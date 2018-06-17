package inter;

import symbols.Type;

/**
 * Created by Mac on 2018/6/17.
 */
public class While extends Stmt{
    Expr expr; Stmt stmt;
    public While(){
        expr = null;
        this.stmt = null;
    }

    public void init(Expr x, Stmt s){
        this.expr = x; this.stmt = s;
        if(expr.type != Type.Bool){
            expr.error("boolean required in while");
        }
    }

    public void gen(int b, int a){
        after = a;
        expr.jumping(0,a);
        int label = newlabel();
        emitlabel(label); stmt.gen(label,b);
        emit("goto L" + b);
    }
}