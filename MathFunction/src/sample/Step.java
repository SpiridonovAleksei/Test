package sample;

/**
 * Created by Alexey
 */
public class Step implements Operation {
    @Override
    public Integer apply(Integer first, Integer second){
        return first^second;
    }
}
