package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Vq  reason: invalid class name and case insensitive filesystem */
public abstract class C87454Vq {
    public static final boolean A00(AnonymousClass1M9 r4, AnonymousClass1PM r5, C18030ve r6, AnonymousClass12L r7, AnonymousClass206 r8) {
        AnonymousClass1E7 A00;
        if (!C18020vd.A05(C18040vf.A02, r6, 1105) || (A00 = AnonymousClass25G.A00(r4, r8)) == null) {
            return false;
        }
        UserJid A0x = AnonymousClass3MZ.A0x(A00);
        if (C1402170l.A01(r7, A0x) || !new C63852tn(r5, (C25491Ok) null, A0x).A03()) {
            return false;
        }
        return true;
    }

    public static final boolean A01(AnonymousClass1PM r3, C18030ve r4, AnonymousClass12L r5, UserJid userJid) {
        C18070vi.A0h(r4, r3);
        C18070vi.A0d(r5, 3);
        if (!C18020vd.A05(C18040vf.A02, r4, 1105) || userJid == null || C1402170l.A01(r5, userJid) || !new C63852tn(r3, (C25491Ok) null, userJid).A03()) {
            return false;
        }
        return true;
    }
}
