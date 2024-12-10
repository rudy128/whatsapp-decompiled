package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9rY  reason: invalid class name and case insensitive filesystem */
public final class C194329rY {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public C194329rY(UserJid userJid, String str, long j) {
        C18070vi.A0d(str, 2);
        this.A01 = userJid;
        this.A02 = str;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194329rY) {
                C194329rY r8 = (C194329rY) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, C17890vO.A02(this.A02, AnonymousClass000.A0L(this.A01)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CTWAAdId(userJid=");
        A10.append(this.A01);
        A10.append(", adId=");
        A10.append(this.A02);
        A10.append(", timestamp=");
        return C17900vP.A0E(A10, this.A00);
    }
}
