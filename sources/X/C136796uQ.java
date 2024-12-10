package X;

/* renamed from: X.6uQ  reason: invalid class name and case insensitive filesystem */
public final class C136796uQ {
    public final AnonymousClass1KB A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18030ve A04;

    public final AnonymousClass732 A00() {
        return C108945cZ.A0f(this.A03).A00(C35021lW.A03);
    }

    public final void A02(C134906rL r12, AnonymousClass89J r13) {
        if (C18020vd.A05(C18040vf.A02, this.A04, 10104)) {
            Number number = (Number) r12.A00.A00;
            String str = (String) r12.A01.A00;
            if (number == null) {
                r13.onFailure(AnonymousClass000.A0k("fbid is null"));
            } else if (str == null) {
                r13.onFailure(AnonymousClass000.A0k("avatar password is null"));
            } else {
                if (((C33631j8) this.A02.get()).A08(new AnonymousClass732(C35021lW.A03, 0L, str, "0", (String) null, number.longValue(), 0))) {
                    r13.onSuccess();
                } else {
                    r13.onFailure(new Exception("failed to save local avatar user"));
                }
            }
        } else {
            C108945cZ.A0f(this.A03).A04(new AnonymousClass7GS(r13, 2), C35021lW.A03, (AnonymousClass705) null, r12);
        }
    }

    public C136796uQ(AnonymousClass1KB r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r1, r3, r4, r5);
        this.A04 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = r5;
    }

    public final void A01() {
        if (A00() != null) {
            C34991lS A0f = C108945cZ.A0f(this.A03);
            ((C33631j8) A0f.A00.get()).A07(C35021lW.A03);
        }
    }

    public final void A03(AnonymousClass89J r5, String str) {
        if (A00() == null) {
            r5.onFailure(AnonymousClass000.A0n("Avatar user does not exist"));
            return;
        }
        C108945cZ.A0f(this.A03).A05(new AnonymousClass7GS(r5, 1), C35021lW.A03, (AnonymousClass705) null, str);
    }
}
