package Animal;

public class Lion extends Animal {
    String roar;

    public Lion(String animalColour, String animalName, String animalBreed, String roar) {
        super(animalColour, animalName, animalBreed);
        this.roar =  roar;
    }

    public String getRoar() {
        return roar;
    }
    @Override
    public String toString() {
        return super.toString() + this.roar;
    }
}
