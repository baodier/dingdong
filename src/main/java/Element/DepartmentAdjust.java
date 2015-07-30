package Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuyq on 2015/7/28.
 */
public class DepartmentAdjust {
    public DepartmentAdjust() {
        this.studentPlans = new ArrayList<StudentPlanDepartment>();
    }
    public List<StudentPlanDepartment> getStudentPlans() {
        return studentPlans;
    }

    private List<StudentPlanDepartment> studentPlans;
    private SchoolPlanDepartment schoolPlan;
    public void push(StudentPlanDepartment plan) {
        if (plan != null)
            this.studentPlans.add(plan);
    }
}
