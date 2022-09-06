package Bai3;

public class StudentC extends Student{
    private Double literature;
    private Double history;
    private Double geography;

    public StudentC(String id, String name, String address, String priority, Double literature, Double history, Double geography) {
        super(id, name, address, priority);
        this.literature = literature;
        this.history = history;
        this.geography = geography;
    }

    public Double getLiterature() {
        return literature;
    }

    public void setLiterature(Double literature) {
        this.literature = literature;
    }

    public Double getHistory() {
        return history;
    }

    public void setHistory(Double history) {
        this.history = history;
    }

    public Double getGeography() {
        return geography;
    }

    public void setGeography(Double geography) {
        this.geography = geography;
    }

    @Override
    public String toString() {
        return "StudentC{" +
                "literature=" + literature +
                ", history=" + history +
                ", geography=" + geography +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority='" + priority + '\'' +
                "} " + super.toString();
    }
}
