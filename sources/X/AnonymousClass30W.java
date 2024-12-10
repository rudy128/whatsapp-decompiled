package X;

/* renamed from: X.30W  reason: invalid class name */
public final class AnonymousClass30W implements C72143Ku {
    public final AnonymousClass190 A00;
    public final C25321Nt A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public void C0w(C171888sR r8) {
        C18070vi.A0d(r8, 0);
        if (C18020vd.A05(C18040vf.A02, this.A02, 7590)) {
            long j = 0;
            for (C46162Dk A0M : ((C32991i5) this.A03.get()).A04()) {
                try {
                    j += C25321Nt.A00(this.A01, A0M.A0M()).A0I;
                } catch (ClassCastException e) {
                    this.A00.A0G("newsletterInfo-class-cast-exception", e.getMessage(), true);
                }
            }
            r8.A0w = Long.valueOf(j);
        }
    }

    public AnonymousClass30W(AnonymousClass190 r1, C25321Nt r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0s(r3, r4, r2, r1);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }
}
