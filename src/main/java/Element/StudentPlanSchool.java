package Element;

import java.util.List;

/**
 * Created by liuyq on 2015/7/31.
 */
public class StudentPlanSchool implements Comparable<StudentPlanSchool> {
    private long id;
    private String name;
    private boolean sex;
    private int score_big;
    private int score_small;
    private List<String> plans;
    private String  district;
    private String school = "";
    private boolean isAdmited = false;


    //返回值：0：正确 1：输入格式有问题
    public int admit(boolean admit, String schoolAdmitted) {
        if (schoolAdmitted == null || schoolAdmitted.equals(""))
            return 1;
        if (admit)
            this.school = schoolAdmitted;
        else
            this.school = "";
        this.isAdmited = admit;
        return 0;
    }
    @Override
    public int compareTo(StudentPlanSchool o) {
        // 按score_small排序
        if (this.getScore_big() > o.getScore_big()) {
            return -1;
        }
        if (this.getScore_big() < o.getScore_big()) {
            return 1;
        }
        return 0;
    }

    public boolean isAdmited() {
        return isAdmited;
    }

    public void setAdmited(boolean isAdmited) {
        this.isAdmited = isAdmited;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }



}
