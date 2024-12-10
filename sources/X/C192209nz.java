package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.9nz  reason: invalid class name and case insensitive filesystem */
public class C192209nz {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C192209nz r5 = (C192209nz) obj;
            if (this.A00 != r5.A00 || !C42171xk.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C192209nz(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = list;
        boolean A1O = AnonymousClass000.A1O(z ? 1 : 0);
        A1O = z2 ? A1O | true : A1O;
        A1O = z3 ? A1O | true : A1O;
        A1O = z4 ? A1O | true : A1O;
        this.A00 = z5 ? A1O | true : A1O ? 1 : 0;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        AnonymousClass000.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }
}
