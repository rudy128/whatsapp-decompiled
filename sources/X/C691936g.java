package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.36g  reason: invalid class name and case insensitive filesystem */
public final class C691936g implements AnonymousClass25D {
    public AnonymousClass1E7 A00;
    public final UserJid A01;

    public C691936g(AnonymousClass1E7 r2, UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        this.A01 = userJid;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C691936g) {
                C691936g r5 = (C691936g) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessMessageForwardInfo(businessOwnerJid=");
        A10.append(this.A01);
        A10.append(", businessOwnerContact=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
