package task2.services;

import task2.models.Client;
import task2.models.Pet;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private static ClientService instance;
    private ClientService() {};
    public static ClientService get() {
        if(instance == null) instance = new ClientService();
        return instance;
    }

    public Client client(String name, int age, List<List<Object>> petsList) {

        // petsList [[name, age, isIll(true/false)]]

        List<Pet> pets = new ArrayList<>();
        for (List<Object> pet : petsList)
            pets.add(new Pet((String) pet.get(0), (int) pet.get(1), (boolean) pet.get(2)));
        return new Client(name,  age, pets);
    }

    public void setRecomend(Client client, Pet pet, String recomend) {
        if (!pet.isIllness())
            client.setRecomendations(recomend);
    }

}
