package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.usernames.observers.UsernameChangeSystemMessageObserver$onUsernameChanged$1;

/* renamed from: X.7Bv  reason: invalid class name and case insensitive filesystem */
public final class C143057Bv implements C26801Tn {
    public final AnonymousClass1CJ A00;
    public final C18030ve A01;
    public final AnonymousClass1PP A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05 = AnonymousClass7S4.A02(this, 31);
    public final C18600wl A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass1OX A08;

    public void C9r(String str, UserJid userJid, String str2) {
        String str3 = str;
        UserJid userJid2 = userJid;
        String str4 = str2;
        C18070vi.A0n(userJid, str, str2);
        if (((userJid instanceof AnonymousClass1E2) || (userJid instanceof PhoneUserJid)) && str.length() > 0 && str2.length() > 0) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 4746)) {
                AnonymousClass3MX.A1Q(new UsernameChangeSystemMessageObserver$onUsernameChanged$1(userJid2, this, str3, str4, (C30391dr) null), this.A08);
            }
        }
    }

    public C143057Bv(AnonymousClass11P r2, AnonymousClass1CJ r3, C18030ve r4, AnonymousClass1PP r5, AnonymousClass00H r6, AnonymousClass00H r7, C18600wl r8, AnonymousClass1OX r9) {
        C18070vi.A0w(r9, r8, r4, r3, r6);
        C18070vi.A0q(r5, r7, r2);
        this.A08 = r9;
        this.A06 = r8;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
        this.A07 = r2;
    }
}
