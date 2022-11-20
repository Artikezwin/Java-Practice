package praktika10.task_3;

public interface IDocument {
    public void run();
    public void PushNew(String filename);
    public void PushOpen(String filename);
    public void PushSave();
    public void PushExit();
}
