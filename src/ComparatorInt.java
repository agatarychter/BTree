import java.util.Comparator;

/**
 * Created by Agata Rychter on 29.05.2017.
 */
public class ComparatorInt implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if((int)o1>(int)o2)
            return 1;
        if((int)o1<(int)o2)
            return -1;
        return 0;
    }
}
