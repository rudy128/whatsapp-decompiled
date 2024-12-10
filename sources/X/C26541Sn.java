package X;

import java.util.Set;

/* renamed from: X.1Sn  reason: invalid class name and case insensitive filesystem */
public final class C26541Sn {
    public static final Set A04 = C200410p.A0S(new C26551So[]{C26551So.A0E, C26551So.A0t, C26551So.A0K, C26551So.A0h, C26551So.A09, C26551So.A0Q, C26551So.A0A, C26551So.A0V, C26551So.A0H, C26551So.A0I});
    public final C26581Sr A00;
    public final AnonymousClass00H A01;
    public final C18100vl A02 = new C18110vm(new C26591Ss(this));
    public final C18100vl A03 = new C18110vm(new C26601St(this));

    public C26541Sn(AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A01 = r4;
        this.A00 = new C26581Sr(r3);
    }

    public final void A00(CXH cxh, C26551So r4) {
        C18100vl r0;
        C18070vi.A0d(r4, 1);
        if (A04.contains(r4)) {
            r0 = this.A02;
        } else {
            r0 = this.A03;
        }
        C18070vi.A0X(((C26461Sf) r0.getValue()).A04(cxh.A02, cxh));
    }
}
