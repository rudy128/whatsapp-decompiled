package X;

import java.util.List;

/* renamed from: X.9qF  reason: invalid class name and case insensitive filesystem */
public final class C193529qF {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193529qF) {
                C193529qF r5 = (C193529qF) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C193529qF(List list, List list2) {
        C18070vi.A0j(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VariantTypes(shownVariants=");
        A10.append(this.A01);
        A10.append(", droppedVariants=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
