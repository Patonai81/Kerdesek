package hu.cib.feladat1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TimePeriodArrayList<E extends XItem> extends ArrayList<E> {

    /**
        A TimePeriod listád XItem elemei tartalmaznak egy from, és egy to elnevezésű mezőpárost.
        A period() függvény visszaad minden olyan listaelemet, amely a bemeneten megkapott from és to
        input paraméterekkel meghatározott időintervallummal átlapolódik.
     */

    public <F extends LocalDate> List<E> period(F from, F to) {
        return null;
    }

    /**
     * A TimePeriod listád konfigurálható a bemeneten megkapott config objektum listával.
     * A config() metódus működése során kitölti a listád minden elemének 'configValue' változójának értékét a következő alapján:
     *
     * Az input listában megkapott XItemConfig objektum meghatároz egy period_max és egy hozzá tartozó config_value értéket.
     * Tekintsd a lista elemeidet egy képzeletbeli dolgozónak, aki a 'from' Localdate dátummal lépett be a céghez.
     * Minden dolgozót fel kell paraméterezni a config_value értékkel, amit az input listában megkapsz.
     * A dolgozód a belépése óta eltelt hónapokat(from érték összevetve a mai dátummal) alapján állítsd be rá a configurációs listában megkapott config_max értéket, úgy
     * hogy a configurációs listában levő legnagyobb már elért számú hónaphoz tartozó szöveget állítsd be számára az ő config_value értékét.
     *
     * Tehát ha
     *  input lista:
     *  period_max: 0, config_value: "max 0"
     *  period_max: 2 , config_value: "max 2"
     *  period_max: 5 , config_value: "max 5"
     *  period_max: 10 , config_value: "max 10"
     *
     * ha a dolgozód 3 hónapja lépett be, akkor a "max 2", ha 14 hónapja lépett be, akkor a "max 10" szöveget állítsd , tehát mindig a legközelebbi alsó küszöbértéket.
     *
     * @param config
     * @return
     */

    public List<E> config(List<XItemConfig> config) {
        return null;
    }


}
