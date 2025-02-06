package day2.BasicOOP.AccessModifier.AbsractClass;

public class Kucing extends Hewan {
    // kata  kunci super untuk memakai variable yang dimiliki parent
    public Kucing( String nama, int umur){super(nama, umur);
    }

    @Override
    public void makan() {
        System.out.println( nama + "Kucing makan");
    }
}
