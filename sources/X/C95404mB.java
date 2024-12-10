package X;

/* renamed from: X.4mB  reason: invalid class name and case insensitive filesystem */
public final class C95404mB implements C72143Ku {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void C0w(C171888sR r5) {
        int ordinal;
        C18070vi.A0d(r5, 0);
        if (AnonymousClass3MW.A0X(this.A00).A0E()) {
            AnonymousClass00H r2 = this.A01;
            int ordinal2 = ((AnonymousClass72E) r2.get()).A03().ordinal();
            int i = 1;
            if (ordinal2 == 0) {
                i = 0;
            } else if (ordinal2 != 1) {
                throw AnonymousClass3MW.A14();
            }
            r5.A0o = Integer.valueOf(i);
            C20944Aby A02 = ((AnonymousClass72E) r2.get()).A02();
            int i2 = null;
            if (!(A02 == null || (ordinal = A02.A00.ordinal()) == -1)) {
                if (ordinal == 0) {
                    i2 = 0;
                } else if (ordinal == 1) {
                    i2 = 1;
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
            r5.A0n = i2;
        }
    }

    public C95404mB(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
