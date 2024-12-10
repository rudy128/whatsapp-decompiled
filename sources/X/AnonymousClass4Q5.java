package X;

import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Q5  reason: invalid class name */
public class AnonymousClass4Q5 {
    public final AnonymousClass00H A00;
    public final C25831Pu A01;

    public void A00(AnonymousClass1FU r9, UserJid userJid, int i, int i2) {
        UserJid userJid2 = userJid;
        if (this.A01.A01(userJid)) {
            AnonymousClass1FU r3 = r9;
            Intent A0c = AnonymousClass1LU.A0c(r9, userJid, i, i2);
            if (C72463Mc.A1U(userJid, this.A00)) {
                int i3 = 2131889947;
                if (i > 0) {
                    i3 = 2131889946;
                }
                r9.CMl(C87374Vi.A01(new AOR(r3, A0c, this, userJid2, 0), r9.getString(i3), 2131887212, false));
                return;
            }
            r9.startActivity(A0c);
        }
    }

    public AnonymousClass4Q5(C25831Pu r1, AnonymousClass00H r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
