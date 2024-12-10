package X;

import com.whatsapp.jid.UserJid;

public final /* synthetic */ class ASB implements B82 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C170018ny A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C193199ph A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void Bju(C185899dK r21, Short sh, String str, boolean z) {
        C170018ny r14 = this.A01;
        int i = this.A00;
        String str2 = this.A04;
        String str3 = this.A05;
        String str4 = this.A06;
        C193199ph r2 = this.A03;
        UserJid userJid = this.A02;
        String str5 = this.A07;
        C18070vi.A0g(str3, 4, str4);
        C18070vi.A0d(str5, 8);
        Short sh2 = sh;
        C20081A6h.A03(r14.A0C, sh2, i);
        if (sh2.shortValue() == 2) {
            C185899dK r15 = r21;
            if (r21 != null && !r14.A0I(str2, str3)) {
                int hashCode = str3.hashCode();
                ((C172038sg) r14.A0F.get()).A0F(userJid, false, AnonymousClass00R.A01, str3, str4, r2.A00, hashCode);
                ((C192239o2) r14.A07.get()).A00(str3, hashCode).A09(new C21123Aer(r14, r15, userJid, r2, str3, str5));
            }
        }
    }

    public /* synthetic */ ASB(C170018ny r1, UserJid userJid, C193199ph r3, String str, String str2, String str3, String str4, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = r3;
        this.A02 = userJid;
        this.A07 = str4;
    }
}
