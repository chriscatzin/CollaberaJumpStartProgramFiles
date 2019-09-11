import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class imageLabel {

    public static void main(String args[]) {
        String title = "Image Label";
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container content = frame.getContentPane();
        content.setLayout(new GridLayout(1, 1));

        JLabel label1 = new JLabel("\t \t \t \t \t \t \t \t Happy Thursday, Lets build some character!");
        content.add(label1);

        Image warnImage = ImageLoader.getImage(imageLabel.class, "BuildCharacter.jpg");
        Icon warnIcon = new ImageIcon(warnImage);
        JLabel label2 = new JLabel(warnIcon);
        content.add(label2);


        frame.setSize(980, 200);
        frame.setVisible(true);
    }
}

final class ImageLoader {

    private ImageLoader() {
    }

    public static Image getImage(Class relativeClass, String filename) {
        Image returnValue = null;
        InputStream is = relativeClass.getResourceAsStream(filename);
        if (is != null) {
            BufferedInputStream bis = new BufferedInputStream(is);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                int ch;
                while ((ch = bis.read()) != -1) {
                    baos.write(ch);
                }
                returnValue = Toolkit.getDefaultToolkit().createImage(
                        baos.toByteArray());
            } catch (IOException exception) {
                System.err.println("Error loading: " + filename);
            }
        }
        return returnValue;
    }
}
