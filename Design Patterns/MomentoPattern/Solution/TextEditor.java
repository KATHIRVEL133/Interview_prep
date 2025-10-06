public class TextEditor {
    private String content;
    public TextEditor(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public TextEditorMemento save() {
        return new TextEditorMemento(content);
    }
    public void restore(TextEditorMemento memento) {
        this.content = memento.getContent();
    }
}
