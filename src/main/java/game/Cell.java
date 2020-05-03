package game;

import java.util.List;

public class Cell {
    private boolean life;
    private List<Cell> neighbours;

    public Cell(boolean life, List<Cell> neighbours) {
        this.life = life;
        this.neighbours = neighbours;
    }

    public boolean getState() {
        return life;
    }

    public boolean setState(boolean state) {
        return life = state;
    }


    public void iteration() {

        // under-population
        if (count(neighbours) < 2) {
            setState(false);
        }

        // survival and reproduction
        if (count(neighbours) == 2 || count(neighbours) == 3 ) {
            setState(true);
        }

        // overcrowding
        if (count(neighbours) > 3) {
            setState(false);
        }
    }

    private int count(List<Cell> neighbours) {
        if (neighbours.size() == 0) {
            return 0;
        }

        if (neighbours.get(0).getState()) {
            return 1 + count((List<Cell>) neighbours.remove(0));
        }

        return count((List<Cell>) neighbours.remove(0));
    }
}
