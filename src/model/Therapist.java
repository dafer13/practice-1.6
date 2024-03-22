package model;



public class Therapist extends Doctor {

  @Override
  public void writeRecipe(String recipe) {

    String recipeNotVowels = recipe;
    String [] rus = {"у", "е", "ё", "ы", "а", "о", "э", "я", "и", "ю"};
    for (String s : rus) {
      recipeNotVowels = recipeNotVowels.replace(s, "");
    }
    System.out.println(recipeNotVowels);
  }
}
