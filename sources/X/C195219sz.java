package X;

/* renamed from: X.9sz  reason: invalid class name and case insensitive filesystem */
public final class C195219sz {
    public long A00;
    public boolean A01;
    public final C35861mv A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass18K A04;

    public final void A00(int i) {
        String str;
        C62292rA A002 = this.A02.A00();
        String str2 = null;
        if (A002 != null) {
            str = A002.A02;
            str2 = A002.A01;
        } else {
            str = null;
        }
        A01(i, str, str2);
    }

    public final void A02(Integer num, String str, int i) {
        C170948qv r1 = new C170948qv();
        r1.A00 = Integer.valueOf(i);
        r1.A03 = str;
        r1.A01 = num;
        if (!(i == 1 || i == 10 || i == 12)) {
            r1.A02 = Integer.valueOf(C72453Mb.A04(this.A01 ? 1 : 0));
        }
        this.A04.CC7(r1);
    }

    public C195219sz(C35861mv r1, AnonymousClass11P r2, AnonymousClass18K r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r1;
    }

    public final void A01(int i, String str, String str2) {
        A02(C138746xc.A00(str2), str, i);
    }
}
