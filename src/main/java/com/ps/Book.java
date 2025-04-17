package com.ps;

public class MyBook
{
   private int id;
   private String isbn;
   private String title;
   private boolean isCheckedOut;
   private String CheckedOutTo;

   public MyBook(int id){
       this.id = id;
   }
   public int getid(){
       return id;
   }
    public void setid(int id)
    {
        this.id = id;
    }


}
