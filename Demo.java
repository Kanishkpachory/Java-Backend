package Array;

class Student{
    int roll;
    String name;
    int marks;
}

public class Demo {
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.roll = 10;
        s1.marks = 55;
        s1.name = "kanishk";

        Student s2 = new Student();
        s2.roll = 11;
        s2.marks = 65;
        s2.name = "pachory";

        Student s3 = new Student();
        s3.roll = 12;
        s3.marks = 75;
        s3.name = "parakram";

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student n : students){
            System.out.print("Roll-No. = " +n.roll+ " , " +" Marks : " +n.marks+ " , " + " Name : " +n.name+ " || " );
        }

    }
}
