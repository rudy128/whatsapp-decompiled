package X;

import java.util.Arrays;

/* renamed from: X.9o0  reason: invalid class name and case insensitive filesystem */
public final class C192219o0 {
    public final String A00;
    public final byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C192219o0 r5 = (C192219o0) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !C42171xk.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((31 + Arrays.hashCode(this.A01)) * 31) + C17900vP.A00(this.A00);
    }

    public C192219o0(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }
}
