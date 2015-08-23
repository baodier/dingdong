package Element;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by liuyq on 2015/7/28.
 */
public class DepartmentAdjust_2 {

    private List<StudentPlanDepartment> studentPlans;
    private SchoolPlanDepartment schoolPlanDepartment;

    public DepartmentAdjust_2() {
        this.studentPlans = new ArrayList<StudentPlanDepartment>();
    }

    public List<StudentPlanDepartment> getStudentPlans() {
        return studentPlans;
    }
    public void setStudentPlans(List<StudentPlanDepartment> studentPlans) {
        this.studentPlans = studentPlans;
    }

    public SchoolPlanDepartment getSchoolPlanDepartment() {
        return schoolPlanDepartment;
    }

    public void setSchoolPlanDepartment(SchoolPlanDepartment schoolPlanDepartment) {
        this.schoolPlanDepartment = schoolPlanDepartment;
    }
    public void push(StudentPlanDepartment plan) {
        if (plan != null)
            this.studentPlans.add(plan);
    }

    public void sort() {
        Collections.sort(studentPlans);
    }

    public void process() {
        // 先对所有学生按照实考分进行排序
        this.sort();

        // 对学生逐个进行志愿录取
        for (StudentPlanDepartment studentPlan : studentPlans)
            processOneStudent(studentPlan);
    }

    public void processOneStudent(StudentPlanDepartment studentPlan) {
        for (String department : studentPlan.getPlans()) {
            if (schoolPlanDepartment.minusOneDepartment(department)) {
                studentPlan.admit(department);
                return;
            }
        }
        if (studentPlan.isCanAdjust())
            studentPlan.waitlist();
        else
            studentPlan.fail();
    }

    public void printStudentStatus() {
        for (StudentPlanDepartment studentPlan : studentPlans) {
            System.out.println(studentPlan.resultToString());
        }
    }
}
