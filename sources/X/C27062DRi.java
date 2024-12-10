package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.DRi  reason: case insensitive filesystem */
public class C27062DRi implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;
    public final Object[] elements;

    public Object readResolve() {
        C23553Blg blg = new C23553Blg(this.comparator);
        blg.add(this.elements);
        return blg.build();
    }

    public C27062DRi(Comparator comparator2, Object[] objArr) {
        this.comparator = comparator2;
        this.elements = objArr;
    }
}
