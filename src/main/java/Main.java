/**
 * Created by HP on 2017-10-18.
 */
public class Main {

    public static void main(String[] args) {

javax.swing.SwingUtilities.invokeLater(new Runnable() {
    public void run() {
        WindowView windowView = new WindowView();
        windowView.setVisible(true);

    }
});

    }
}