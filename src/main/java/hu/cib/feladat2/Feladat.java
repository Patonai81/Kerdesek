package hu.cib.feladat2;

import java.util.HashSet;

public class Feladat {

    /**
     * Adott egy bemeneti tömb és egy célérték szám.
     * Add vissza az első olyan számpárt a tömb elemei közül tömbként mint  visszatérési érték,
     * amelyek összege a targetSum mező értéke.
     * @param input
     * @param targetSum
     * @return
     */
    public int[] find(int[] input, int targetSum){
        HashSet pair = new HashSet();

        for (int item : input){
            int potential = targetSum-item;
            if (pair.contains(potential)){
                return new int[]{potential,item};
            }else {
                pair.add(item);
            }
        }
    return new int[0];
    }

}
