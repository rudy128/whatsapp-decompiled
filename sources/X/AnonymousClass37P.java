package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.37P  reason: invalid class name */
public final class AnonymousClass37P implements C22548BCf {
    public final AnonymousClass1KB A00;
    public final C26811To A01;
    public final C24671Lf A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass1M9 A04;

    public void C6Z(UserJid userJid, String str, long j) {
        AnonymousClass1E7 A0E = this.A04.A0E(userJid);
        if (A0E != null) {
            A0E.A0Z = str;
            A0E.A0F = j;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("getstatus/received  jid=");
            A10.append(userJid);
            A10.append(" timestamp=");
            C17890vO.A16(A10, A0E.A0F);
            this.A03.CGF(new C146497Pi(this, A0E, 18));
        }
    }

    public AnonymousClass37P(AnonymousClass1KB r1, C26811To r2, AnonymousClass1M9 r3, C24671Lf r4, AnonymousClass10I r5) {
        this.A00 = r1;
        this.A03 = r5;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
    }

    public void Br3(UserJid userJid) {
        C17900vP.A0Y(userJid, "getstatus/delete jid=", AnonymousClass000.A10());
        AnonymousClass1E7 A0E = this.A04.A0E(userJid);
        if (A0E != null) {
            A0E.A0Z = null;
            A0E.A0F = 0;
            this.A03.CGF(new C146497Pi(this, A0E, 18));
        }
    }

    public void Bsp(UserJid userJid, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("getstatus/failed jid=");
        A10.append(userJid);
        C17900vP.A0k(" code=", A10, i);
    }

    public void BzE(UserJid userJid) {
        C17900vP.A0Y(userJid, "getstatus/nochange jid=", AnonymousClass000.A10());
    }
}
