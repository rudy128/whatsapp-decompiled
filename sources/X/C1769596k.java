package X;

import java.util.Arrays;

/* renamed from: X.96k  reason: invalid class name and case insensitive filesystem */
public final class C1769596k extends C183499Ym {
    public String A00 = "";
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769596k)) {
            return false;
        }
        C1769596k r4 = (C1769596k) obj;
        return C42171xk.A00(this.A00, r4.A00) && C42171xk.A00(Boolean.valueOf(this.A01), Boolean.valueOf(r4.A01));
    }

    public C1769596k(int i, boolean z) {
        super(i);
        this.A01 = z;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        A1a[1] = this.A00;
        AnonymousClass8BU.A1Q(A1a, this.A01);
        return Arrays.hashCode(A1a);
    }
}
