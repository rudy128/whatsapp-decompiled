package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.30c  reason: invalid class name and case insensitive filesystem */
public final class C675930c implements C108035b1 {
    public final C19830z4 A00;
    public final AnonymousClass00H A01;

    public /* synthetic */ void BwO(AnonymousClass1E1 r1, AnonymousClass1E1 r2, PhoneUserJid phoneUserJid) {
    }

    public void BwN(AnonymousClass1E1 r5, AnonymousClass1E1 r6, PhoneUserJid phoneUserJid) {
        String A0b = this.A00.A0b();
        AnonymousClass00H r2 = this.A01;
        boolean A0P = ((C37551pj) r2.get()).A0P(r5);
        boolean A0P2 = ((C37551pj) r2.get()).A0P(phoneUserJid);
        if (A0P) {
            if (!A0P2) {
                ((C37551pj) r2.get()).A0J(phoneUserJid, A0b);
            }
        } else if (A0P2) {
            ((C37551pj) r2.get()).A0J(r5, A0b);
        }
    }

    public C675930c(C19830z4 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
