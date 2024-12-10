package X;

import android.text.method.LinkMovementMethod;

/* renamed from: X.1t5  reason: invalid class name and case insensitive filesystem */
public class C39441t5 extends LinkMovementMethod {
    public Runnable A00 = null;
    public C39371sy A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.widget.TextView r20, android.text.Spannable r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r17 = r22
            int r8 = r17.getAction()
            r0 = 3
            r7 = r19
            r18 = r20
            if (r8 != r0) goto L_0x0018
            X.1sy r2 = r7.A01
            if (r2 == 0) goto L_0x0018
            r1 = r17
            r0 = r18
            r2.C8s(r1, r0)
        L_0x0018:
            r6 = 1
            r16 = 0
            if (r8 == r6) goto L_0x0020
            if (r8 == 0) goto L_0x0020
        L_0x001f:
            return r16
        L_0x0020:
            float r0 = r17.getX()
            int r14 = (int) r0
            int r0 = r18.getTotalPaddingLeft()
            int r14 = r14 - r0
            int r0 = r18.getScrollX()
            int r14 = r14 + r0
            float r0 = r17.getY()
            int r1 = (int) r0
            int r0 = r18.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r18.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r13 = r18.getLayout()
            int r12 = r13.getLineForVertical(r1)
            int r11 = r13.getLineStart(r12)
            int r10 = r13.getLineEnd(r12)
            java.lang.Class<X.1sy> r9 = X.C39371sy.class
            r15 = r21
            java.lang.Object[] r5 = r15.getSpans(r11, r10, r9)
            X.1sy[] r5 = (X.C39371sy[]) r5
            int r4 = r5.length
            if (r4 == 0) goto L_0x001f
            int r1 = r10 - r11
            r3 = 0
            int r0 = r7.A03     // Catch:{ all -> 0x00e3 }
            if (r1 > r0) goto L_0x0087
            int r2 = r7.A02     // Catch:{ all -> 0x00e3 }
            if (r1 > r2) goto L_0x00b6
            goto L_0x00c1
        L_0x0067:
            r0 = 8207(0x200f, float:1.15E-41)
            if (r1 == r0) goto L_0x0083
            r0 = 1564(0x61c, float:2.192E-42)
            if (r1 == r0) goto L_0x0083
            r0 = 1807(0x70f, float:2.532E-42)
            if (r1 == r0) goto L_0x0083
            r0 = 8234(0x202a, float:1.1538E-41)
            if (r1 < r0) goto L_0x00b4
            r0 = 8238(0x202e, float:1.1544E-41)
            if (r1 <= r0) goto L_0x0083
            r0 = 8294(0x2066, float:1.1622E-41)
            if (r1 < r0) goto L_0x00b4
            r0 = 8297(0x2069, float:1.1627E-41)
            if (r1 > r0) goto L_0x00b4
        L_0x0083:
            int r3 = r3 + 1
            if (r3 <= r2) goto L_0x00b4
        L_0x0087:
            r2 = 0
        L_0x0088:
            r1 = r5[r2]
            boolean r0 = r1 instanceof X.C74653c9
            if (r0 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00b1
            X.1sy[] r5 = new X.C39371sy[r6]
            r5[r16] = r1
        L_0x0094:
            int r0 = r5.length
            if (r0 == 0) goto L_0x001f
            java.lang.Runnable r0 = r7.A00
            if (r0 == 0) goto L_0x00a0
            if (r8 != r6) goto L_0x00a0
            r0.run()
        L_0x00a0:
            r2 = r5[r16]
            r7.A01 = r2
            r1 = r17
            r0 = r18
            r2.C8s(r1, r0)
            return r6
        L_0x00ac:
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x00b1
            goto L_0x0088
        L_0x00b1:
            if (r4 <= r6) goto L_0x0094
            return r16
        L_0x00b4:
            int r11 = r11 + 1
        L_0x00b6:
            if (r11 >= r10) goto L_0x00c1
            char r1 = r15.charAt(r11)     // Catch:{ all -> 0x00e3 }
            r0 = 8206(0x200e, float:1.1499E-41)
            if (r1 == r0) goto L_0x0083
            goto L_0x0067
        L_0x00c1:
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x00d7
            float r1 = (float) r14
            float r0 = r13.getLineLeft(r12)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001f
            float r0 = r13.getLineRight(r12)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            return r16
        L_0x00d7:
            float r0 = (float) r14
            int r0 = r13.getOffsetForHorizontal(r12, r0)
            java.lang.Object[] r5 = r15.getSpans(r0, r0, r9)
            X.1sy[] r5 = (X.C39371sy[]) r5
            goto L_0x0094
        L_0x00e3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39441t5.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    public C39441t5(C18030ve r3) {
        C18040vf r1 = C18040vf.A02;
        this.A04 = C18020vd.A05(r1, r3, 6823);
        this.A03 = C18020vd.A00(r1, r3, 7089);
        this.A02 = C18020vd.A00(r1, r3, 7090);
    }
}
