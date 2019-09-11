import java.util.Collections;
import java.util.List;

public class swapWork {

    public static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static final <T> void swap (List<T> l, int i, int j) {
        Collections.<T>swap(l, i, j);
    }

}
