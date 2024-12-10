package X;

import java.util.Arrays;

/* renamed from: X.9qV  reason: invalid class name and case insensitive filesystem */
public final class C193689qV {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C193689qV)) {
            return false;
        }
        C193689qV r4 = (C193689qV) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public C193689qV(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, this.A01);
        AnonymousClass000.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append("x");
        return C17880vN.A0t(A10, this.A00);
    }
}
