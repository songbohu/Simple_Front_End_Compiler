package inter;

import lexer.Word;
import symbols.Type;

/**
 * Created by Mac on 2018/6/16.
 */
public class Id extends Expr{

    public int offset;
    public Id(Word id, Type p, int b){
        super(id,p);
        offset = b;
    }

}
