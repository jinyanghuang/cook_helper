package com.example.huang.cookhelper;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.List;
/**
 * Created by saifzabarah on 2016-11-18.
 */

public class Recipe {
    private String name;
    private String classr;
    private String type;
    private String category;
    private ArrayList<Ingredient> ing;
    private String cal;
    private String cook;
    private String prep;
    private String steps;

    Recipe(String Name, String classr, String type, String category,ArrayList<Ingredient> ing, String cook,String prep, String cal, String steps){
        this.name=name;
        this.classr=classr;
        this.type=type;
        this.category=category;
        this.ing=ing;
        this.steps=steps;
        this.cal=cal;
        this.cook=cook;


    }

    public String getName(){
        return name;
    }
    public String getClassr(){
        return classr;
    }
    public String getType(){
        return type;
    }
    public String getCategory(){
        return category;
    }
    public ArrayList<Ingredient>getIng(){
        return ing;
    }
    public String getSteps(){
        return steps;
    }
    public String getCal(){return cal;}
    public String getCook(){return cook;}
    public String getPrep(){return prep;}

    public void setAll(String Name, String classr, String type, String category,ArrayList<Ingredient> ing, String cook,String prep, String cal, String steps){
        this.name=name;
        this.classr=classr;
        this.type=type;
        this.category=category;
        this.ing=ing;
        this.steps=steps;
        this.cal=cal;
        this.cook=cook;

    }

    public void writeRecipe(){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting().serializeNulls();
        Gson gson = builder.create();
        System.out.println(this);
      try {
         String jsonString = gson.toJson(this);
         System.out.println(jsonString);
         PrintWriter writer = new PrintWriter(this.getName() + ".json", "UTF-8");
         writer.println(jsonString);
         writer.close();
      } catch (Exception e){
         System.out.println("Exception" + e);
      }
    }
}
