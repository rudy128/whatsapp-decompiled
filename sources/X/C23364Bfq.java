package X;

import java.util.Arrays;

/* renamed from: X.Bfq  reason: case insensitive filesystem */
public final class C23364Bfq extends DSA {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && this.A00 == ((C23364Bfq) obj).A00);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        DSA dsa = (DSA) obj;
        int A01 = dsa.A01();
        if (7 != A01) {
            return 7 - A01;
        }
        C23364Bfq bfq = (C23364Bfq) dsa;
        int i = 20;
        int i2 = 21;
        if (true != this.A00) {
            i2 = 20;
        }
        if (true == bfq.A00) {
            i = 21;
        }
        return i2 - i;
    }

    public final String toString() {
        return Boolean.toString(this.A00);
    }

    public C23364Bfq(boolean z) {
        this.A00 = z;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, 7);
        BE8.A1O(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }
}
