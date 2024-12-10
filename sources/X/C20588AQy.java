package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AQy  reason: case insensitive filesystem */
public final class C20588AQy implements C107285Zc {
    public final C48122Lg A00;
    public final AnonymousClass1E7 A01;

    public C20588AQy(C48122Lg r2, AnonymousClass1E7 r3) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean Bfv() {
        UserJid A0x = AnonymousClass3MZ.A0x(this.A01);
        C48122Lg r0 = this.A00;
        if (A0x == null || r0.A04(A0x) == null) {
            return false;
        }
        return true;
    }
}
