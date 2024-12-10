package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9q8  reason: invalid class name and case insensitive filesystem */
public final class C193459q8 {
    public final UserJid A00;
    public final String A01;

    public C193459q8(UserJid userJid, String str) {
        C18070vi.A0d(str, 2);
        this.A00 = userJid;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193459q8) {
                C193459q8 r5 = (C193459q8) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsCatalogCollectionRequest(bizJid=");
        A10.append(this.A00);
        A10.append(", collectionId=");
        return C17900vP.A0B(this.A01, A10);
    }
}
