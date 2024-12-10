package X;

/* renamed from: X.9uB  reason: invalid class name and case insensitive filesystem */
public final class C195939uB {
    public final AnonymousClass190 A00;
    public final AnonymousClass18K A01;

    public final void A00(int i, int i2, String str) {
        if (400 <= i2 && i2 < 500) {
            A01(i, i2, str, false);
        }
    }

    public final void A02(String str) {
        this.A00.A0G(AnonymousClass001.A1H("backup/", "crashed-stage", AnonymousClass000.A10()), str, false);
    }

    public final void A03(String str, String str2, boolean z) {
        this.A00.A0G(AnonymousClass001.A1H("gdrive/", str, AnonymousClass000.A10()), str2, z);
    }

    public C195939uB(AnonymousClass190 r1, AnonymousClass18K r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A01(int i, int i2, String str, boolean z) {
        String A012 = A6M.A01(str);
        C171048r5 r1 = new C171048r5();
        r1.A01 = Integer.valueOf(i);
        r1.A02 = C17880vN.A0n(i2);
        r1.A03 = str;
        r1.A04 = A012;
        r1.A00 = Boolean.valueOf(z);
        this.A01.CC7(r1);
    }
}
