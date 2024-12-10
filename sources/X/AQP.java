package X;

import com.whatsapp.jid.UserJid;

public class AQP implements C22540BBx {
    public C187219fS A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass9BS A02;
    public final AnonymousClass10I A03;

    public void C2M() {
        A00(this, (C62602rf) null);
    }

    public /* synthetic */ void C8D() {
    }

    public static void A00(AQP aqp, C62602rf r5) {
        C187219fS r4 = aqp.A00;
        if (r4 != null) {
            A6I.A00(r4.A00, r4.A01, r4.A03, r5, r4.A04);
            C22435B7r b7r = r4.A02;
            if (b7r != null) {
                b7r.Bmy();
            }
        }
    }

    public void C8C(C62602rf r5) {
        if (r5 == null) {
            r5 = null;
        } else {
            int i = r5.A00;
            if (i == 1 || i == 2 || i == 3) {
                C187219fS r0 = this.A00;
                if (r0 != null) {
                    A6I a6i = r0.A01;
                    A6I.A02(a6i);
                    A6I.A01(r0.A00, a6i, r0.A03, r0.A04);
                    return;
                }
                return;
            }
        }
        A00(this, r5);
    }

    public AQP(C187219fS r2, AnonymousClass11E r3, C678831f r4, UserJid userJid, AnonymousClass1OZ r6, AnonymousClass10I r7) {
        this.A00 = r2;
        this.A03 = r7;
        this.A01 = r3;
        this.A02 = new AnonymousClass9BS(r4, this, userJid, r6);
    }
}
