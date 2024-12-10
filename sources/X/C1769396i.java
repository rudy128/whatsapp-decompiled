package X;

import java.util.Arrays;

/* renamed from: X.96i  reason: invalid class name and case insensitive filesystem */
public final class C1769396i extends C183499Ym {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769396i)) {
            return false;
        }
        return C42171xk.A00(Integer.valueOf(this.A00), Integer.valueOf(((C183499Ym) obj).A00));
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        return Arrays.hashCode(A1a);
    }
}
