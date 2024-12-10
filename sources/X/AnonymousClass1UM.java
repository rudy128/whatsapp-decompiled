package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1UM  reason: invalid class name */
public final class AnonymousClass1UM {
    public final C25111Mx A00;
    public final AnonymousClass1UL A01;

    public AnonymousClass1UM(C25111Mx r2, AnonymousClass1UL r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final C54452eA A00(AnonymousClass1BI r6, boolean z) {
        C18070vi.A0d(r6, 0);
        if (!C22971Dz.A0d(r6)) {
            return null;
        }
        UserJid userJid = (UserJid) r6;
        C58962lX A05 = this.A00.A05(userJid);
        if (A05 == null || z) {
            return new C54452eA(A05, this.A01.A02(userJid), true);
        }
        return new C54452eA(A05, (AnonymousClass1EC) null, false);
    }
}
