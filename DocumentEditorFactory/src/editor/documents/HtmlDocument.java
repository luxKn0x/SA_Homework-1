package editor.documents;

public class HtmlDocument implements Document {

    @Override
    public void save() {
        System.out.println("Saving document as HTML");
    }

    @Override
    public void display() {
        System.out.println("Displaying HTML document in browser");
    }
}
