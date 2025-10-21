public class App {
    public static void main(String[] args) throws Exception {
        Person aPerson = new Person();
        Person aClonePerson = aPerson; // REFERENCE
        Person aClonePerson2 = new Person(aPerson);// SHALLOW COPY 

        aPerson.alter = 4;

        System.out.println(aPerson.alter);
        System.out.println(aClonePerson.alter); // REFERENCE
        System.out.println(aClonePerson2.alter);// SHALLOW COPY 


        

        System.out.println(aClonePerson2 == aPerson); // DEEP COPYy
        System.out.println(aClonePerson == aPerson); // REFERENCE 
        
        System.out.println(aPerson.equals(aClonePerson));
        System.out.println(aPerson.equals(aClonePerson2));

    }
}
