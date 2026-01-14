package editor;

import editor.documents.Document;

public class Editor {

    private Document document;

    public Editor(Document document) {
        this.document = document;
    }

    public void saveDocument() {
        document.save();
    }

    public void displayDocument() {
        document.display();
    }
}
