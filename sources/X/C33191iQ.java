package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1iQ  reason: invalid class name and case insensitive filesystem */
public final class C33191iQ implements C33181iP {
    public final C18030ve A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C33131iK A03;

    public C33191iQ(AnonymousClass11S r2, AnonymousClass1M9 r3, C18030ve r4, C33131iK r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r2, 4);
        this.A00 = r4;
        this.A03 = r5;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BKL(SharedPreferences sharedPreferences, AnonymousClass2HW r6, AnonymousClass1BI r7) {
        Boolean bool;
        UserJid userJid;
        if (C18020vd.A05(C18040vf.A02, this.A00, 9949)) {
            AnonymousClass1E7 A0F = this.A02.A0F(r7);
            Boolean bool2 = null;
            if (A0F == null || !A0F.A0C() || (userJid = (UserJid) A0F.A06(UserJid.class)) == null) {
                bool = null;
            } else {
                bool = this.A03.A00(userJid);
            }
            r6.A0P = bool;
            AnonymousClass11S r0 = this.A01;
            r0.A0I();
            PhoneUserJid phoneUserJid = r0.A0E;
            if (phoneUserJid != null) {
                bool2 = this.A03.A00(phoneUserJid);
            }
            r6.A0V = bool2;
        }
    }
}
