package X;

import java.util.ArrayList;

/* renamed from: X.27L  reason: invalid class name */
public class AnonymousClass27L extends C38871s3 {
    public float A00 = -1.0f;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public C38921sC A04;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0.A0q[0] != r2) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C38961sG r10) {
        /*
            r9 = this;
            X.1s3 r3 = r9.A0Z
            if (r3 == 0) goto L_0x0059
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            X.1sC r7 = r3.A06(r2)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.1sC r6 = r3.A06(r0)
            X.1s3 r0 = r9.A0Z
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r4]
            r8 = 1
            if (r0 == r2) goto L_0x001e
        L_0x001d:
            r8 = 0
        L_0x001e:
            int r0 = r9.A01
            if (r0 != 0) goto L_0x0039
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            X.1sC r7 = r3.A06(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.1sC r6 = r3.A06(r0)
            X.1s3 r0 = r9.A0Z
            if (r0 == 0) goto L_0x00a3
            java.lang.Integer[] r0 = r0.A0q
            r0 = r0[r1]
            if (r0 != r2) goto L_0x00a3
        L_0x0038:
            r8 = r1
        L_0x0039:
            int r0 = r9.A02
            r5 = 8
            r1 = -1
            r3 = 5
            if (r0 == r1) goto L_0x005a
            X.1sC r0 = r9.A04
            X.1sH r2 = r10.A09(r0)
            X.1sH r1 = r10.A09(r7)
            int r0 = r9.A02
            r10.A0D(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x0059
            X.1sH r0 = r10.A09(r6)
            r10.A0E(r0, r2, r4, r3)
        L_0x0059:
            return
        L_0x005a:
            int r0 = r9.A03
            if (r0 == r1) goto L_0x007b
            X.1sC r0 = r9.A04
            X.1sH r2 = r10.A09(r0)
            X.1sH r1 = r10.A09(r6)
            int r0 = r9.A03
            int r0 = -r0
            r10.A0D(r2, r1, r0, r5)
            if (r8 == 0) goto L_0x0059
            X.1sH r0 = r10.A09(r7)
            r10.A0E(r2, r0, r4, r3)
            r10.A0E(r1, r2, r4, r3)
            return
        L_0x007b:
            float r1 = r9.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0059
            X.1sC r0 = r9.A04
            X.1sH r5 = r10.A09(r0)
            X.1sH r4 = r10.A09(r6)
            float r3 = r9.A00
            X.1sJ r2 = r10.A06()
            X.1sO r1 = r2.A01
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.CCz(r5, r0)
            X.1sO r0 = r2.A01
            r0.CCz(r4, r3)
            r10.A0B(r2)
            return
        L_0x00a3:
            r1 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27L.A0I(X.1sG):void");
    }

    public void A0J(int i) {
        C38921sC r3;
        if (this.A01 != i) {
            this.A01 = i;
            ArrayList arrayList = this.A0g;
            arrayList.clear();
            if (i == 1) {
                r3 = this.A0W;
            } else {
                r3 = this.A0Y;
            }
            this.A04 = r3;
            arrayList.add(r3);
            C38921sC[] r2 = this.A0n;
            int length = r2.length;
            for (int i2 = 0; i2 < length; i2++) {
                r2[i2] = r3;
            }
        }
    }

    public AnonymousClass27L() {
        C38921sC r3 = this.A0Y;
        this.A04 = r3;
        this.A01 = 0;
        ArrayList arrayList = this.A0g;
        arrayList.clear();
        arrayList.add(r3);
        C38921sC[] r1 = this.A0n;
        int length = r1.length;
        for (int i = 0; i < length; i++) {
            r1[i] = r3;
        }
    }
}
