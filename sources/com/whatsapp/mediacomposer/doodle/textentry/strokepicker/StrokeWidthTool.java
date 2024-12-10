package com.whatsapp.mediacomposer.doodle.textentry.strokepicker;

import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6Z2;
import X.AnonymousClass7JJ;
import X.AnonymousClass85M;
import X.C108945cZ;
import X.C18070vi;
import X.C22667BJi;
import X.C43531zx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;

public final class StrokeWidthTool extends View {
    public static final int[] A0H = C108945cZ.A1W();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public AnonymousClass85M A0A;
    public float A0B;
    public boolean A0C;
    public boolean A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Path A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StrokeWidthTool(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A0G = C108945cZ.A0L();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass6Z2.A01);
        this.A02 = 0.0f;
        this.A01 = 100.0f;
        this.A03 = 0.0f;
        float dimension = obtainStyledAttributes.getDimension(2, (float) C43531zx.A00(this, 20)) / 2.0f;
        this.A04 = dimension;
        float f = dimension * 2.0f * 0.6f;
        this.A06 = f;
        this.A00 = f / 2.0f;
        int color = obtainStyledAttributes.getColor(3, -1);
        int color2 = obtainStyledAttributes.getColor(1, -1);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            AnonymousClass3MY.A0w(context, this, resourceId);
        }
        obtainStyledAttributes.recycle();
        Paint A0K = C108945cZ.A0K(1);
        Paint.Style style = Paint.Style.FILL;
        A0K.setStyle(style);
        A0K.setColor(color);
        this.A0F = A0K;
        Paint A0K2 = C108945cZ.A0K(1);
        A0K2.setStyle(style);
        A0K2.setColor(color2);
        this.A0E = A0K2;
        AnonymousClass1HF.A0f(this, new C22667BJi(this, 12));
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        canvas.drawPath(this.A0G, this.A0F);
        canvas.drawCircle(this.A09, this.A05, this.A04, this.A0E);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0C = true;
        this.A09 = C108945cZ.A02(getWidth());
        float f = this.A04;
        this.A08 = ((float) getPaddingTop()) + f;
        this.A07 = (C108945cZ.A04(this) - f) - ((float) getPaddingBottom());
        float f2 = this.A06 / 2.0f;
        float f3 = this.A09;
        float f4 = this.A08;
        RectF rectF = new RectF(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
        float f5 = this.A00 / 2.0f;
        float f6 = this.A09;
        float f7 = this.A07;
        RectF rectF2 = new RectF(f6 - f5, f7 - f5, f6 + f5, f7 + f5);
        Path path = this.A0G;
        path.rewind();
        path.moveTo(this.A09 - f5, this.A07);
        path.lineTo(this.A09 - f2, this.A08);
        path.arcTo(rectF, 180.0f, 180.0f);
        path.lineTo(this.A09 + f5, this.A07);
        path.arcTo(rectF2, 0.0f, 180.0f);
        path.close();
        path.setFillType(Path.FillType.WINDING);
        A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1 != 3) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r2 = 0
            X.C18070vi.A0d(r8, r2)
            int r1 = r8.getAction()
            r6 = 1
            if (r1 == 0) goto L_0x0014
            if (r1 == r6) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0023
            r0 = 3
            if (r1 == r0) goto L_0x0067
        L_0x0013:
            return r6
        L_0x0014:
            float r2 = r8.getY()
            r7.A0B = r2
            float r0 = r7.A07
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0013
            r7.A0D = r6
            goto L_0x0033
        L_0x0023:
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x0013
            float r1 = r8.getY()
            float r0 = r7.A0B
            float r0 = r0 - r1
            r7.A0B = r1
            float r2 = r7.A05
            float r2 = r2 - r0
        L_0x0033:
            float r5 = r7.A07
            float r1 = r7.A08
            float r0 = java.lang.Math.max(r1, r2)
            float r4 = java.lang.Math.min(r5, r0)
            r7.A05 = r4
            float r3 = r7.A03
            float r2 = r5 - r1
            float r0 = r7.A01
            float r1 = r7.A02
            float r0 = r0 - r1
            float r5 = r5 - r4
            float r0 = r0 / r2
            float r0 = r0 * r5
            float r1 = r1 + r0
            r7.A03 = r1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            A01(r7, r1)
            X.85M r0 = r7.A0A
            if (r0 == 0) goto L_0x0060
            int[] r0 = A0H
            r7.getLocationInWindow(r0)
        L_0x0060:
            r7.invalidate()
        L_0x0063:
            r7.invalidate()
            return r6
        L_0x0067:
            r7.A0D = r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.textentry.strokepicker.StrokeWidthTool.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public static final void A00(StrokeWidthTool strokeWidthTool) {
        if (strokeWidthTool.A0C) {
            float f = strokeWidthTool.A07;
            float f2 = f - strokeWidthTool.A08;
            float f3 = strokeWidthTool.A01;
            float f4 = strokeWidthTool.A02;
            strokeWidthTool.A05 = f - ((f2 / (f3 - f4)) * (strokeWidthTool.A03 - f4));
            strokeWidthTool.invalidate();
        }
    }

    public static final void A01(StrokeWidthTool strokeWidthTool, float f) {
        AnonymousClass85M r3 = strokeWidthTool.A0A;
        if (r3 != null) {
            AnonymousClass7JJ r32 = (AnonymousClass7JJ) r3;
            r32.A01.A00 = TypedValue.applyDimension(2, f, AnonymousClass3Ma.A09(r32.A03));
            TextEntryView.A04(r32.A00, r32.A02, f);
        }
    }

    public final void setStrokeWidth(float f) {
        this.A03 = Math.min(Math.max(f, this.A02), this.A01);
        A00(this);
    }

    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight() + (((int) this.A04) * 2);
        int A002 = C43531zx.A00(this, 200);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == Integer.MIN_VALUE) {
            A002 = Math.min(A002, size2);
        } else if (mode2 == 1073741824) {
            A002 = size2;
        }
        setMeasuredDimension(paddingLeft, A002);
    }

    public final void setOnValueChangedListener(AnonymousClass85M r1) {
        this.A0A = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StrokeWidthTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ StrokeWidthTool(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StrokeWidthTool(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
