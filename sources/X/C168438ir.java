package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8ir  reason: invalid class name and case insensitive filesystem */
public final class C168438ir extends C168468iu {
    public final UserJid A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C168438ir) && C18070vi.A18(this.A00, ((C168438ir) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C168438ir(UserJid userJid) {
        this.A00 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DirectConnectionFailure(bizJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
