package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AeM  reason: case insensitive filesystem */
public class C21092AeM implements B9W {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C21092AeM(C170018ny r1, UserJid userJid, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = userJid;
    }

    public final void BtO(Object obj) {
        C172058si r4;
        String str;
        String str2;
        if (this.A00 != 0) {
            String str3 = this.A03;
            String str4 = this.A04;
            String str5 = this.A05;
            ((C172058si) C18070vi.A0E(((C170018ny) this.A01).A09)).A0G((Jid) this.A02, str3, str4, str5, "back", (String) null, false);
            return;
        }
        C170018ny r42 = (C170018ny) this.A01;
        String str6 = this.A03;
        String str7 = this.A04;
        String str8 = this.A05;
        Jid jid = (Jid) this.A02;
        C21109Aed aed = (C21109Aed) obj;
        C18070vi.A0d(aed, 5);
        String str9 = aed.A03;
        if (C18070vi.A18(str9, "open_bloks_screen")) {
            Integer num = aed.A01;
            if (num == AnonymousClass00R.A0N) {
                r4 = (C172058si) C18070vi.A0E(r42.A09);
                str = null;
                str2 = "bloks_screen_cta";
            } else if (num == AnonymousClass00R.A01) {
                if (!C18020vd.A05(C18040vf.A02, C17880vN.A0P(r42.A00), 4510)) {
                    AnonymousClass8BR.A0T(r42.A09).A0F(str6.hashCode(), 2);
                    return;
                }
                return;
            } else {
                return;
            }
        } else if (C18070vi.A18(str9, "wae_action_dispatcher") && aed.A01 == AnonymousClass00R.A00) {
            r4 = (C172058si) C18070vi.A0E(r42.A09);
            str = null;
            str2 = "back";
        } else {
            return;
        }
        r4.A0G(jid, str6, str7, str8, str2, str, false);
    }
}
