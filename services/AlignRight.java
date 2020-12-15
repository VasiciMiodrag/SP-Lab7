package services;

public class AlignRight implements AlignStrategy{
    public void render(String paragraph, Context context) {
        System.out.println("Align right: " + paragraph);
    }
}
