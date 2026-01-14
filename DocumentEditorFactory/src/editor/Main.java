package editor;

import editor.documents.Document;

public class Main {

    public static void main(String[] args) {

        String userChoice = "pdf";

        Document document = DocumentFactory.createDocument(userChoice);
        Editor editor = new Editor(document);

        editor.displayDocument();
        editor.saveDocument();
    }
}
