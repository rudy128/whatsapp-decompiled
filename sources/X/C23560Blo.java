package X;

import java.io.Serializable;

/* renamed from: X.Blo  reason: case insensitive filesystem */
public final class C23560Blo extends DUS implements Serializable {
    public static final C23560Blo INSTANCE = new C23560Blo();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        C199610h.A04(comparable);
        C199610h.A04(comparable2);
        return comparable.compareTo(comparable2);
    }
}
