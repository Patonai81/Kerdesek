package hu.cib.feladat1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class TesztFeladat2 {

    static TimePeriodArrayList<XItem> xItems = new TimePeriodArrayList<>();
    static List<XItemConfig> configList = new ArrayList<>();

    static XItem x1, x2, x3, x4;

    @BeforeAll
    static void init() {
        x1 = new XItem("1", LocalDate.of(2020, 4, 18), LocalDate.of(2020, 4, 27));
        x2 = new XItem("2", LocalDate.of(2020, 5, 18), LocalDate.of(2021, 7, 27));
        x3 = new XItem("3", LocalDate.of(2021, 6, 18), LocalDate.of(2021, 12, 27));
        x4 = new XItem("4", LocalDate.of(2020, 7, 18), LocalDate.of(2023, 12, 27));
        xItems.addAll(Arrays.asList(x1, x2, x3, x4));

        XItemConfig config0 = new XItemConfig();
        config0.setPeriod_max(0);
        config0.setConfigValue("max 1");

        XItemConfig config1 = new XItemConfig();
        config1.setPeriod_max(5);
        config1.setConfigValue("max 5");

        XItemConfig config2 = new XItemConfig();
        config2.setPeriod_max(2);
        config2.setConfigValue("max 2");

        XItemConfig config3 = new XItemConfig();
        config3.setPeriod_max(20);
        config3.setConfigValue("max 20");

        configList.addAll(Arrays.asList(config0,config1,config2,config3));

    }

    @Test
    void testItemsSize() {
        assertThat(xItems.config(configList)).hasSize(4);
    }

    @Test
    void testConfigItemsNonNull() {
        assertThat(xItems.config(configList)).filteredOn( item -> !item.configValue.equals(null));
        assertThat(xItems.config(configList)).filteredOn( item -> !item.configValue.equals(""));
    }

    @Test
    void testConfigItemsHasOne() {
        assertThat(xItems.config(configList)).filteredOn( item -> item.configValue.equals("max 1")).hasSize(1);
    }

    @Test
    void testConfigItemsHasTwo() {
        assertThat(xItems.config(configList)).filteredOn( item -> item.configValue.equals("max 5")).hasSize(2);
    }

    @Test
    void testConfigItemsHasTwenty() {
        assertThat(xItems.config(configList)).filteredOn( item -> item.configValue.equals("max 20")).hasSize(1);
    }



}
