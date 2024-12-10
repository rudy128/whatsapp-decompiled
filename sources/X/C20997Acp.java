package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Acp  reason: case insensitive filesystem */
public abstract class C20997Acp implements AnonymousClass1O5, BAF {
    public boolean A00;
    public final C26911Ty A01;

    public C20997Acp(C26911Ty r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final boolean A02(UserJid userJid, int i) {
        boolean z = false;
        if (i == 421) {
            z = true;
            if (!this.A00) {
                this.A00 = true;
                this.A01.A0E(this, userJid, true);
            } else {
                Brd(userJid);
                return true;
            }
        }
        return z;
    }

    public static void A01(C26911Ty r0, C167898hx r1) {
        if (r0.A0J()) {
            r1.A04();
        } else {
            r1.A03();
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
