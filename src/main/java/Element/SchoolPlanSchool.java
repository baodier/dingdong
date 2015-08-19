package Element;

import Utils.Pair;

/**
 * Created by liuyq on 2015/7/31.
 */
public class SchoolPlanSchool {
    private String level;
    private int code;
    private String name;
    private int reputation;
    private int style;
    private int plan;
    private int planBig;
    private double ratio;
    private int left;

    public SchoolPlanSchool() {
        plan = 0;
        left = 0;
        planBig = 0;
    }

    public void calPlanBig() {
        this.plan = (int)Math.ceil((double)plan * ratio);
    }


    public boolean minusOne() {
        if (this.left > 0) {
            this.left -= 1;
            return true;
        }
        return false;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getPlanBig() {
        return planBig;
    }

    public void setPlanBig(int planBig) {
        this.planBig = planBig;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getStyle() {
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }


    static public void main(String[] args) {
        double x = 0.0;
        double f = Math.floor(x);
        /*if (x - f > 0.0)
            System.out.println(f+1.0);
        else
            System.out.println(f);*/
        System.out.println(Math.ceil(1.00));
    }

}
