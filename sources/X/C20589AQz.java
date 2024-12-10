package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AQz  reason: case insensitive filesystem */
public final class C20589AQz implements C107285Zc {
    public final C30781eV A00;
    public final C48122Lg A01;
    public final AnonymousClass1E7 A02;

    public boolean Bfv() {
        AnonymousClass1E7 r3 = this.A02;
        if (r3.A0C()) {
            Class<UserJid> cls = UserJid.class;
            UserJid userJid = (UserJid) r3.A06(cls);
            if (userJid != null && (this.A00.A00(userJid) instanceof AnonymousClass8oR)) {
                UserJid userJid2 = (UserJid) r3.A06(cls);
                C48122Lg r0 = this.A01;
                if (userJid2 == null || r0.A04(userJid2) == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C20589AQz(C30781eV r1, C48122Lg r2, AnonymousClass1E7 r3) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
