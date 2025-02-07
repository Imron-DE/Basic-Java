package day3.Enums;

public class Main {
    public static void main(String[] args) {
        // pangill enum
        EnumDay today = EnumDay.FRIDAY;

        switch (today){
            case SUNDAY : System.out.println("Today is Sunday");
            break;
            case MONDAY : System.out.println("Today is Monday");
            break;
            case TUESDAY : System.out.println("Today is Tuesday");
            break;
            case WEDNESDAY : System.out.println("Today is Wednesday");
            break;
            case THURSDAY : System.out.println("Today is Thursday");
            break;
            case FRIDAY : System.out.println("Today is Friday");
            break;
            case SATURDAY : System.out.println("Today is Saturday");
            break;
            default : System.out.println("Invalid day");
        }
        // enum class
        EnumLikeClass getToday = EnumLikeClass.MONDAY;
        System.out.println(" Today is " + getToday +" and its a " + getToday.getType());
    }
}
