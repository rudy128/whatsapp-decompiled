package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9sS  reason: invalid class name and case insensitive filesystem */
public final class C194889sS {
    public final UserJid A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C194889sS(UserJid userJid, String str, String str2, boolean z) {
        C18070vi.A0d(userJid, 4);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194889sS) {
                C194889sS r5 = (C194889sS) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass0DV.A00(C17890vO.A02(this.A01, C17880vN.A03(this.A02)), this.A03));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogCategoryTabItem(tabName=");
        A10.append(this.A02);
        A10.append(", categoryId=");
        A10.append(this.A01);
        A10.append(", isLastLevel=");
        A10.append(this.A03);
        A10.append(", bizJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
