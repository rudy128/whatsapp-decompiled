package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.9oJ  reason: invalid class name and case insensitive filesystem */
public class C192389oJ {
    public final A08 A00;
    public final Comparator A01 = new C21486Akr(5);
    public volatile List A02;

    public List A00() {
        List list;
        synchronized (this) {
            if (this.A02 == null) {
                A01();
            }
            list = this.A02;
        }
        return list;
    }

    public void A01() {
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = this.A00.A01();
            }
        }
    }

    public C192389oJ(A08 a08) {
        this.A00 = a08;
    }
}
