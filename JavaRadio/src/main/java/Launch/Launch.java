package Launch;

import Panes.RadioInterface;

/**
 *
 * @author José Augusto Scherer
 */
public class Launch {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new RadioInterface().setVisible(true);
        });
    }
}
