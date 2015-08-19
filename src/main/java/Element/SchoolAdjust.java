package Element;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liuyq on 2015/7/28.
 */
public class SchoolAdjust {
    private List<StudentPlanSchool> studentPlanSchools;
    private HashMap<String, SchoolPlanSchool> schoolPlanSchoolHashMap;

    public void sort() {
        Collections.sort(studentPlanSchools);
    }

    public void process() {
        // 先对所有学生按照投档分进行排序
        this.sort();

        // 对学生逐个进行学校录取
        for (StudentPlanSchool studentPlan : studentPlanSchools)
            processOneStudent(studentPlan);
    }

    public void processOneStudent(StudentPlanSchool studentPlanSchool) {
        for (String school : studentPlanSchool.getPlans()) {
            if (schoolPlanSchoolHashMap.containsKey(school)) {
                SchoolPlanSchool schoolPlanSchool = schoolPlanSchoolHashMap.get(school);
                if (schoolPlanSchool.minusOne()) {
                    studentPlanSchool.admit(true, school);
                    return;
                }
            }
        }
        studentPlanSchool.admit(false, "");
    }


    public static void main(String[] args) {
        class MyTest {
            public int a;
            public int b;

            public MyTest(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public String toString() {
                return this.a+"\t"+this.b;
            }
        }

        HashMap<String, MyTest> tst = new HashMap<String, MyTest>();
        MyTest m1 = new MyTest(1,2);
        tst.put("11", m1);

        MyTest m2 = tst.get("11");
        m2.a = 10;
        m2.b = 20;
        System.out.println(tst.toString());

    }
}
