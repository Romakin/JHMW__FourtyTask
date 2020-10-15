package task2.models;

import java.util.List;
import java.util.stream.Collectors;

public class Hospital {

    private final String name;
    private final String address;
    private List<Doctor> doctors;
    private final int MAX_CLIENTS_NUM = 100;
    private int current_clients_num = 0;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Doctor getFreeDoctor() {
        List<Doctor> freeDocs = doctors.stream()
                .filter(Doctor::isFree).collect(Collectors.toList());
        if (freeDocs.size() > 0) {
            return freeDocs.get(0);
        }
        return null;
    }

    public boolean canVisit() {
        return current_clients_num < MAX_CLIENTS_NUM;
    }

    public void visit() {
        current_clients_num++;
    }

    public void goOut() {
        current_clients_num--;
    }
}
