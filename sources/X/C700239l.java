package X;

/* renamed from: X.39l  reason: invalid class name and case insensitive filesystem */
public final class C700239l implements AnonymousClass3LK {
    public final AnonymousClass00H A00;

    public C700239l(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCb(AnonymousClass206 r4, C49702Rn r5, int i) {
        boolean z;
        C18070vi.A0d(r4, 0);
        C693336u A0O = r4.A0O();
        if (A0O != null) {
            synchronized (A0O) {
                z = A0O.A01;
            }
            if (z) {
                byte[] A01 = A0O.A01();
                C25331Nu r0 = (C25331Nu) this.A00.get();
                if (A01 != null) {
                    r0.A03(r4, A01);
                } else {
                    r0.A02(r4);
                }
                synchronized (A0O) {
                    A0O.A01 = false;
                }
                if (r5 != null) {
                    throw C17900vP.A07(C700239l.class);
                }
            }
        }
    }
}
