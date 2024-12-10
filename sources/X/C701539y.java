package X;

/* renamed from: X.39y  reason: invalid class name and case insensitive filesystem */
public final class C701539y implements AnonymousClass3LL {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void CCb(AnonymousClass206 r5, C49702Rn r6, int i) {
        boolean z;
        C18070vi.A0d(r5, 0);
        AW0 A002 = AnonymousClass25B.A00(r5);
        if (A002 != null) {
            synchronized (A002) {
                z = A002.A0O;
            }
            if (z) {
                AnonymousClass1QS r0 = (AnonymousClass1QS) this.A01.get();
                AnonymousClass1QS.A00(r0);
                AnonymousClass1QR r1 = r0.A04;
                C18070vi.A0X(r1);
                r1.A0P(r5, true);
                A002.A0E(false);
                ((A0E) this.A00.get()).A01(r5);
                if (r6 != null) {
                    throw C17900vP.A07(C701539y.class);
                }
            }
        }
    }

    public C701539y(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
