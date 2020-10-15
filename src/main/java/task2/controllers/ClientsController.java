package task2.controllers;

import task2.models.Client;
import task2.models.Hospital;
import task2.services.HospitalService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientsController {

    private List<Hospital> hospitals;

    public ClientsController() {
        hospitals = new ArrayList<>();

        // ToDo generate some hospitals
        for (List h : getHospitalsArray()) {
            hospitals.add(HospitalService.get().hospital(
                    (String) h.get(0),
                    (String) h.get(1),
                    (List<List<Object>>) h.get(2)
            ));
        }
    }

    public void run(Client client) {
        for (Hospital h: hospitals) {
            if (h.canVisit()) {
                HospitalService.get()
                        .visit(h, client);
            }
        }
    }

    private List<List<Object>> getHospitalsArray() {
        return Arrays.asList(
                Arrays.asList(
                    "Saint Luise Clinic",
                    "Tranc St., 32/1",
                    Arrays.asList(
                        Arrays.asList(90, "Kate B.") ,
                        Arrays.asList(80, "John St."),
                        Arrays.asList(75, "Mark D.")
                    )
                )
        );
    }

}
