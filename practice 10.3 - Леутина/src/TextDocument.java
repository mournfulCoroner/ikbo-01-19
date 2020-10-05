import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument extends IDocument {

    static JTextArea area = new JTextArea();
    static Boolean isArea = false;
    public TextDocument(String name){
            create(name);
    }

    @Override
    public File create(String name) {
        file = new File("D://Test", name + ".txt");
        try{
            if(!file.exists()) {
                JOptionPane.showMessageDialog(null, "Файл не найден и будет создан новый");
                file.createNewFile();
            }

        }
        catch (Exception ignored){
            JOptionPane.showMessageDialog(null, "Не удалось создать файл", "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        }
        return file;
    }

    @Override
    public void save() {
        String text = area.getText();
        try(FileWriter writer = new FileWriter(getFile(), false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){ System.out.println(ex.getMessage()); }
    }

    @Override
    public File getFile() {
        return file;
    }

    @Override
    public void createField(Client cl) {
        StringBuilder text = new StringBuilder();
        try(FileReader reader = new FileReader(getFile()))
        {
            int c;
            while((c=reader.read())!=-1) text.append((char) c);
        }
        catch(IOException ex){  JOptionPane.showMessageDialog(null, "Не удалось считать файл",
                "Ошибка", JOptionPane.ERROR_MESSAGE); }
        area.setText(text.toString());
        if(!isArea){
            cl.add(area);
            isArea = true;
        }
        cl.revalidate();
    }
}
