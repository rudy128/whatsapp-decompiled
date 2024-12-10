package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.43p  reason: invalid class name and case insensitive filesystem */
public final class C821843p extends C83314Eq {
    public final long A00;
    public final UserJid A01;

    public C821843p(UserJid userJid, long j) {
        C18070vi.A0d(userJid, 1);
        this.A01 = userJid;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C821843p) {
                C821843p r8 = (C821843p) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(user=");
        A10.append(this.A01);
        A10.append(", expirationTimestamp=");
        return C17900vP.A0E(A10, this.A00);
    }
}
