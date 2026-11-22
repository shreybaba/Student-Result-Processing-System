
package studentresultsystem;

import javax.swing.SwingUtilities;
import studentresultsystem.ui.MainFrame;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            MainFrame frame = new MainFrame();

            frame.setVisible(true);

        });
    }
}
