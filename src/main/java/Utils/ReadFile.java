package Utils;

import Element.DepartmentAdjust;
import Element.SchoolAdjust;
import Element.StudentPlan;

import java.io.*;
import java.util.Collections;

/**
 * Created by liuyq on 2015/7/28.
 */
public class ReadFile {
    static public void pr(String str) {
        System.out.println(str);
    }

    public static DepartmentAdjust readinDepartmentAdjust(String filename) {
        DepartmentAdjust departmentAdjust = new DepartmentAdjust();
        try {
            int countline = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(filename), "utf-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                StudentPlan plan = new StudentPlan();
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
                departmentAdjust.push(plan);
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

        Collections.sort(departmentAdjust.getStudentPlans());
        for (StudentPlan plan : departmentAdjust.getStudentPlans())
            pr(plan.toString());
        return departmentAdjust;
    }


    static public void main(String[] args){
       ReadFile.readinDepartmentAdjust("E:\\project\\luqu\\data\\department_adjust.txt");
    }
}
