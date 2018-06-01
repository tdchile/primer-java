import com.teamtreehouse.Treet;
import java.util.Date;
import java.util.Arrays;

public class Example {

  public static void main(String[] args) {
    Treet treet = new Treet("gtdel",
                            "lOfficial EVO Magazine reveal more details about the halt in production" +
                            "of both the PEUGEOT #308GTI & #208GTI as #Peugeot make changes to the 308GTI" +
                            "to make it cleaner and halt production of the 3dr 20",
                            new Date(1526898180000L)
    
    );  
    
    Treet secondTreet = new Treet("gtdel",
                                  "Además sale en internet q los empresarios exitosos" +
                                  "fracasan al menos una vez, y yo voy en esa fase dolorosa" +
                                  "por ahora...pero vamos por más, rendirse no es opción..." +
                                   "solo una palabra", new Date (1527780701000L)
                                 );                                  
      
    System.out.printf("This is are the  new Treet:---***************---  %s %n ---***************--- %s %n***************---", treet,secondTreet);
    
    System.out.println ("---*****---las palabras de mi tuiter son:");
    for(String word:treet.getWords()) {
      
      System.out.println(word);
   }
    
       System.out.println ("---*****---las palabras de mi segundo tuiter son:");
    for(String word:secondTreet.getWords()) {
      
      System.out.println(word.toUpperCase());
   }
    
    
    Treet[] treetsArray ={secondTreet,treet};
    Arrays.sort(treetsArray);
   // for (Treet exampleTreet : treetsArray){
      System.out.printf("********primer tuiter******* %s %n", treetsArray[0]);
      System.out.printf("********segundo tuiter******** %s %n", treetsArray[1]);
    }
    
  }


