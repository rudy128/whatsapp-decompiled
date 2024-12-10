package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C108945cZ;
import X.C18000vb;
import X.C18070vi;
import X.C72473Md;
import X.C84144If;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public final class SegmentedProgressBar extends View implements AnonymousClass009 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnimatorSet A08;
    public Bitmap A09;
    public C18000vb A0A;
    public AnonymousClass031 A0B;
    public boolean A0C;
    public float[] A0D;
    public int[] A0E;
    public int A0F;
    public int A0G;
    public final Paint A0H;
    public final RectF A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A0C) {
            this.A0C = true;
            this.A0A = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A02 = 1000;
        this.A01 = 300;
        this.A0H = C108945cZ.A0K(1);
        this.A0I = AnonymousClass3MW.A08();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0M);
            C18070vi.A0X(obtainStyledAttributes);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.A07 = dimensionPixelSize;
            if (dimensionPixelSize % 2 == 1) {
                this.A07 = dimensionPixelSize + 1;
            }
            this.A05 = obtainStyledAttributes.getInteger(4, 0);
            this.A0G = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.A0F = obtainStyledAttributes.getInteger(2, 0);
            this.A00 = obtainStyledAttributes.getDimension(1, 0.0f);
            this.A04 = obtainStyledAttributes.getInteger(0, 0);
            this.A03 = obtainStyledAttributes.getInteger(5, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0128, code lost:
        if (r13 != null) goto L_0x012a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r0 = 0
            r10 = r25
            X.C18070vi.A0d(r10, r0)
            r11 = r24
            int r9 = r11.getWidth()
            int r22 = r11.getPaddingLeft()
            int r21 = r11.getPaddingRight()
            int r13 = r9 - r22
            int r13 = r13 - r21
            int r20 = r11.getPaddingTop()
            int r0 = X.C72473Md.A04(r11)
            r1 = 2
            int r0 = r0 / r1
            int r20 = r20 + r0
            android.graphics.Paint r8 = r11.A0H
            int r0 = r11.A03
            X.AnonymousClass3MZ.A1D(r0, r8)
            android.graphics.RectF r12 = r11.A0I
            int r7 = r11.A07
            int r6 = r7 / r1
            int r0 = r20 - r6
            float r3 = (float) r0
            float r2 = X.C108945cZ.A03(r11)
            int r0 = r6 + r20
            float r5 = (float) r0
            r1 = 0
            r12.set(r1, r3, r2, r5)
            r10.drawRect(r12, r8)
            float[] r4 = r11.A0D
            if (r4 == 0) goto L_0x00e4
            int[] r0 = r11.A0E
            r19 = r0
            if (r0 == 0) goto L_0x00e4
            int r0 = r4.length
            r23 = r0
            r14 = 0
            r18 = 0
        L_0x0052:
            r0 = r23
            if (r14 >= r0) goto L_0x00e4
            r0 = r4[r14]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b1
            r0 = r19[r14]
            r8.setColor(r0)
            r17 = r4[r14]
            r0 = 1120403456(0x42c80000, float:100.0)
            float r17 = r17 / r0
            float r0 = (float) r13
            float r17 = r17 * r0
            boolean r0 = r11.isInEditMode()
            if (r0 != 0) goto L_0x00b5
            X.0vb r0 = r11.getWhatsAppLocale()
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 != 0) goto L_0x00b5
            int r0 = r9 - r21
            float r3 = (float) r0
            float r2 = r3 - r18
            float r16 = r2 - r17
            int r15 = r7 / 2
            int r0 = r20 - r15
            float r1 = (float) r0
            int r15 = r15 + r20
            float r0 = (float) r15
            r15 = r16
            r12.set(r15, r1, r2, r0)
            r10.drawRect(r12, r8)
            int r2 = r4.length
            r0 = 1
            int r2 = r2 - r0
            if (r14 != r2) goto L_0x009c
            int r2 = r11.A06
            r0 = 100
            if (r2 == r0) goto L_0x00af
        L_0x009c:
            int r0 = r11.A0F
            r8.setColor(r0)
            float r3 = r3 - r18
            float r3 = r3 - r17
            int r0 = r11.A0G
            float r0 = (float) r0
            float r0 = r0 + r3
            r12.set(r3, r1, r0, r5)
        L_0x00ac:
            r10.drawRect(r12, r8)
        L_0x00af:
            float r18 = r18 + r17
        L_0x00b1:
            int r14 = r14 + 1
            r1 = 0
            goto L_0x0052
        L_0x00b5:
            r0 = r22
            float r3 = (float) r0
            float r1 = r3 + r18
            int r0 = r7 / 2
            int r0 = r20 - r0
            float r2 = (float) r0
            float r3 = r3 + r17
            float r3 = r3 + r18
            r12.set(r1, r2, r3, r5)
            r10.drawRect(r12, r8)
            int r1 = r4.length
            r0 = 1
            int r1 = r1 - r0
            if (r14 != r1) goto L_0x00d4
            int r1 = r11.A06
            r0 = 100
            if (r1 == r0) goto L_0x00af
        L_0x00d4:
            int r0 = r11.A0F
            r8.setColor(r0)
            float r1 = r17 + r18
            int r0 = r11.A0G
            float r0 = (float) r0
            float r0 = r1 - r0
            r12.set(r0, r2, r1, r5)
            goto L_0x00ac
        L_0x00e4:
            int r3 = r11.A05
            r8.setColor(r3)
            android.graphics.Bitmap r13 = r11.A09
            if (r13 != 0) goto L_0x012a
            int r2 = r11.getWidth()
            float r5 = r12.height()
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            android.graphics.Bitmap r13 = X.C108945cZ.A0H(r2, r7)
            android.graphics.Canvas r14 = X.C108945cZ.A0I(r13)
            android.graphics.Paint r4 = X.AnonymousClass3MZ.A0A()
            r4.setColor(r3)
            r0 = 0
            r4.setXfermode(r0)
            float r3 = (float) r2
            float r2 = (float) r7
            r16 = r1
            r15 = r1
            r17 = r3
            r18 = r2
            r19 = r4
            r14.drawRect(r15, r16, r17, r18, r19)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR
            X.C108965cb.A11(r4, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r1, r3, r2)
            r14.drawRoundRect(r0, r5, r5, r4)
            r11.A09 = r13
            if (r13 == 0) goto L_0x012d
        L_0x012a:
            r10.drawBitmap(r13, r1, r1, r8)
        L_0x012d:
            float r2 = r11.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0180
            int r5 = r11.getHeight()
            float r14 = r12.height()
            r13 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r13
            int r0 = r11.A04
            r8.setColor(r0)
            X.AnonymousClass3MW.A1P(r8)
            r8.setStrokeWidth(r2)
            float r12 = r8.getStrokeWidth()
            float r12 = r12 / r13
            int r0 = r11.getPaddingLeft()
            float r3 = (float) r0
            float r3 = r3 + r12
            int r0 = r11.getPaddingRight()
            float r4 = (float) r0
            float r4 = r4 + r12
            int r0 = r11.getPaddingTop()
            float r2 = (float) r0
            float r2 = r2 + r12
            int r0 = r11.getPaddingBottom()
            float r1 = (float) r0
            float r1 = r1 + r12
            float r0 = (float) r5
            float r0 = r0 - r2
            float r0 = r0 - r1
            float r0 = r0 / r13
            float r2 = r2 + r0
            int r0 = r7 / 2
            float r0 = (float) r0
            float r11 = r2 - r0
            float r11 = r11 + r12
            float r1 = (float) r9
            float r1 = r1 - r4
            float r0 = (float) r6
            float r2 = r2 + r0
            float r2 = r2 - r12
            r9 = r10
            r10 = r3
            r12 = r1
            r13 = r2
            r15 = r14
            r16 = r8
            r9.drawRoundRect(r10, r11, r12, r13, r14, r15, r16)
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.SegmentedProgressBar.onDraw(android.graphics.Canvas):void");
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A0A = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0B;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public void onMeasure(int i, int i2) {
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingTop() + this.A07 + getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size2, size);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A09 = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ SegmentedProgressBar(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
