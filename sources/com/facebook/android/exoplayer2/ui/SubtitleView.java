package com.facebook.android.exoplayer2.ui;

import X.AnonymousClass000;
import X.BEA;
import X.C25598Cid;
import X.C72463Mc;
import X.CUY;
import X.E40;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import java.util.List;

public final class SubtitleView extends View implements E40 {
    public float A00;
    public float A01;
    public C25598Cid A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public final List A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0106, code lost:
        if (r8.A0D == r12) goto L_0x0108;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0175 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r36) {
        /*
            r35 = this;
            r13 = r35
            java.util.List r0 = r13.A03
            r26 = r0
            if (r0 == 0) goto L_0x0387
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x0387
            int r12 = r13.getHeight()
            int r25 = r13.getPaddingLeft()
            int r11 = r13.getPaddingTop()
            int r24 = X.C72463Mc.A09(r13)
            int r0 = r13.getPaddingBottom()
            int r12 = r12 - r0
            if (r12 <= r11) goto L_0x0387
            r1 = r24
            r0 = r25
            if (r1 <= r0) goto L_0x0387
            int r0 = r12 - r11
            float r10 = r13.A00
            float r0 = (float) r0
            float r10 = r10 * r0
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0387
            int r23 = r26.size()
            r9 = 0
        L_0x003b:
            r0 = r23
            if (r9 >= r0) goto L_0x0387
            r0 = r26
            java.lang.Object r6 = r0.get(r9)
            X.CqQ r6 = (X.C26009CqQ) r6
            java.util.List r0 = r13.A06
            java.lang.Object r8 = r0.get(r9)
            X.CUY r8 = (X.CUY) r8
            boolean r5 = r13.A05
            boolean r4 = r13.A04
            X.Cid r2 = r13.A02
            float r1 = r13.A01
            java.lang.CharSequence r14 = r6.A05
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0175
            int r3 = r2.A04
            java.lang.CharSequence r0 = r8.A0M
            if (r0 == r14) goto L_0x006d
            if (r0 == 0) goto L_0x01a9
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x01a9
        L_0x006d:
            float r7 = r8.A02
            float r0 = r6.A00
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            int r7 = r8.A08
            int r0 = r6.A03
            if (r7 != r0) goto L_0x01a9
            int r0 = r8.A07
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r7, r0)
            if (r0 == 0) goto L_0x01a9
            float r7 = r8.A03
            float r0 = r6.A01
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            int r0 = r8.A09
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            int r0 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r7, r0)
            if (r0 == 0) goto L_0x01a9
            float r0 = r8.A04
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            float r0 = r8.A01
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            boolean r0 = r8.A0O
            if (r0 != r5) goto L_0x01a9
            boolean r0 = r8.A0N
            if (r0 != r4) goto L_0x01a9
            int r7 = r8.A0C
            int r0 = r2.A03
            if (r7 != r0) goto L_0x01a9
            int r7 = r8.A06
            int r0 = r2.A00
            if (r7 != r0) goto L_0x01a9
            int r0 = r8.A0K
            if (r0 != r3) goto L_0x01a9
            int r7 = r8.A0B
            int r0 = r2.A02
            if (r7 != r0) goto L_0x01a9
            int r7 = r8.A0A
            int r0 = r2.A01
            if (r7 != r0) goto L_0x01a9
            android.text.TextPaint r7 = r8.A0V
            android.graphics.Typeface r15 = r7.getTypeface()
            android.graphics.Typeface r0 = r2.A05
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r15, r0)
            if (r0 == 0) goto L_0x01a9
            float r0 = r8.A05
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            float r0 = r8.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            int r15 = r8.A0E
            r0 = r25
            if (r15 != r0) goto L_0x01a9
            int r0 = r8.A0G
            if (r0 != r11) goto L_0x01a9
            int r15 = r8.A0F
            r0 = r24
            if (r15 != r0) goto L_0x01a9
            int r0 = r8.A0D
            if (r0 != r12) goto L_0x01a9
        L_0x0108:
            android.text.StaticLayout r14 = r8.A0L
            if (r14 == 0) goto L_0x0175
            r6 = r36
            int r5 = r6.save()
            int r0 = r8.A0H
            float r1 = (float) r0
            int r0 = r8.A0J
            float r0 = (float) r0
            r6.translate(r1, r0)
            int r0 = r8.A0K
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x0149
            android.graphics.Paint r3 = r8.A0U
            int r0 = r8.A0K
            r3.setColor(r0)
            int r0 = r8.A0I
            int r0 = -r0
            float r2 = (float) r0
            int r1 = r14.getWidth()
            int r0 = r8.A0I
            int r1 = r1 + r0
            float r1 = (float) r1
            int r0 = r14.getHeight()
            float r0 = (float) r0
            r17 = 0
            r16 = r2
            r18 = r1
            r19 = r0
            r20 = r3
            r15 = r6
            r15.drawRect(r16, r17, r18, r19, r20)
        L_0x0149:
            int r1 = r8.A0B
            r15 = 0
            r0 = 1
            if (r1 != r0) goto L_0x0179
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r7.setStrokeJoin(r0)
            float r0 = r8.A0P
            r7.setStrokeWidth(r0)
            int r0 = r8.A0A
            r7.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r7.setStyle(r0)
            r14.draw(r6)
        L_0x0166:
            int r0 = r8.A0C
            X.AnonymousClass3MZ.A1D(r0, r7)
            r14.draw(r6)
            r0 = 0
            r7.setShadowLayer(r0, r0, r0, r15)
            r6.restoreToCount(r5)
        L_0x0175:
            int r9 = r9 + 1
            goto L_0x003b
        L_0x0179:
            r0 = 2
            if (r1 != r0) goto L_0x0186
            float r2 = r8.A0R
            float r1 = r8.A0Q
            int r0 = r8.A0A
            r7.setShadowLayer(r2, r1, r1, r0)
            goto L_0x0166
        L_0x0186:
            r0 = 3
            if (r1 == r0) goto L_0x01a5
            r0 = 4
            if (r1 != r0) goto L_0x0166
            r4 = -1
            int r3 = r8.A0A
        L_0x018f:
            float r2 = r8.A0R
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r0
            int r0 = r8.A0C
            X.AnonymousClass3MZ.A1D(r0, r7)
            float r0 = -r1
            r7.setShadowLayer(r2, r0, r0, r3)
            r14.draw(r6)
            r7.setShadowLayer(r2, r1, r1, r4)
            goto L_0x0166
        L_0x01a5:
            r3 = -1
            int r4 = r8.A0A
            goto L_0x018f
        L_0x01a9:
            r8.A0M = r14
            float r0 = r6.A00
            r8.A02 = r0
            int r0 = r6.A03
            r8.A08 = r0
            int r0 = r6.A02
            r8.A07 = r0
            float r0 = r6.A01
            r8.A03 = r0
            int r0 = r6.A04
            r8.A09 = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r8.A04 = r0
            r8.A01 = r0
            r8.A0O = r5
            r8.A0N = r4
            int r0 = r2.A03
            r8.A0C = r0
            int r0 = r2.A00
            r8.A06 = r0
            r8.A0K = r3
            int r0 = r2.A02
            r8.A0B = r0
            int r0 = r2.A01
            r8.A0A = r0
            android.text.TextPaint r7 = r8.A0V
            android.graphics.Typeface r0 = r2.A05
            r7.setTypeface(r0)
            r8.A05 = r10
            r8.A00 = r1
            r0 = r25
            r8.A0E = r0
            r8.A0G = r11
            r0 = r24
            r8.A0F = r0
            r8.A0D = r12
            java.lang.CharSequence r0 = r8.A0M
            X.C26056CrS.A01(r0)
            java.lang.CharSequence r1 = r8.A0M
            int r6 = r8.A0F
            int r0 = r8.A0E
            int r6 = r6 - r0
            int r5 = r8.A0D
            int r0 = r8.A0G
            int r5 = r5 - r0
            float r0 = r8.A05
            r7.setTextSize(r0)
            float r2 = r8.A05
            r0 = 1040187392(0x3e000000, float:0.125)
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r0 = (int) r2
            r22 = r0
            int r0 = r0 * 2
            int r4 = r6 - r0
            float r2 = r8.A04
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x0224
            float r0 = (float) r4
            float r0 = r0 * r2
            int r4 = (int) r0
        L_0x0224:
            java.lang.String r20 = "SubtitlePainter"
            if (r4 > 0) goto L_0x0231
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
        L_0x022a:
            r0 = r20
            android.util.Log.w(r0, r1)
            goto L_0x0108
        L_0x0231:
            boolean r0 = r8.A0O
            r19 = 0
            r3 = 0
            if (r0 != 0) goto L_0x029c
            java.lang.String r1 = r1.toString()
        L_0x023c:
            int r0 = r8.A06
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x025d
            android.text.SpannableStringBuilder r18 = new android.text.SpannableStringBuilder
            r0 = r18
            r0.<init>(r1)
            int r0 = r8.A06
            android.text.style.BackgroundColorSpan r15 = new android.text.style.BackgroundColorSpan
            r15.<init>(r0)
            int r14 = r18.length()
            r1 = r18
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r1.setSpan(r15, r3, r14, r2)
        L_0x025d:
            android.text.Layout$Alignment r31 = android.text.Layout.Alignment.ALIGN_CENTER
            float r0 = r8.A0T
            r32 = r0
            float r0 = r8.A0S
            r33 = r0
            r3 = 1
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r27 = r0
            r28 = r1
            r29 = r7
            r30 = r4
            r34 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r8.A0L = r0
            int r17 = r0.getHeight()
            android.text.StaticLayout r0 = r8.A0L
            int r16 = r0.getLineCount()
            r2 = 0
            r1 = 0
        L_0x0285:
            r0 = r16
            if (r1 >= r0) goto L_0x02d9
            android.text.StaticLayout r0 = r8.A0L
            float r0 = r0.getLineWidth(r1)
            double r14 = (double) r0
            double r14 = java.lang.Math.ceil(r14)
            int r0 = (int) r14
            int r2 = java.lang.Math.max(r0, r2)
            int r1 = r1 + 1
            goto L_0x0285
        L_0x029c:
            boolean r0 = r8.A0N
            if (r0 != 0) goto L_0x023c
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r1)
            int r1 = r2.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r0 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r15 = r2.getSpans(r3, r1, r0)
            android.text.style.AbsoluteSizeSpan[] r15 = (android.text.style.AbsoluteSizeSpan[]) r15
            java.lang.Class<android.text.style.RelativeSizeSpan> r0 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r1 = r2.getSpans(r3, r1, r0)
            android.text.style.RelativeSizeSpan[] r1 = (android.text.style.RelativeSizeSpan[]) r1
            int r0 = r15.length
            r16 = r0
            r14 = 0
        L_0x02bd:
            r0 = r16
            if (r14 >= r0) goto L_0x02c9
            r0 = r15[r14]
            r2.removeSpan(r0)
            int r14 = r14 + 1
            goto L_0x02bd
        L_0x02c9:
            int r0 = r1.length
            r15 = r0
            r14 = 0
        L_0x02cc:
            if (r14 >= r15) goto L_0x02d6
            r0 = r1[r14]
            r2.removeSpan(r0)
            int r14 = r14 + 1
            goto L_0x02cc
        L_0x02d6:
            r1 = r2
            goto L_0x023c
        L_0x02d9:
            float r0 = r8.A04
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x0318
            if (r2 >= r4) goto L_0x0318
        L_0x02e1:
            int r0 = r22 * 2
            int r4 = r4 + r0
            float r2 = r8.A03
            r1 = 2
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x0311
            float r0 = (float) r6
            int r0 = X.BE6.A04(r0, r2)
            int r6 = r8.A0E
            int r0 = r0 + r6
            int r2 = r8.A09
            if (r2 == r3) goto L_0x030c
            if (r2 != r1) goto L_0x02fa
            int r0 = r0 - r4
        L_0x02fa:
            int r6 = java.lang.Math.max(r0, r6)
            int r4 = r4 + r6
            int r0 = r8.A0F
            int r4 = java.lang.Math.min(r4, r0)
        L_0x0305:
            int r4 = r4 - r6
            if (r4 > 0) goto L_0x031a
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            goto L_0x022a
        L_0x030c:
            int r0 = r0 * 2
            int r0 = r0 - r4
            int r0 = r0 / r1
            goto L_0x02fa
        L_0x0311:
            int r6 = r6 - r4
            int r6 = r6 / r1
            int r0 = r8.A0E
            int r6 = r6 + r0
            int r4 = r4 + r6
            goto L_0x0305
        L_0x0318:
            r4 = r2
            goto L_0x02e1
        L_0x031a:
            float r2 = r8.A02
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x037c
            int r0 = r8.A08
            if (r0 == 0) goto L_0x0374
            android.text.StaticLayout r0 = r8.A0L
            r2 = 0
            int r5 = r0.getLineBottom(r2)
            android.text.StaticLayout r0 = r8.A0L
            int r0 = r0.getLineTop(r2)
            int r5 = r5 - r0
            float r2 = r8.A02
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x0374
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r0
            float r0 = (float) r5
            int r2 = X.BE6.A04(r2, r0)
            int r0 = r8.A0D
        L_0x0342:
            int r2 = r2 + r0
            int r0 = r8.A07
            if (r0 != r1) goto L_0x036c
            int r2 = r2 - r17
        L_0x0349:
            int r1 = r2 + r17
            int r0 = r8.A0D
            if (r1 <= r0) goto L_0x0366
            int r2 = r0 - r17
        L_0x0351:
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r27 = r0
            r30 = r4
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r8.A0L = r0
            r8.A0H = r6
            r8.A0J = r2
            r0 = r22
            r8.A0I = r0
            goto L_0x0108
        L_0x0366:
            int r0 = r8.A0G
            if (r2 >= r0) goto L_0x0351
            r2 = r0
            goto L_0x0351
        L_0x036c:
            if (r0 != r3) goto L_0x0349
            int r2 = r2 * 2
            int r2 = r2 - r17
            int r2 = r2 / r1
            goto L_0x0349
        L_0x0374:
            float r0 = (float) r5
            int r2 = X.BE6.A04(r0, r2)
            int r0 = r8.A0G
            goto L_0x0342
        L_0x037c:
            int r2 = r8.A0D
            int r2 = r2 - r17
            float r1 = (float) r5
            float r0 = r8.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 - r0
            goto L_0x0351
        L_0x0387:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.exoplayer2.ui.SubtitleView.dispatchDraw(android.graphics.Canvas):void");
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            invalidate();
        }
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.A05 != z || this.A04 != z) {
            this.A05 = z;
            this.A04 = z;
            invalidate();
        }
    }

    public void setBottomPaddingFraction(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            invalidate();
        }
    }

    public void setCues(List list) {
        if (this.A03 != list) {
            this.A03 = list;
            int A0C = C72463Mc.A0C(list);
            while (true) {
                List list2 = this.A06;
                if (list2.size() < A0C) {
                    list2.add(new CUY(getContext()));
                } else {
                    invalidate();
                    return;
                }
            }
        }
    }

    public void setFractionalTextSize(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            invalidate();
        }
    }

    public void setStyle(C25598Cid cid) {
        if (this.A02 != cid) {
            this.A02 = cid;
            invalidate();
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = AnonymousClass000.A13();
        this.A00 = 0.0533f;
        this.A05 = true;
        this.A04 = true;
        this.A02 = C25598Cid.A06;
        this.A01 = 0.08f;
    }

    private float getUserCaptionFontScaleV19() {
        return BEA.A0P(this).getFontScale();
    }

    private C25598Cid getUserCaptionStyleV19() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        CaptioningManager.CaptionStyle userStyle = BEA.A0P(this).getUserStyle();
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = -1;
        }
        if (userStyle.hasBackgroundColor()) {
            i2 = userStyle.backgroundColor;
        } else {
            i2 = -16777216;
        }
        if (userStyle.hasWindowColor()) {
            i3 = userStyle.windowColor;
        } else {
            i3 = 0;
        }
        if (userStyle.hasEdgeType()) {
            i4 = userStyle.edgeType;
        } else {
            i4 = 0;
        }
        if (userStyle.hasEdgeColor()) {
            i5 = userStyle.edgeColor;
        } else {
            i5 = -1;
        }
        return new C25598Cid(userStyle.getTypeface(), i, i2, i3, i4, i5);
    }

    public void A00() {
        C25598Cid cid;
        if (!BEA.A0P(this).isEnabled() || isInEditMode()) {
            cid = C25598Cid.A06;
        } else {
            cid = getUserCaptionStyleV19();
        }
        setStyle(cid);
    }

    public void A01() {
        float f;
        if (!isInEditMode()) {
            f = BEA.A0P(this).getFontScale();
        } else {
            f = 1.0f;
        }
        float f2 = f * 0.0533f;
        if (this.A00 != f2) {
            this.A00 = f2;
            invalidate();
        }
    }

    public void Bqd(List list) {
        setCues(list);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }
}
