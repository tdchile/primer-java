import com.teamtreehouse.Treet;
import java.util.Date;

public class Example {

  public static void main(String[] args) {
    Treet treet = new Treet("gtdel",
                            "lOfficial EVO Magazine reveal more details about the halt in production" +
                            "of both the PEUGEOT #308GTI & #208GTI as #Peugeot make changes to the 308GTI" +
                            "to make it cleaner and halt production of the 3dr 20",
                            new Date(1526898180000L)
    
    );
    System.out.printf("This is a new Treet:  %s %n", treet);
    
    System.out.println ("las palabras de mi tuiter son:");
    for(String word:treet.getWords()) {
      
      System.out.println(word);
   }
  }
}

