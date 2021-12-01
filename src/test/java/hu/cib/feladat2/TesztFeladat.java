package hu.cib.feladat2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TesztFeladat {

    private static int[] tmb;

    @BeforeAll
    static void init() {
        tmb = new int[]{ 1,2,3,4,5,6,7};
    }

    @Test
    public void testSum(){
        assertThat(new Feladat().find(tmb,5)).containsOnly(2,3);
    }

    @Test
    public void testSum1(){
        assertThat(new Feladat().find(tmb,13)).containsOnly(6,7);
    }

}
