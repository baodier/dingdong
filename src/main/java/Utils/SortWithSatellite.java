package Utils;

/**
 * Created by liuyq on 2015/7/28.
 */

import java.util.ArrayList;

public class SortWithSatellite {

    public static void quicksort(ArrayList<String> main, ArrayList<Float> satellite) {
        quicksort(main, satellite, 0, satellite.size() - 1);
    }

    // quicksort a[left] to a[right]
    public static void quicksort(ArrayList<String> a, ArrayList<Float> satellite, int left, int right) {
        if (right <= left) return;
        int i = partition(a, satellite, left, right);
        quicksort(a, satellite, left, i-1);
        quicksort(a, satellite, i+1, right);
    }

    // partition a[left] to a[right], assumes left < right
    private static int partition(ArrayList<String> a, ArrayList<Float> satellite,
                                 int left, int right) {
        int i = left - 1;
        int j = right;
        while (true) {
            while (less(a.get(++i), a.get(right)))      // find item on left to swap
                ;                               // a[right] acts as sentinel
            while (less(a.get(right), a.get(--j)))      // find item on right to swap
                if (j == left) break;           // don't go out-of-bounds
            if (i >= j) break;                  // check if pointers cross
            exch(a, satellite, i, j);               // swap two elements into place
        }
        exch(a, satellite, i, right);               // swap with partition element
        return i;
    }

    // is x < y ?
    private static boolean less(String x, String y) {
        //return (x < y);
        String[] sp_x = x.split("#");
        String[] sp_y = y.split("#");

        // orderid
        if (!sp_x[0].equals(sp_y[0]))
            return Integer.valueOf(sp_x[0]) < Integer.valueOf(sp_y[0]);
        else
            //itemid
            return Integer.valueOf(sp_x[1]) < Integer.valueOf(sp_y[1]);
    }

    // exchange a[i] and a[j]
    private static void exch(ArrayList<String> a, ArrayList<Float> satellite, int i, int j) {
        String swap = a.get(i);
        a.set(i, a.get(j));
        a.set(j, swap);
        float b = satellite.get(i);
        satellite.set(i,satellite.get(j));
        satellite.set(j,b);
    }
}
