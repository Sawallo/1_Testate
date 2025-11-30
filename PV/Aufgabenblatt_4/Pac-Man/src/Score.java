import java.io.Serializable;

public class Score implements Serializable{
    
    private  int punkte = 0;

    public Score(){
    }

    public void add(int p){
        this.punkte = this.punkte + p;
    }

    public int getPunkte() {
        return punkte;
    }
}
