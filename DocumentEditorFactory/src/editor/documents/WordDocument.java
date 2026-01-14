package editor.documents;

public class WordDocument implements Document {

    @Override
    public void save() {
        System.out.println("Saving document as Word file");
    }

    @Override
    public void display() {
        System.out.println("Displaying Word document");
    }
}
