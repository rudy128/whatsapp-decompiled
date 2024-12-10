package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9mS  reason: invalid class name and case insensitive filesystem */
public final class C191349mS {
    public final C24751Ln A00;
    public final C18030ve A01;
    public final AnonymousClass1OZ A02;
    public final B6B A03;
    public final AnonymousClass10I A04;

    public C191349mS(C24751Ln r2, C18030ve r3, AnonymousClass1OZ r4, AnonymousClass10I r5, B6B b6b) {
        C18070vi.A0d(r4, 1);
        this.A02 = r4;
        this.A03 = b6b;
        this.A01 = r3;
        this.A04 = r5;
        this.A00 = r2;
    }

    public final void A00(ARR arr, UserJid userJid, Long l, String str, String str2, String str3) {
        String str4;
        String A0B = this.A02.A0B();
        UserJid userJid2 = userJid;
        if (userJid instanceof PhoneUserJid) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("https://wa.me/");
            str4 = AnonymousClass000.A0y(userJid.user, A10);
        } else {
            str4 = "https://wa.me";
        }
        this.A04.CGN(new C21407Aja(userJid2, this, new C178759Ei(String.valueOf(arr.getValue()), String.valueOf(arr.A00), AnonymousClass8BU.A0n(arr)), l, A0B, str4, str, str2, str3));
    }
}
