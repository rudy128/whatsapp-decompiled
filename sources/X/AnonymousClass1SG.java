package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1SG  reason: invalid class name */
public class AnonymousClass1SG {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final C22611Cn A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public AnonymousClass2MN A00(UserJid userJid) {
        C29691ci A0A = this.A01.A0A(userJid);
        if (A0A == null || A0A.A0E == -1) {
            return null;
        }
        AnonymousClass206 A032 = ((AnonymousClass1W6) this.A04.get()).A01.A03(A0A.A0E);
        if (!(A032 instanceof C436420i) || ((C436420i) A032).A00 != 28) {
            return null;
        }
        return (AnonymousClass2MN) A032;
    }

    public void A01(UserJid userJid, C436420i r6) {
        C29691ci A002 = AnonymousClass1CJ.A00(this.A01, userJid);
        if (A002 != null) {
            ((C31931gM) this.A03.get()).A01(new AnonymousClass3C4(this, A002, r6, 4), 18);
        }
    }

    public AnonymousClass1SG(AnonymousClass1LW r1, AnonymousClass1CJ r2, C22611Cn r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r3;
    }
}
