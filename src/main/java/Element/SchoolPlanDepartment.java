package Element;

import java.util.Map;

/**
 * Created by liuyq on 2015/7/28.
 */

//学校计划：
public class SchoolPlanDepartment {
    private String level;
    private int code;
    private String name;
    private int reputation;
    private int style;
    private Map<String, Pair> plans;

    class Pair {
        public int need;
        public int left;

        public Pair(int n, int l) {
            this.need = n;
            this.left = l;
        }
    }
    public boolean minusOneDepartment(String department) {
        if (plans.containsKey(department)) {
            Pair pair = plans.get(department);
            if (pair.left > 0) {
                plans.put(department, new Pair(pair.need, pair.left-1));
                return true;
            }
        }
        return false;
    }

    public Map<String, Pair> getPlans() {
        return plans;
    }

    public void setPlans(Map<String, Pair> plans) {
        this.plans = plans;
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


}
