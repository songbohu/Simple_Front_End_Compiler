package inter;

import lexer.Word;
import symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Temp extends Expr {

    static int count = 0;

    int number = 0;

    public Temp(Type p){
        super(Word.temp,p);
        number = ++count;
    }
    public String toString(){
        return "t" + number;
    }

}
