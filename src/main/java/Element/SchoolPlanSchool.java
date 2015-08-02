package Element;

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

    public void calPlanBig() {
        this.plan = (int)Math.ceil((double)plan * ratio);
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
