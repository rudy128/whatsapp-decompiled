package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.AWm  reason: case insensitive filesystem */
public class C20731AWm implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C20731AWm(UserJid userJid, CallInfo callInfo, int i, boolean z) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = callInfo;
            this.A02 = userJid;
        } else {
            this.A01 = userJid;
            this.A02 = callInfo;
        }
        this.A03 = z;
    }

    public final void CGE(Object obj) {
        if (this.A00 != 0) {
            BDF bdf = (BDF) obj;
            bdf.C33((UserJid) this.A02, ((CallInfo) this.A01).videoEnabled, this.A03);
            return;
        }
        BDF bdf2 = (BDF) obj;
        bdf2.C36((UserJid) this.A01, ((CallInfo) this.A02).videoEnabled, this.A03);
    }
}
