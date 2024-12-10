package X;

import java.util.Arrays;

/* renamed from: X.1jP  reason: invalid class name and case insensitive filesystem */
public class C33801jP {
    public final byte[] A00;

    public byte[] A00() {
        return A8G.A05(new byte[]{5}, this.A00);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C33801jP)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C33801jP) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C33801jP(byte[] bArr) {
        this.A00 = bArr;
    }
}
