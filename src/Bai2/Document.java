package Bai2;

public class Document {
    protected String id;
    protected String namePublisher;
    protected int numberRelease;

    public Document(String id, String namePublisher, int numberRelease) {
        this.id = id;
        this.namePublisher = namePublisher;
        this.numberRelease = numberRelease;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", namePublisher='" + namePublisher + '\'' +
                ", numberRelease=" + numberRelease +
                '}';
    }
}
