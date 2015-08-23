package Element;

import java.util.*;

/**
 * Created by liuyq on 2015/7/28.
 */
class StudentInfoUserdInProcess implements Comparable<StudentInfoUserdInProcess> {
    private int index_in_list;
    private float score_used;
    private String department;

    public int getIndex_in_list() {
        return index_in_list;
    }

    public void setIndex_in_list(int index_in_list) {
        this.index_in_list = index_in_list;
    }

    public float getScore_used() {
        return score_used;
    }

    public void setScore_used(float score_used) {
        this.score_used = score_used;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(StudentInfoUserdInProcess o) {
        // 按score排序
        if (this.getScore_used() > o.getScore_used()) {
            return -1;
        }
        if (this.getScore_used() < o.getScore_used()) {
            return 1;
        }

        // 保证分数相同的两个人的志愿不会交叉排放
        if (this.getIndex_in_list() < o.getIndex_in_list())
            return  1;
        if (this.getIndex_in_list() > o.getIndex_in_list())
            return -1;

        return 0;
    }
}

//学生填报的志愿：院系级别
public class StudentPlanDepartment implements Comparable<StudentPlanDepartment> {
    private long id;
    private String name;
    private boolean sex;
    private float score_big;
    private float score_small;
    private List<String> plans;
    private boolean canAdjust;
    private String admitted = "";
    private boolean inWaitingList = false;
    private boolean failed = false;

    public StudentPlanDepartment() {
        //考生志愿信息
        this.id = 0L;
        this.name = "";
        this.sex = true;
        this.score_big = 0;
        this.score_small = 0;
        this.plans = new ArrayList<String>();
        this.canAdjust = false;

        //录取结果
        this.admitted = "";
        this.inWaitingList = false;
        this.failed = false;
    }

    public String plan2String() {
        String ret = "";
        for (String plan : plans)
            ret += plan+"\t";
        return ret.trim();
    }
    public String toString() {
        return id+"\t"+name+"\t"+sex+"\t"+score_big+"\t"+score_small+"\t"+plan2String()+"\t"+canAdjust+"\t"+admitted+"\t"+inWaitingList;
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

    public boolean admit(String department) {
        if (department==null || department.equals(""))
            return false;
        this.admitted = department;
        this.inWaitingList = false;
        this.failed = false;
        return true;
    }

    public void fail() {
        this.admitted = "";
        this.inWaitingList = false;
        this.failed = true;
    }

    public void waitlist() {
        this.admitted = "";
        this.inWaitingList = true;
        this.failed = false;
    }

    public String resultToString() {
        String ret = id+"\t"+name+"\t";
        if (this.inWaitingList)
            ret += "\t等待扩招\t";
        else if (this.failed)
            ret += "\t\t退档处理";
        else
            ret += admitted+"\t\t";
        return ret;
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

    public float getScore_big() {
        return score_big;
    }

    public void setScore_big(int score_big) {
        this.score_big = score_big;
    }

    public float getScore_small() {
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
