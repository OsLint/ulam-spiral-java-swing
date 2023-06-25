import javax.swing.*;
import java.awt.*;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main extends JFrame {
    private static int size;

    public static void main(String[] args) {
        size = getSizeFromUser();
        SwingUtilities.invokeLater(Main::new);
    }

    public Main() {
        super("Ulam Spiral");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setBackground(Color.white);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        setSize(size, size);
        setLocation(screenWidth / 2 - size / 2, screenHeight / 2 - size / 2);

    }

    private static int getSizeFromUser() {
        String input = JOptionPane.showInputDialog("Enter the size of the spiral:");
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 100;
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);


        int x = getWidth() / 2;
        int y = getHeight() / 2;

        double angle = 0.0;
        int dx = 1, dy = 0;

        for (int i = 1, step = 1, turn = 1; i < pow(size,2); i++) {

            if (isPrime(i))
                g.fillRect(x, y, 2, 2);

            x += dx * 3;
            y += dy * 3;

            if (i == turn) {

                angle += 90.0;

                if ((dx == 0 && dy == -1) || (dx == 0 && dy == 1))
                    step++;

                turn += step;

                dx = (int) Math.cos(Math.toRadians(angle));
                dy = (int) Math.sin(Math.toRadians(-angle));
            }
        }
    }


    private static boolean isPrime(int value) {
        if (value == 1) return false;
        for (int i = 2; i <= sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}