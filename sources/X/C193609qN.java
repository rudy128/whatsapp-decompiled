package X;

import java.util.List;

/* renamed from: X.9qN  reason: invalid class name and case insensitive filesystem */
public final class C193609qN {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193609qN) {
                C193609qN r5 = (C193609qN) obj;
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

    public C193609qN(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TypeaheadRecentSearch(categories=");
        A10.append(this.A01);
        A10.append(", businesses=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
