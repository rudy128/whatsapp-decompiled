package X;

import java.util.List;

/* renamed from: X.6sG  reason: invalid class name and case insensitive filesystem */
public final class C135476sG {
    public final Boolean A00;
    public final String A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135476sG) {
                C135476sG r5 = (C135476sG) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0L(this.A02) + C17900vP.A00(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public C135476sG(Boolean bool, String str, List list) {
        this.A02 = list;
        this.A01 = str;
        this.A00 = bool;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MusicCatalogResponse(items=");
        A10.append(this.A02);
        A10.append(", endCursor=");
        A10.append(this.A01);
        A10.append(", hasNextPage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
