public class Ghost extends GameObject{

    public Ghost(int x, int y){
        super(x, y);
    }

    @Override
    public void update() {
        //todo
    }

    @Override
    public void move() {
        
    }

    public void randommove(Grid<GameObject> grid) {
        int x = this.getX();
        int y = this.getY();

        int richtung = (int)(Math.random() * 4);
        int newX = x;
        int newY = y;
        if (richtung == 0) newY--; //hoch
        if (richtung == 1) newY++; //runter
        if (richtung == 2) newX--; //links
        if (richtung == 3) newX++; //rechts

        GameObject ziel = grid.get(newX, newY);
        if (!(ziel instanceof Wall) && !(ziel instanceof Ghost)) {
            try {
                grid.move(this, newX, newY);
            } catch (Exception ex) {}
    }


    }
}