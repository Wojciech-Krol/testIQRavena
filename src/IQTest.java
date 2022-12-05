import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class IQTest {
    private JPanel Menu;
    private JButton STARTButton;

    public IQTest() {
        JFrame frame = new JFrame("IQTest");
        frame.setContentPane(Menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(600, 800));
        frame.setSize(600, 800);
        frame.setMaximumSize(new Dimension(600, 800));
        frame.setLocationRelativeTo(null);
        frame.pack();
        STARTButton.setBackground(new Color(60,63,65));
        frame.setVisible(true);
    }

}
