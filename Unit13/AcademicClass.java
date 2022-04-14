import java.util.*;

public class AcademicClass{



  public AcademicClass(){
    students = new ArrayList<Student>();
    //teacher = new Teacher()
  }

  public void addTeacher(String name, String subject){
    teacher = new Teacher(name, subject);
    System.out.println(teacher.getName());
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
public void returnAll(){
     System.out.println(students);
     System.out.println(teacher);

   }
  //function that takes integer as input and returns arraylist of
   //students whose favorite nums are 'n'
   public ArrayList<Student> findNumFavs(int n){
     ArrayList<Student> findMatchingNums = new ArrayList<Student>();

     for(Student s: students){
       if(s.getFavNum()==n){
         findMatchingNums.add(s);
       }
     }
     return findMatchingNums;
   }

   //function that returns ArrayList of names of students
   //whose favorite num is odd

   public ArrayList<Student> oddNums(){
     ArrayList<Student> odds = new ArrayList<Student>();
     for(Student s : students){
       if(s.getFavNum()%2==1){
         odds.add(s);
       }
     }
     return odds;
   }

   //private variable for Teacher
   private Teacher teacher;
   //private arrayList of students
   private ArrayList<Student> students;



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
     allStudents.addTeacher("Dr. Kessner", "APCS");
     allStudents.returnAll();



   }
}
