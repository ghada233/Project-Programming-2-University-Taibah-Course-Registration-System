/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taibahcs;

import java.util.ArrayList;

/**
 *
 * @author M
 */
public class Convener extends FacultyMember {

//    TAs ta = new TAs();
//    Lecture le = new Lecture();
//    String[] courses = {};
//    String[] members = {};
    public ArrayList<Course> course = new ArrayList<>();
    private ArrayList<Lecturers> lecturers = new ArrayList<>();
    private ArrayList<TAs> tas = new ArrayList<>();
    private ArrayList<String> members = new ArrayList<>();
    private ArrayList<String> _courses = new ArrayList<>();

    public Convener() {
    }

    public Convener(int FacultyID, String firstName, String lastName, String academicRank, String academicSpecialization, ArrayList<String> courses, ArrayList<String> member) {
        super(FacultyID, academicRank, firstName, lastName, academicSpecialization);

          this._courses = courses;
        this.members = member;
    }

    public void allocateCourse( ArrayList<String> mmm , int x) {
      for(Lecturers e : lecturers){
          if(e.getFacultyID() == x){
            e.setAssignedCourses(mmm);
      }
      }
      for(TAs e : tas){
          if(e.getFacultyID() == x){
            e.setAssignedCourses(mmm);
      }
      }
    }
   
               
     public void dropCourse(Course c) {
        course.remove(c);
    }
    
    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public ArrayList<Lecturers> getLecturers() {
        return lecturers;
    }

    public void setLecturers(ArrayList<Lecturers> lecturers) {
        this.lecturers = lecturers;
    }

    public ArrayList<TAs> getTas() {
        return tas;
    }

    public void setTas(ArrayList<TAs> tas) {
        this.tas = tas;
    }

    public ArrayList<String> getmembers() {
        return members;
    }

    public void setmembers(ArrayList<String> members) {
        this.members = members;
    }

    public ArrayList<String> get_courses() {
        return _courses;
    }

    public void set_courses(ArrayList<String> _courses) {
        this._courses = _courses;
    }

    @Override
    public String toString() {
          return "FacultyID : " + super.getFacultyID()+ " firstName : " 
                + super.getFirstName()  +" lastName : " + super.getLastName() + " academicRank : "
                + super.getAcademicRank() + " academicSpecialization : " + super.getAcademicSpecialization() + " courses : " + get_courses() + " Memebers : " + getmembers()+"\n";
        
       // return ( super.toString()   +  );
    }

}
