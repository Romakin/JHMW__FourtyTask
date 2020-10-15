package task2.services;

import task2.models.Client;
import task2.models.Doctor;
import task2.models.Hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalService {

    private static HospitalService instance;
    private HospitalService() {};
    public static HospitalService get() {
        if(instance == null) instance = new HospitalService();
        return instance;
    }

    public Hospital hospital(String name, String address, List<List<Object>> doctorsList) {
        Hospital hospital = new Hospital(name, address);
        List<Doctor> doctors = new ArrayList<>();
        for (List<Object> doc : doctorsList)
            doctors.add(DoctorService.get().doctor((int) doc.get(0), (String) doc.get(1)));
        hospital.setDoctors(doctors);
        return hospital;
    }

    public void visit(Hospital hospital, Client client) {
        hospital.visit();
        Doctor doc = hospital.getFreeDoctor();
        if (doc != null) {
            DoctorService.get().helpPet(doc, client, client.getIllnessPet());
            hospital.goOut();
        } else {
            System.out.println("Пожалуйста, ожидайте пока кто нибудь освободится");
        }
    }

}
