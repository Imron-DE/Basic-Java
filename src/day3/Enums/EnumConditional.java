package day3.Enums;

public class EnumConditional {
    enum userStatus{
        ACTIVE, NONACTIVE, BANNED
    }

    static class user {
        private  String nama;
        private userStatus status;

        public user(String nama, userStatus status){
            this.nama = nama;
            this.status = status;
        }

        public void setStatus(userStatus status){
            this.status = status;
        }

        public void checkStatus(){
            System.out.println("User " + nama + " is " + status);
        }
    }

    public static void main(String[] args) {
        userStatus user1 = userStatus.ACTIVE;

        if(user1 == userStatus.ACTIVE) {
            System.out.println("User is active");
        }else {
            System.out.println("User is not active");
        };

        user danu = new user("Danu", userStatus.ACTIVE);
        System.out.println("==check status==");
        danu.checkStatus();

        System.out.println("==update status==");
        danu.setStatus(userStatus.BANNED);
        danu.checkStatus();

    }


}
