public class Person {
    String name;
    int alter;

    public Person(){
        name = "Bart";
        alter = 5;
    }

    public Person(Person p){ 
        name = new String(p.name); // DEEP COPY 
        alter =  p.alter;
    }

    


}
