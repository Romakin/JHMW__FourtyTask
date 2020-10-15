package task2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    private String Name;
    private int age;
    private List<Pet> pets;
    private List<String> recomendations;

    public Client(String name, int age, List<Pet> pets) {
        Name = name;
        this.pets = pets;
        this.age = age;
        recomendations = new ArrayList<>();
    }

    public Pet getIllnessPet() {
        List<Pet> illnessPets = pets.stream()
                .filter(Pet::isIllness).collect(Collectors.toList());
        if (illnessPets.size() > 0) {
            return illnessPets.get(0);
        }
        return null;
    }

    public void setRecomendations(String recomendation) {
        this.recomendations.add(recomendation);
    }
}
