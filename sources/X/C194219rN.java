package X;

import java.util.List;

/* renamed from: X.9rN  reason: invalid class name and case insensitive filesystem */
public final class C194219rN {
    public final C193429q5 A00;
    public final C179409Hv A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194219rN) {
                C194219rN r5 = (C194219rN) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)));
    }

    public C194219rN(C193429q5 r1, C179409Hv r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CatalogCollectionsPage(collections=");
        A10.append(this.A02);
        A10.append(", catalogType=");
        A10.append(this.A01);
        A10.append(", pageInfo=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
