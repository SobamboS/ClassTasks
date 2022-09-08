package Animal;

public class Horse extends Animal {
    String neigh;

    public Horse(String animalColour, String animalName, String animalBreed, String neigh) {
        super(animalColour, animalName, animalBreed);
        this.neigh = neigh;
    }

    public String getNeigh() {
        return neigh;
    }

    @Override
    public String toString() {
        return super.toString() + this.neigh;

    }
}

