import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame {

    IDocument doc;
    public Client(){
        Client context = this;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menu = new JMenuBar();
        menu.add(createFileMenu(context));
        setJMenuBar(menu);
        setSize(400, 600);
        setVisible(true);

    }
    private JMenu createFileMenu(Client context){
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                doc = new CreateTextDocument().CreateOpen();
                doc.createField(context);
            }
        });
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                doc = new CreateTextDocument().CreateNew();
                doc.createField(context);
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    doc.save();
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Файл не открыт", "Ошибка",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        exit.addActionListener(actionEvent -> System.exit(0));
        return file;
    }

    public static void main(String[] args) {
        new Client();
    }
}
