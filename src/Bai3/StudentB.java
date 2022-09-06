package Bai3;

public class StudentB extends Student{
    private Double math;
    private Double chemistry;
    private Double biology;

    public StudentB(String id, String name, String address, String priority, Double math, Double chemistry, Double biology) {
        super(id, name, address, priority);
        this.math = math;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }

    public Double getBiology() {
        return biology;
    }

    public void setBiology(Double biology) {
        this.biology = biology;
    }

    @Override
    public String toString() {
        return "StudentB{" +
                "math=" + math +
                ", chemistry=" + chemistry +
                ", biology=" + biology +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority='" + priority + '\'' +
                "} " + super.toString();
    }
}
