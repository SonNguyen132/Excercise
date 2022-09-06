package Bai3;

public class StudentA extends Student{
    private Double math;
    private Double physic;
    private Double chemistry;

    public StudentA(String id, String name, String address, String priority, Double math, Double physic, Double chemistry) {
        super(id, name, address, priority);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getPhysic() {
        return physic;
    }

    public void setPhysic(Double physic) {
        this.physic = physic;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "StudentA{" +
                "math=" + math +
                ", physic=" + physic +
                ", chemistry=" + chemistry +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority='" + priority + '\'' +
                "} " + super.toString();
    }
}
