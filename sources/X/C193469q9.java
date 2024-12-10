package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.9q9  reason: invalid class name and case insensitive filesystem */
public final class C193469q9 {
    public final UserJid A00;
    public final Collection A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193469q9) {
                C193469q9 r5 = (C193469q9) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C193469q9(UserJid userJid, Collection collection) {
        this.A00 = userJid;
        this.A01 = collection;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsCatalogProductListRequest(bizJid=");
        A10.append(this.A00);
        A10.append(", productIds=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
