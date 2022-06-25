package threads.blocking.immutable;

import java.util.ArrayList;
import java.util.List;

// Immutable class
public final/*5-�� �������*/ class Animal {

    private final String species; //2-�� �������
    private final int age;
    private final List<String> favoriteFoods;

    public Animal(String species, int age, List<String> favoriteFoods) { //1-�� �������
        this.species = species;
        this.age = age;
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFavoriteFoods() {
        return new ArrayList<>(favoriteFoods); //4-�� �������
    }
}
