package X;

/* renamed from: X.0OB  reason: invalid class name */
public abstract class AnonymousClass0OB {
    public static final C16120rk A00 = new C05510Un(0);
    public static final C16120rk A01 = new C05510Un(1);
    public static final C17220uJ A02 = new C05520Uo(0);
    public static final C17220uJ A03 = new C05520Uo(1);
    public static final C16130rl A04 = new C05530Up(0);
    public static final C16130rl A05 = new C05530Up(1);

    public static final void A00(int[] iArr, int[] iArr2, int i, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < r6) {
                int i6 = iArr[i2];
                iArr2[i5] = C22339B3q.A01(f);
                f += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        for (int i7 = r6 - 1; -1 < i7; i7--) {
            int i8 = iArr[i7];
            iArr2[i7] = C22339B3q.A01(f);
            f += (float) i8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r5 != 1) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(int[] r8, int[] r9, int r10, boolean r11) {
        /*
            int r5 = r8.length
            if (r5 == 0) goto L_0x0046
            r7 = 0
            r1 = 0
            r2 = 0
        L_0x0006:
            r0 = r8[r1]
            int r2 = r2 + r0
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x0006
            int r0 = r5 + -1
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            int r10 = r10 - r2
            float r6 = (float) r10
            float r0 = (float) r0
            float r6 = r6 / r0
            if (r11 == 0) goto L_0x001d
            r4 = r6
            if (r5 == r1) goto L_0x0034
        L_0x001d:
            r4 = 0
            if (r11 != 0) goto L_0x0034
            r3 = 0
        L_0x0021:
            r2 = r8[r7]
            int r1 = r3 + 1
            int r0 = X.C22339B3q.A01(r4)
            r9[r3] = r0
            float r0 = (float) r2
            float r0 = r0 + r6
            float r4 = r4 + r0
            int r7 = r7 + 1
            r3 = r1
            if (r7 >= r5) goto L_0x0046
            goto L_0x0021
        L_0x0034:
            int r5 = r5 - r1
        L_0x0035:
            r0 = -1
            if (r0 >= r5) goto L_0x0046
            r1 = r8[r5]
            int r0 = X.C22339B3q.A01(r4)
            r9[r5] = r0
            float r0 = (float) r1
            float r0 = r0 + r6
            float r4 = r4 + r0
            int r5 = r5 + -1
            goto L_0x0035
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OB.A01(int[], int[], int, boolean):void");
    }
}
