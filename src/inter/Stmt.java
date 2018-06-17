package inter;

/**
 * Created by Mac on 2018/6/17.
 */
public class Stmt extends Node{
    public Stmt(){}
    public static Stmt Null = new Stmt();
    public void gen(int a, int b){}
    int after = 0;
    public static Stmt Enclosing = Stmt.Null;
}