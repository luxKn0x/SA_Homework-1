package editor;

import editor.documents.*;

public class DocumentFactory {

    public static Document createDocument(String type) {

        switch (type.toLowerCase()) {
            case "pdf":
                return new PdfDocument();
            case "word":
                return new WordDocument();
            case "html":
                return new HtmlDocument();
            default:
                throw new IllegalArgumentException("Unsupported document type");
        }
    }
}
