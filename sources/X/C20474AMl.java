package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AMl  reason: case insensitive filesystem */
public final /* synthetic */ class C20474AMl implements B77 {
    public final /* synthetic */ C185579co A00;
    public final /* synthetic */ C172588tf A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ UserJid A03;

    public final void Bmx(AEW aew) {
        C185579co r6 = this.A00;
        UserJid userJid = this.A02;
        C172588tf r4 = this.A01;
        UserJid userJid2 = this.A03;
        if (aew == null) {
            r6.A00.A0F(new C20488AMz(r6, r4, userJid, userJid2), userJid, (String) null);
        } else if (aew.A0Y) {
            C20259ADr aDr = aew.A03;
            if (aDr != null) {
                r6.A00.A0H(userJid2, aDr.A00);
            }
            r6.A00.A0E(r4, userJid, true);
        } else {
            r4.A05();
        }
    }

    public /* synthetic */ C20474AMl(C185579co r1, C172588tf r2, UserJid userJid, UserJid userJid2) {
        this.A00 = r1;
        this.A02 = userJid;
        this.A01 = r2;
        this.A03 = userJid2;
    }
}
