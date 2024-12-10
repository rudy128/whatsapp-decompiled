package X;

/* renamed from: X.9lf  reason: invalid class name and case insensitive filesystem */
public final class C190879lf {
    public boolean A00;
    public final long[] A01 = new long[7];
    public final int[] A02 = new int[7];
    public final boolean[] A03 = new boolean[7];

    public final int[] A00() {
        synchronized (this) {
            if (!this.A00) {
                return null;
            }
            long[] jArr = this.A01;
            int i = 0;
            int i2 = 0;
            while (i < 7) {
                int i3 = i2 + 1;
                int i4 = 1;
                boolean A1R = AnonymousClass000.A1R((jArr[i] > 0 ? 1 : (jArr[i] == 0 ? 0 : -1)));
                boolean[] zArr = this.A03;
                if (A1R != zArr[i2]) {
                    int[] iArr = this.A02;
                    if (!A1R) {
                        i4 = 2;
                    }
                    iArr[i2] = i4;
                } else {
                    this.A02[i2] = 0;
                }
                zArr[i2] = A1R;
                i++;
                i2 = i3;
            }
            this.A00 = false;
            int[] iArr2 = (int[]) this.A02.clone();
            return iArr2;
        }
    }
}
