package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AMh  reason: case insensitive filesystem */
public final class C20470AMh implements BAE {
    public final /* synthetic */ C198689yk A00;
    public final /* synthetic */ C193739qa A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C22821Di A04;

    public C20470AMh(C198689yk r1, C193739qa r2, UserJid userJid, String str, C22821Di r5) {
        this.A00 = r1;
        this.A02 = userJid;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = r5;
    }

    public void Brc(AEW aew) {
        C198689yk r5 = this.A00;
        AEW aew2 = aew;
        r5.A05.CGF(new C21463AkU(this.A02, this.A01, aew2, r5, this.A04, this.A03, 4));
    }

    public void BzH(AEW aew) {
        C22821Di r1 = this.A04;
        C198689yk r2 = this.A00;
        C193739qa r3 = this.A01;
        r1.invoke(C198689yk.A00(r2, r3, aew, r3.A01, "V2", this.A03));
    }
}
