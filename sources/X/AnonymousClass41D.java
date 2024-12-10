package X;

import java.util.Set;

/* renamed from: X.41D  reason: invalid class name */
public final class AnonymousClass41D extends C83164Eb {
    public final Set A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass41D) {
                AnonymousClass41D r5 = (AnonymousClass41D) obj;
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

    public AnonymousClass41D(Set set, Set set2) {
        this.A00 = set;
        this.A01 = set2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkSubgroupsResult(groups=");
        A10.append(this.A00);
        A10.append(", participants=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
