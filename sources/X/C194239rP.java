package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9rP  reason: invalid class name and case insensitive filesystem */
public final class C194239rP {
    public final UserJid A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194239rP) {
                C194239rP r5 = (C194239rP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17890vO.A02(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    public C194239rP(String str, UserJid userJid, String str2) {
        C18070vi.A0k(str, str2);
        this.A00 = userJid;
        this.A02 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsCatalogCollectionAdditionalPageRequest(bizJid=");
        A10.append(this.A00);
        A10.append(", collectionId=");
        A10.append(this.A02);
        A10.append(", afterCursor=");
        return C17900vP.A0B(this.A01, A10);
    }
}
