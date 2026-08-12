package student;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class PdfUtil {

    public static int getPageCount(File file) {

        try (PDDocument document = PDDocument.load(file)) {

            return document.getNumberOfPages();

        } catch (IOException e) {

            return -1;
        }
    }
}