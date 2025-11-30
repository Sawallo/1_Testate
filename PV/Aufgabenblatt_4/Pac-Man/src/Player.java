public class Player extends GameObject{


    private Score score = new Score();


    public Player(int x, int y){
        super(x, y);
    }


    //Punkte hinzufügen
    public void addScore(int p){
        score.add(p);
    }
    
    //Punkte abfragen
    public int getScore(){
        return score.getPunkte();
    }

    //Speicher für Score Objekt
    public Score getScoreObj(){
        return score;
    }








    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

}
