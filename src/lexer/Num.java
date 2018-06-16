package lexer;

/**
 * Created by Mac on 2018/6/16.
 */
public class Num extends Token {
    public final int value;
    public Num(int v){
        super(Tag.NUM);
        this.value = v;
    }

    public String toString(){
        return "" + value;
    }
}
