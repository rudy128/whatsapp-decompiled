package X;

/* renamed from: X.CkT  reason: case insensitive filesystem */
public final class C25698CkT {
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public D48 A07;
    public boolean A08 = true;
    public boolean A09 = true;
    public int[] A0A = new int[1000];
    public int[] A0B = new int[1000];
    public int[] A0C = new int[1000];
    public long[] A0D = new long[1000];
    public long[] A0E = new long[1000];
    public D48[] A0F = new D48[1000];
    public C25117CYq[] A0G = new C25117CYq[1000];

    public synchronized boolean A01() {
        return AnonymousClass000.A1S(this.A03, this.A02);
    }

    public static long A00(C25698CkT ckT, int i) {
        int i2;
        long j = ckT.A05;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int i3 = ckT.A04 + (i - 1);
            int i4 = ckT.A01;
            if (i3 >= i4) {
                i3 -= i4;
            }
            for (int i5 = 0; i5 < i; i5++) {
                j2 = Math.max(j2, ckT.A0E[i2]);
                if ((ckT.A0A[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i4 - 1;
                }
            }
        }
        ckT.A05 = Math.max(j, j2);
        int i6 = ckT.A02 - i;
        ckT.A02 = i6;
        ckT.A00 += i;
        int i7 = ckT.A04 + i;
        ckT.A04 = i7;
        int i8 = ckT.A01;
        if (i7 >= i8) {
            i7 -= i8;
            ckT.A04 = i7;
        }
        int i9 = ckT.A03 - i;
        ckT.A03 = i9;
        if (i9 < 0) {
            ckT.A03 = 0;
        }
        if (i6 != 0) {
            return ckT.A0D[i7];
        }
        if (i7 != 0) {
            i8 = i7;
        }
        int i10 = i8 - 1;
        return ckT.A0D[i10] + ((long) ckT.A0B[i10]);
    }
}
