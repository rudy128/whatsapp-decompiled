package X;

import java.util.Arrays;

/* renamed from: X.9oL  reason: invalid class name and case insensitive filesystem */
public class C192409oL {
    public int A00;
    public String A01 = "";
    public boolean A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C192409oL)) {
            return false;
        }
        C192409oL r4 = (C192409oL) obj;
        if (this.A01.equals(r4.A01) && this.A00 == r4.A00 && this.A02 == r4.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A01;
        AnonymousClass000.A1M(A1a, this.A00);
        AnonymousClass8BU.A1Q(A1a, this.A02);
        return Arrays.hashCode(A1a);
    }
}
