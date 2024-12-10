package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9qL  reason: invalid class name and case insensitive filesystem */
public final class C193589qL {
    public final long A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193589qL) {
                C193589qL r8 = (C193589qL) obj;
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

    public C193589qL(UserJid userJid, long j) {
        this.A01 = userJid;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizIntegritySignalsRateLimitParams(userJid=");
        A10.append(this.A01);
        A10.append(", lastMexSyncTS=");
        return C17900vP.A0E(A10, this.A00);
    }
}
