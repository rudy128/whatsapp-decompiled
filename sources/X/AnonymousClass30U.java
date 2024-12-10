package X;

/* renamed from: X.30U  reason: invalid class name */
public final class AnonymousClass30U implements C72143Ku {
    public final C19830z4 A00;
    public final AnonymousClass00H A01;

    public void C0w(C171888sR r3) {
        Integer num;
        int i;
        C18070vi.A0d(r3, 0);
        if (((C196039uM) this.A01.get()).A02()) {
            C19830z4 r1 = this.A00;
            String A0o = r1.A0o();
            if (A0o == null || A0o.length() == 0) {
                i = 1;
            } else {
                boolean A2N = r1.A2N();
                i = 2;
                if (A2N) {
                    i = 3;
                }
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        r3.A0k = num;
    }

    public AnonymousClass30U(C19830z4 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
