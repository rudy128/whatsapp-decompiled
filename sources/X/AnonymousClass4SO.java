package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4SO  reason: invalid class name */
public final class AnonymousClass4SO {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C18030ve A06;
    public final UserJid A07;
    public final String A08;

    public final C130546jc A00() {
        UserJid userJid = this.A07;
        boolean z = this.A02;
        boolean z2 = this.A05;
        boolean z3 = this.A04;
        return new C130546jc(userJid, this.A08, this.A01, this.A00, z, z2, z3, this.A03);
    }

    public final void A01(int i, int i2) {
        if (!AnonymousClass3MX.A1X(this.A06)) {
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public AnonymousClass4SO(C18030ve r3, UserJid userJid, String str) {
        C18070vi.A0j(r3, userJid);
        this.A06 = r3;
        this.A07 = userJid;
        this.A08 = str;
        C18040vf r1 = C18040vf.A02;
        this.A04 = C18020vd.A05(r1, r3, 6185);
        this.A03 = C18020vd.A05(r1, r3, 9871);
    }
}
