package X;

import java.util.Set;

/* renamed from: X.0y1  reason: invalid class name and case insensitive filesystem */
public final class C19320y1 extends C19310y0 {
    public final long A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C19310y0)) {
                return false;
            }
            C19320y1 r7 = (C19320y1) ((C19310y0) obj);
            if (this.A00 != r7.A00 || !this.A01.equals(r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfigValue{delta=");
        sb.append(this.A00);
        sb.append(", maxAllowedDelay=");
        sb.append(86400000);
        sb.append(", flags=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C19320y1(Set set, long j) {
        this.A00 = j;
        this.A01 = set;
    }

    public int hashCode() {
        long j = this.A00;
        return ((((1000003 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (86400000 ^ (86400000 >>> 32)))) * 1000003) ^ this.A01.hashCode();
    }
}
