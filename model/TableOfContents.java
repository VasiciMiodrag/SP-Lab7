package model;

public class TableOfContents implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
