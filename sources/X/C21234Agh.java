package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Agh  reason: case insensitive filesystem */
public final class C21234Agh implements C22470B9c {
    public static final C21234Agh A00 = new C21234Agh();

    public final Object BCF(C29621ca r5, C62672rm r6) {
        UserJid A0L;
        AnonymousClass9CY A02;
        boolean A17 = C18070vi.A17(r5, r6);
        if (!r6.A09(r5, "participant") || (A0L = AnonymousClass8BY.A0L(r5, r6, AnonymousClass8BS.A1Y(A17 ? 1 : 0, 0))) == null || (A02 = A97.A02(r5, r6)) == null) {
            return null;
        }
        return new AnonymousClass9E5(A0L, r5, A02);
    }
}
