package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9r5  reason: invalid class name and case insensitive filesystem */
public final class C194049r5 {
    public final AnonymousClass1E2 A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194049r5) {
                C194049r5 r5 = (C194049r5) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C194049r5(AnonymousClass1E2 r1, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("KeyPair(phoneKey=");
        A10.append(this.A01);
        A10.append(", lidKey=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
