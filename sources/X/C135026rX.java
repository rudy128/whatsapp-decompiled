package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6rX  reason: invalid class name and case insensitive filesystem */
public final class C135026rX {
    public final UserJid A00;
    public final AnonymousClass206 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135026rX) {
                C135026rX r5 = (C135026rX) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public C135026rX(UserJid userJid, AnonymousClass206 r2) {
        this.A01 = r2;
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserControlMessageLevelFragmentInput(fMessage=");
        A10.append(this.A01);
        A10.append(", userJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
