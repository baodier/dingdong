package Utils;

/**
 * Created by liuyq on 2015/8/2.
 */
public class Pair {

    public int need;
    public int left;

    public Pair() {
        this.need = 0;
        this.left = 0;
    }
    public Pair(int n) {
        this.need = n;
        this.left = n;
    }
    public Pair(int n, int l) {
        this.need = n;
        this.left = l;
    }

}
