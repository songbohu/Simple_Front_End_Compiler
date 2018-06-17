package inter;

import symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class Do extends Stmt{
    Expr expr; Stmt stmt;
    public Do(){
        expr = null;
        stmt = null;
    }

    public void init(Stmt s, Expr x){
        this.expr = x;
        this.stmt = s;
        if( expr.type!= Type.Bool){
            expr.error("boolean required in do");
        }
    }

    public void gen(int b, int a){

        after = a;
        int label = newlabel();
        stmt.gen(b,label);
        emitlabel(label);
        expr.jumping(b,0);
    }
}
