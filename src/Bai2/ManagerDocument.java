package Bai2;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
    private List<Document> documents;

    public ManagerDocument(){
        this.documents = new ArrayList<>();
    }
    //Them tai lieu vao List
    public void addDocument(Document document){
        this.documents.add(document);
    }
    //Ham xoa tai lieu theo ma tai lieu
    public boolean deleteDocument(String id){
        Document docs = this.documents.stream().filter(s -> s.getId().equals(id))
                .findFirst().orElse(null);
        if (docs == null){
            return false;
        } else
            this.documents.remove(docs);
            return true;
    }
    //Hien thi thong tin
    public void showInfor(){
        this.documents.forEach(s -> System.out.println(s.toString()));
    }
    //Tim kiem theo Sach
    public void findBook(){
        this.documents.stream().filter(s -> s instanceof Book).forEach(s -> System.out.println(s.toString()));
    }
    //Tim kiem theo Bao
    public void findNewspaper(){
        this.documents.stream().filter(s -> s instanceof Newspaper).forEach(s -> System.out.println(s.toString()));
    }
    //Tim kiem theo Tap chi
    public void findJournal(){
        this.documents.stream().filter(s -> s instanceof Journal).forEach(s -> System.out.println(s.toString()));
    }
}
