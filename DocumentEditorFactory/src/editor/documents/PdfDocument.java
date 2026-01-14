package editor.documents;

public class PdfDocument implements Document {

    @Override
    public void save() {
        System.out.println("Saving document as PDF");
    }

    @Override
    public void display() {
        System.out.println("Displaying PDF document");
    }
}
