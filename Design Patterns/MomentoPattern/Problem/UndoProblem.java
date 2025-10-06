public class UndoProblem {
public static void main(String[] args) {
    Text text = new Text("Hello");
    text.setContent("Hello, World!");
    System.out.println(text.getContent()); // Outputs: Hello, World!
    //undo operation is not possible
}
}
