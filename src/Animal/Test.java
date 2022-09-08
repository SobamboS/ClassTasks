package Animal;

public class Test {
    public static void main(String[] args) {
        Lion lion = new Lion("Brown", "Mufasa", "Mountain Animal.Lion", "grrrrr");
        System.out.println(lion.getRoar());

        Dog dog = new Dog("Brown", "Bingo", "Pit Bull", "brrrrk");
        System.out.println(dog.getBark());

        Horse horse = new Horse("Black", "Billy", "Wild Animal.Horse", "neeei");
        System.out.println(horse.getNeigh());

        Animal animal = new Animal("WHITE", "djdsk", "hjdj");
        System.out.println(animal.getColour());
        System.out.println(animal.getBreed());
        System.out.println(animal.getName());
    }
}
