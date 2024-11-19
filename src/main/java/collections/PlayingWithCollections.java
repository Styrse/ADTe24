package collections;

import entities.Course;
import entities.Student;
import util.DataReader;
import wordcounter.WordCounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PlayingWithCollections {

    public static void main(String[] args) {
        playWithLists();
        playWithSet();
        playWithMaps();

//        searchTimes();
//        timer();

    }

    public static void playWithLists() {

        // Lav en LinkedList og en ArrayList med Student-objekter. Fyld dem op med objekter ved at kalde DataReader.fillWithStudents() med din liste
        LinkedList<Student> students = new LinkedList<>();
        ArrayList<Student> students1 = new ArrayList<>();

        DataReader.fillWithStudents(students, 5);
        DataReader.fillWithStudents(students1, 5);

//        System.out.println(students);
//        System.out.println(students1);
        // Tilføj et nyt Student-objekt objekt med metoden add() til hver af listerne.
        // Hvor i listerne tror du, det bliver tilføjet? Test din teori ved at printe listerne før og efter
        students.add(new Student("Styr", 32));
        students1.add(new Student("Niki", 29));

//        System.out.println(students);
//        System.out.println(students1);

        // Hvad sker der hvis vi tilføjer et nyt Student-objekt på index 3 i hver af listerne?
        // Prøv det af. Tænk over hvad du tror, der vil ske og print så ud for at se om du har ret
        students.add(3, new Student("Anders", 28));
        students1.add(3, new Student("Peter", 27));

//        System.out.println(students);
//        System.out.println(students1);

        // Hvad sker der hvis vi tilføjer to ens Student-objekter?
        // Lav en LinkedList og en ArrayList med Student-objekter. Fyld dem op med objekter ved at kalde DataReader.fillWithStudents() med din liste
        students.add(new Student("Styr", 32));
        students1.add(new Student("Niki", 29));

//        System.out.println(students);
//        System.out.println(students1);

    }

    public static void playWithSet() {
        // Lav et HashSet og et TreeSet med Student-objekter. Fyld det op ved at kalde DataReader.fillWithStudents() med dit sæt
//        HashSet<Student> students = new HashSet<>();
        TreeSet<Student> students1 = new TreeSet<>();
//        DataReader.fillWithStudents(students, 5);
        DataReader.fillWithStudents(students1, 5);

//        System.out.println(students);
//        System.out.println(students1);
        // Tilføj et nyt Student-objekt objekt med metoden add()
//        students.add(new Student("Anders", 20));
        students1.add(new Student("Nikita", 29));

        // Hvor i settet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
//        System.out.println(students);
//        System.out.println(students1);

        // Hvad sker der hvis vi tilføjer to ens Student-objekter?
//        students.add(new Student("Anders", 30));
        students1.add(new Student("Nikita", 29));

//        System.out.println(students);
//        System.out.println(students1);

        // Ekstra - hvad vil det sige, at Student-objekterne er ens? Kan vi ændre på dette?


        // Lav din egen klasse med nogle attributter og nogle fornuftige equals(), hashcode og compareTo()-metoder
        // Prøv din klasse af ved at indsætte nogle objekter af den i henholdsvis et TreeSet og et HashSet
    }


    public static void playWithMaps() {

        // Lav et HashMap() med Student-objekter og Courses, hvor Student er key og Course er value
        // Fyld det op ved at kalde DataReader.fillWithStudentsAndCourses()
        HashMap<Student, Course> studentCourseHashMap = new HashMap<>();
        DataReader.fillWithStudentsAndCourses(studentCourseHashMap, 5);

//        System.out.println(studentCourseHashMap);
        // Tilføj et nyt Student-objekt/Course-objekt par med metoden put()
        studentCourseHashMap.put(new Student("Styr", 32), new Course("Dat1"));

        // Hvor i mappet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter
//        System.out.println(studentCourseHashMap);

        // Hvad sker der hvis vi tilføjer to Student/Course par hvor Student-objekterne er ens?
        studentCourseHashMap.put(new Student("Styr", 32), new Course("Dat2"));
//        System.out.println(studentCourseHashMap);

        // Og hvad sker der hvis vi tilføjer to Student/Course par hvor Course-objekterne er ens?
        studentCourseHashMap.put(new Student("Alex", 29), new Course("Dat1"));
        studentCourseHashMap.put(new Student("Styr", 32), new Course("Dat1"));
//        System.out.println(studentCourseHashMap);

        // Prøv at indsætte objekter af din egen klasse (med tilhørende values, fx i form af Stringobjekter) i et HashMap
        HashMap<Teacher, School> teacherSchoolHashMap = new HashMap<>();
        teacherSchoolHashMap.put(new Teacher("Jesper", 4), new School("CPHBUSINESS", "Lyngby"));
        teacherSchoolHashMap.put(new Teacher("Tess", 7), new School("CPHBUSINESS", "Lyngby"));
    }

    public static void searchTimes()
    {
        // starttid
        long start = System.currentTimeMillis();

        // run experiment
//        List<Student> studlist = new ArrayList<>();
//        DataReader.fillWithStudents(studlist, 1000);
//
//        System.out.println(studlist.contains(new Student("Signe", 30)));

        WordCounter wc = new WordCounter("data/hhgttg.txt", true);
        wc.countWordOccurrences();

        // sluttid
        long end = System.currentTimeMillis();
        System.out.println("runtime (ms): " + (end - start));
    }

    public static void timer(){
        double start = System.nanoTime();
        System.out.println("Hello World!");
        double end = System.nanoTime();
        System.out.println((end - start)/1000000000);
    }

}