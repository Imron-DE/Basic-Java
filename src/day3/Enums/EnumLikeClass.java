package day3.Enums;

/* ENUM = mirip juga dengan class : punya variable,constructor,method yang sama seperti class*/
public enum EnumLikeClass {
    SUNDAY("Weekend"), MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"), THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend");

    private String Type;

    EnumLikeClass(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }
}

