package X;

import java.util.Arrays;

/* renamed from: X.2kn  reason: invalid class name and case insensitive filesystem */
public final class C58502kn {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C58502kn r5 = (C58502kn) obj;
            if (!Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02) || !C42171xk.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((31 + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02)) * 31) + C17900vP.A00(this.A00);
    }

    public C58502kn(String str, byte[] bArr, byte[] bArr2) {
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = bArr2;
    }
}
