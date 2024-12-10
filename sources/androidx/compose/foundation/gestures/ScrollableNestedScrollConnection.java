package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.AnonymousClass0CI;
import X.AnonymousClass0QY;
import X.C16810tG;
import X.C16840tJ;
import X.C26199CuU;
import X.C30391dr;

public final class ScrollableNestedScrollConnection implements C16810tG {
    public boolean A00;
    public final ScrollingLogic A01;

    public long C1Q(long j, int i) {
        if (i == 2) {
            AnonymousClass000.A1C(this.A01.A06, true);
        }
        return AnonymousClass0QY.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object C15(X.C30391dr r7, long r8, long r10) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C07530bI
            if (r0 == 0) goto L_0x005e
            r5 = r7
            X.0bI r5 = (X.C07530bI) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 != r1) goto L_0x0064
            long r10 = r5.J$0
            java.lang.Object r2 = r5.L$0
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r2 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection) r2
            X.C30691eM.A01(r4)
        L_0x0028:
            X.CuU r4 = (X.C26199CuU) r4
            long r0 = r4.A03()
            long r0 = X.C26199CuU.A00(r10, r0)
        L_0x0032:
            X.CuU r3 = X.C26199CuU.A01(r0)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r2.A01
            r1 = 0
            X.0uU r0 = r0.A06
            X.AnonymousClass000.A1C(r0, r1)
        L_0x003e:
            return r3
        L_0x003f:
            X.C30691eM.A01(r4)
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0056
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r6.A01
            r5.L$0 = r6
            r5.J$0 = r10
            r5.label = r1
            java.lang.Object r4 = r0.A05(r5, r10)
            if (r4 == r3) goto L_0x003e
            r2 = r6
            goto L_0x0028
        L_0x0056:
            long r0 = X.C26199CuU.A01
            long r0 = X.C7C.A00()
            r2 = r6
            goto L_0x0032
        L_0x005e:
            X.0bI r5 = new X.0bI
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.C15(X.1dr, long, long):java.lang.Object");
    }

    public long C1C(long j, long j2, int i) {
        float A02;
        if (this.A00) {
            ScrollingLogic scrollingLogic = this.A01;
            if (!scrollingLogic.A03.BgL()) {
                C16840tJ r2 = scrollingLogic.A03;
                if (scrollingLogic.A02 == AnonymousClass0CI.Horizontal) {
                    A02 = AnonymousClass0QY.A01(j2);
                } else {
                    A02 = AnonymousClass0QY.A02(j2);
                }
                if (scrollingLogic.A05) {
                    A02 *= -1.0f;
                }
                float BIy = r2.BIy(A02);
                if (scrollingLogic.A05) {
                    BIy *= -1.0f;
                }
                return scrollingLogic.A01(BIy);
            }
        }
        return AnonymousClass0QY.A03;
    }

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.A01 = scrollingLogic;
        this.A00 = z;
    }

    public /* synthetic */ Object C1K(C30391dr r2, long j) {
        return C26199CuU.A01;
    }
}
