import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MilanMadrid extends JFrame {
    JButton milan = new JButton("   AC Milan   ");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    JPanel pnl = new JPanel(new GridLayout(2, 1));

    int milScore = 0, madScore = 0;
    Font fnt = new Font("Times new roman", Font.BOLD, 15);

    public void setScore()
    {
        result.setText("Result: " + milScore + " X " + madScore);

        if (madScore > milScore) winner.setText("Winner: Real Madrid");
        else if (milScore > madScore) winner.setText("Winner: AC Milan");
        else winner.setText("Winner: DRAW");
    }
    MilanMadrid() {
        super("Example");
        setLayout(new BorderLayout());
        setSize(400, 300);

        last.setFont(fnt);
        winner.setFont(fnt);
        result.setFont(fnt);
        winner.setAlignment(Label.CENTER);

        pnl.add(last);
        pnl.add(result);

        add(winner, BorderLayout.NORTH);
        add(milan, BorderLayout.WEST);
        add(madrid, BorderLayout.EAST);
        add(pnl, BorderLayout.CENTER);

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                milScore++;
                last.setText("Last Scorer: " + "AC Milan");
                setScore();

            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                madScore++;
                last.setText("Last Scorer: " + "Real Madrid");
                result.setText("Result: " + milScore + " X " + madScore);
                setScore();
            }
        });

        winner.addMouseListener(new MouseListener() {
            String text = winner.getText();

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                winner.setText("~~~~~~~");
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                winner.setText(text);
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                winner.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                winner.setForeground(Color.BLACK);
            }
        });
    }

    public static void main(String[] args) {
        new MilanMadrid().setVisible(true);
    }
}