import javax.swing.*;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new TextDocument(JOptionPane.showInputDialog("What is file name?"));
    }

    @Override
    public IDocument CreateOpen() {
        return CreateNew();
    }
}
