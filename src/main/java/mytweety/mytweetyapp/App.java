package mytweety.mytweetyapp;

import org.tweetyproject.logics.pl.syntax.*;

public class App{
    public static void main( String[] args ) {
        PlFormula helloWorld = new Proposition("HelloWorld");
        System.out.println(helloWorld); }
}