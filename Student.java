import java.util.Scanner;
class Student
{
    String name;
    String usn;
    int marks[] = new int[5];
    int credits[] = new int[5];
    int i,n;
    int grade=0;
    double total=0;

void get_data()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Student Name:");
    name = in.next();
    System.out.println("Enter the USN:");
    usn = in.next();
    System.out.println("Enter the no. of subjects:");
    n=in.nextInt();
    System.out.println("Enter Subject credits and subject marks:");
    for(i=0;i<n;i++)
    {
        System.out.println("Credits for subject"+(i+1)+":");
        credits[i] = in.nextInt();
        System.out.println("Marks in subject"+(i+1)+":");
        marks[i] = in.nextInt();
    }
}

void calculate_sgpa()
{
    for(i=0;i<n;i++)
    {
        if(marks[i]>=90 && marks[i]<=100)
            grade=10;
       else if(marks[i]>=80 && marks[i]<=90)
            grade=9;
       else if(marks[i]>=70 && marks[i]<=80)
            grade=8;
       else if(marks[i]>=60 && marks[i]<=70)
            grade=7;
       else if(marks[i]>=50 && marks[i]<=60)
            grade=6;
       else if(marks[i]>=40 && marks[i]<=50)
            grade=5;    
       else if(marks[i]>=0 && marks[i]<=40)
            grade=0;
        else
        System.out.println("Invalid marks entered");
	total=total+(grade*credits[i]);
      }

    total=total/20;
    System.out.println("Sgpa="+total);
    }
    
void stud_details()
{
    System.out.println("Name:"+name);
    System.out.println("USN:"+usn);
    System.out.println("Marks & Credits of all subjects:");
    for(i=0;i<n;i++)
    {
        System.out.println("subject:"+(i+1)+":");
        System.out.println("Marks:"+marks[i]);
        System.out.println("Credits:"+credits[i]);
    }
    calculate_sgpa();
}

public static void main(String args[])
{
    Student s = new Student();
    s.get_data();
    s.calculate_sgpa();
    s.stud_details();
}
}