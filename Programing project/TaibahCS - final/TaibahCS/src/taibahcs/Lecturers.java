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
public class Lecturers extends FacultyMember {

    private int maxmimumMumberOfCourse;
    private int quotaOfCreditHourse;
    private ArrayList<String> assignedCourses = new ArrayList<>();

    private int currenthourse = 0;
    private int currentcourse = 0;

    public Lecturers() {
    }

    public Lecturers(int FacultyID, String firstName, String lastName, String academicRank, String academicSpecialization, int maxmimumMumberOfCourse, int quotaOfCreditHourse, ArrayList<String> s) {
        super(FacultyID, firstName, lastName, academicRank, academicSpecialization);
        this.maxmimumMumberOfCourse = maxmimumMumberOfCourse;
        this.quotaOfCreditHourse = quotaOfCreditHourse;
        this.assignedCourses = s;
    }

    public Lecturers(int FacultyID, String firstName, String lastName, String academicRank, String academicSpecialization, int maxmimumMumberOfCourse, int quotaOfCreditHourse) {
        super(FacultyID, firstName, lastName, academicRank, academicSpecialization);
        this.maxmimumMumberOfCourse = maxmimumMumberOfCourse;
        this.quotaOfCreditHourse = quotaOfCreditHourse;

    }

    public int getMaxmimumMumberOfCourse() {
        return maxmimumMumberOfCourse;
    }

    public void setMaxmimumMumberOfCourse(int maxmimumMumberOfCourse) {
        this.maxmimumMumberOfCourse = maxmimumMumberOfCourse;
    }

    public int getQuotaOfCreditHourse() {
        return quotaOfCreditHourse;
    }

    public void setQuotaOfCreditHourse(int quotaOfCreditHourse) {
        this.quotaOfCreditHourse = quotaOfCreditHourse;
    }

    public ArrayList<String> getAssignedCourses() {
        return assignedCourses;
    }

    public void setAssignedCourses(ArrayList<String> s) {

        this.assignedCourses = s;
    }

    public void setcurrentcourse(int currentcourse) {
        this.currentcourse = currentcourse;
    }

///////////////////////////////////////////////
    public void setcurrenthourse(int currenthourse) {
        this.currenthourse = currenthourse;
    }

    public int getcurrenthourse() {
        return currenthourse;
    }
/////////////////////////////////////////

    public int getcurrentcourse() {
        return currentcourse;
    }

    @Override
    public String toString() {

        return "FacultyID : " + super.getFacultyID() + " firstName : "
                + super.getFirstName() + " lastName : " + super.getLastName() + " academicRank : "
                + super.getAcademicRank() + " academicSpecialization : " + super.getAcademicSpecialization() + "  Current Courses : " + getcurrentcourse() + " maxmimumMumberOfCourse : " + maxmimumMumberOfCourse + " Current Hours : " + getcurrenthourse() + " quotaOfCreditHourse : "
                + quotaOfCreditHourse + " assignedCourses : " + assignedCourses + "\n";
    }

}
