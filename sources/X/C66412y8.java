package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2y8  reason: invalid class name and case insensitive filesystem */
public final class C66412y8 implements C107115Yl {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void Bmo(C446324e r4) {
        C446324e A002;
        if (!r4.A0J) {
            UserJid userJid = r4.A04;
            if (((AnonymousClass1CJ) this.A02.get()).A0P(userJid) && (A002 = ((C25741Pl) this.A01.get()).A00(userJid)) != null && !C18070vi.A18(A002.A0E, r4.A0E)) {
                ((C192379oI) this.A00.get()).A01(userJid);
            }
        }
    }

    public C66412y8(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
