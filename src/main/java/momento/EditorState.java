package momento;

public class EditorState {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void undo() {
        System.out.println("how");
    }
}
