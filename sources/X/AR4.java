package X;

public final class AR4 implements C72143Ku {
    public final C19830z4 A00;
    public final AnonymousClass18O A01;
    public final AnonymousClass118 A02;
    public final C26291Ro A03;

    public void C0w(C171888sR r9) {
        C18070vi.A0d(r9, 0);
        r9.A0x = this.A03.A00();
        C19830z4 r7 = this.A00;
        r9.A0b = Boolean.valueOf(r7.A2U());
        AnonymousClass00H r3 = r7.A00;
        long j = C17880vN.A0B(r3).getLong("xmpp:lifecycle_worker_runtime_seconds", 0) + C17880vN.A0B(r3).getLong("xmpp:logout_worker_runtime_seconds", 0);
        C17880vN.A1D(C19830z4.A00(r7), "xmpp:lifecycle_worker_runtime_seconds", 0);
        C17880vN.A1D(C19830z4.A00(r7), "xmpp:logout_worker_runtime_seconds", 0);
        r9.A0t = Long.valueOf(j);
        try {
            if (this.A01.A09(AnonymousClass18O.A0c)) {
                C25058CVo A002 = C25731Cl1.A00(this.A02.A00);
                if (!A002.A01) {
                    r9.A1f = A002.A00;
                }
            }
        } catch (Throwable th) {
            C30691eM.A00(th);
        }
    }

    public AR4(AnonymousClass18O r1, AnonymousClass118 r2, C19830z4 r3, C26291Ro r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
        this.A03 = r4;
    }
}
