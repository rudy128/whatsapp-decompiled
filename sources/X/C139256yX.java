package X;

import android.graphics.PointF;

/* renamed from: X.6yX  reason: invalid class name and case insensitive filesystem */
public final class C139256yX {
    public AnonymousClass899 A00;
    public AnonymousClass69V A01;
    public boolean A02;
    public final float A03;
    public final C1410073x A04;
    public final C138456x7 A05;
    public final AnonymousClass6p8 A06;
    public final AnonymousClass70N A07;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r2 != 6) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.view.MotionEvent r14, float r15, int r16, boolean r17) {
        /*
            r13 = this;
            r1 = 0
            X.C18070vi.A0d(r14, r1)
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x001d
            int r2 = r14.getActionMasked()
            r1 = 1
            if (r2 == 0) goto L_0x00a4
            if (r2 == r1) goto L_0x0070
            r0 = 2
            if (r2 == r0) goto L_0x001e
            r0 = 3
            if (r2 == r0) goto L_0x0070
            r0 = 5
            if (r2 == r0) goto L_0x00a4
            r0 = 6
            if (r2 == r0) goto L_0x0070
        L_0x001d:
            return r1
        L_0x001e:
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x001d
            X.69V r5 = r13.A01
            if (r5 == 0) goto L_0x001d
            int r7 = r14.getHistorySize()
            r6 = 0
        L_0x002b:
            r4 = 0
            if (r6 >= r7) goto L_0x0050
            float r3 = r14.getHistoricalX(r6)
            float r2 = r14.getHistoricalY(r6)
            X.69V r0 = r13.A01
            if (r0 == 0) goto L_0x003c
            X.70B r4 = r0.A04
        L_0x003c:
            boolean r0 = r4 instanceof X.C1196869l
            android.graphics.PointF r4 = r13.A00(r3, r2, r0)
            long r2 = r14.getHistoricalEventTime(r6)
            X.70B r0 = r5.A04
            if (r0 == 0) goto L_0x004d
            r0.A06(r4, r2)
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0050:
            float r3 = r14.getX()
            float r2 = r14.getY()
            X.69V r0 = r13.A01
            if (r0 == 0) goto L_0x005e
            X.70B r4 = r0.A04
        L_0x005e:
            boolean r0 = r4 instanceof X.C1196869l
            android.graphics.PointF r4 = r13.A00(r3, r2, r0)
            long r2 = r14.getEventTime()
            X.70B r0 = r5.A04
            if (r0 == 0) goto L_0x001d
            r0.A06(r4, r2)
            return r1
        L_0x0070:
            boolean r0 = r13.A02
            if (r0 == 0) goto L_0x009a
            X.69V r6 = r13.A01
            r5 = 0
            if (r6 == 0) goto L_0x0098
            float r3 = r14.getX()
            float r2 = r14.getY()
            X.69V r0 = r13.A01
            if (r0 == 0) goto L_0x00a2
            X.70B r0 = r0.A04
        L_0x0087:
            boolean r0 = r0 instanceof X.C1196869l
            android.graphics.PointF r4 = r13.A00(r3, r2, r0)
            long r2 = r14.getEventTime()
            X.70B r0 = r6.A04
            if (r0 == 0) goto L_0x0098
            r0.A05(r4, r2)
        L_0x0098:
            r13.A01 = r5
        L_0x009a:
            X.899 r0 = r13.A00
            if (r0 == 0) goto L_0x001d
            r0.Bs7()
            return r1
        L_0x00a2:
            r0 = r5
            goto L_0x0087
        L_0x00a4:
            float r2 = r13.A03
            X.69V r0 = new X.69V
            r0.<init>(r2)
            r13.A01 = r0
            X.6x7 r2 = r13.A05
            r0.A0a(r2)
            r2 = r16
            r0.A0K(r2)
            r0.A0J(r15)
            X.73x r6 = r13.A04
            r5 = r17
            if (r17 == 0) goto L_0x0120
            android.graphics.Bitmap r2 = r6.A05
            if (r2 != 0) goto L_0x00c7
            X.C1410073x.A04(r6, r1)
        L_0x00c7:
            android.graphics.Bitmap r4 = r6.A05
        L_0x00c9:
            android.graphics.PointF r3 = r6.A0D
            int r2 = r6.A00
            X.C18070vi.A0d(r3, r1)
            r0.A01 = r4
            r0.A02 = r3
            r0.A00 = r2
            float r3 = r14.getX()
            float r2 = r14.getY()
            android.graphics.PointF r6 = r13.A00(r3, r2, r5)
            long r11 = r14.getEventTime()
            X.6x7 r8 = r0.A05
            if (r17 == 0) goto L_0x010c
            if (r8 == 0) goto L_0x010c
            android.graphics.Bitmap r4 = r0.A01
            android.graphics.PointF r7 = r0.A02
            int r10 = r0.A00
            android.graphics.Paint r5 = r0.A05
            float r9 = r0.A0B()
            X.69l r3 = new X.69l
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x00fd:
            r0.A04 = r3
            X.70N r2 = r13.A07
            r2.A06(r0)
            X.899 r0 = r13.A00
            if (r0 == 0) goto L_0x001d
            r0.Bs6()
            return r1
        L_0x010c:
            android.graphics.Bitmap r4 = r0.A01
            android.graphics.PointF r7 = r0.A02
            int r10 = r0.A00
            android.graphics.Paint r5 = r0.A05
            float r8 = r0.A0B()
            float r9 = r0.A07
            X.BuA r3 = new X.BuA
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00fd
        L_0x0120:
            android.graphics.Bitmap r2 = r6.A06
            if (r2 != 0) goto L_0x0127
            X.C1410073x.A05(r6, r1)
        L_0x0127:
            android.graphics.Bitmap r4 = r6.A06
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139256yX.A01(android.view.MotionEvent, float, int, boolean):boolean");
    }

    private final PointF A00(float f, float f2, boolean z) {
        AnonymousClass69K r0;
        AnonymousClass6p8 r1 = this.A06;
        if (z) {
            r0 = this.A07.A01();
        } else {
            r0 = null;
        }
        return r1.A01(r0, f, f2);
    }

    public C139256yX(C1410073x r4, AnonymousClass6p8 r5, AnonymousClass70N r6, C138456x7 r7, float f) {
        this.A07 = r6;
        this.A04 = r4;
        this.A06 = r5;
        this.A05 = r7;
        this.A03 = f;
        for (AnonymousClass69V A0a : r6.A04()) {
            A0a.A0a(this.A05);
        }
    }
}
