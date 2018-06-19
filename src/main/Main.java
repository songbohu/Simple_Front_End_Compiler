package main;

import lexer.Lexer;
import parser.Parser;

import java.io.*;

/**
 * Created by Mac on 2018/6/16.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        if(args.length >= 2){
            try{
                FileInputStream fis=new FileInputStream(args[0]);
                System.setIn(fis);}
            catch (FileNotFoundException e){
                e.printStackTrace();
            }

            PrintStream ps=new PrintStream(new FileOutputStream(args[1]));
            System.setOut(ps);

        }


        Lexer lex = new Lexer();
        Parser parse = new Parser(lex);
        parse.program();
        System.out.write('\n');
    }

}
