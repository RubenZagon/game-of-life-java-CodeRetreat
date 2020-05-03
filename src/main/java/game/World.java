package game;

import java.util.ArrayList;
import java.util.List;

public class World {

    private Integer rows;
    private Integer columns;

    private World(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public static World create(Integer rows, Integer columns) {
        if(rows < 3 || columns < 3){
            return new World(3, 3);
        }
        return new World(rows, columns);
    }

    public Integer getArea(){
        return rows * columns;
    }

    public List<List> print(){

        List<List> list = new ArrayList<>();
        List<Integer> rowList = new ArrayList<>();

        for (int i= 0; i < rows; i++){
            for (int j= 0; j < columns; j++){
                rowList.add(0);
            }
            list.add(rowList);
        }

        return list;
    }
}
