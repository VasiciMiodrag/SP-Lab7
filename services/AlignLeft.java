package services;

public class AlignLeft implements AlignStrategy{
    public void render(String paragraph, Context context) {
        System.out.println("Align left: " + paragraph);
    }
}
