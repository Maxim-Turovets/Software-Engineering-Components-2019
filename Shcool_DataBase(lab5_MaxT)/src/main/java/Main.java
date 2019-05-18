import database.DbHandler;
import database.GenerationData;

import java.sql.SQLException;

public class Main {

    public  static  void  main(String args[]) throws ClassNotFoundException {
        try {
            // Создаем экземпляр по работе с БД
            DbHandler dbHandler = DbHandler.getInstance();

            // Generate  date
            GenerationData data = new GenerationData();
              data.generateTeacher();
              data.generateScience();
              data.generateStudent();

            dbHandler.getInfoStudent("Анна");
            dbHandler.getInfoStudent("Алексей");
            dbHandler.getInfoStudent("Наталья");


          //  dbHandler.registrationStudent("Максим","Туровец",4);




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
