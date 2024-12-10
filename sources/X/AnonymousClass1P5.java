package X;

import java.util.List;

/* renamed from: X.1P5  reason: invalid class name */
public class AnonymousClass1P5 extends Exception {
    public AnonymousClass1P5(List list) {
        super("No valid sessions.", (Throwable) list.get(0));
    }

    public AnonymousClass1P5(String str) {
        super(str);
    }

    public AnonymousClass1P5(Throwable th) {
        super(th);
    }

    public AnonymousClass1P5() {
    }
}
