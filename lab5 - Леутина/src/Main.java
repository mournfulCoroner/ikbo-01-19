
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

    ImageIcon[] anim = new ImageIcon[4];
    JLabel lab = new JLabel();

    Main() throws InterruptedException {
        for(int i = 1; i <=4; i++) anim[i-1] = new ImageIcon(i + ".jpg");
        JFrame window = new JFrame();
        window.setSize(anim[0].getIconWidth(), anim[0].getIconHeight());
        window.add(lab);
        window.setVisible(true);
        int i = 1;
        while (true)
        {
            Thread.sleep(100);
            lab.setIcon(anim[i]);
            i++;
            window.revalidate();
            if(i == 4) i = 1;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        new Main();
    }
}

