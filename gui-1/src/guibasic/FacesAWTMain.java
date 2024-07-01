package guibasic;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class FacesAWTMain {
    public static void main(String[] args) {
        new FacesAWTMain();
    }

    FacesAWTMain() {
        FaceFrame f = new FaceFrame();
        f.setSize(800, 800);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }

    class FaceFrame extends Frame {
        private int faceWidth = 150;
        private int faceHeight = 150;
        private int padding = 25;
        private Random rand = new Random();

        public void paint(Graphics g) {
            int xStart = padding;
            int yStart = padding;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    drawFace(g, xStart + col * (faceWidth + padding), yStart + row * (faceHeight + padding));
                }
            }
        }

        public void drawFace(Graphics g, int x, int y) {
            // Draw face outline
            g.setColor(randomColor());
            g.fillOval(x, y, faceWidth, faceHeight);

            // Draw eyes
            g.setColor(Color.BLACK);
            drawEyes(g, x + 35, y + 50, 30, 30); // Left eye
            drawEyes(g, x + 85, y + 50, 30, 30); // Right eye

            // Draw nose
            g.drawLine(x + 75, y + 60, x + 75, y + 100);

            // Draw mouth
            if (rand.nextBoolean()) {
                g.drawLine(x + 50, y + 120, x + 100, y + 120); // Straight mouth
            } else {
                g.drawArc(x + 50, y + 100, 50, 40, 0, -180); // Sad mouth
            }

            // Draw eyebrows
            drawEyebrows(g, x + 25, y + 35, 50, 10); // Left eyebrow
            drawEyebrows(g, x + 85, y + 35, 50, 10); // Right eyebrow
        }

        public void drawEyes(Graphics g, int x, int y, int width, int height) {
            g.fillOval(x, y, width, height);
        }

        public void drawEyebrows(Graphics g, int x, int y, int width, int height) {
            g.fillRect(x, y, width, height);
        }

        public Color randomColor() {
            int r = rand.nextInt(56)+180;
            int g = rand.nextInt(100)+100;
            int b = rand.nextInt(50)+100;
            return new Color(r, g, b);
        }
    }
}
