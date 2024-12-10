package X;

/* renamed from: X.39O  reason: invalid class name */
public final class AnonymousClass39O implements AnonymousClass3ML {
    public final AnonymousClass00H A00;

    public AnonymousClass39O(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r4, C49702Rn r5) {
        boolean z;
        C18070vi.A0d(r4, 0);
        C693336u A0O = r4.A0O();
        if (A0O != null) {
            synchronized (A0O) {
                z = A0O.A01;
            }
            if (z && A0O.A01() != null) {
                ((C25331Nu) this.A00.get()).A03(r4, A0O.A01());
                synchronized (A0O) {
                    A0O.A01 = false;
                }
                if (r5 != null) {
                    throw C17900vP.A07(AnonymousClass39O.class);
                }
            }
        }
    }
}
