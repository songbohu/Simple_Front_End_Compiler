package lexer;

/**
 * Created by Mac on 2018/6/16.
 */
public class Real extends Token {
    public final float value;
    public Real(float v){
        super(Tag.REAL);
        this.value = v;
    }
    public String toString(){
        return "" + value;
    }
}
