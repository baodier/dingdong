package luqu;

import jdbc.JdbcConnector;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import thrift.LuquService;
import thrift.SchoolInfo;
import thrift.StudentInfo;
import thrift.StudentPlan;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liuyq on 2015/8/22.
 */


class DataInMemory {
    public static List<StudentInfo> studentInfoList = new ArrayList<StudentInfo>();
    public static List<SchoolInfo> schoolInfoList = new ArrayList<SchoolInfo>();

    public static void load() {
        JdbcConnector jdbcConn = new JdbcConnector();

        try {
            // 初始化数据库连接(在finally中关闭连接)
            jdbcConn.initial("jdbc:mysql://127.0.0.1:3306/dingdong", "root", "");
            HashMap<Integer, StudentInfo> studentInfoHashMap = new HashMap<Integer, StudentInfo>();

            // 读学生基本信息表
            String sql = "select * from add_studentbaseinfo";
            System.out.println(sql);
            Statement sql_statement = jdbcConn.conn.createStatement();
            ResultSet result = sql_statement.executeQuery(sql);
            while (result.next()) {
                StudentInfo studentInfo = new StudentInfo();

                int id = result.getInt("student_id");
                String name = result.getString("name");
                System.out.println(id+"\t"+name);
                int sex = result.getInt("sex");
                float score_big = result.getFloat("score_big");
                float score_small = result.getFloat("score_small");
                //float score_add = result.getFloat("score_add");
                String district = result.getString("district");
                String school = result.getString("school");

                studentInfo.setName(name);
                if (sex == 1)
                    studentInfo.setSex(true);
                else
                    studentInfo.setSex(false);
                studentInfo.setScore_big(score_big);
                studentInfo.setScore_small(score_small);
                studentInfo.setDistrict(district);
                studentInfo.setGraduate_school(school);

                studentInfoHashMap.put(id, studentInfo);
            }
            System.out.println(studentInfoHashMap);

            // 读学生学校志愿表
            sql = "select * from add_studentplanschool";
            System.out.println(sql);
            result = sql_statement.executeQuery(sql);
            while (result.next()) {
                List<StudentPlan> studentPlanList = new ArrayList<StudentPlan>();

                int id = result.getInt("student_id");
                for (int i=1; i<7; i++) {
                    String school = result.getString("school"+i);
                    StudentPlan studentPlan = new StudentPlan();
                    studentPlan.setSchool(school);
                    System.out.println(studentPlan);
                    studentPlanList.add(studentPlan);
                }

                StudentInfo studentInfo = studentInfoHashMap.get(id);
                if (studentInfo != null) {
                    System.out.println(id);
                    studentInfo.setPlans(studentPlanList);
                    studentInfoHashMap.put(id, studentInfo);
                }
            }
            System.out.println(studentInfoHashMap);

            // 读学生院系志愿表
            sql = "select * from add_studentplanschooldepartment";
            System.out.println(sql);
            result = sql_statement.executeQuery(sql);
            while (result.next()) {
                List<StudentPlan> studentPlanList = new ArrayList<StudentPlan>();

                int id = result.getInt("student_id");
                for (int i=1; i<7; i++) {
                    String school = result.getString("school"+i);
                    StudentPlan studentPlan = new StudentPlan();
                    studentPlan.setSchool(school);
                    System.out.println(studentPlan);
                    studentPlanList.add(studentPlan);
                }

                StudentInfo studentInfo = studentInfoHashMap.get(id);
                if (studentInfo != null) {
                    System.out.println(id);
                    studentInfo.setPlans(studentPlanList);
                    studentInfoHashMap.put(id, studentInfo);
                }
            }
            System.out.println(studentInfoHashMap);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            jdbcConn.close();
        }
    }
}

public class Luqu {

    private static int numberThreads = 10;
    private static int port = 9090;

    static public void main(String[] args) {
        DataInMemory.load();
        TServerSocket serverSocket = null;
        try {
            serverSocket = new TServerSocket(port, 100000);
        } catch (TTransportException e) {
            e.printStackTrace();
        }
        LuquService.Processor gdProcessor  = new LuquService.Processor(new LuquHandler());
        if (args.length > 0) {
            numberThreads = Integer.parseInt(args[0]);
        }
        TThreadPoolServer.Args serverArgs = new TThreadPoolServer.Args(serverSocket);
        serverArgs.maxWorkerThreads(numberThreads);
        TServer thriftServer = new TThreadPoolServer(serverArgs.processor(gdProcessor).protocolFactory(new TBinaryProtocol.Factory()));
        thriftServer.serve();


    }
}
