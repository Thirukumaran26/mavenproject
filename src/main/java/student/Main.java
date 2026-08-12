package student;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: PdfCounter <pdf-file>");
            return;
        }

        File pdf = new File(args[0]);

        int pages = PdfUtil.getPageCount(pdf);

        if (pages != -1)
            System.out.println("Total Pages : " + pages);
        else
            System.out.println("Cannot read PDF.");
    }
}