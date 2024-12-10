package X;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class DUS implements Comparator {
    public abstract int compare(Object obj, Object obj2);

    public static DUS natural() {
        return C23560Blo.INSTANCE;
    }

    public DUS onResultOf(C43011z6 r2) {
        return new C23559Bln(r2, this);
    }

    public DUS reverse() {
        return new C23558Blm(this);
    }

    public List sortedCopy(Iterable iterable) {
        Object[] array = C26063Crd.toArray(iterable);
        Arrays.sort(array, this);
        return C220618l.newArrayList((Iterable) Arrays.asList(array));
    }
}
