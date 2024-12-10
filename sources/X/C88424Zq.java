package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Zq  reason: invalid class name and case insensitive filesystem */
public final class C88424Zq {
    public static final C88424Zq A00 = new Object();

    public static final boolean A00(AnonymousClass1PM r3, C25491Ok r4, C18030ve r5, AnonymousClass12L r6, UserJid userJid, C145887Mz r8) {
        C18070vi.A0d(r5, 0);
        C18070vi.A0s(r6, r4, r8, r3);
        if (!A01(r5, r8) || userJid == null || C1402170l.A01(r6, userJid)) {
            return false;
        }
        C63852tn r1 = new C63852tn(r3, r4, userJid);
        if (r1.A03() || r1.A04()) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C18030ve r3, C145887Mz r4) {
        C18070vi.A0h(r3, r4);
        int A01 = r4.A01("20210210");
        if (!C18020vd.A05(C18040vf.A02, r3, 791) || A01 != 2) {
            return false;
        }
        return true;
    }
}
