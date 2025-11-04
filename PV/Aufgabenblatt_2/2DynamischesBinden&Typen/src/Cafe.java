/**
 * A Class, showing information about different drinks in a cafe.
 */

public class Cafe {

    public static void main(String[] args) {

        IcedTea icedTea = new IcedTea();
        Coffee coffee = new Coffee();
        Drink espresso = new Coffee();
        Drink lemon = icedTea;
        
        System.out.println("1: coffee.temperature           		: " + coffee.temperature);  // compiler schaut nach ob in coffee temperature angelegt ist 
        System.out.println("2: icedTea.getTemperature()     		: " + icedTea.getTemperature());  // iced Tea hat nicht die Methode getTemperature aber da icedTea eine subklasse ist erbt sie diese  
        System.out.println("3: coffee.getTemperature()      		: " + coffee.getTemperature()); // hier hat coffee die methode getTempreture 
        System.out.println("4: ((IcedTea) lemon).temperature		: " + ((IcedTea) lemon).temperature); // Da Attribute nicht dynamisch gebunden werden übernimmt der Type-Cast hier die zuordnung weil 
        System.out.println("5: ((Drink) coffee).temperature 		: " + ((Drink) coffee).temperature); // im vorfeld schon gesagt wurde von welchem typ diese Attribute sind 
        System.out.println("6: ((Drink) espresso).getTemperature()	: " + ((Drink) espresso).getTemperature()); // Der Interpreter schaut nicht nach Typen deswegen ist espresso ein Coffee statt ein Drink 
        System.out.println("7: Ist dieser Cast möglich? icedTea = (IcedTea)((Drink)coffee);"); // Nur sichtbare und überschriebene Methoden werden gebunden

    }
}