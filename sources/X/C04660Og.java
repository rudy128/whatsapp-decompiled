package X;

/* renamed from: X.0Og  reason: invalid class name and case insensitive filesystem */
public abstract class C04660Og {
    public final int A00;
    public final C25411Oc A01;

    public /* synthetic */ C04660Og(AnonymousClass1Y1 r1, C25411Oc r2, int i) {
        this(r2, i);
    }

    public static int A00(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public abstract int A01(long j);

    public abstract int A02(long j);

    public abstract int A03(long j);

    public abstract int A04(long j);

    public abstract long A05(int i, int i2);

    public C04660Og(C25411Oc r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final C25411Oc A06() {
        return this.A01;
    }
}
