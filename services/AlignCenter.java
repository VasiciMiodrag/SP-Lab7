package services;

public class AlignCenter implements AlignStrategy{
    public void render(String paragraph, Context context) {
        System.out.println("Align center: " + paragraph);
    }
}
