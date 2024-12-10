package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.43o  reason: invalid class name and case insensitive filesystem */
public final class C821743o extends C83314Eq {
    public final UserJid A00;

    public C821743o(UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C821743o) && C18070vi.A18(this.A00, ((C821743o) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(user=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
