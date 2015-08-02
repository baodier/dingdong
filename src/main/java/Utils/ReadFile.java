package Utils;

import Element.DepartmentAdjust;
import Element.SchoolAdjust;
import Element.SchoolPlanDepartment;
import Element.StudentPlanDepartment;


import java.io.*;
import java.util.*;

/**
 * Created by liuyq on 2015/7/28.
 */
public class ReadFile {
    static public void pr(String str) {
        System.out.println(str);
    }

    public static SchoolPlanDepartment readinSchoolPlan(String filename) {
        SchoolPlanDepartment schoolPlanDepartment = new SchoolPlanDepartment();
        HashMap<String, Pair> plans = new HashMap<String, Pair>();
        schoolPlanDepartment.setCode(10001);
        schoolPlanDepartment.setLevel("本一A");
        schoolPlanDepartment.setName("北京大学");
        schoolPlanDepartment.setReputation(100);
        schoolPlanDepartment.setStyle(1);//1:综合

        try {
            int countline = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(filename), "utf-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] sp = line.trim().split("\t");
                if (sp.length != 2) {
                    pr(line);
                    continue;
                }
                countline += 1;
                String dep = sp[0];
                int need = Integer.valueOf(sp[1]);
                Pair plan = new Pair(need);
                plans.put(dep, plan);
            }
            schoolPlanDepartment.setPlans(plans);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        pr(schoolPlanDepartment.toString());
        return schoolPlanDepartment;
    }
    public static List<StudentPlanDepartment> readinDepartmentAdjust(String filename) {
        //DepartmentAdjust departmentAdjust = new DepartmentAdjust();
        List<StudentPlanDepartment> studentPlanDepartmentList = new ArrayList<StudentPlanDepartment>();
        try {
            int countline = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(filename), "utf-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                StudentPlanDepartment plan = new StudentPlanDepartment();
                String[] sp = line.trim().split("\t");
                if (sp.length != 12) {
                    pr(line);
                    continue;
                }
                countline += 1;
                if (countline%100000 == 0)
                    System.out.println(countline);

                plan.setId(Long.valueOf(sp[0]));
                plan.setName(sp[1]);
                plan.setSex(sp[2].equals("男"));
                plan.setScore_big(Integer.valueOf(sp[3]));
                plan.setScore_small(Integer.valueOf(sp[4]));
                for (int i=0; i<6; i++)
                    plan.pushPlan(sp[i+5]);
                plan.setCanAdjust(sp[11].equals("是"));
                studentPlanDepartmentList.add(plan);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Collections.sort(departmentAdjust.getStudentPlans());
        for (StudentPlanDepartment plan : studentPlanDepartmentList)
            pr(plan.toString());
        return studentPlanDepartmentList;
    }


    static public void main(String[] args){
        List<StudentPlanDepartment> studentPlan = ReadFile.readinDepartmentAdjust("E:\\projectr\\dingdong\\data\\department_adjust.txt");
        SchoolPlanDepartment schoolPlanDepartment = ReadFile.readinSchoolPlan("E:\\projectr\\dingdong\\data\\school_plan.txt");

        DepartmentAdjust departmentAdjust = new DepartmentAdjust();
        departmentAdjust.setSchoolPlanDepartment(schoolPlanDepartment);
        departmentAdjust.setStudentPlans(studentPlan);
        departmentAdjust.process();
        for (StudentPlanDepartment plan : departmentAdjust.getStudentPlans())
            pr(plan.resultToString());
    }
}
