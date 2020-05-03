import game.World;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WorldShould {

    @Test
    public void show_me_if_the_world_is_created (){
        World world = World.create(4, 4);
        assertThat(world.getArea()).isEqualTo(16);
    }

    @Test
    public void print (){
        World world = World.create(3, 3);

        List<List> list = new ArrayList<>();
        List<Integer> rowList = new ArrayList<>();

        rowList.add(0);
        rowList.add(0);
        rowList.add(0);

        list.add(rowList);
        list.add(rowList);
        list.add(rowList);

        assertThat(world.print()).isEqualTo(list);
    }
}
