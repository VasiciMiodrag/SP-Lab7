package services;

import model.*;

public class BookStatistics implements Visitor {
    private int countParagraph;
    private int countImage;
    private int countTables;

    public void visit(Book book) {
        for (Element e : book.getElements()) {
            castVisitor(e);
        }
    }

    public void visit(Section section) {
        for (Element e : section.getElements()) {
            castVisitor(e);
        }
    }

    public void visit(Paragraph paragraph) {
        countParagraph++;
    }

    public void visit(ImageProxy proxy) {
        countImage++;
    }

    public void visit(Image image) {
        countImage++;
    }

    public void visit(Table table) {
        countTables++;
    }

    public void visit(TableOfContents content) {
        countTables++;
    }

    public void printCounter() {
        System.out.println("Number of paragraphs: " + countParagraph);
        System.out.println("Number of images: " + countImage);
        System.out.println("Number of tables: " + countTables);
    }

    private void castVisitor(Element e) {
        if (e instanceof Paragraph) {
            visit((Paragraph) e);
        } else if (e instanceof ImageProxy) {
            visit((ImageProxy) e);
        } else if (e instanceof Image) {
            visit((Image) e);
        } else if (e instanceof TableOfContents) {
            visit((TableOfContents) e);
        } else if (e instanceof Section) {
            visit((Section) e);
        } else if (e instanceof Table) {
            visit((Table) e);
        }
    }
}
