package X;

import java.util.Arrays;

/* renamed from: X.96j  reason: invalid class name and case insensitive filesystem */
public final class C1769496j extends C183499Ym {
    public String A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1769496j)) {
            return false;
        }
        return C42171xk.A00(this.A00, ((C1769496j) obj).A00);
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A00);
        AnonymousClass000.A1M(A1b, this.A00.hashCode());
        return Arrays.hashCode(A1b);
    }
}
