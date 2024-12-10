package X;

import java.util.Set;

/* renamed from: X.23Q  reason: invalid class name */
public class AnonymousClass23Q extends AnonymousClass23N {
    public AnonymousClass23Q(AnonymousClass205 r3, long j) {
        super(r3, 15, j);
        this.A01 = 7;
        this.A00 = j;
        A0Y(0);
    }

    public void A17(AnonymousClass206 r3) {
        C692236j A02;
        Set set;
        if (r3.A0v.A02 && (A02 = C63672tV.A02(r3)) != null && (set = A02.A05) != null) {
            C692236j r0 = new C692236j();
            r0.A05 = set;
            C63672tV.A03(this, r0);
        }
    }

    public AnonymousClass23Q(AnonymousClass206 r3, AnonymousClass205 r4, long j) {
        this(r4, r3.A0I);
        this.A0K = r3.A0H();
        this.A0i = r3.A0T();
        this.A01 = r3.A0v.A01;
        this.A00 = j;
        this.A0U = r3.A0U;
        this.A07 = 0;
        A17(r3);
    }
}
