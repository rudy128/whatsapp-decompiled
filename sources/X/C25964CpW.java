package X;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;

/* renamed from: X.CpW  reason: case insensitive filesystem */
public final class C25964CpW {
    public AnonymousClass0NU A00;
    public AnonymousClass0NU A01;
    public C26227CvJ A02;
    public EBT A03;
    public C26224CvE A04;
    public C22821Di A05 = DrZ.A00;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Object A0C = C17880vN.A0p();
    public final Matrix A0D = C108945cZ.A0J();
    public final CursorAnchorInfo.Builder A0E = new CursorAnchorInfo.Builder();
    public final C16710ss A0F;
    public final E0A A0G;
    public final float[] A0H = C05040Qd.A08();

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.4rD] */
    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object, X.DRh] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c0, code lost:
        if (r9 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0165, code lost:
        if (r2 <= r4.A03) goto L_0x0167;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C25964CpW r26) {
        /*
            r8 = r26
            X.E0A r1 = r8.A0G
            X.D62 r1 = (X.D62) r1
            X.0vl r0 = r1.A02
            r26 = r0
            java.lang.Object r0 = r26.getValue()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.view.View r15 = r1.A00
            boolean r0 = r0.isActive(r15)
            if (r0 == 0) goto L_0x01b9
            X.1Di r1 = r8.A05
            float[] r4 = r8.A0H
            X.0Qd r0 = new X.0Qd
            r0.<init>(r4)
            r1.invoke(r0)
            X.0ss r3 = r8.A0F
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.ui.platform.AndroidComposeView) r3
            androidx.compose.ui.platform.AndroidComposeView.A0J(r3)
            float[] r0 = r3.A0W
            X.C05040Qd.A06(r4, r0)
            long r0 = r3.A01
            float r2 = X.AnonymousClass0QY.A01(r0)
            float r1 = X.AnonymousClass0QY.A02(r0)
            float[] r0 = r3.A0V
            X.C05040Qd.A04(r0)
            X.C05040Qd.A05(r0, r2, r1)
            X.C04990Pv.A04(r4, r0)
            android.graphics.Matrix r1 = r8.A0D
            X.AnonymousClass0LJ.A00(r1, r4)
            android.view.inputmethod.CursorAnchorInfo$Builder r7 = r8.A0E
            X.CvE r2 = r8.A04
            X.C18070vi.A0b(r2)
            X.EBT r6 = r8.A03
            X.C18070vi.A0b(r6)
            X.CvJ r5 = r8.A02
            X.C18070vi.A0b(r5)
            X.0NU r4 = r8.A01
            X.C18070vi.A0b(r4)
            X.0NU r0 = r8.A00
            r25 = r0
            X.C18070vi.A0b(r25)
            boolean r10 = r8.A09
            boolean r3 = r8.A07
            boolean r0 = r8.A08
            r17 = r0
            boolean r0 = r8.A0A
            r16 = r0
            r7.reset()
            r7.setMatrix(r1)
            long r0 = r2.A00
            int r9 = X.C26260Cw5.A02(r0)
            int r0 = X.C26260Cw5.A01(r0)
            r7.setSelectionRange(r9, r0)
            if (r10 == 0) goto L_0x00d5
            if (r9 < 0) goto L_0x00d5
            int r14 = r6.CB1(r9)
            X.0NU r9 = r5.A0K(r14)
            float r10 = r9.A01
            long r0 = r5.A00
            int r0 = X.AnonymousClass000.A0G(r0)
            float r1 = (float) r0
            r0 = 0
            float r12 = X.C28851b7.A02(r10, r0, r1)
            float r11 = r9.A03
            boolean r13 = A01(r4, r12, r11)
            float r10 = r9.A00
            boolean r9 = A01(r4, r12, r10)
            X.By3 r1 = r5.A0P(r14)
            X.By3 r0 = X.C24245By3.Rtl
            r23 = 0
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r13 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00c2
        L_0x00bc:
            r23 = 1
            if (r13 == 0) goto L_0x00c2
            if (r9 != 0) goto L_0x00c4
        L_0x00c2:
            r23 = r23 | 2
        L_0x00c4:
            if (r0 == 0) goto L_0x00c8
            r23 = r23 | 4
        L_0x00c8:
            r22 = r10
            r19 = r12
            r20 = r11
            r21 = r10
            r18 = r7
            r18.setInsertionMarkerLocation(r19, r20, r21, r22, r23)
        L_0x00d5:
            if (r3 == 0) goto L_0x0193
            X.Cw5 r0 = r2.A02
            if (r0 == 0) goto L_0x0193
            long r0 = r0.A00
            int r9 = X.C26260Cw5.A02(r0)
            int r11 = X.C26260Cw5.A01(r0)
            if (r9 < 0) goto L_0x0193
            if (r9 >= r11) goto L_0x0193
            X.DRu r0 = r2.A01
            java.lang.String r0 = r0.A00
            java.lang.CharSequence r0 = r0.subSequence(r9, r11)
            r7.setComposingText(r9, r0)
            int r10 = r6.CB1(r9)
            int r1 = r6.CB1(r11)
            int r0 = r1 - r10
            int r0 = r0 * 4
            float[] r3 = new float[r0]
            X.CvC r12 = r5.A01
            long r0 = X.C25858CnM.A02(r10, r1)
            r14 = 0
            int r2 = X.C26260Cw5.A02(r0)
            X.C26222CvC.A02(r12, r2)
            int r2 = X.C26260Cw5.A01(r0)
            X.C26222CvC.A03(r12, r2)
            X.4rD r13 = new X.4rD
            r13.<init>()
            r13.element = r14
            X.DRh r19 = new X.DRh
            r19.<init>()
            java.util.List r12 = r12.A05
            X.Dqw r2 = new X.Dqw
            r18 = r2
            r20 = r13
            r21 = r3
            r22 = r0
            r18.<init>(r19, r20, r21, r22)
            X.C25285Ccn.A01(r12, r2, r0)
        L_0x0135:
            if (r9 >= r11) goto L_0x0193
            int r0 = r6.CB1(r9)
            int r1 = r0 - r10
            int r2 = r1 * 4
            r14 = r3[r2]
            int r1 = r2 + 1
            r13 = r3[r1]
            int r1 = r2 + 2
            r12 = r3[r1]
            int r1 = r2 + 3
            r2 = r3[r1]
            float r1 = r4.A02
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0167
            float r1 = r4.A01
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0167
            float r1 = r4.A00
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0167
            float r1 = r4.A03
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r24 = 1
            if (r1 > 0) goto L_0x0169
        L_0x0167:
            r24 = 0
        L_0x0169:
            boolean r1 = A01(r4, r14, r13)
            if (r1 == 0) goto L_0x0175
            boolean r1 = A01(r4, r12, r2)
            if (r1 != 0) goto L_0x0177
        L_0x0175:
            r24 = r24 | 2
        L_0x0177:
            X.By3 r1 = r5.A0P(r0)
            X.By3 r0 = X.C24245By3.Rtl
            if (r1 != r0) goto L_0x0181
            r24 = r24 | 4
        L_0x0181:
            r19 = r9
            r20 = r14
            r21 = r13
            r22 = r12
            r23 = r2
            r18 = r7
            r18.addCharacterBounds(r19, r20, r21, r22, r23, r24)
            int r9 = r9 + 1
            goto L_0x0135
        L_0x0193:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x01a9
            if (r17 == 0) goto L_0x01a0
            r0 = r25
            X.C71.A00(r7, r0)
        L_0x01a0:
            r0 = 34
            if (r1 < r0) goto L_0x01a9
            if (r16 == 0) goto L_0x01a9
            X.C72.A00(r7, r4, r5)
        L_0x01a9:
            android.view.inputmethod.CursorAnchorInfo r1 = r7.build()
            java.lang.Object r0 = r26.getValue()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.updateCursorAnchorInfo(r15, r1)
            r0 = 0
            r8.A06 = r0
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25964CpW.A00(X.CpW):void");
    }

    public static final boolean A01(AnonymousClass0NU r2, float f, float f2) {
        float f3 = r2.A01;
        if (f <= r2.A02 && f3 <= f) {
            float f4 = r2.A03;
            if (f2 > r2.A00 || f4 > f2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C25964CpW(C16710ss r2, E0A e0a) {
        this.A0F = r2;
        this.A0G = e0a;
    }
}
