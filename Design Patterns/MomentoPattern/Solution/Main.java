public class Main {
  public static void main(String[] args) {
    TextEditor editor = new TextEditor("Hello");
    Helper helper = new Helper();

    helper.save(editor);
    editor.setContent("Hello, World!");
    System.out.println(editor.getContent()); // Outputs: Hello, World!
    helper.save(editor);
    helper.undo(editor);
    System.out.println(editor.getContent()); // Outputs: Hello
  }
}
