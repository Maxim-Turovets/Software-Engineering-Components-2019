package database;

import org.sqlite.JDBC;

import java.sql.*;
import java.util.*;

public class DbHandler {


    private static final String CON_STR = "jdbc:sqlite:C:/Users/mturo/IdeaProjects/Shcool_DataBase(MaxT_lab5)/base.db";

    private static DbHandler instance = null;

    public static synchronized DbHandler getInstance() throws SQLException {
        if (instance == null)
            instance = new DbHandler();
        return instance;
    }

    private Connection connection;
    private int clas;

    private DbHandler() throws SQLException {
        // Регистрируем драйвер, с которым будем работать
        // в нашем случае Sqlite
        DriverManager.registerDriver(new JDBC());
        // Выполняем подключение к базе данных
        this.connection = DriverManager.getConnection(CON_STR);
    }

    private int getIndexStudent(String name) {

        int z=-12 ;
        try
        {
            Statement statement = this.connection.createStatement();
            ResultSet a = statement.executeQuery("Select  id_student from all_students\n" +
                    "where name_student ='"+name+"'");

             z = a.getInt("id_student");
             statement.close();

        } catch (SQLException e) {
            System.out.println("Нет информации");
            System.exit(0);
        }
       return  z;
    }
    private int getIndexClass(String name) {

        int z=-12 ;
        try
        {
            Statement statement = this.connection.createStatement();
            ResultSet a = statement.executeQuery("Select  class_id from all_students\n" +
                    "where name_student ='"+name+"'");

            z = a.getInt("class_id");
            statement.close();

        } catch (SQLException e) {
            System.out.println("Нет информации");
            System.exit(0);
        }
        return  z;
    }

    public void registrationTeacher(String name , String lastname) {

        try
        {
            Statement statement = this.connection.createStatement();
            statement.executeQuery("insert  into teachers (name,lastname) values ('" +name+"','"+lastname+"')");

        } catch (SQLException e) {
        }
    }

    public   void registrationStudent(String name ,String lastname,int classId)
    {
        try
        {
            Statement statement = this.connection.createStatement();
            statement.execute("insert  into all_students (name_student,lastname_student,class_id) values ('" +name+"','"+lastname+"',"+classId+")");
            statement.close();
            generateRatingThisStudent(getScienceIndexes(classId),getIndexStudent(name));
            clas = classId;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public  void registrationScience(int teacherId ,String name)
    {
        try
        {
            Statement statement = this.connection.createStatement();
            statement.executeQuery("insert  into all_science (teacher_id,name) values (" + teacherId+ ",'"+name+"')");

        } catch (SQLException e) {
//            e.printStackTrace();
        }
    }

    private  ArrayList<Integer> getScienceIndexes(int classId) throws SQLException, ClassNotFoundException {
        Array scienses;
        Statement statement = this.connection.createStatement();
        ResultSet a = null;
        ResultSet b = null;
        try {
            a = statement.executeQuery("SELECT science_id from classes where class_id="  +classId);

           return getArrayIntegerCollum(a);

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  null;
    }


    private   ArrayList<Integer> getArrayIntegerCollum (ResultSet rs) throws SQLException,  ClassNotFoundException{
        ArrayList<Integer> a = new ArrayList<>();

        while(rs.next())
        {
            a.add(rs.getInt(1));

        }

        return a;
    }

    private  ArrayList<String> getStringCollum(ResultSet rs) throws SQLException,  ClassNotFoundException{
        ArrayList<String> a = new ArrayList<String>();



        while(rs.next())
        {
            a.add(rs.getString(1));
        }

        return a;
    }

    private ArrayList<String> getScienceNameArray(int indexClass) throws SQLException, ClassNotFoundException {

        ArrayList<Integer> scienceList = getScienceIndexes(indexClass);
        ArrayList<String> scienceName = new ArrayList<>();
        Statement statement = this.connection.createStatement();

        for(int i=0;i<scienceList.size();i++) {
            ResultSet rs = statement.executeQuery("Select name from all_science where science_id ="+scienceList.get(i));
            scienceName.add(rs.getString(1));
            //System.out.println(scienceName.get(i));
        }
        return  scienceName;
    }

    public  void  generateRatingThisStudent(ArrayList<Integer>scieceList,int indexStudent) throws SQLException {
        Statement statement = this.connection.createStatement();
        for(int i=0;i<scieceList.size();i++)
        {
            int rating = (int) ( Math.random() * 5 );
            int attendance = (int) ( Math.random() * 15 );
            statement.execute("insert  INTO ratings (student_id,science_id,score,attendance)values("+indexStudent+","+scieceList.get(i)+","+rating+","+attendance+")");
            statement.close();
        }
    }

    private ArrayList<Integer> getScore (int indexStudent) throws SQLException, ClassNotFoundException {
        Statement statement = this.connection.createStatement();
        ResultSet rs = statement.executeQuery("Select score from ratings where student_id ="+indexStudent);
        ArrayList<Integer> scoreList =getArrayIntegerCollum(rs);
        statement.close();
        return  scoreList;
    }

    private ArrayList<Integer> getAttendance (int indexStudent) throws SQLException, ClassNotFoundException {
        Statement statement = this.connection.createStatement();
        ResultSet rs = statement.executeQuery("Select attendance from ratings where student_id ="+indexStudent);
        ArrayList<Integer> scoreList =getArrayIntegerCollum(rs);
        statement.close();
        return  scoreList;
    }

    public String  getInfoStudent(String name) throws SQLException, ClassNotFoundException {
        int localIndexStudent = getIndexStudent(name);
        ArrayList <Integer> scores = getScore(localIndexStudent);
        ArrayList <Integer> attendances = getAttendance(localIndexStudent);
        ArrayList <String> sciences = getScienceNameArray(getIndexClass(name));
        ArrayList <String> teacherName = getTeacherNameArray(getIndexClass(name));
        ArrayList <String> teacherLasName = getTeacherLastNameArray(getIndexClass(name));

        String info=("\t   Ученик | "+name+" | Класс "+getIndexClass(name));

        System.out.println(info);

        try {
            for (int i = 0; i < scores.size(); i++) {
                System.out.println("Предмет  :  " + sciences.get(i) + ";  Балл  :  " + scores.get(i) + ";  Посещений  :" + attendances.get(i) + ";  Преподаватель  :  " + teacherName.get(i) + " " + teacherLasName.get(i));
            }
        }catch (Exception e){}
        return  null;
    }


    private ArrayList<String> getTeacherNameArray(int indexClass) throws SQLException, ClassNotFoundException {

        ArrayList<String> teacherName = new ArrayList<>();
        Statement statement = this.connection.createStatement();

        for(int i=1;i<9;i++) {
            ResultSet rs = statement.executeQuery("Select name from teachers where id="+i);
            teacherName.add(rs.getString(1));
        }
        return  teacherName;
    }
    private ArrayList<String> getTeacherLastNameArray(int indexClass) throws SQLException, ClassNotFoundException {

        ArrayList<String> teacherLastName = new ArrayList<>();


        for(int i=1;i<9;i++) {
            Statement statement = this.connection.createStatement();
            ResultSet rs = statement.executeQuery("Select lastname from teachers where rowid="+i);
            teacherLastName.add(rs.getString(1));
            statement.close();

        }
        return  teacherLastName;
    }
}