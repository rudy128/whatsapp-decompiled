package X;

/* renamed from: X.0C8  reason: invalid class name */
public final class AnonymousClass0C8 extends C04660Og {
    public static final AnonymousClass0C8 A00 = new AnonymousClass0C8();

    public int A01(long j) {
        int i = ((int) j) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A03(long j) {
        int i = (((int) j) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public long A05(int i, int i2) {
        int i3 = 0;
        int i4 = i + 1;
        if (i == Integer.MAX_VALUE) {
            i4 = 0;
        }
        if (i2 != Integer.MAX_VALUE) {
            i3 = i2 + 1;
        }
        return ((long) (((i4 & 8191) << 18) | (this.A00 << 30) | (262143 & i3))) & 4294967295L;
    }

    public AnonymousClass0C8() {
        super((AnonymousClass1Y1) null, new C25411Oc(8190, 262142), 2);
    }

    public int A02(long j) {
        int i = ((int) (j >>> 32)) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public int A04(long j) {
        int i = (((int) (j >>> 32)) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }
}
