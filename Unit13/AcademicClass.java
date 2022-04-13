import java.util.*;

public class AcademicClass{


  public void addTeacher(String name){

    for(Teacher t: teacher){
      t.getName();
    }
    return name;
  }

  //function to add students to ArrayList
  public ArrayList<Student> addStudent(String name, int num){
    ArrayList<Student> students = new ArrayList<Student>();

    for(Student s:students){
      students.add(s);
    }
    return students;

  }

  //fufnction that prints infor about the class, all the students name
public ArrayList<Student> returnAll(){
  ArrayList<Student> classWhole = new ArrayList<Student>();
     classWhole = students;
     for(Student s: students){
       classWhole.add(s);
       classWhole.addTeacher(teacher);

     }
     return classWhole;

     }
  //function that takes integer as input and returns arraylist of
   //students whose favorite nums are 'n'
   public ArrayList<Student> findNumFavs(int n){
     ArrayList<Student> findMatchingNums = new ArrayList<Student>();

     for(Student s:students){
       if(s.getFavNum()==n){
         findMatchingNums.add(s);
       }
     }
     return findMatchingNums;
   }

   //function that returns ArrayList of names of students
   //whose favorite num is odd

   public ArrayList<Student> oddNums(ArrayList<Student> students){
     ArrayList<Student> odds = new ArrayList<Student>();
     for(Student s:students){
       if(s.getFaveNum()%2==1){
         odds.add(s);
       }
     }
     return odds;
   }

   //private variable for Teacher
   private Teacher teacher;
   //private arrayList of students
   private ArrayList<Student> students;
   private ArrayList<Student> classWhole;



   public static void main(String[] args){

     AcademicClass allStudents = new AcademicClass();
     allStudents.addStudent("Sydney", 3);
     allStudents.addStudent("Maddy", 7);
     allStudents.addStudent("Cat", 12);
     allStudents.addStudent("Mael", 15);
     allStudents.addStudent("Max", 2);
     allStudents.addStudent("Dylan", 8);

     ArrayList<Student> oddStudents = allStudents.oddNums();
     System.out.println(oddStudents);

     System.out.println(allStudents.findNumFavs(3));
     classWhole.addTeacher("Dr. Kessner");



   }
}
