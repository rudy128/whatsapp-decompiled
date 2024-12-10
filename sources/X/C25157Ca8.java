package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Ca8  reason: case insensitive filesystem */
public final class C25157Ca8 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C25157Ca8)) {
                return false;
            }
            C25157Ca8 ca8 = (C25157Ca8) obj;
            if (!(this.A01 == ca8.A01 && this.A00 == ca8.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A01 + 31) * 31) + this.A00;
    }

    public C25157Ca8(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A01);
        AnonymousClass000.A1M(A1b, this.A00);
        return C108955ca.A12((Locale) null, "%dx%d", Arrays.copyOf(A1b, 2));
    }
}
