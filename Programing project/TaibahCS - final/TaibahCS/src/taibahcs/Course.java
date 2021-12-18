/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taibahcs;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author M
 */
public class Course extends FacultyMember {

    /// ArrayList<Course> asd = new ArrayList<>();
    private String cousrseCode;
    private String courseName;
    private int creditHours;
    private long ID=0;
    private static final AtomicLong count = new AtomicLong(0);
  

//    public Course(String CousrseCode,String CourseName, int CreditHours, int FacultyID, String firstName, String lastName, String academicRank, String academicSpecialization) {
//
//        super(FacultyID, firstName, lastName, academicRank, academicSpecialization);
//        this.cousrseCode = CousrseCode;
//           this.courseName = CourseName;
//        this.creditHours = CreditHours;
//     
//
//    }
      public Course() {
    }

    public Course(String CousrseCode , String CourseName , int CreditHours) {
        this.cousrseCode = CousrseCode;
        this.creditHours = CreditHours;
        this.courseName = CourseName;
        ID = count.incrementAndGet();
       
    }

    public String getCousrseCode() {
        return cousrseCode;
    }

    public void setCousrseCode(String CousrseCode) {
        this.cousrseCode = CousrseCode;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int CreditHours) {
        this.creditHours = CreditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String CourseName) {
        this.courseName = CourseName;
    }



       public double getID() {
       
        return ID;
       }
     



    @Override
    public String toString() {
//        return "CousrseCode : " + cousrseCode + "\t CourseName : " + courseName
//                + "\t CreditHours : " + creditHours +"\n" ;
       return   "\n" +ID+ "\t\t"+ cousrseCode + "\t\t" +courseName +"\t "
          +"\t"   +  creditHours  ;


    }
}
