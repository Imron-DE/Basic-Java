package day3.InnerClass;

// INNNER CLASS : class didalam class , inner class bisa mengaskses atribut dan method milik outer class
// implementasi inner class bisa digunakan ketika mau membuat structure ddata objek didalam objek
// atau untuk grouping antara atribut dan fungsionalitas
public class OuterClasss {
    private String outervar = "10";

    public class InnerClass {
        public void display(){
            System.out.println("Outer var = " + outervar);
        }
    }

    public static void main(String[] args) {
        OuterClasss outer = new OuterClasss();
        OuterClasss.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}


/*  VISUAL
* cont outer = {
*                 outerVar = 10;
*                 innerClass = {
*                               innner = outerVar;
*                               }
*                }
* */