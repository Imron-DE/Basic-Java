package day2.OOP.Student;

public class Student {
    public String name;
    public int score;
    private Boolean issPass;

    public Student(String studentname, int studentscore) {
        name = studentname;
        score = studentscore;
        issPass = false;
    }

    public void cekStatus() {
        if (score >= 85) {
            issPass = true;
            System.out.println("name : " + name + " score : " + score + " isspass : " + issPass);
            System.out.println("status : lulus");
        } else {
            System.out.println("name : " + name + " score : " + score + " issPass : " + issPass);
            System.out.println("status : tidak lulus");
        }
    }
}
