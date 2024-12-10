package X;

import java.io.Serializable;

/* renamed from: X.3BZ  reason: invalid class name */
public class AnonymousClass3BZ implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public Object readResolve() {
        return C199410f.copyOf(this.elements);
    }

    public AnonymousClass3BZ(Object[] objArr) {
        this.elements = objArr;
    }
}
