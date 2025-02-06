package day2.OOP.Blogs;

// Enkapsulasi : cara untuk membatasi dan melindungu data / metode dari acees langsung 
// untuk mengingkatkan keamanan dari perubahan data yang toidak disengaja /sengaja 
import java.util.ArrayList;
import java.util.List;

// class utama 
public class Blog {
    // ENKAPSULASI TERJADI DISINI
    private String title;
    private String content;
    // List : interface yang menanakan bahwa variable ini adalah sebuah list atau daftar atau array
    // kenapa memakai list agar bisa memakai array list
    private List<Comment> comments;
    
    public Blog(String blogtitle, String blogcontent) {
        title = blogtitle;
        content = blogcontent;
        // ArrayList untuk menyimpan data dalam bentuk array ke comment
        comments = new ArrayList<>();
    }
    // getter blog
    public String getTitle(){return title;}
    public void setTitle(String newTitle){title = newTitle;}
    public String getContent(){return content;}
    public void setContent(String newContent){content = newContent;}

    // methode blog
    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Content : " + content);
    }
    
    // inner class : class didalam class/ objek didalam class
    public class Comment {
        private String author;
        private String text;
        
        public Comment(String name, String comment) {
            author = name;
            text = comment;
        }
        
        // getter
        public String getAuthor(){return author;}
        public String getText(){return text;}
    }
    
    // method untuk menambahkan comment ke blog
    public void addComment(String author, String text) {
        Comment newComment = new Comment(author, text);
        comments.add(newComment);
    }
    
    public void displayComments() {
        System.out.println("Comment : ");
        for (Comment comment : comments) {
            System.out.println("Author : " + comment.getAuthor());
            System.out.println("Comment : " + comment.getText());
        }
    }
}
