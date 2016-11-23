import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import java.io.*;

public class read_ex {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      ObjectMapper mapper = new ObjectMapper(); 
      try {
         File f = new File("C:\\Users\\Ayman\\workspace\\Jackson_example\\recipe_template.json");
         Recipe recipe = mapper.readValue(f, Recipe.class);
         System.out.println (recipe);
      } catch (Exception e){
         System.out.println("Exception" + e);
      }
   }

}
