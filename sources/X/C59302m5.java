package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2m5  reason: invalid class name and case insensitive filesystem */
public final class C59302m5 {
    public final AnonymousClass1EC A00;
    public final UserJid A01;
    public final AnonymousClass1EC A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59302m5) {
                C59302m5 r5 = (C59302m5) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02)) + AnonymousClass001.A0k(this.A01);
    }

    public C59302m5(AnonymousClass1EC r1, AnonymousClass1EC r2, UserJid userJid) {
        C18070vi.A0j(r1, r2);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubgroupSuggestionKey(parentGroupJid=");
        A10.append(this.A02);
        A10.append(", groupJid=");
        A10.append(this.A00);
        A10.append(", creatorJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
