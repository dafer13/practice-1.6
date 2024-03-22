package model;


public class Surgeon extends Doctor {

  @Override
  public void writeRecipe(String recipe) {

    int stringLength = recipe.length();
    String reverseRecipe = "";
    for (int i = 0; i < stringLength; i++) {
      reverseRecipe = recipe.charAt(i) + reverseRecipe;
    }

    System.out.println(reverseRecipe);
  }
}