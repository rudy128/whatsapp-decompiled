package X;

/* renamed from: X.Cqk  reason: case insensitive filesystem */
public class C26026Cqk {
    public static final C26026Cqk A0D = new Object();
    public int A00;
    public C24938CQo A01;
    public C26278CwY A02;
    public C26026Cqk A03;
    public C26026Cqk A04;
    public short A05;
    public short A06;
    public short A07;
    public short A08;
    public short A09;
    public short A0A;
    public int[] A0B;
    public int[] A0C;

    public static void A00(C26026Cqk cqk, int i, int i2, int i3) {
        int[] iArr = cqk.A0B;
        if (iArr == null) {
            iArr = new int[6];
            cqk.A0B = iArr;
        }
        int i4 = iArr[0];
        int i5 = i4 + 2;
        int length = iArr.length;
        if (i5 >= length) {
            int[] iArr2 = new int[(length + 6)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            cqk.A0B = iArr2;
            iArr = iArr2;
        }
        int i6 = i4 + 1;
        iArr[i6] = i;
        int i7 = i6 + 1;
        iArr[i7] = i2 | i3;
        iArr[0] = i7;
    }

    public final void A01(C26151CtI ctI, int i, boolean z) {
        if ((this.A05 & 4) != 0) {
            int i2 = this.A00 - i;
            if (z) {
                ctI.A04(i2);
            } else {
                ctI.A05(i2);
            }
        } else if (z) {
            A00(this, i, 536870912, ctI.A00);
            ctI.A04(-1);
        } else {
            A00(this, i, 268435456, ctI.A00);
            ctI.A05(-1);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A02(short r7) {
        /*
            r6 = this;
            X.Cqk r5 = A0D
            r6.A04 = r5
            r4 = r6
        L_0x0005:
            if (r4 == r5) goto L_0x0032
            X.Cqk r3 = r4.A04
            r0 = 0
            r4.A04 = r0
            short r0 = r4.A0A
            if (r0 != 0) goto L_0x0030
            r4.A0A = r7
            X.CQo r2 = r4.A01
            r1 = r2
        L_0x0015:
            if (r2 == 0) goto L_0x0030
            short r0 = r4.A05
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0024
            X.CQo r0 = r1.A00
            if (r2 != r0) goto L_0x0024
        L_0x0021:
            X.CQo r2 = r2.A00
            goto L_0x0015
        L_0x0024:
            X.Cqk r0 = r2.A02
            X.Cqk r0 = r0.A04
            if (r0 != 0) goto L_0x0021
            X.Cqk r0 = r2.A02
            r0.A04 = r3
            r3 = r0
            goto L_0x0021
        L_0x0030:
            r4 = r3
            goto L_0x0005
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26026Cqk.A02(short):void");
    }

    public String toString() {
        return AnonymousClass001.A1I("L", AnonymousClass000.A10(), System.identityHashCode(this));
    }
}
