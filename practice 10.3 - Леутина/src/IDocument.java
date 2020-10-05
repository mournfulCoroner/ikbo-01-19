import java.io.File;

public abstract class IDocument {

    protected File file;
    public abstract File create(String name);
    public abstract void save();
    public abstract File getFile();
    public abstract void createField(Client cl);
}
