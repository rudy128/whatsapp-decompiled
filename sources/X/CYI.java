package X;

import java.util.Arrays;

public final class CYI {
    public final String A00;
    public final long A01;

    public CYI(String str, long j) {
        this.A00 = str;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof CYI) {
                    CYI cyi = (CYI) obj;
                    if (C25332Cdd.A01(this.A00, cyi.A00)) {
                        long j = this.A01;
                        if (C25332Cdd.A00(Long.valueOf(j), cyi.A01)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1a = C17890vO.A1a(this.A00);
        C17890vO.A1M(A1a, this.A01);
        return Arrays.hashCode(A1a);
    }
}
