import java.util.ArrayList;

// ! This design already serve a Zoo contains different type of animals
public class Zoo {
  private ArrayList<Animal> animals;

  public Zoo() {
    this.animals = new ArrayList<>();
  }

  public void add(Animal animal) {
    this.animals.add(animal);
  }

  public static void main(String[] args) {
    Zoo zoo = new Zoo();
    zoo.add(new Lion());
    zoo.add(new Cat());
  }
}