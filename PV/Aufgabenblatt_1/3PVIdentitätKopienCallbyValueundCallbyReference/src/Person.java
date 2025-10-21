public class Person {

    int age;
    String name;


    Person(int a, String n){
        age = a;
        name = n;
    }


    Person(Person a){
        
        this.age = a.age;
        this.name = a.name;
    }



    public static void main(String[] args){
        
        Person a = new Person(30, "Bert");
        Person b = new Person(a);
        //Person b = a;

        System.out.println(a.age);
        System.out.println(b.age);
        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
