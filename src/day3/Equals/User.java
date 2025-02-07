package day3.Equals;

public class User {
    private String username;
    private String email ;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    // method equals juga bisa di override untuk membandingkan 1 field atau beberapa field saja dalam objek
    public boolean equals (Object obj){
        if (this == obj)return true; // pertama cek jika objeknya sama
        // cek apa objeknya null atau bukan instance /class user
        if (obj == null || getClass() != obj.getClass())return false;
        User user = (User) obj;  // downcasting objek ke class user
        // cek apakah username dan email sama
        return username.equals(user.username) && email.equals(user.email);
    }

    public String getData (){return "username" + username + " email : " + email;}
    public String getUsername() {return username;}
}
