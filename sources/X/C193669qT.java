package X;

import java.util.List;

/* renamed from: X.9qT  reason: invalid class name and case insensitive filesystem */
public final class C193669qT {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193669qT) {
                C193669qT r8 = (C193669qT) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C193669qT(List list, long j) {
        this.A01 = list;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PopularBusinesses(popularBusinessDataList=");
        A10.append(this.A01);
        A10.append(", lastUpdated=");
        return C17900vP.A0E(A10, this.A00);
    }
}
