package X;

import java.util.Comparator;

public abstract class DUG implements Comparator {
    public int compare(Object obj, Object obj2) {
        Throwable th;
        if (this instanceof C23350Bfc) {
            return ((C23350Bfc) this).zza.compare(obj2, obj);
        }
        if (this instanceof C23352Bfe) {
            Comparable comparable = (Comparable) obj2;
            if (obj == null) {
                th = null;
            } else if (obj == comparable) {
                return 0;
            } else {
                return comparable.compareTo(obj);
            }
        } else if (!(this instanceof C23351Bfd)) {
            return ((C23349Bfb) this).zza.compare(obj, obj2);
        } else {
            Comparable comparable2 = (Comparable) obj;
            th = null;
            if (!(comparable2 == null || obj2 == null)) {
                return comparable2.compareTo(obj2);
            }
        }
        throw th;
    }
}
