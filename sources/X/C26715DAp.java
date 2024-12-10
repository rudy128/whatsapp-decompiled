package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.DAp  reason: case insensitive filesystem */
public class C26715DAp implements E4E {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C26711DAl A01;

    public C26715DAp(C26711DAl dAl, int i) {
        this.A01 = dAl;
        this.A00 = i;
    }

    public boolean Bea(long j) {
        C6M c6m = (C6M) this.A01.A01.get(this.A00);
        C26159CtX.A02(c6m, "timeline effect should not be null.");
        return c6m.A00.A05(j, TimeUnit.MICROSECONDS);
    }
}
