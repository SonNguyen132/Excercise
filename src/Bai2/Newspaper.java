package Bai2;

public class Newspaper extends Document{
    private int issueDay;

    public Newspaper(String id, String namePublisher, int numberRelease, int issueDay) {
        super(id, namePublisher, numberRelease);
        this.issueDay = issueDay;
    }

    public int getIssueDay() {
        return issueDay;
    }

    public void setIssueDay(int issueDay) {
        this.issueDay = issueDay;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "issueDay=" + issueDay +
                ", id=" + id +
                ", namePublisher='" + namePublisher + '\'' +
                ", numberRelease=" + numberRelease +
                "} " + super.toString();
    }
}
