package X;

import java.util.concurrent.Callable;

/* renamed from: X.DVq  reason: case insensitive filesystem */
public final class C27129DVq implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ CYA A03;
    public final /* synthetic */ C25153Ca4 A04;
    public final /* synthetic */ C25153Ca4 A05;
    public final /* synthetic */ C24284Byh A06;
    public final /* synthetic */ AnonymousClass0IV A07;
    public final /* synthetic */ DFL A08;
    public final /* synthetic */ boolean A09;

    public C27129DVq(CYA cya, C25153Ca4 ca4, C25153Ca4 ca42, C24284Byh byh, AnonymousClass0IV r5, DFL dfl, int i, int i2, int i3, boolean z) {
        this.A05 = ca4;
        this.A04 = ca42;
        this.A08 = dfl;
        this.A07 = r5;
        this.A03 = cya;
        this.A00 = i;
        this.A06 = byh;
        this.A02 = i2;
        this.A01 = i3;
        this.A09 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f0, code lost:
        if (r2 == null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        if (X.C18070vi.A00(r3.A00 ^ Integer.MIN_VALUE, r0.A00 ^ Integer.MIN_VALUE) <= 0) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0173, code lost:
        if (r2 == null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0177, code lost:
        r0 = r2.A0D(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r29 = this;
            r1 = r29
            X.Ca4 r7 = r1.A05
            int r2 = r7.A00()
            X.Ca4 r3 = r1.A04
            int r0 = r3.A00()
            X.DFL r6 = r1.A08
            r5 = 0
            X.0IV r10 = r1.A07
            X.CYA r4 = r1.A03
            long r25 = X.C02740Fe.A00(r2, r0)
            r2 = 1
            r9 = 1
            X.0Mi r21 = r4.A00(r6, r2)
            X.0OS r19 = X.C04220Mi.A04
            android.content.Context r0 = r10.A02
            r28 = r0
            X.0Jt r8 = new X.0Jt
            r8.<init>(r6, r5, r5)
            java.lang.Object r0 = r10.A03
            r18 = r0
            r0 = r18
            X.DOZ r0 = (X.DOZ) r0
            r27 = r0
            X.CBx.A00(r27)
            int r0 = r10.A01
            r24 = r0
            r20 = r28
            r22 = r8
            r23 = r18
            X.0Mi r12 = r19.A03(r20, r21, r22, r23, r24, r25)
            r4.A01(r12, r6, r2)
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x0055
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            return r12
        L_0x0055:
            X.0Mk r0 = r12.A01
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03
            android.graphics.Rect r0 = r0.A03
            int r11 = r0.width()
            int r10 = r0.height()
            int r8 = r1.A00
            X.Byh r0 = r1.A06
            r21 = r0
            int r0 = r1.A02
            int r2 = r1.A01
            boolean r15 = r1.A09
            r20 = r10
            X.DFL r17 = X.C25303Cd7.A00(r6)
            if (r17 != 0) goto L_0x00be
            X.DSE r3 = new X.DSE
            r3.<init>(r11)
            X.DSE r0 = new X.DSE
            r0.<init>(r10)
        L_0x0081:
            X.1D6 r2 = X.AnonymousClass1D6.A01(r3, r0)
            java.lang.Object r0 = r2.first
            X.DSE r0 = (X.DSE) r0
            int r1 = r0.A00
            java.lang.Object r0 = r2.second
            X.DSE r0 = (X.DSE) r0
            int r2 = r0.A00
            if (r1 != r11) goto L_0x0095
            if (r2 == r10) goto L_0x0054
        L_0x0095:
            int r0 = X.C24676CEq.A00
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            long r25 = X.C02740Fe.A00(r1, r0)
            r1 = 0
            X.0Mi r21 = r4.A00(r6, r1)
            X.0Jt r0 = new X.0Jt
            r0.<init>(r6, r5, r5)
            X.CBx.A00(r27)
            r20 = r28
            r22 = r0
            X.0Mi r12 = r19.A03(r20, r21, r22, r23, r24, r25)
            r4.A01(r12, r6, r1)
            return r12
        L_0x00be:
            r14 = r11
            if (r8 == r9) goto L_0x00c4
            r14 = r10
            r20 = r11
        L_0x00c4:
            int r13 = android.view.View.MeasureSpec.getMode(r2)
            int r7 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = android.view.View.MeasureSpec.getMode(r0)
            int r1 = android.view.View.MeasureSpec.getSize(r0)
            X.DFL r0 = X.C25303Cd7.A00(r6)
            X.Ca4 r16 = X.C26232CvO.A02(r0, r2, r1, r8)
            X.DFL r0 = X.C25303Cd7.A00(r6)
            X.Ca4 r3 = X.C26232CvO.A01(r0, r13, r7, r8)
            X.DFL r2 = X.C25303Cd7.A00(r6)
            r1 = r7
            if (r13 != 0) goto L_0x00ec
            r1 = 0
        L_0x00ec:
            if (r8 != r9) goto L_0x0171
            r0 = 41
            if (r2 != 0) goto L_0x0177
        L_0x00f2:
            r0 = r5
        L_0x00f3:
            X.DSE r1 = X.C26232CvO.A04(r0, r5, r1)
            if (r1 == 0) goto L_0x0104
            int r0 = r1.A00
            int r0 = r3.A01(r0)
            X.DSE r1 = new X.DSE
            r1.<init>(r0)
        L_0x0104:
            java.lang.Float r0 = X.C25303Cd7.A01(r17)
            if (r0 == 0) goto L_0x013b
            double r13 = X.C60652oO.A00(r20)
            float r0 = r0.floatValue()
            double r0 = (double) r0
            if (r8 != r9) goto L_0x0139
            double r13 = r13 * r0
        L_0x0116:
            int r14 = X.C22339B3q.A00(r13)
        L_0x011a:
            int r2 = r3.A01(r14)
            r1 = r16
            r0 = r20
            int r1 = r1.A01(r0)
            r0 = r1
            if (r8 != r9) goto L_0x012a
            r0 = r2
        L_0x012a:
            X.DSE r3 = new X.DSE
            r3.<init>(r0)
            if (r8 != r9) goto L_0x0132
            r2 = r1
        L_0x0132:
            X.DSE r0 = new X.DSE
            r0.<init>(r2)
            goto L_0x0081
        L_0x0139:
            double r13 = r13 / r0
            goto L_0x0116
        L_0x013b:
            if (r13 != 0) goto L_0x013e
            r7 = 0
        L_0x013e:
            if (r15 == 0) goto L_0x011a
            X.Byh r2 = X.C24284Byh.STRETCH
            r0 = r21
            if (r0 != r2) goto L_0x011a
            if (r1 != 0) goto L_0x011a
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x011a
            X.DSE r0 = r3.A01
            if (r0 == 0) goto L_0x0160
            int r2 = r3.A00
            int r1 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r0
            r1 = r1 ^ r0
            int r0 = X.C18070vi.A00(r2, r1)
            if (r0 > 0) goto L_0x011a
        L_0x0160:
            int r2 = r3.A01(r7)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r14 ^ r0
            r0 = r0 ^ r2
            int r0 = X.AnonymousClass1XO.A00(r1, r0)
            if (r0 >= 0) goto L_0x011a
            r14 = r2
            goto L_0x011a
        L_0x0171:
            r0 = 35
            if (r2 != 0) goto L_0x0177
            goto L_0x00f2
        L_0x0177:
            java.lang.String r0 = r2.A0D(r0)
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27129DVq.call():java.lang.Object");
    }
}
