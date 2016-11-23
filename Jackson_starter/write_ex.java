import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class write_ex {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      ObjectMapper mapper = new ObjectMapper();
      Recipe recipe = new Recipe();
      recipe.set_name("Falafel");
      recipe.set_class(Recipe.Class.VEGIE);
      recipe.set_category(Recipe.Category.STARTER);
      recipe.set_origin(Recipe.Origin.MIDLE_EASTERN);
      Recipe.Ingredient ingr = new Recipe.Ingredient();
      List<Recipe.Ingredient> ingr_list = new ArrayList<Recipe.Ingredient>();
      ingr.set_name("Chick Peas");
      ingr.set_quantity(1);
      ingr.set_units(Recipe.Measure.CUP);
      ingr_list.add(ingr);
      ingr = new Recipe.Ingredient();
      ingr.set_name("Parsly");
      ingr.set_quantity(10);
      ingr.set_units(Recipe.Measure.OUNCE);
      ingr_list.add(ingr);
      recipe.set_ingredients(ingr_list);
      System.out.println(recipe);
      try {
         mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
         String jsonString = mapper.writeValueAsString(recipe);
         System.out.println(jsonString);
         PrintWriter writer = new PrintWriter("out_recipe.json", "UTF-8");
         writer.println(jsonString);
         writer.close();
      } catch (Exception e){
         System.out.println("Exception" + e);
      }
   }

}
