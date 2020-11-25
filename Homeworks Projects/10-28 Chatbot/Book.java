public class Book
{
private String author;
private String title;
private Person borrower;
public Book(String a, String t)
{
author = a;
title = t;
borrower = null;
}
public void printDetails()
{
System.out.print("Author: " + author + " Title: " + title);
if ( borrower.getName() != null)
{
System.out.println(" Borrower: " + borrower.getName());
}
}
public void setBorrower(Person b)
{  borrower = b;  }
}
