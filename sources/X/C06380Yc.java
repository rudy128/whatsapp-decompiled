package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.0Yc  reason: invalid class name and case insensitive filesystem */
public final class C06380Yc implements Iterable, C18450wR {
    public final int A00;
    public final C06390Yd A01;
    public final int A02;

    public Iterator iterator() {
        C06390Yd r3 = this.A01;
        if (r3.A02() == this.A00) {
            int i = this.A02;
            r3.A08(i);
            return new C06780Zq(r3, i + 1, i + AnonymousClass000.A0S(r3.A0G(), i));
        }
        throw new ConcurrentModificationException();
    }

    public C06380Yc(C06390Yd r1, int i, int i2) {
        this.A01 = r1;
        this.A02 = i;
        this.A00 = i2;
    }
}
