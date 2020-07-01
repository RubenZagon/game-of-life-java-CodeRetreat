import game.World;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WorldShould {


    @Test
    public void it_works (){
//        List<Integer[][]> listWorld = {};
        List<Integer> listWorld = {};

        World world = new World(listWorld);

        assertThat().isEqualTo(1);
    }

}
