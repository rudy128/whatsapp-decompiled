package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.Cr7  reason: case insensitive filesystem */
public final class C26043Cr7 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint.FontMetricsInt A06;
    public final Rect A07 = AnonymousClass3MW.A07();
    public final Layout A08;
    public final C18100vl A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final C25738Cl8 A0D;
    public final D4T[] A0E;

    public static final Rect A00(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, cls) != i2) {
                Rect A072 = AnonymousClass3MW.A07();
                Rect A073 = AnonymousClass3MW.A07();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        C24502C6w.A00(textPaint2, A073, charSequence, i, nextSpanTransition);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i, nextSpanTransition, A073);
                    }
                    A072.right += A073.width();
                    A072.top = Math.min(A072.top, A073.top);
                    A072.bottom = Math.max(A072.bottom, A073.bottom);
                    i = nextSpanTransition;
                }
                return A072;
            }
        }
        Rect A074 = AnonymousClass3MW.A07();
        if (Build.VERSION.SDK_INT >= 29) {
            C24502C6w.A00(textPaint, A074, charSequence, i, i2);
            return A074;
        }
        textPaint.getTextBounds(charSequence.toString(), i, i2, A074);
        return A074;
    }

    public static final BoringLayout A01(BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2, boolean z) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
    }

    public final float A02(int i) {
        float lineBottom;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.A04 - 1;
        if (i != i3 || (fontMetricsInt = this.A06) == null) {
            lineBottom = ((float) this.A05) + ((float) this.A08.getLineBottom(i));
            if (i == i3) {
                i2 = this.A02;
            } else {
                i2 = 0;
            }
        } else {
            lineBottom = (float) this.A08.getLineBottom(i - 1);
            i2 = fontMetricsInt.bottom;
        }
        return lineBottom + ((float) i2);
    }

    public final float A03(int i) {
        int i2;
        float lineTop = (float) this.A08.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.A05;
        }
        return lineTop + ((float) i2);
    }

    public final float A04(int i, boolean z) {
        float f;
        float A012 = ((C25673Ck4) this.A09.getValue()).A01(i, true, z);
        if (this.A08.getLineForOffset(i) == this.A04 - 1) {
            f = this.A00 + this.A01;
        } else {
            f = 0.0f;
        }
        return A012 + f;
    }

    public final float A05(int i, boolean z) {
        float f;
        float A012 = ((C25673Ck4) this.A09.getValue()).A01(i, false, z);
        if (this.A08.getLineForOffset(i) == this.A04 - 1) {
            f = this.A00 + this.A01;
        } else {
            f = 0.0f;
        }
        return A012 + f;
    }

    public final int A06(int i) {
        Layout layout = this.A08;
        if (layout.getEllipsisStart(i) == 0) {
            return layout.getLineEnd(i);
        }
        return layout.getText().length();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (((android.text.Spanned) r15).nextSpanTransition(-1, r5, X.C22619BGa.class) >= r5) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0122, code lost:
        if (r0 != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014d, code lost:
        if (r9.length == 0) goto L_0x014f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26043Cr7(android.text.TextPaint r27, android.text.TextUtils.TruncateAt r28, X.C25738Cl8 r29, java.lang.CharSequence r30, float r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, boolean r40) {
        /*
            r26 = this;
            r3 = 1
            r6 = r26
            r6.<init>()
            r2 = r40
            r6.A0B = r2
            r7 = r29
            r6.A0D = r7
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r6.A07 = r0
            r15 = r30
            int r5 = r15.length()
            X.BEq r0 = X.C25430Cfc.A01
            r1 = r33
            if (r33 == 0) goto L_0x0061
            if (r1 == r3) goto L_0x005e
            r0 = 2
            if (r1 == r0) goto L_0x005b
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
        L_0x0027:
            android.text.Layout$Alignment r0 = X.C24691CGd.A01
            r1 = r32
            if (r32 == 0) goto L_0x0058
            if (r1 == r3) goto L_0x0055
            r0 = 2
            if (r1 == r0) goto L_0x0052
            r0 = 3
            if (r1 == r0) goto L_0x004f
            android.text.Layout$Alignment r11 = X.C24691CGd.A01
        L_0x0037:
            boolean r0 = r15 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0048
            r4 = r15
            android.text.Spanned r4 = (android.text.Spanned) r4
            r1 = -1
            java.lang.Class<X.BGa> r0 = X.C22619BGa.class
            int r0 = r4.nextSpanTransition(r1, r5, r0)
            r8 = 1
            if (r0 < r5) goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            java.lang.String r0 = "TextLayout:initLayout"
            android.os.Trace.beginSection(r0)
            goto L_0x0064
        L_0x004f:
            android.text.Layout$Alignment r11 = X.C24691CGd.A00
            goto L_0x0037
        L_0x0052:
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0037
        L_0x0055:
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0037
        L_0x0058:
            android.text.Layout$Alignment r11 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0037
        L_0x005b:
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x0027
        L_0x005e:
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0027
        L_0x0061:
            android.text.TextDirectionHeuristic r12 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0027
        L_0x0064:
            android.text.BoringLayout$Metrics r16 = r7.A02()     // Catch:{ all -> 0x0248 }
            r5 = r31
            double r0 = (double) r5     // Catch:{ all -> 0x0248 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x0248 }
            float r4 = (float) r0     // Catch:{ all -> 0x0248 }
            int r4 = (int) r4     // Catch:{ all -> 0x0248 }
            r13 = r27
            r14 = r28
            r1 = r34
            if (r16 == 0) goto L_0x008f
            float r0 = r7.A01()     // Catch:{ all -> 0x0248 }
            int r0 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            if (r8 != 0) goto L_0x008f
            r6.A0C = r3     // Catch:{ all -> 0x0248 }
            if (r4 < 0) goto L_0x0088
            goto L_0x00b4
        L_0x0088:
            java.lang.String r0 = "negative width"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x0248 }
            throw r0     // Catch:{ all -> 0x0248 }
        L_0x008f:
            r0 = 0
            r6.A0C = r0     // Catch:{ all -> 0x0248 }
            int r16 = r15.length()     // Catch:{ all -> 0x0248 }
            X.E77 r0 = X.CE4.A00     // Catch:{ all -> 0x0248 }
            X.CUH r10 = new X.CUH     // Catch:{ all -> 0x0248 }
            r19 = r4
            r20 = r39
            r21 = r35
            r22 = r36
            r23 = r37
            r24 = r38
            r17 = r4
            r18 = r1
            r25 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0248 }
            android.text.StaticLayout r8 = r0.BG8(r10)     // Catch:{ all -> 0x0248 }
            goto L_0x00cc
        L_0x00b4:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0248 }
            r0 = 33
            if (r3 < r0) goto L_0x00cf
            r22 = r4
            r17 = r11
            r18 = r13
            r19 = r14
            r20 = r15
            r21 = r4
            r23 = r2
            android.text.BoringLayout r8 = X.C25859CnN.A01(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0248 }
        L_0x00cc:
            r6.A08 = r8     // Catch:{ all -> 0x0248 }
            goto L_0x00e2
        L_0x00cf:
            r22 = r4
            r17 = r11
            r18 = r13
            r19 = r14
            r20 = r15
            r21 = r4
            r23 = r2
            android.text.BoringLayout r8 = A01(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0248 }
            goto L_0x00cc
        L_0x00e2:
            android.os.Trace.endSection()
            int r0 = r8.getLineCount()
            int r0 = java.lang.Math.min(r0, r1)
            r6.A04 = r0
            int r7 = r0 + -1
            if (r0 < r1) goto L_0x01dd
            int r0 = r8.getEllipsisCount(r7)
            if (r0 > 0) goto L_0x0103
            int r1 = r8.getLineEnd(r7)
            int r0 = r15.length()
            if (r1 == r0) goto L_0x01dd
        L_0x0103:
            r0 = 1
        L_0x0104:
            r6.A0A = r0
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0124
            boolean r0 = r6.A0C
            android.text.Layout r4 = r6.A08
            if (r0 == 0) goto L_0x01cd
            java.lang.String r0 = "null cannot be cast to non-null type android.text.BoringLayout"
            X.C18070vi.A0z(r4, r0)
            r2 = r4
            android.text.BoringLayout r2 = (android.text.BoringLayout) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0177
            boolean r0 = X.C25859CnN.A02(r2)
        L_0x0122:
            if (r0 == 0) goto L_0x0177
        L_0x0124:
            long r4 = X.C25430Cfc.A00
        L_0x0126:
            android.text.Layout r1 = r6.A08
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            r3 = 0
            if (r0 == 0) goto L_0x014f
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Spanned"
            X.C18070vi.A0z(r2, r0)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r1.getText()
            int r1 = r0.length()
            java.lang.Class<X.D4T> r0 = X.D4T.class
            java.lang.Object[] r9 = r2.getSpans(r3, r1, r0)
            X.D4T[] r9 = (X.D4T[]) r9
            int r0 = r9.length
            if (r0 != 0) goto L_0x0151
        L_0x014f:
            X.D4T[] r9 = new X.D4T[r3]
        L_0x0151:
            r6.A0E = r9
            int r2 = r9.length
            r1 = 0
            r11 = 0
        L_0x0156:
            if (r1 >= r2) goto L_0x01e0
            r10 = r9[r1]
            int r0 = r10.A03
            if (r0 >= 0) goto L_0x0168
            int r0 = r10.A03
            int r0 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.max(r3, r0)
        L_0x0168:
            int r0 = r10.A05
            if (r0 >= 0) goto L_0x0174
            int r0 = java.lang.Math.abs(r0)
            int r11 = java.lang.Math.max(r3, r0)
        L_0x0174:
            int r1 = r1 + 1
            goto L_0x0156
        L_0x0177:
            android.text.TextPaint r10 = r4.getPaint()
            java.lang.CharSequence r9 = r4.getText()
            r2 = 0
            int r1 = r4.getLineStart(r2)
            int r0 = r4.getLineEnd(r2)
            android.graphics.Rect r1 = A00(r10, r9, r1, r0)
            int r5 = r4.getLineAscent(r2)
            int r0 = r1.top
            if (r0 >= r5) goto L_0x01bd
            int r5 = r5 - r0
        L_0x0195:
            int r3 = r6.A04
            r2 = 1
            if (r3 == r2) goto L_0x01a8
            int r0 = r3 - r2
            int r1 = r4.getLineStart(r0)
            int r0 = r4.getLineEnd(r0)
            android.graphics.Rect r1 = A00(r10, r9, r1, r0)
        L_0x01a8:
            int r3 = r3 - r2
            int r0 = r4.getLineDescent(r3)
            int r3 = r1.bottom
            if (r3 <= r0) goto L_0x01b8
            int r3 = r3 - r0
        L_0x01b2:
            if (r5 != 0) goto L_0x01c2
            if (r3 != 0) goto L_0x01c2
            goto L_0x0124
        L_0x01b8:
            int r3 = r4.getBottomPadding()
            goto L_0x01b2
        L_0x01bd:
            int r5 = r4.getTopPadding()
            goto L_0x0195
        L_0x01c2:
            long r0 = (long) r5
            r2 = 32
            long r0 = r0 << r2
            long r4 = X.BE7.A0C(r3)
            long r4 = r4 | r0
            goto L_0x0126
        L_0x01cd:
            java.lang.String r0 = "null cannot be cast to non-null type android.text.StaticLayout"
            X.C18070vi.A0z(r4, r0)
            r1 = r4
            android.text.StaticLayout r1 = (android.text.StaticLayout) r1
            X.E77 r0 = X.CE4.A00
            boolean r0 = r0.Bej(r1)
            goto L_0x0122
        L_0x01dd:
            r0 = 0
            goto L_0x0104
        L_0x01e0:
            if (r3 != 0) goto L_0x023e
            if (r11 != 0) goto L_0x023e
            long r2 = X.C25430Cfc.A00
        L_0x01e6:
            r10 = 32
            long r0 = r4 >> r10
            int r11 = (int) r0
            long r0 = r2 >> r10
            int r10 = (int) r0
            int r0 = java.lang.Math.max(r11, r10)
            r6.A05 = r0
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r10
            int r1 = (int) r4
            long r2 = r2 & r10
            int r0 = (int) r2
            int r0 = java.lang.Math.max(r1, r0)
            r6.A02 = r0
            android.graphics.Paint$FontMetricsInt r3 = X.C25430Cfc.A00(r12, r13, r6, r9)
            if (r3 == 0) goto L_0x023c
            int r2 = r3.bottom
            float r1 = r6.A02(r7)
            float r0 = r6.A03(r7)
            float r1 = r1 - r0
            int r0 = (int) r1
            int r2 = r2 - r0
        L_0x0216:
            r6.A03 = r2
            r6.A06 = r3
            android.text.TextPaint r0 = r8.getPaint()
            float r0 = X.C25287Ccp.A00(r0, r8, r7)
            r6.A00 = r0
            android.text.TextPaint r0 = r8.getPaint()
            float r0 = X.C25287Ccp.A01(r0, r8, r7)
            r6.A01 = r0
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.Dfm r0 = new X.Dfm
            r0.<init>(r6)
            X.0vl r0 = X.AnonymousClass1DF.A00(r1, r0)
            r6.A09 = r0
            return
        L_0x023c:
            r2 = 0
            goto L_0x0216
        L_0x023e:
            long r0 = (long) r3
            r2 = 32
            long r0 = r0 << r2
            long r2 = X.BE7.A0C(r11)
            long r2 = r2 | r0
            goto L_0x01e6
        L_0x0248:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26043Cr7.<init>(android.text.TextPaint, android.text.TextUtils$TruncateAt, X.Cl8, java.lang.CharSequence, float, int, int, int, int, int, int, int, int, boolean):void");
    }
}
