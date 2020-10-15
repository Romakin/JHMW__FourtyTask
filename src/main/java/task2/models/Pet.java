package task2.models;

public class Pet {

    private final String name;
    private int age;
    private boolean isIll;

    public Pet(String name, int age, boolean isIll) {
        this.name = name;
        this.age = age;
        this.isIll = isIll;
    }

    public boolean isIllness() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }
}
