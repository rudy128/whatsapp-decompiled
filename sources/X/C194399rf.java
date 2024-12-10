package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9rf  reason: invalid class name and case insensitive filesystem */
public final class C194399rf {
    public final UserJid A00;
    public final String A01;
    public final boolean A02;

    public C194399rf(UserJid userJid, String str, boolean z) {
        C18070vi.A0d(str, 2);
        this.A00 = userJid;
        this.A01 = str;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194399rf) {
                C194399rf r5 = (C194399rf) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A00)), this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutationKey(callCreatorJid=");
        A10.append(this.A00);
        A10.append(", callId=");
        A10.append(this.A01);
        A10.append(", isIncoming=");
        return C17900vP.A0F(A10, this.A02);
    }
}
