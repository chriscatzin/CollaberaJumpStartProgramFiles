import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class loadImage {

    public static void main(String[] arguments) throws IOException {

        JPanel panel = new JPanel();

        BufferedImage image = ImageIO.read(new File("buildCharacter.jpg"));
        JLabel label = new JLabel(new ImageIcon(image));
        panel.add(label);

        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Load Image using Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the Jpanel to the main window
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);

    }
}