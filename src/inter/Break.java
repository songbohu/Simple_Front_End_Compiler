package inter;

/**
 * Created by Mac on 2018/6/17.
 */
public class Break extends Stmt{
    Stmt stmt;
    public Break(){
        if(Stmt.Enclosing == Stmt.Null) error("unclosed break");
        stmt = Stmt.Enclosing;
    }

    public void gen(int b, int a){
        emit("goto L" + stmt.after);
    }

}
