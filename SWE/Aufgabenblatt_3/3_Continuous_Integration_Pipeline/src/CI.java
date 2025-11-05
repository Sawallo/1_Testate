public class CI {

    public String text = "Die Zahl beträgt";
    public int zahleins = 15;
    public int zahlzwei = 20;

    public int rechung(){
        return (zahleins + zahlzwei);
    }

    public String ausgabe(){
        int ges = rechung();
        return (text+" "+ges);
    }

    public static void main(String[] args) throws Exception {

        System.out.println(new CI().ausgabe());

    }
}
