import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Реализуйте игру-угадайку, которая имеет одно текстовое поле и
одну кнопку. Он предложит пользователю угадать число между 0-20 и
дает ему три попытки. Если ему не удастся угадать, то будет выведено
сообщение, что пользователь допустил ошибку в угадывнии и что
число меньше / больше. Если пользователь попытался три раза угадать,
то программу завершается с соответствующим сообщением. Если
пользовательугадал, то программа должна тоже завершаться с
соответствующим сообщением.*/
public class Main extends JFrame {
    private JLabel title = new JLabel("Угадайте число!");
    private JTextField input = new JTextField();
    private JButton button = new JButton("Тык");
    private int number = (int) (Math.random() * 20);
    private int tries = 3;
    Main() {
        setLayout(new BorderLayout());
        setSize(350,120);

        add(title, BorderLayout.NORTH);
        add(input, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Integer.parseInt(input.getText()) == number) {
                    JOptionPane.showMessageDialog(null, "Вы победили!", "ура!",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                else {
                    tries--;
                    if(tries == 0){
                        JOptionPane.showMessageDialog(null, "Вы потратили все попытки и проиграли...",
                                "увы...", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    String text = "Ваша попытка оказалась неудачной. Число ";
                    if(Integer.parseInt(input.getText()) > number) text += "меньше.";
                    else text += "больше.";
                    title.setForeground(Color.RED);
                    title.setText(text);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
