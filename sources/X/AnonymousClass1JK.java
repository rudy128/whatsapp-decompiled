package X;

import java.io.Serializable;

/* renamed from: X.1JK  reason: invalid class name */
public class AnonymousClass1JK implements Serializable {
    public static final AnonymousClass1JK A00 = new Object();

    private Object readResolve() {
        return A00;
    }
}
