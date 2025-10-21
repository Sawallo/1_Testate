public class Book extends Media {


    //Konstuktor um Superkonstruktor aufzurufen
    Book(int year){
        super(year);
    }

    public static void main(String[] args) {

        Book b = new Book(2015);
        
        System.out.println(b.author);
        System.out.println(b.title);
        System.out.println(b.year);

    }


}
