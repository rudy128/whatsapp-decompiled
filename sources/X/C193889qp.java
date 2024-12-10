package X;

import java.util.Arrays;

/* renamed from: X.9qp  reason: invalid class name and case insensitive filesystem */
public final class C193889qp {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C193889qp r7 = (C193889qp) obj;
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public C193889qp(String str, long j) {
        this.A01 = str;
        this.A00 = j;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        C17890vO.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("{ path = ");
        AnonymousClass8BT.A1V(A10, this.A01);
        A10.append("size");
        A10.append(" = ");
        A10.append(this.A00);
        return AnonymousClass000.A0y(" } \n", A10);
    }
}
