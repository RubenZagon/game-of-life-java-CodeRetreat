package game;

import java.util.List;

public class World {

    public void print(List<Integer[][]> world) {

        //    [[[0,0,0],[0,1,0],[0,0,1]], [[0,0,0],[0,1,0],[0,0,1]], [[0,0,0],[0,1,0],[0,0,1]] ]

        for (Integer[][] item :
                world) {
            for (int i = 0; i < item.length; i++) {
                for (int j = 0; j < item[i].length; j++) {
                    System.out.println(item[i][j]);
                }
                System.out.println();
            }
        }
    }
}
