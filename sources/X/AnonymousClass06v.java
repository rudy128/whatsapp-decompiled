package X;

/* renamed from: X.06v  reason: invalid class name */
public final class AnonymousClass06v extends AnonymousClass0KS {
    public int A00;

    public static final int A00(AnonymousClass06v r7, int i) {
        int i2 = r7.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0t = AnonymousClass001.A0t(AnonymousClass002.A01(r7.A04, i3));
            if (A0t != 0) {
                return (i3 + (Long.numberOfTrailingZeros(A0t) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public AnonymousClass06v() {
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        A01(this, 6);
    }

    public static final void A01(AnonymousClass06v r3, int i) {
        int A0C = AnonymousClass001.A0C(i);
        r3.A00 = A0C;
        long[] A07 = AnonymousClass002.A07(A0C);
        r3.A04 = A07;
        AnonymousClass002.A06(A07, A0C);
        int i2 = r3.A00;
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        r3.A00 = AnonymousClass001.A0B(i2) - r3.A01;
        r3.A02 = new int[A0C];
        r3.A03 = new int[A0C];
    }
}
