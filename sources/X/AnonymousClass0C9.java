package X;

/* renamed from: X.0C9  reason: invalid class name */
public final class AnonymousClass0C9 extends C04660Og {
    public static final AnonymousClass0C9 A00 = new AnonymousClass0C9();

    public AnonymousClass0C9() {
        super((AnonymousClass1Y1) null, new C25411Oc(0, 1073741822), 1);
    }

    public int A03(long j) {
        return 0;
    }

    public int A04(long j) {
        return 0;
    }

    public int A02(long j) {
        return C04660Og.A00(j >>> 32);
    }

    public int A01(long j) {
        return C04660Og.A00(j);
    }

    public long A05(int i, int i2) {
        int i3 = i2 + 1;
        if (i2 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        return ((long) ((i3 & 1073741823) | (this.A00 << 30))) & 4294967295L;
    }
}
