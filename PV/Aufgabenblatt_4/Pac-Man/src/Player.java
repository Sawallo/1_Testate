public class Player extends GameObject{

    
    private final Score score = new Score();


    public Player(int x, int y){
        super(x, y);
    }


    
    public void addScore(int p){
        score.add(p);
    }
    
    
    public int getScore(){
        return score.getPunkte();
    }

    //Speicher für Score Objekt
    public Score getScoreObj(){
        return score;
    }




    @Override
    public void update() {
        //todo
    }

    @Override
    public void move() {
        //todo
    }

}
