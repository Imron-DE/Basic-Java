package day2;

import day2.OOP.Blogs.Blog;
import day2.OOP.Student.Student;
import day2.OOP.Users.Admin;
import day2.OOP.Users.User;

public class Main {
    public static void main(String[] args) {
        // Class Biasa
        System.out.println("== Get Student ==");
        Student s1 = new Student("imron", 70);
        s1.cekStatus();

        Student s2 = new Student("dani", 95);
        s2.name = "danu";//update data
        s2.score = 95;
        s2.cekStatus();

        // Class enkapslasi
        System.out.println("== GET BLOG ==");
        Blog myBlog = new Blog("Bootcamo Aigen Batch 3", "Open Registration");
        myBlog.displayInfo();
        myBlog.getTitle(); // buat nambahin title
        myBlog.setTitle("Bootcamo Aigen Batch 4");
        myBlog.setContent("Close Registration"); // buat nambahin content
        myBlog.displayInfo();

        // comment
        myBlog.addComment("imron", "Masih buka ga gan ");
        myBlog.addComment("dani", "Bayar ga gan ");
        myBlog.displayComments();

        // Inharitance
        System.out.println("== GET USER ==");
        User userGuest = new User("imron");
        userGuest.displayInfo();

        //class child
        Admin  userAdmin = new Admin("Alwi", true);
        userAdmin.displayInfo();
    }

}
