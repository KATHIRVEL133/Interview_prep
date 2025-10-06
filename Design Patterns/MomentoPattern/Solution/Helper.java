import java.util.Stack;

public class Helper {

   private Stack<TextEditorMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }
    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
