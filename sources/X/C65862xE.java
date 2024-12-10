package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2xE  reason: invalid class name and case insensitive filesystem */
public final class C65862xE implements C26181Rd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C49752Rt A01;
    public final /* synthetic */ C24881Ma A02;
    public final /* synthetic */ GroupJid A03;

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public C65862xE(C49752Rt r1, C24881Ma r2, GroupJid groupJid, int i) {
        this.A02 = r2;
        this.A03 = groupJid;
        this.A00 = i;
        this.A01 = r1;
    }

    public void BvR() {
        C24881Ma r2 = this.A02;
        r2.A02.unregisterObserver(this);
        r2.A07.CGF(new C21365Aiu(r2, this.A03, this.A01, this.A00, 23));
    }
}
