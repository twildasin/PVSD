package com.company;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("Dan", 4.164);
        Student student2 = new Student("Ronald", 3.988);
        Student student3 = new Student("Joe", 3.459);

        System.out.println("The top three students are:");

        if (student1.GPA >= student2.GPA && student1.GPA >= student3.GPA)
        {
            System.out.println(student1.name);
            if (student2.GPA >= student3.GPA)
            {
                System.out.println(student2.name);
                System.out.println(student3.name);
            }
            else
            {
                System.out.println(student3.name);
                System.out.println(student2.name);
            }
        }
        else if (student2.GPA >= student1.GPA && student2.GPA >= student3.GPA)
        {
            System.out.println(student2.name);
            if (student3.GPA >= student1.GPA)
            {
                System.out.println(student3.name);
                System.out.println(student1.name);
            }
            else
            {
                System.out.println(student1.name);
                System.out.println(student3.name);
            }
        }
        else if (student3.GPA >= student2.GPA && student3.GPA >= student1.GPA)
        {
            System.out.println(student3.name);
            if (student2.GPA >= student2.GPA)
            {
                System.out.println(student2.name);
                System.out.println(student1.name);
            }
            else
            {
                System.out.println(student1.name);
                System.out.println(student2.name);
            }
        }
        
    }
}
