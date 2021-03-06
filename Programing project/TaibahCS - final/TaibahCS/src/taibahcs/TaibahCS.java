package taibahcs;

import java.util.ArrayList;
import java.util.Scanner;

public class TaibahCS {

    public static void unlocatedCourse(ArrayList<Course> cours, ArrayList<String> str) {

        ArrayList<String> sbb = new ArrayList<>();
        for (Course kt : cours) {

            sbb.add(kt.getCousrseCode());
            if (!sbb.removeAll(str)) {
                System.out.println(kt.toString());
            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Convener convener = new Convener();
        ArrayList<String> colction = new ArrayList<>();
        ////////////////////////////////  Declare Objects for Courses ///////////////////////////
        ArrayList<Course> course = new ArrayList<>();
        course.add(new Course("CS 111", "Programming 1                            ", 4));
        course.add(new Course("CS 112", "Programming 2                            ", 4));
        course.add(new Course("CS 103", "Discrete Structures                      ", 3));
        course.add(new Course("CS 211", "Algorithms and Data Structures 1         ", 4));
        course.add(new Course("CE 211", "Introduction to Software Engineering 1   ", 4));
        course.add(new Course("CS 281", "Computer Organization and Architecture1  ", 3));
        course.add(new Course("CE 224", "Computer Networks                        ", 4));
        course.add(new Course("CE 332", "Software Modelling and Analysis          ", 4));
        course.add(new Course("CS 284", "Theory of Computation                    ", 3));
        course.add(new Course("CS 301", " Operating Systems                       ", 4));
        course.add(new Course("CS 323", "Intelligent Systems                      ", 3));
        course.add(new Course("CS 362", "Database Systems                         ", 4));
        course.add(new Course("CS 372", "Computer Graphics                        ", 4));
        course.add(new Course("CS 451", "Computer Security                        ", 4));
        course.add(new Course("CS 424", "Introduction to Parallel Computing       ", 4));

        convener.setCourse(course);

        //////////////////////////////// End Declare Objects for Courses ///////////////////////////
        ////////////////////////////////  Declare Objects for Lecturers ///////////////////////////
        //int Number_Of_Courses;
        ArrayList<Lecturers> lecturers = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();


        lecturers.add((new Lecturers(1, "Nora", "Ahmad", "Lecturer", "Algorithms", 3, 12)));
        lecturers.add((new Lecturers(2, "Nora", "Abdullah", "Lecturer", "Natural Language Processing", 3, 12)));
        lecturers.add((new Lecturers(3, "Maryam", "Mohammad", "Lecturer", "Computer Security", 3, 12)));
        lecturers.add((new Lecturers(4, "Samar", "Jamal", "Lecturer", "Software Engineering", 3, 12)));
        lecturers.add((new Lecturers(5, "Fatimah", "Ali", "Lecturer", "Computer Science", 3, 12)));
        lecturers.add((new Lecturers(6, "Hanan", "Hassan", "Lecturer", "Machine Learning", 3, 12)));

        convener.setLecturers(lecturers);
        //////////////////////////////// End Declare Objects for Lecturers ///////////////////////////

        ////////////////////////////////  Declare Objects for TAs ///////////////////////////
        ArrayList<TAs> tas = new ArrayList<>();
        tas.add((new TAs(7, "Abrar", "Talal", "TA", "Computer Security", 4, 14)));
        tas.add((new TAs(8, "Rawan", "Omar", "TA", "Computer Science", 4, 14)));
        tas.add((new TAs(9, "Jameelah", "Adel ", "TA", "Computer Science", 4, 14)));
        tas.add((new TAs(10, "Huda", "Abdulmajeed ", "TA", "Software Engineering", 4, 14)));
        tas.add((new TAs(11, "Mohammed", "Majed", "TA", "Software Engineering", 4, 14)));
        tas.add((new TAs(12, "Lama", "Osama", "TA", "Computer Science ", 4, 14)));
        tas.add((new TAs(13, "Noor", "Ayman", "TA", "Machine Learning ", 4, 14)));

        convener.setTas(tas);
        ////////////////////////////////  Declare Objects for TAs ///////////////////////////

        ////////////////////////////////  Declare Objects for Convener ///////////////////////////
        ArrayList<String> _courses = new ArrayList<>();
        _courses.add("CS111");
        _courses.add("CS112");
        convener.set_courses(_courses);
        ArrayList<String> members = new ArrayList<>();
        members.add("001");
        members.add("005");
        members.add("010");
        members.add("011");
        convener.setmembers(members);

        ArrayList<Convener> cc1 = new ArrayList<>();
        cc1.add(new Convener(14, "Najwa", "Ahmad", "Assistant Professor", "Computer Science", convener.get_courses(), convener.getmembers()));
        cc1.add(new Convener(15, "Ali", "Khaled", "Assistant Professor", "Computer Science", convener.get_courses(), convener.getmembers()));
        cc1.add(new Convener(16, "Sara", "Ibrahim", "Assistant Professor", "Computer Security", convener.get_courses(), convener.getmembers()));
        cc1.add(new Convener(17, "Layla", "Mohammad", "Assistant Professor", "Intelligent Systems", convener.get_courses(), convener.getmembers()));
        cc1.add(new Convener(18, "Mohammad", "Mostafa", "Assistant Professor", "Machine Learning", convener.get_courses(), convener.getmembers()));
        //////////////////////////////// End  Declare Objects for Convener ///////////////////////////

        int choice = 0;
        do {
            System.out.println("Plase use teh operation you Want : "
                    + "\nIF you want Convener course Enter 1 "
                    + "\nIF you want Lecturers course Enter 2 "
                    + "\nIF you want TA (Teaching Assistant) course Enter 3 "
            );

            int num = input.nextInt();

            switch (num) {
                case 1:
                    ArrayList<String> j = new ArrayList<>();
                    ArrayList<String> o = new ArrayList<>();
                    System.out.println("Enter your ID : ");
                    int c = input.nextInt();

                    for (Convener cb : cc1) {
                        if (cb.getFacultyID() == c) {
                            System.out.println("1- Allocate course\n"
                                    + "2- Drop course\n"
                                    + "3- Print a report ");
                            System.out.println("Plase use teh operation you Want : ");
                            int num1 = input.nextInt();
                            switch (num1) {
                                case 1:
                                    System.out.println(lecturers);
                                    System.out.println(tas);

                                    unlocatedCourse(course, colction);

                                    System.out.println("Enter ID Course : ");
                                    int idcourse = input.nextInt();

                                    System.out.println("Enter ID Member : ");
                                    int idmember = input.nextInt();

                                    int current_hourse = 0;
                                    int current_course = 0;

                                    for (Course m : course) {

                                        if (idcourse == m.getID()) {
                                            j.add(m.getCousrseCode());
                                            current_hourse += m.getCreditHours();

                                        }
                                    }
                                    for (Lecturers lec : lecturers) {
                                        if (idmember == lec.getFacultyID()) {

                                            if (lec.getcurrentcourse() < lec.getMaxmimumMumberOfCourse()) {
                                                if (lec.getcurrenthourse() < lec.getQuotaOfCreditHourse()) {
                                                    lec.setcurrentcourse(lec.getcurrentcourse() + current_course + 1);
                                                    lec.setcurrenthourse(lec.getcurrenthourse() + current_hourse);
                                                    str.add(lec.getAssignedCourses().toString());

                                                    o.addAll(j);
                                                    o.addAll(str);
                                                    convener.allocateCourse(o, idmember);
                                                    str.remove(0);

                                                    System.out.println(lec.toString());

                                                }

                                            } else {
                                                System.out.println("\n number of course OR number of hours  is full \n");
                                            }

                                        }
                                    }

                                    for (TAs taz : tas) {
                                        if (idmember == taz.getFacultyID()) {

                                            if (taz.getcurrentcourse() < taz.getMaxmimumMumberOfCourse()) {
                                                if (taz.getcurrenthourse() < taz.getQuotaOfCreditHourse()) {
                                                    taz.setcurrentcourse(taz.getcurrentcourse() + current_course + 1);
                                                    taz.setcurrenthourse(taz.getcurrenthourse() + current_hourse);
                                                    str.add(taz.getAssignedCourses().toString());

                                                    o.addAll(j);
                                                    o.addAll(str);
                                                    convener.allocateCourse(o, idmember);
                                                    str.remove(0);

                                                    System.out.println(taz.toString());

                                                }

                                            } else {
                                                System.out.println("\n number of course OR number of hours  is full \n");
                                            }

                                        }

                                    }

                                    colction.addAll(o);
                                    break;
                                case 2:
                                    System.out.println(course);
                                    System.out.println("Enter ID Course : ");

                                    int v = input.nextInt();

                                    convener.dropCourse(course.remove(v - 1));

                                    System.out.println(course);

                                    break;
                                case 3:
                                    System.out.println(course);
                                    System.out.println(lecturers);
                                    System.out.println(tas);
                                    unlocatedCourse(course, colction);

                                    System.out.println(cc1.toString());
                                    break;
                            }

                        }

                    }

                    break;

                case 2:
                    System.out.println("Enter your ID : ");
                    int n = input.nextInt();

                    for (Lecturers ob : lecturers) {
                        if (ob.getFacultyID() == n) {
                            System.out.println(ob);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Enter your ID : ");
                    int D = input.nextInt();

                    for (TAs tb : tas) {
                        if (tb.getFacultyID() == D) {
                            System.out.println(tb.toString());
                            break;
                        }

                    }
                    break;

                default:
                    System.out.println("chosen Erroe");

            }

        } while (choice != 5);
    }
}
