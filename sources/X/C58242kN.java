package X;

import java.util.Arrays;

/* renamed from: X.2kN  reason: invalid class name and case insensitive filesystem */
public class C58242kN {
    public final byte[] A00;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C58242kN)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C58242kN) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C58242kN(byte[] bArr) {
        this.A00 = bArr;
    }
}
