public class Media {

    //Variablen
    String title;
    String author;
    int year;

    //Konstrunktoren
    Media(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    Media(int year){
        this("n.a.", "n.a.", year);
    }
}
