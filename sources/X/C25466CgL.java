package X;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CgL  reason: case insensitive filesystem */
public abstract class C25466CgL {
    public static final Runnable A00;
    public static final Runnable A01;
    public static final ConcurrentHashMap A02 = AnonymousClass8BR.A17();
    public static final AtomicInteger A03 = new AtomicInteger(0);
    public static final AtomicInteger A04 = new AtomicInteger(0);
    public static final AtomicInteger A05 = new AtomicInteger(0);
    public static final C18100vl A06;

    static {
        C18110vm A012 = AnonymousClass1DF.A01(C27863Dn0.A00);
        A06 = A012;
        DTR dtr = DTR.A00;
        A00 = dtr;
        DTS dts = DTS.A00;
        A01 = dts;
        ((Handler) A012.getValue()).post(dtr);
        ((Handler) A06.getValue()).post(dts);
    }

    public static final void A00(CN9 cn9, int i) {
        int i2 = cn9.A00;
        float f = ((float) i2) * 0.5f;
        if (f < 1.0f) {
            f = 1.0f;
        }
        int i3 = (int) f;
        C26737DBq dBq = cn9.A01;
        int i4 = dBq.A00;
        int A032 = C28851b7.A03(i4 + i, i3, i2);
        if (A032 != i4 && A032 != dBq.A00) {
            dBq.A00 = C28851b7.A03(A032, 1, dBq.A02);
            C26737DBq.A01(dBq).A02(dBq.A00);
        }
    }
}
