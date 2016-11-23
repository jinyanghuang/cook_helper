import java.util.Iterator;
import java.util.List;

public class Recipe {
   public enum Class {BEAF, CHICKEN, SEAFOOD, VEGIE};
   public enum Origin {ITALIAN, CHINESE, MIDLE_EASTERN, INDIAN, AMERICAN};
   public enum Category {STARTER, MAIN_DISH, DESERT, DRINK, SAUCE, SALAD};
   public enum Measure {CUP, TEA_SPOON, TABLE_SPOON, OUNCE, KILO_GRAM, GRAM, PIECE};
   public static class Ingredient{
      private String _name;
      private float _quantity;
      private Measure _units;
      
      public String get_name() { return _name; }
      public void set_name(String name) {_name = name;}
      public float get_quantity() { return _quantity; }
      public void set_quantity(float q) { _quantity = q; }
      public Measure get_units() { return _units; }
      public void set_units(Measure u) { _units = u; }
   }
   private String _name;
   private Class _class;
   private Origin _origin;
   private Category _category;
   private List<Ingredient>  _ingredients;
   private List<String> _direction;
   
   public String get_name() { return _name; }
   public void set_name(String name) { _name = name; }
   public Class get_class() { return _class; }
   public void set_class(Class cl) { _class = cl; }
   public Origin get_origin() { return _origin; }
   public void set_origin(Origin origin) { _origin = origin; }
   public Category get_category() { return _category; }
   public void set_category(Category cat) { _category = cat; }
   public List<Ingredient> get_ingredients() { return _ingredients; }
   public void set_ingredients(List<Ingredient> ig) { _ingredients = ig; }
   public List<String> get_direction() { return _direction; }
   public void set_direction(List<String> dr) { _direction = dr; }
   public String toString(){
      String str;
      str = "Recipe Name: " + _name + "\n";
      str += _origin + " " + _category + " " + _class + " recipe \n";
      str += "Ingredients: \n";
      Iterator<Ingredient> itr = _ingredients.iterator();
      while (itr.hasNext()){
         Ingredient ingr = itr.next();
         str += ingr._name + " " + ingr._quantity + " " + ingr._units + "\n";
      }
      return str;
   }
}
