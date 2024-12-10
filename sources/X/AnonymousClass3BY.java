package X;

import java.io.Serializable;

/* renamed from: X.3BY  reason: invalid class name */
public class AnonymousClass3BY implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object[] elements;

    public Object readResolve() {
        return AnonymousClass1IX.copyOf(this.elements);
    }

    public AnonymousClass3BY(Object[] objArr) {
        this.elements = objArr;
    }
}
