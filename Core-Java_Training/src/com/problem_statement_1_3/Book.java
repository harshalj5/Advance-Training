package com.problem_statement_1_3;

public class Book {
	
	/*private String booktitile;
	private int bookprice;
	public String getBooktitile() {
		return booktitile;
	}
	public void setBooktitile(String booktitile) {
		this.booktitile = booktitile;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
*/
	private String bookName;
    private int bookPrice;
   
    public void setBookName(String bookName)
    {
        this.bookName=bookName;
    }
    
    public String getBookName()
    {
        return this.bookName;
    }
    
    public void setBookPrice(int bookPrice)
    {
        this.bookPrice=bookPrice;
    }
    
    public int getBookPrice()
    {
        return this.bookPrice;
    }

}
