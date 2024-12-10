package X;

import com.whatsapp.jid.UserJid;

public final class A4F {
    public String A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public static final C171138rE A00(A4F a4f, UserJid userJid, int i, boolean z) {
        C171138rE r5 = new C171138rE();
        if (z) {
            r5.A02 = ((C189399jB) a4f.A06.get()).A00(userJid);
        }
        AnonymousClass00H r2 = a4f.A05;
        r5.A01 = Long.valueOf(C17890vO.A05(C17900vP.A02(r2), "pref_deeplink_journey_logging_counter"));
        if (C18020vd.A05(C18040vf.A02, a4f.A01, 11200)) {
            r5.A03 = a4f.A00;
        }
        r5.A00 = Integer.valueOf(i);
        C60082nM A032 = ((C30801eX) a4f.A04.get()).A03(userJid);
        if (A032 != null) {
            r5.A05 = A032.A07;
            r5.A04 = A032.A06;
        }
        C17880vN.A1D(C19830z4.A00(C17880vN.A0K(r2)), "pref_deeplink_journey_logging_counter", C17890vO.A05(C17900vP.A02(r2), "pref_deeplink_journey_logging_counter") + 1);
        return r5;
    }

    public static final void A01(A4F a4f, UserJid userJid, int i) {
        if (C18020vd.A05(C18040vf.A02, a4f.A01, 9568)) {
            a4f.A03.CGF(new C21470Akb((Object) userJid, i, 46, (Object) a4f));
        }
    }

    public A4F(C18030ve r2, AnonymousClass18K r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r4, r3, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r5;
        this.A05 = r6;
        this.A04 = r7;
    }
}
