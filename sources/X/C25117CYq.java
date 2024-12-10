package X;

import java.util.Arrays;

/* renamed from: X.CYq  reason: case insensitive filesystem */
public final class C25117CYq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25117CYq cYq = (C25117CYq) obj;
            if (!(this.A01 == cYq.A01 && this.A02 == cYq.A02 && this.A00 == cYq.A00 && Arrays.equals(this.A03, cYq.A03))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }

    public C25117CYq(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }
}
