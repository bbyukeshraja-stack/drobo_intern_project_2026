
import java. util.*;

   class Student{

   static ArrayList<HashMap<String , String>> studentList = new ArrayList<>();
   static ArrayList<HashMap<String , String>> addStudentList(){
     HashMap<String,String> student1= new HashMap<>();
     student1 .put("Name","Naveen");
     student1.put("RollNo","4020");
     student1.put("Department","CSE");
     student1.put("Mark","75");
     student1.put("DOB","1st jan 2006");

     studentList.add(student1);

     HashMap<String,String> student2= new HashMap<>();
     student2 .put("Name","Abrar");
     student2.put("RollNo","4021");
     student2.put("Department","CSE");
     student2.put("Mark","76");
     student2.put("DOB","14th feb 2006");

     studentList.add(student2);

     HashMap<String,String> student3= new HashMap<>();
     student3 .put("Name","Vijay");
     student3.put("RollNo","4022");
     student3.put("Department","CSE");
     student3.put("Mark","80");
     student3.put("DOB","7th july 2005");

     studentList.add(student3);

     HashMap<String,String> student4= new HashMap<>();
     student4.put("Name","Yukesh");
     student4.put("RollNo","4023");
     student4.put("Department","CSE");
     student4.put("Mark","75");
     student4.put("DOB","3rd aug 2006");

     studentList.add(student4);
     return studentList;
   }
   public static void main(String[] args) {
    ArrayList<HashMap<String,String>> records= addStudentList();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the student to search: ");
    String searchName = sc.nextLine();
    for (HashMap<String, String> student : records) {
        if(student.get("Name").equals(searchName)){
            System.out.println("Name: " + student.get("Name"));
            System.out.println("Roll No: " + student.get("RollNo"));
            System.out.println("Department: " + student.get("Department"));
            System.out.println("Mark: " + student.get("Mark"));
            System.out.println("DOB: " + student.get("DOB"));
    }
}
}
   }
   