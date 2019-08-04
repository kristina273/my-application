package hr.ferit.kristinaopacak.ljetopokusaj100;

public class Kategorija {

    private String Name;
    private int Photo;

    public Kategorija() {
    }

    public Kategorija(String name, int photo) {
        Name = name;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoto(int photo){
        Photo = photo;
    }
}
