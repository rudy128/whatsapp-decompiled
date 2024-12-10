package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9pM  reason: invalid class name and case insensitive filesystem */
public final class C192989pM {
    public final UserJid A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C192989pM) && C18070vi.A18(this.A00, ((C192989pM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C192989pM(UserJid userJid) {
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsCatalogProductCatalogRequest(bizJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
