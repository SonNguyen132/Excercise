package Bai2;

public class Book extends Document{
    private String nameAuthor;
    private int numberOfPage;

    public Book(String id, String namePublisher, int numberRelease, String nameAuthor, int numberOfPage) {
        super(id, namePublisher, numberRelease);
        this.nameAuthor = nameAuthor;
        this.numberOfPage = numberOfPage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", numberOfPage=" + numberOfPage +
                ", id=" + id +
                ", namePublisher='" + namePublisher + '\'' +
                ", numberRelease=" + numberRelease +
                "} " + super.toString();
    }
}
