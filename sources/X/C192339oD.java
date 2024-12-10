package X;

import java.util.Arrays;

/* renamed from: X.9oD  reason: invalid class name and case insensitive filesystem */
public final class C192339oD {
    public final C192589oe A00;
    public final A0y A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C192339oD)) {
            return false;
        }
        C192339oD r4 = (C192339oD) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public C192339oD(C192589oe r1, A0y a0y) {
        this.A01 = a0y;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        A1b[1] = this.A00;
        return Arrays.deepHashCode(A1b);
    }
}
