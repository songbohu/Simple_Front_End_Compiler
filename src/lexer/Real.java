package lexer;

/**
 * Created by Mac on 2018/6/16.
 */
public class Real extends Token {
    public final float value;
    public Real(float v){
        super(Tag.REAL);
        value = v;
    }
    public String toString(){
        return "" + value;
    }
}
