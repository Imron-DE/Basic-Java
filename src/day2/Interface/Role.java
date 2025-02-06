package day2.Interface;

public interface Role {
    default void admin(Boolean isAdmin){
        System.out.println("isAdmin : "+ isAdmin);
    }
}
