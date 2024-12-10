package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.37N  reason: invalid class name */
public final class AnonymousClass37N implements C22548BCf {
    public final C22548BCf A00;
    public final /* synthetic */ C59932n7 A01;

    public AnonymousClass37N(C59932n7 r1, C22548BCf bCf) {
        this.A01 = r1;
        this.A00 = bCf;
    }

    public void Br3(UserJid userJid) {
        C22548BCf bCf = this.A00;
        if (bCf != null) {
            bCf.Br3(userJid);
        }
    }

    public void Bsp(UserJid userJid, int i) {
        C22548BCf bCf = this.A00;
        if (bCf != null) {
            bCf.Bsp(userJid, i);
        }
        C59932n7 r1 = this.A01;
        r1.A02.postDelayed(new C70713Cf(r1, this, 21), 25);
    }

    public void BzE(UserJid userJid) {
        C22548BCf bCf = this.A00;
        if (bCf != null) {
            bCf.BzE(userJid);
        }
    }

    public void C6Z(UserJid userJid, String str, long j) {
        C22548BCf bCf = this.A00;
        if (bCf != null) {
            bCf.C6Z(userJid, str, j);
        }
        C59932n7 r3 = this.A01;
        r3.A02.post(new C21452AkJ(10, str, r3));
    }
}
