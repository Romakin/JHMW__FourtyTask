package task2.models;

public class Doctor {

    private final int percentRate;
    private final String name;
    private boolean isBusy;

    public Doctor(int percentRate, String name) {
        this.percentRate = percentRate;
        this.name = name;
        this.isBusy = false;
    }

    public boolean isFree() {
        return !isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public int getPercentRate() {
        return percentRate;
    }

    public String getRecomendation() {
        return "Используйте правильные лекарства и правильно кормите";
    }
}
