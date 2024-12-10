package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9qA  reason: invalid class name and case insensitive filesystem */
public final class C193479qA {
    public final UserJid A00;
    public final String A01;

    public C193479qA(UserJid userJid, String str) {
        C18070vi.A0d(str, 2);
        this.A00 = userJid;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193479qA) {
                C193479qA r5 = (C193479qA) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A00)) + 1231;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsCatalogProductRequest(bizJid=");
        A10.append(this.A00);
        A10.append(", productId=");
        A10.append(this.A01);
        A10.append(", fetchComplianceInfo=");
        return C17900vP.A0F(A10, true);
    }
}
