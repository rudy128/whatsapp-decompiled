package X;

import java.util.Arrays;

public class CYl {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof CYl)) {
                return false;
            }
            CYl cYl = (CYl) obj;
            if (!(this.A00 == cYl.A00 && this.A03 == cYl.A03 && this.A01 == cYl.A01 && this.A02 == cYl.A02)) {
                return false;
            }
        }
        return true;
    }

    public CYl(int i, int i2, long j, long j2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
    }

    public int hashCode() {
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, this.A00);
        C17890vO.A1M(A1a, this.A03);
        AnonymousClass3Ma.A1S(A1a, this.A01);
        C17890vO.A1O(A1a, this.A02);
        return Arrays.hashCode(A1a);
    }
}
