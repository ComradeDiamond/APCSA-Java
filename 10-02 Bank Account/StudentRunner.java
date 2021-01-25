public class StudentRunner
{ 
  public static void main(String[] args)
  {
    //Create four students (with fake emails) 
    Student s1 = new Student("Joe", "joe@someemail.net");
    Student s2 = new Student("Mr. Folwell", "MrF@someemail.net");
    Student s3 = new Student("Donut", "donut@someemail.net");
    Student s4 = new Student("TopEmail", "popToast@someemail.net");

    //print out the student info for each student
    s1.print();
    s2.print();
    s3.print();
    s4.print();
    System.out.println("==================");

    //change the of emails to their nycstudents.net email
    s1.setEmail("joe@nycstudents.net");
    s2.setEmail("MrF@nycstudents.net");
    s3.setEmail("Donut@nycstudents.net");
    s4.setEmail("popToast@someemail.net");

    //change the names so they have the format first name, last name
    s1.setName("Joe Potato");
    s2.setName("Nathan Folwell");
    s3.setName("Dunkin Donuts");
    s4.setName("Top Email");
    
    //test out the toString() method
    String p1 = s1.toString();
    String p2 = s2.toString();
    String p3 = s3.toString();
    String p4 = s4.toString();

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
  }
}   
