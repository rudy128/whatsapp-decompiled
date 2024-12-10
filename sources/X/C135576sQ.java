package X;

import java.util.List;

/* renamed from: X.6sQ  reason: invalid class name and case insensitive filesystem */
public final class C135576sQ {
    public final List A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135576sQ) {
                C135576sQ r5 = (C135576sQ) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
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

    public C135576sQ(List list, List list2, List list3) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = list3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostRequestDestinationResult(successIds=");
        A10.append(this.A02);
        A10.append(", failureUnknownIds=");
        A10.append(this.A01);
        A10.append(", failureDuplicateIds=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
