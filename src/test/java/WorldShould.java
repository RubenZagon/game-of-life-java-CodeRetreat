import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WorldShould {

    // [0,0,0],[0,1,0],[0,0,1]],

    @Test
    public void it_works (){
        List<Integer> sky = new ArrayList<Integer>();
        List<Integer> ground = new ArrayList<Integer>();
        List<Integer> water = new ArrayList<Integer>();

        List<List<Integer>> world = new ArrayList<>();

        sky.add(0,0);
        sky.add(1,0);
        sky.add(2,0);

        ground.add(0,0);
        ground.add(1,0);
        ground.add(2,0);

        water.add(0,0);
        water.add(1,0);
        water.add(2,0);

        world.add(0,sky);
        world.add(1,ground);
        world.add(2,water);

        System.out.println(world);

//        assertThat().isEqualTo(1);
    }

}
