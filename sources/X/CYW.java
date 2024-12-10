package X;

import java.util.Arrays;

public final class CYW {
    public final D3X A00;
    public final int[] A01;
    public final boolean[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CYW cyw = (CYW) obj;
            if (!this.A00.equals(cyw.A00) || !Arrays.equals(this.A01, cyw.A01) || !Arrays.equals(this.A02, cyw.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0L(this.A00) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02);
    }

    public CYW(D3X d3x, int[] iArr, boolean[] zArr) {
        this.A00 = d3x;
        this.A01 = (int[]) iArr.clone();
        this.A02 = (boolean[]) zArr.clone();
    }
}
