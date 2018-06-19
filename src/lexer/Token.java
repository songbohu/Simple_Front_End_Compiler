package lexer;

/**
 * Created by Mac on 2018/6/16.
 */
public class Token {
    public final int tag;
    public Token(int t){
        tag = t;
    }
    public String toString(){
        return "" + (char)tag;
    }
}
