package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2pW  reason: invalid class name and case insensitive filesystem */
public final class C61342pW {
    public final C18030ve A00;
    public final AnonymousClass1PM A01;

    public static final boolean A00(C61342pW r5, AnonymousClass1BI r6, long j, boolean z, boolean z2) {
        if (r6 != null && z && j == 0) {
            UserJid A002 = C22941Dw.A00(r6);
            AnonymousClass1PM r0 = r5.A01;
            if (!z2 && r0.A04(A002)) {
                String str = r6.user;
                String A012 = C18020vd.A01(C18040vf.A02, r5.A00, 10638);
                C18070vi.A0X(A012);
                if (!AnonymousClass1YF.A0Y(A012, str, false)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C61342pW(AnonymousClass1PM r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
