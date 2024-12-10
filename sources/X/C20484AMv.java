package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AMv  reason: case insensitive filesystem */
public class C20484AMv implements C36211nW {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C20484AMv(C21132Af0 af0, C195529tU r2, UserJid userJid, int i) {
        this.A00 = i;
        this.A03 = r2;
        this.A01 = userJid;
        this.A02 = af0;
    }

    public void BvB() {
        Object valueOf;
        int i = this.A00;
        C21132Af0 af0 = (C21132Af0) this.A02;
        C196149uX r1 = ((C195529tU) this.A03).A03;
        if (i != 0) {
            valueOf = r1.A00((AEW) null);
        } else {
            valueOf = Boolean.valueOf(r1.A04((AEW) null));
        }
        af0.A0B(valueOf);
    }

    public void BvC() {
        int i;
        int i2 = this.A00;
        C195529tU r5 = (C195529tU) this.A03;
        C26911Ty r4 = r5.A04;
        UserJid userJid = (UserJid) this.A01;
        Object obj = this.A02;
        if (i2 != 0) {
            i = 2;
        } else {
            i = 1;
        }
        r4.A0D(new C20471AMi(obj, r5, i), userJid);
    }
}
