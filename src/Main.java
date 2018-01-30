public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Cat(), new Cow(), new Dog()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].saySmth();
        }
    }

}