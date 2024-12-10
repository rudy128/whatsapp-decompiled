package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9qD  reason: invalid class name and case insensitive filesystem */
public final class C193509qD {
    public final UserJid A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193509qD) {
                C193509qD r5 = (C193509qD) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C193509qD(UserJid userJid, String str) {
        this.A01 = str;
        this.A00 = userJid;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, (99200 + C17900vP.A00(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogPromotionsRequest(width=");
        A10.append(100);
        A10.append(", height=");
        A10.append(100);
        A10.append(", sessionId=");
        A10.append(this.A01);
        A10.append(", bizJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
