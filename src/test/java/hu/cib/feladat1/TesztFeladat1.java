package hu.cib.feladat1;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;


public class TesztFeladat1 {

    static TimePeriodArrayList<XItem> xItems = new TimePeriodArrayList<>();
    static XItem x1,x2,x3,x4;

    @BeforeAll
    static void init() {
        x1=new XItem("1",LocalDate.of(2021, 4, 18), LocalDate.of(2021, 4, 27));
        x2=new XItem("2",LocalDate.of(2021, 5, 18), LocalDate.of(2021, 5, 27));
        x3=new XItem("3",LocalDate.of(2021, 6, 18), LocalDate.of(2021, 6, 27));
        x4=new XItem("4",LocalDate.of(2021, 7, 18), LocalDate.of(2021, 7, 27));
        xItems.addAll(Arrays.asList(x1,x2,x3,x4));

    }

    @Test
    void testNullDate() {
        assertThat(xItems.period(LocalDate.of(2021,02,01),LocalDate.of(2021,02,18))).hasSize(0);
    }

    @Test
    void testBeforeDate() {
        assertThat(xItems.period(LocalDate.of(2021,02,01),LocalDate.of(2021,02,18))).hasSize(0);
    }

    @Test
    void testAfterDate() {
        assertThat(xItems.period(LocalDate.of(2022,02,01),LocalDate.of(2022,02,18))).hasSize(0);
    }
    @Test
    void testNonOverlap() {
        assertThat(xItems.period(LocalDate.of(2021,04,28),LocalDate.of(2021,05,14))).hasSize(0);
    }

    @Test
    void testOverlap1() {
        assertThat(xItems.period(LocalDate.of(2021, 02, 01), LocalDate.of(2021, 04, 18))).containsOnly(x1);
    }

    @Test
    void testOverlap2() {
        assertThat(xItems.period(LocalDate.of(2021,02,01),LocalDate.of(2021,04,19))).hasSize(1).containsOnly(x1);
    }

    @Test
    void testOverlap3() {
        assertThat(xItems.period(LocalDate.of(2021,04,22),LocalDate.of(2021,05,22))).hasSize(2).containsOnly(x1,x2);
    }



}
