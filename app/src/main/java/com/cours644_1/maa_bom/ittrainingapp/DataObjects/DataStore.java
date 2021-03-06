package com.cours644_1.maa_bom.ittrainingapp.DataObjects;

import java.util.Date;
import java.util.List;

/**
 * Created by arnaud on 14.11.2015.
 */
public interface DataStore {

    //used in the general student list show off all student in database
    List<Student> getStudentsList();
    //used to list Studends who participe to a cours
    List<Student> getStudentsList(Cours cours);
    //used to list Students who participate to a session
    List<Student> getStudentsList(Session session);
    //used to save modification or new Student
    int save (Student srudent);
    void delete(Student student);
    Student getStudentById(int id);



    //used in the genneral teachers list show off all teachers in database
    List<Teacher> getTeachersList();
    //used to list teachers who participe to a cours
    List<Teacher> getTeachersList(Cours cours);
    //used to list teachers who participate to a session
    List<Teacher> getTeachersList(Session session);
    //used to save modification or new Student
    int save (Teacher teacher);
    void delete(Teacher teacher);
    Teacher getTeacherById(int id);

    //used in the genneral cours list show off all teachers in database
    List<Cours> getCoursList();
    Cours getCoursById(int id);
    List<Cours> getCoursFor(Student student);
    List<Cours> getCoursFor(Teacher teacher);
    int save(Cours cours);
    void delete(Cours cours);

    Session getSessionById(int id);
    //used to list session from cours
    List<Session> getSessionFor(Cours cours);
    //used to list sesson for a teacher
    List<Session> getSessionFor(Teacher teacher);
    //used to list sesson for a teacher
    List<Session> getSessionFor(Student student);
    List<Session> getAllSession(Cours cours);

    int save(Session session);
    void delete(Session session);


    Room getRoomById(int id);
    List<Room> getAvailableRooms(Date start, Date end, Session session);
    List<Room> getRooms();

    void setCours(Student student,List<Cours> selected);
    void setTeacher(Cours cours, List<Teacher> selected);

}
