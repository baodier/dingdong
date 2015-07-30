package Element;

import java.util.*;

/**
 * Created by liuyq on 2015/7/28.
 */

//学生填报的志愿：院系级别
public class StudentPlanDepartment implements Comparable<StudentPlanDepartment> {
    private long id;
    private String name;
    private boolean sex;
    private int score_big;
    private int score_small;
    private List<String> plans;
    private boolean canAdjust;
    private String admitted = "";
    private boolean inWaitingList = false;

    public StudentPlanDepartment() {
        this.id = 0L;
        this.name = "";
        this.sex = true;
        this.score_big = 0;
        this.score_small = 0;
        this.plans = new ArrayList<String>();
        this.canAdjust = false;
        this.admitted = "";
        this.inWaitingList = false;
    }

    public String plan2String() {
        String ret = "";
        for (String plan : plans)
            ret += plan+"\t";
        return ret.trim();
    }
    public String toString() {
        return id+"\t"+name+"\t"+sex+"\t"+score_big+"\t"+score_small+"\t"+plan2String()+"\t"+canAdjust+"\t"+admitted+"\t"+inWaitingList+"\n";
    }
    public void pushPlan(String one) {
        if (!one.equals(""))
            this.plans.add(one);
    }

    @Override
    public int compareTo(StudentPlanDepartment o) {
        // 按score_small排序
        if (this.getScore_small() > o.getScore_small()) {
            return -1;
        }
        if (this.getScore_small() < o.getScore_small()) {
            return 1;
        }
        return 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getScore_big() {
        return score_big;
    }

    public void setScore_big(int score_big) {
        this.score_big = score_big;
    }

    public int getScore_small() {
        return score_small;
    }

    public void setScore_small(int score_small) {
        this.score_small = score_small;
    }

    public List<String> getPlans() {
        return plans;
    }

    public void setPlans(List<String> plans) {
        this.plans = plans;
    }

    public boolean isCanAdjust() {
        return canAdjust;
    }

    public void setCanAdjust(boolean canAdjust) {
        this.canAdjust = canAdjust;
    }

    public String getAdmitted() {
        return admitted;
    }

    public void setAdmitted(String admitted) {
        this.admitted = admitted;
    }

    public boolean isInWaitingList() {
        return inWaitingList;
    }

    public void setInWaitingList(boolean inWaitingList) {
        this.inWaitingList = inWaitingList;
    }


}