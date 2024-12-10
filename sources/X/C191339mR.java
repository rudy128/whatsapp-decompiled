package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9mR  reason: invalid class name and case insensitive filesystem */
public class C191339mR {
    public final C31061ex A00;
    public final AnonymousClass1QS A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;

    public void A00(Activity activity, C72073Kn r17, UserJid userJid, C1418477e r19, boolean z, boolean z2) {
        Object A0q;
        AOR aor;
        Activity activity2 = activity;
        UserJid userJid2 = userJid;
        boolean A1W = AnonymousClass000.A1W(userJid2);
        int i = 2131893764;
        if (z2) {
            i = 2131893766;
        }
        Object[] objArr = new Object[1];
        C1418477e r11 = r19;
        if (A1W) {
            A0q = this.A04.A0I(this.A03.A0H(userJid2));
        } else {
            A0q = AnonymousClass8BT.A0q(r11);
        }
        String A0q2 = C17880vN.A0q(activity2, A0q, objArr, 0, i);
        C72073Kn r7 = r17;
        if (A1W) {
            aor = new AOR(activity2, r7, this, userJid2, 1);
        } else if (this.A01.A06().BPW() != null) {
            aor = new AOR(activity2, r11, this, r7, 2);
        } else {
            aor = null;
        }
        ((AnonymousClass1FR) activity2).CMl(C87374Vi.A01(aor, A0q2, 0, z));
    }

    public C191339mR(AnonymousClass1M9 r1, C24921Me r2, C31061ex r3, AnonymousClass1QS r4, AnonymousClass00H r5) {
        this.A03 = r1;
        this.A04 = r2;
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
    }
}
