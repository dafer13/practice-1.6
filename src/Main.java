import java.util.Scanner;
import model.Doctor;
import model.Surgeon;
import model.Therapist;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Выберите врача к которому хотите обратиться:\n1. Хирург\n2. Терапевт");
      String doctor = scanner.nextLine();

      if (doctor.equals("Хирург")) {
        Doctor surgeon = new Surgeon();
        System.out.println("Введите рецепт");

        String recipe = scanner.nextLine();
        surgeon.writeRecipe(recipe);
        return;
      }

      if (doctor.equals("Терапевт")) {
        Doctor therapist = new Therapist();
        System.out.println("Введите рецепт");

        String recipe = scanner.nextLine();
        therapist.writeRecipe(recipe);
        return;
      } else {
        System.out.println("Такого врача не существует");
      }
    }

  }

}
