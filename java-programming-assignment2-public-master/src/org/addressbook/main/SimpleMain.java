package org.addressbook.main;
import org.addressbook.main.SimpleApplication;

public class SimpleMain{
public static void main(String[]args) {

try
{SimpleApplication AdressBook = new SimpleApplication();
      AdressBook.start();}
    catch(Exception e){
      System.err.println(e.getMessage());}
}}
