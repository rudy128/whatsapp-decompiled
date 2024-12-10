package com.whatsapp.settings.chat.theme.adapter;

import X.AnonymousClass000;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass6G2;
import X.C108945cZ;
import X.C108985cd;
import X.C124476Ym;
import X.C17900vP;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C43191zP;
import X.C62762rw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CirclePageIndicator extends AnonymousClass6G2 {
    public static int A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public Paint A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A0E = C19740yt.A00(getContext(), 2131103233);
        this.A02 = -1;
        this.A03 = -1;
        this.A07 = C108945cZ.A0K(1);
        this.A04 = C108945cZ.A0K(1);
        this.A08 = C108945cZ.A0K(1);
        this.A05 = C108945cZ.A0K(1);
        this.A06 = C108945cZ.A0K(1);
        this.A00 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C124476Ym.A00, 0, i);
        C18070vi.A0X(obtainStyledAttributes);
        try {
            int i2 = this.A0E;
            setActiveColor(obtainStyledAttributes.getColor(0, i2));
            setInactiveColor(obtainStyledAttributes.getColor(3, i2));
            int i3 = this.A09;
            A0F = obtainStyledAttributes.getDimensionPixelSize(1, i3);
            this.A05 = obtainStyledAttributes.getDimensionPixelOffset(2, i3);
            this.A04 = obtainStyledAttributes.getInt(8, 5);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.A09 = obtainStyledAttributes.getBoolean(7, false);
            this.A0A = obtainStyledAttributes.getBoolean(9, true);
            this.A0B = obtainStyledAttributes.getBoolean(10, false);
            this.A0C = obtainStyledAttributes.getBoolean(11, false);
            this.A0D = obtainStyledAttributes.getBoolean(12, false);
            obtainStyledAttributes.recycle();
            Paint paint = this.A04;
            C108945cZ.A1L(paint);
            AnonymousClass3MX.A19(context, paint, AnonymousClass1YL.A00(context, 2130971957, 2131103104));
            if (this.A09) {
                if (this.A0A) {
                    Paint paint2 = this.A08;
                    AnonymousClass3MX.A19(context, paint2, 2131103054);
                    paint2.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
                    paint2.setStrokeWidth((float) (A0F * 2));
                }
                if (this.A0B) {
                    Paint paint3 = this.A05;
                    AnonymousClass3MX.A19(context, paint3, this.A0D ? 2131103053 : 2131103055);
                    paint3.setMaskFilter(new BlurMaskFilter(22.0f, BlurMaskFilter.Blur.NORMAL));
                }
                if (this.A0C) {
                    AnonymousClass3MX.A19(context, this.A06, 2131103053);
                    this.A00 = 2;
                }
            }
            C62762rw.A01(context, 8.0f);
            C62762rw.A01(context, 12.0f);
            C62762rw.A01(context, 4.0f);
            Paint paint4 = this.A07;
            C108945cZ.A1L(paint4);
            AnonymousClass3MX.A19(context, paint4, 2131103206);
            C62762rw.A01(context, 6.0f);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d5, code lost:
        if (r13 == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c6, code lost:
        if (r10 == false) goto L_0x01f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r0 = 0
            r14 = r25
            X.C18070vi.A0d(r14, r0)
            r8 = r24
            super.onDraw(r14)
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x0151
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0051
            int r0 = r8.getScrollX()
            float r3 = (float) r0
            int r0 = r8.getPaddingLeft()
            float r0 = (float) r0
            float r3 = r3 + r0
            int r0 = A0F
            float r0 = (float) r0
            float r3 = r3 - r0
            int r1 = r8.getPaddingTop()
            int r0 = r8.getMeasuredHeight()
            int r0 = X.C108985cd.A07(r8, r0)
            int r0 = r0 / 2
            int r1 = r1 + r0
            float r2 = (float) r1
            int r0 = r14.getWidth()
            float r1 = (float) r0
            int r0 = r8.getPaddingLeft()
            int r0 = r0 * 2
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = A0F
            float r0 = (float) r0
            float r1 = r1 + r0
            float r17 = r3 + r1
            android.graphics.Paint r0 = r8.A08
            r18 = r2
            r15 = r3
            r16 = r2
            r19 = r0
            r14.drawLine(r15, r16, r17, r18, r19)
        L_0x0051:
            int r0 = r8.getScrollX()
            float r5 = (float) r0
            int r0 = r14.getWidth()
            float r4 = (float) r0
            int r0 = r14.getHeight()
            float r3 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r3 / r0
            float r2 = java.lang.Math.abs(r0)
            float r4 = r4 + r5
            r0 = 0
            float r3 = r3 + r0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5, r0, r4, r3)
            android.graphics.Paint r0 = r8.A04
            r14.drawRoundRect(r1, r2, r2, r0)
            boolean r13 = r8.A0D
            if (r13 == 0) goto L_0x014b
            int r21 = X.C72463Mc.A09(r8)
        L_0x007d:
            int r22 = r8.getPaddingTop()
            int r0 = r8.getMeasuredHeight()
            int r0 = X.C108985cd.A07(r8, r0)
            int r0 = r0 / 2
            int r22 = r22 + r0
            int r1 = A0F
            double r6 = (double) r1
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r6 = r6 * r2
            r12 = 1
            if (r13 == 0) goto L_0x0142
            r17 = -1
            int r11 = r8.A03
            int r11 = r11 - r12
        L_0x009b:
            if (r11 < 0) goto L_0x0204
        L_0x009d:
            int r0 = r1 * r17
            int r21 = r21 + r0
            float r9 = (float) r1
            int r3 = r8.A01
            if (r11 == r3) goto L_0x00b4
            if (r11 != 0) goto L_0x00aa
            if (r3 == r12) goto L_0x00b4
        L_0x00aa:
            int r2 = r8.A03
            int r0 = r2 - r12
            if (r11 != r0) goto L_0x00da
            int r0 = r2 + -2
            if (r3 != r0) goto L_0x00da
        L_0x00b4:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00ca
            if (r13 == 0) goto L_0x00d8
            int r0 = r8.A03
            int r0 = r0 - r11
            int r0 = r0 - r12
        L_0x00bf:
            r18 = r8
            r19 = r14
            r20 = r9
            r23 = r0
            r18.A00(r19, r20, r21, r22, r23)
        L_0x00ca:
            int r1 = A0F
            int r0 = r8.A05
            int r0 = r0 + r1
            int r0 = r0 * r17
            int r21 = r21 + r0
            int r11 = r11 + r17
            if (r13 == 0) goto L_0x0145
            goto L_0x009b
        L_0x00d8:
            r0 = r11
            goto L_0x00bf
        L_0x00da:
            int r0 = r8.A04
            if (r2 <= r0) goto L_0x00b4
            int r1 = r1 + r21
            int r0 = r8.getScrollX()
            int r1 = r1 - r0
            double r2 = (double) r1
            int r0 = X.C72463Mc.A09(r8)
            double r0 = (double) r0
            double r0 = r0 - r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0113
            int r1 = A0F
            int r1 = r1 + r21
            int r0 = r8.getScrollX()
            int r1 = r1 - r0
            double r2 = (double) r1
            int r0 = X.C72463Mc.A09(r8)
            double r9 = (double) r0
            double r9 = r9 - r6
            int r0 = r8.getWidth()
            double r0 = (double) r0
            double r0 = r0 - r6
            int r4 = A0F
            double r4 = (double) r4
            r15 = 0
            double r0 = r0 - r9
            double r15 = r15 - r4
            double r2 = r2 - r9
            double r2 = r2 / r0
        L_0x010f:
            double r2 = r2 * r15
            double r4 = r4 + r2
            float r9 = (float) r4
            goto L_0x00b4
        L_0x0113:
            int r0 = A0F
            int r1 = r21 - r0
            int r0 = r8.getScrollX()
            int r1 = r1 - r0
            double r2 = (double) r1
            int r0 = r8.getPaddingLeft()
            double r0 = (double) r0
            double r0 = r0 + r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b4
            int r0 = A0F
            int r1 = r21 - r0
            int r0 = r8.getScrollX()
            int r1 = r1 - r0
            double r2 = (double) r1
            int r0 = r8.getPaddingLeft()
            double r0 = (double) r0
            double r0 = r0 + r6
            int r4 = A0F
            double r4 = (double) r4
            r15 = 0
            double r9 = r6 - r0
            double r15 = r15 - r4
            double r2 = r2 - r0
            double r2 = r2 / r9
            goto L_0x010f
        L_0x0142:
            r17 = 1
            r11 = 0
        L_0x0145:
            int r0 = r8.A03
            if (r11 >= r0) goto L_0x0204
            goto L_0x009d
        L_0x014b:
            int r21 = r8.getPaddingLeft()
            goto L_0x007d
        L_0x0151:
            boolean r10 = r8.A0D
            if (r10 == 0) goto L_0x01fe
            int r19 = X.C72463Mc.A09(r8)
        L_0x0159:
            int r20 = r8.getPaddingTop()
            int r0 = r8.getMeasuredHeight()
            int r0 = X.C108985cd.A07(r8, r0)
            int r0 = r0 / 2
            int r20 = r20 + r0
            r15 = 1
            if (r10 == 0) goto L_0x01f6
            r13 = -1
            int r9 = r8.A03
            int r9 = r9 - r15
        L_0x0170:
            if (r9 < 0) goto L_0x0204
        L_0x0172:
            int r2 = A0F
            int r0 = r2 * r13
            int r19 = r19 + r0
            float r4 = (float) r2
            int r1 = r8.A03
            int r0 = r8.A04
            if (r1 <= r0) goto L_0x01ac
            int r2 = r2 + r19
            int r0 = r8.getScrollX()
            int r2 = r2 - r0
            int r0 = X.C72463Mc.A09(r8)
            if (r2 <= r0) goto L_0x01cb
            int r1 = A0F
            int r1 = r1 + r19
            int r0 = r8.getScrollX()
            int r1 = r1 - r0
            double r0 = (double) r1
            int r2 = X.C72463Mc.A09(r8)
            double r6 = (double) r2
            int r2 = r8.getWidth()
            double r4 = (double) r2
            int r2 = A0F
            double r2 = (double) r2
            r11 = 0
            double r4 = r4 - r6
            double r11 = r11 - r2
            double r0 = r0 - r6
            double r0 = r0 / r4
            double r0 = r0 * r11
        L_0x01aa:
            double r2 = r2 + r0
            float r4 = (float) r2
        L_0x01ac:
            if (r10 == 0) goto L_0x01c9
            int r0 = r8.A03
            int r0 = r0 - r9
            int r0 = r0 - r15
        L_0x01b2:
            r16 = r8
            r17 = r14
            r18 = r4
            r21 = r0
            r16.A00(r17, r18, r19, r20, r21)
            int r1 = A0F
            int r0 = r8.A05
            int r1 = r1 + r0
            int r1 = r1 * r13
            int r19 = r19 + r1
            int r9 = r9 + r13
            if (r10 == 0) goto L_0x01f8
            goto L_0x0170
        L_0x01c9:
            r0 = r9
            goto L_0x01b2
        L_0x01cb:
            int r0 = A0F
            int r1 = r19 - r0
            int r0 = r8.getScrollX()
            int r1 = r1 - r0
            int r0 = r8.getPaddingLeft()
            if (r1 >= r0) goto L_0x01ac
            int r0 = A0F
            int r1 = r19 - r0
            int r0 = r8.getScrollX()
            int r1 = r1 - r0
            double r0 = (double) r1
            int r2 = r8.getPaddingLeft()
            double r4 = (double) r2
            int r2 = A0F
            double r2 = (double) r2
            r11 = 0
            r6 = 0
            double r11 = r11 - r4
            double r6 = r6 - r2
            double r0 = r0 - r4
            double r0 = r0 / r11
            double r0 = r0 * r6
            goto L_0x01aa
        L_0x01f6:
            r13 = 1
            r9 = 0
        L_0x01f8:
            int r0 = r8.A03
            if (r9 >= r0) goto L_0x0204
            goto L_0x0172
        L_0x01fe:
            int r19 = r8.getPaddingLeft()
            goto L_0x0159
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.graphics.Canvas r12, float r13, int r14, int r15, int r16) {
        /*
            r11 = this;
            boolean r0 = r11.A07
            r4 = r16
            if (r0 == 0) goto L_0x0070
            float r6 = r11.A00
            double r2 = (double) r6
            double r0 = java.lang.Math.floor(r2)
            int r5 = (int) r0
            double r0 = java.lang.Math.ceil(r2)
            int r2 = (int) r0
            int r0 = r11.A01
            float r1 = (float) r2
            if (r5 != r0) goto L_0x001a
            r1 = r6
            float r6 = (float) r5
        L_0x001a:
            float r1 = r1 - r6
            android.graphics.Paint r6 = r11.A0B
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            if (r4 != r0) goto L_0x005e
            android.animation.ArgbEvaluator r8 = r11.A0A
            int r0 = r11.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r11.A02
        L_0x002b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r8.evaluate(r1, r3, r0)
            X.C18070vi.A0z(r0, r7)
            int r0 = X.AnonymousClass000.A0M(r0)
        L_0x003a:
            r6.setColor(r0)
            int r0 = r11.A01
            if (r4 != r0) goto L_0x0058
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            double r0 = (double) r0
        L_0x0045:
            double r2 = (double) r13
            r9 = 0
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 - r9
            double r4 = r2 - r2
            double r0 = r0 - r9
            double r0 = r0 / r7
            double r0 = r0 * r4
            double r2 = r2 + r0
            float r13 = (float) r2
        L_0x0052:
            float r1 = (float) r14
            float r0 = (float) r15
            r12.drawCircle(r1, r0, r13, r6)
            return
        L_0x0058:
            if (r4 == r5) goto L_0x005c
            if (r4 != r2) goto L_0x0052
        L_0x005c:
            double r0 = (double) r1
            goto L_0x0045
        L_0x005e:
            if (r4 == r5) goto L_0x0065
            if (r4 == r2) goto L_0x0065
            int r0 = r11.A02
            goto L_0x003a
        L_0x0065:
            android.animation.ArgbEvaluator r8 = r11.A0A
            int r0 = r11.A02
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r11.A01
            goto L_0x002b
        L_0x0070:
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x007f
            float r3 = (float) r14
            float r2 = (float) r15
            int r0 = r11.A03
            float r1 = (float) r0
            float r1 = r1 + r13
            android.graphics.Paint r0 = r11.A05
            r12.drawCircle(r3, r2, r1, r0)
        L_0x007f:
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x0092
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x0092
            float r3 = (float) r14
            float r2 = (float) r15
            int r0 = r11.A00
            float r1 = (float) r0
            float r1 = r1 + r13
            android.graphics.Paint r0 = r11.A06
            r12.drawCircle(r3, r2, r1, r0)
        L_0x0092:
            android.graphics.Paint r2 = r11.A0B
            int r0 = r11.A01
            if (r4 != r0) goto L_0x00a3
            int r0 = r11.A01
        L_0x009a:
            r2.setColor(r0)
            float r1 = (float) r14
            float r0 = (float) r15
            r12.drawCircle(r1, r0, r13, r2)
            return
        L_0x00a3:
            int r0 = r11.A02
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.theme.adapter.CirclePageIndicator.A00(android.graphics.Canvas, float, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        String str;
        int i3 = this.A03;
        if (i3 == -1) {
            i3 = 0;
        }
        if (this.A09) {
            i2 = View.MeasureSpec.makeMeasureSpec(C108985cd.A06(this, A0F + i3), 1073741824);
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int viewWidth = getViewWidth();
            if (mode == Integer.MIN_VALUE && viewWidth > size) {
                viewWidth = size;
            }
            size = viewWidth;
            int i4 = this.A02;
            if (i4 != -1 && size > i4) {
                size = i4;
            }
        }
        int i5 = this.A02;
        if (i5 != -1 && size > i5) {
            size = i5;
        }
        if (mode == Integer.MIN_VALUE) {
            str = "ATMOST";
        } else if (mode != 1073741824) {
            str = "UNSET";
        } else {
            str = "EXACTLY";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CirclePageIndicator/pageCount ");
        A10.append(this.A03);
        A10.append(" width ");
        A10.append(size);
        A10.append(" (");
        A10.append(str);
        C17900vP.A0i("), ", A10, i5);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int A062 = C108985cd.A06(this, (A0F + i3) * 2);
            if (mode2 == Integer.MIN_VALUE && A062 > size2) {
                A062 = size2;
            }
            size2 = A062;
        }
        setMeasuredDimension(size, size2);
    }

    public void setCurrentPage(int i) {
        this.A01 = i;
        double targetScrollPosition = (double) getTargetScrollPosition();
        C18100vl r5 = this.A0C;
        if (targetScrollPosition != ((C43191zP) r5.getValue()).A00) {
            ((C43191zP) r5.getValue()).A01(targetScrollPosition);
        }
        invalidate();
    }

    public int getCurrentPage() {
        return this.A01;
    }

    public int getTargetScrollPosition() {
        int i;
        int paddingLeft = getPaddingLeft();
        int i2 = this.A03;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                i = 0;
                break;
            }
            int i5 = A0F;
            int i6 = paddingLeft + i5;
            int i7 = this.A01;
            if (i4 == i7) {
                int i8 = i6 - i5;
                int i9 = i5 * 2;
                i = i9 + i8;
                if (this.A09) {
                    if (i7 != 0) {
                        i8 -= this.A05 + i9;
                    }
                    if (i7 != i2 - 1) {
                        i += i9 + this.A05;
                    }
                }
                i3 = i8;
            } else {
                paddingLeft = i6 + i5 + this.A05;
                i4++;
            }
        }
        int paddingLeft2 = i3 - getPaddingLeft();
        int width = (i - getWidth()) + getPaddingRight();
        if (width > getScrollX()) {
            return width;
        }
        if (paddingLeft2 >= getScrollX()) {
            return getScrollX();
        }
        return paddingLeft2;
    }

    public int getViewWidth() {
        int i = this.A03;
        return getPaddingLeft() + getPaddingRight() + (i * 2 * A0F) + ((i - 1) * this.A05);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setScrollX(0);
        ((C43191zP) this.A0C.getValue()).A00((double) getTargetScrollPosition());
    }

    private final void setBackgroundScale(float f) {
        invalidate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
