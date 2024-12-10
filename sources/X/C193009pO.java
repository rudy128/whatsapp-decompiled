package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9pO  reason: invalid class name and case insensitive filesystem */
public final class C193009pO {
    public final UserJid A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193009pO) && C18070vi.A18(this.A00, ((C193009pO) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C193009pO(UserJid userJid) {
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetPublicKeyRequest(businessJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
