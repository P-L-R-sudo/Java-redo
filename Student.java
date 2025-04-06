public class Student {
    String name = "loki";
    int age = 20;
    int rollno = 1;

    public static void main (String[] args) {
        
        Student S1 = new Student();
        S1.name = "John";
        S1.age = 20;
        S1.rollno = 10;

        Student S2 = new Student();
        S2.name = "Peter"; 
        S2.age = 21;
        S2.rollno = 2;

        Student S3 = new Student();
        S3.name = "Rahul";
        S3.age = 22;
        S3.rollno = 3;

        Student student[] = new Student[3];
        student[0] = S1;
        student[1] = S2;
        student[2] = S3;

//         for (int i = 0; i < student.length; i++) {
//             System.out.println("Name: " + student[i].name + ", Age: " + student[i].age);
// }
           for (Student stud : student) {   // Enhanced loop for strin objects
            System.out.println("Name: " + stud.name + ", Age: " + stud.age);
           }
}
}
