package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.A4h  reason: case insensitive filesystem */
public class C20038A4h {
    public static final List A0B;
    public int A00 = 0;
    public int A01 = 0;
    public List A02;
    public final BDR A03;
    public final C183209Xj A04;
    public final B8H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final List A09 = AnonymousClass8BU.A0y(A0B);
    public final AtomicInteger A0A = new AtomicInteger(Integer.MIN_VALUE);

    public static synchronized void A00(C20038A4h a4h, int i) {
        synchronized (a4h) {
            C17900vP.A0j("GoogleMigrate/setCurrentScreen = ", AnonymousClass000.A10(), i);
            a4h.A01 = i;
        }
    }

    public void A01(int i, int i2, int i3) {
        double A002;
        double d = (((double) i2) * 1.0d) / ((double) i3);
        synchronized (this) {
            if (this.A02 == null) {
                List list = this.A09;
                ArrayList A13 = AnonymousClass000.A13();
                double d2 = 0.0d;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    A13.add(Double.valueOf(d2));
                    d2 += ((Double) list.get(i4)).doubleValue();
                }
                A13.add(Double.valueOf(d2));
                this.A02 = Collections.unmodifiableList(A13);
            }
        }
        List list2 = this.A09;
        if (i >= list2.size()) {
            A002 = 1.0d;
        } else {
            double min = Math.min(Math.max(0.0d, d), 1.0d);
            A002 = (AnonymousClass8BR.A00(this.A02.get(i)) + (AnonymousClass8BR.A00(list2.get(i)) * min)) / AnonymousClass8BR.A00(this.A02.get(list2.size()));
        }
        int i5 = (int) (A002 * 100.0d);
        if (i5 != this.A0A.getAndSet(i5)) {
            C20736AWr.A00(C17880vN.A0V(this.A07), i5, 6);
        }
    }

    public C20038A4h(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        this.A07 = r3;
        this.A06 = r4;
        this.A08 = r5;
        this.A04 = new C183209Xj(this);
        this.A05 = new AW4(this);
        this.A03 = new AW2(this);
    }

    static {
        ArrayList A13 = AnonymousClass000.A13();
        Double valueOf = Double.valueOf(0.5d);
        A13.add(valueOf);
        A13.add(valueOf);
        A0B = Collections.unmodifiableList(A13);
    }
}
