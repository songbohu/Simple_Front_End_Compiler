package inter;

import lexer.Token;
import symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Op extends Expr{
    public Op(Token tok, Type p){
        super(tok,p);
    }

    public Expr reduce(){
        Expr x = gen();
        Temp t = new Temp(type);
        emit(t.toString() + " = " + x.toString());
        return t;
    }
}