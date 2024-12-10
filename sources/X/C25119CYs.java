package X;

import java.util.HashMap;

/* renamed from: X.CYs  reason: case insensitive filesystem */
public class C25119CYs {
    public final int A00;
    public final int A01;
    public final EAW A02;
    public final HashMap A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C25119CYs cYs = (C25119CYs) obj;
        if (this.A01 == cYs.A01 && this.A00 == cYs.A00 && this.A02 == cYs.A02) {
            HashMap hashMap = this.A03;
            HashMap hashMap2 = cYs.A03;
            if (hashMap == null) {
                return hashMap2 == null;
            }
            if (hashMap.equals(hashMap2)) {
                return true;
            }
        }
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C25119CYs(CRN crn) {
        this.A01 = crn.A02;
        this.A00 = crn.A01;
        this.A02 = crn.A03;
        this.A03 = crn.A00;
    }
}
