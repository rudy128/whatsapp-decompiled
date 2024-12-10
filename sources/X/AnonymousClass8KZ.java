package X;

import android.os.Build;
import java.lang.reflect.Array;

/* renamed from: X.8KZ  reason: invalid class name */
public class AnonymousClass8KZ extends C180179Ll implements BA5 {
    public static final boolean A04 = C108975cc.A1C(Build.VERSION.SDK_INT, 23);
    public int A00;
    public long[][] A01;
    public final A0P A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r7.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r7 = this;
            X.A0P r5 = r7.A02
            if (r5 == 0) goto L_0x0037
            long[][] r0 = r7.A01
            int r3 = r0.length
            if (r3 == 0) goto L_0x0037
            int r4 = r7.A00
            r6 = r0[r4]
            r2 = 0
            long r0 = r5.A00
            r6[r2] = r0
            long r1 = r5.A05
            r0 = 1
            r6[r0] = r1
            long r1 = r5.A06
            r0 = 2
            r6[r0] = r1
            long r1 = r5.A02
            r0 = 3
            r6[r0] = r1
            long r1 = r5.A03
            r0 = 4
            r6[r0] = r1
            long r1 = r5.A01
            r0 = 5
            r6[r0] = r1
            long r1 = r5.A04
            r0 = 6
            r6[r0] = r1
            int r0 = r4 + 1
            r7.A00 = r0
            int r0 = r0 % r3
            r7.A00 = r0
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KZ.A00():void");
    }

    public void BEX(C188479hU r4) {
        A0P a0p = this.A02;
        if (a0p != null) {
            a0p.A01();
            if (this.A03) {
                A00();
            }
            r4.A03 = a0p.A05;
            r4.A05 = a0p.A06;
            r4.A00 = a0p.A02;
            r4.A01 = a0p.A03;
            r4.A04 = a0p.A07;
        }
    }

    public void CQJ() {
        A0P a0p = this.A02;
        if (a0p != null && this.A03) {
            a0p.A01();
            A00();
        }
    }

    public AnonymousClass8KZ(boolean z) {
        A0P a0p;
        this.A00 = 0;
        if (A04) {
            a0p = A0P.A00();
        } else {
            a0p = null;
        }
        this.A02 = a0p;
        this.A03 = z;
        int[] iArr = {0, 0};
        if (z) {
            // fill-array-data instruction
            iArr[0] = 15;
            iArr[1] = 7;
        }
        this.A01 = (long[][]) Array.newInstance(Long.TYPE, iArr);
    }

    public AnonymousClass8KZ() {
        this(false);
    }
}
