import model.*;
import services.OpenCommand;
import services.SaveCommand;
import services.StatisticsCommand;

public class Main {

        public static void main(String[] args) throws Exception {
            OpenCommand openCommand = new OpenCommand("MyBook");
            openCommand.execute();
            
            Section section = new Section("Chapter 2");
            section.addElement(new Paragraph("First paragraph of chapter 2"));
            section.addElement(new Paragraph("Second paragraph of chapter 2"));
            
            SaveCommand saveCommand = new SaveCommand(section);
            saveCommand.execute();
            StatisticsCommand statisticsCommand = new StatisticsCommand();
            statisticsCommand.execute();
        }
}
