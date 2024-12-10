package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AMz  reason: case insensitive filesystem */
public class C20488AMz implements C22572BDn {
    public final /* synthetic */ C185579co A00;
    public final /* synthetic */ C172588tf A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ UserJid A03;

    public void BvC() {
    }

    public C20488AMz(C185579co r1, C172588tf r2, UserJid userJid, UserJid userJid2) {
        this.A00 = r1;
        this.A02 = userJid;
        this.A03 = userJid2;
        this.A01 = r2;
    }

    public void BvB() {
        this.A01.A05();
    }

    public void BvD(AEW aew) {
        C185579co r5 = this.A00;
        UserJid userJid = this.A02;
        UserJid userJid2 = this.A03;
        C172588tf r2 = this.A01;
        if (aew == null || !aew.A0Y) {
            r2.A05();
            return;
        }
        C20259ADr aDr = aew.A03;
        if (aDr != null) {
            r5.A00.A0H(userJid2, aDr.A00);
        }
        r5.A00.A0E(r2, userJid, true);
    }
}
