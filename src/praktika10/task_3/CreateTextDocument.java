package praktika10.task_3;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew(String src) {
        TextDocument doc = new TextDocument();
        doc.PushNew(src);
        return doc;
    }

    @Override
    public IDocument CreateOpen(String src) {
        TextDocument doc = new TextDocument();
        doc.PushOpen(src);
        return doc;
    }
}
