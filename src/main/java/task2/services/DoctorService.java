package task2.services;

import task2.models.Client;
import task2.models.Doctor;
import task2.models.Pet;

import java.util.concurrent.ThreadLocalRandom;

public class DoctorService {

    private static DoctorService instance;
    private DoctorService() {};
    public static DoctorService get() {
        if(instance == null) instance = new DoctorService();
        return instance;
    }

    public Doctor doctor(int percentRate, String name) {
        return new Doctor(percentRate, name);
    }

    public void helpPet(Doctor doc, Client client, Pet pet) {
        doc.setBusy(true);
        if (doc.getPercentRate() > ThreadLocalRandom.current().nextInt(1, 101)) {
            pet.setIll(false);
        }
        ClientService.get().setRecomend(client, pet, doc.getRecomendation());
        doc.setBusy(false);
    }


}
