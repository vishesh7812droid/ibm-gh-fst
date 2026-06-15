package fst;

abstract class Book {
 String title;


 abstract void setTitle(String title);

 
 String getTitle() {
     return title;
 }
}


class MyBook extends Book {


 void setTitle(String title) {
     this.title = title;
 }
}


public class activity5 {
 public static void main(String[] args) {

   
     MyBook newNovel = new MyBook();

     newNovel.setTitle("Harry Potter");

    
     System.out.println("Book Title: " + newNovel.getTitle());

                      }
          }
