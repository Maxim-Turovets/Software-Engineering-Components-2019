package database;

import java.sql.SQLException;

public class GenerationData {

    public void generateTeacher() throws SQLException {

        DbHandler dbHandler = DbHandler.getInstance();
        dbHandler.registrationTeacher("Иван", "Тищук");
        dbHandler.registrationTeacher("Николай", "Белинский");
        dbHandler.registrationTeacher("Анатолий", "Лысенко");
        dbHandler.registrationTeacher("Олександр", "Ляшко");
        dbHandler.registrationTeacher("Алексей", "Зеленский");
        dbHandler.registrationTeacher("Ольга", "Тимошенко");
        dbHandler.registrationTeacher("Юрий", "Олийник");
        dbHandler.registrationTeacher("Наталья", "Талах");
        dbHandler.registrationTeacher("Алина", "Белоножко");
    }

    public void generateScience() throws SQLException {
        DbHandler dbHandler = DbHandler.getInstance();
        dbHandler.registrationScience(1,"Философия");
        dbHandler.registrationScience(2,"Математика");
        dbHandler.registrationScience(3,"История");
        dbHandler.registrationScience(4,"Екология");
        dbHandler.registrationScience(5,"Программирование");
        dbHandler.registrationScience(6,"Правознавство");
        dbHandler.registrationScience(7,"Физ-воспитание");
        dbHandler.registrationScience(8,"Економика");
        dbHandler.registrationScience(9,"География");
        dbHandler.registrationScience(1,"Биология");
        dbHandler.registrationScience(2,"Астрономия");
        dbHandler.registrationScience(3,"Литература");
        dbHandler.registrationScience(4,"Физика");
        dbHandler.registrationScience(5,"Анг-язык");
    }


    public  void  generateStudent() throws SQLException{
        DbHandler dbHandler = DbHandler.getInstance();
        dbHandler.registrationStudent("Коля","Какойто",1);
        dbHandler.registrationStudent("Михаил","Белый",1);
        dbHandler.registrationStudent("Алексей","Соловко",1);
        dbHandler.registrationStudent("Виктория","Белинская",2);
        dbHandler.registrationStudent("Андрей","Сикорский",3);
        dbHandler.registrationStudent("Костя","Копелец",3);
        dbHandler.registrationStudent("Анна","Герман",2);
        dbHandler.registrationStudent("Наталья","Мосейчук",4);
        dbHandler.registrationStudent("Василий","Голобородько",4);
        dbHandler.registrationStudent("Антон","Неизвестный",4);
    }



}
