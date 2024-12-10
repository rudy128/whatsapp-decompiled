package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4IZ;
import X.AnonymousClass85F;
import X.C108945cZ;
import X.C108985cd;
import X.C109865e9;
import X.C137296vE;
import X.C18000vb;
import X.C72463Mc;
import X.C72473Md;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;

public class ColorPickerView extends View implements AnonymousClass009 {
    public float A00;
    public int A01;
    public int A02;
    public C18000vb A03;
    public AnonymousClass85F A04;
    public AnonymousClass031 A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Bitmap A0B;
    public boolean A0C;
    public int[] A0D;
    public final Paint A0E;
    public final Paint A0F;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IZ.A02);
            this.A09 = (int) obtainStyledAttributes.getDimension(2, 1.0f);
            this.A02 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A0A = (int) obtainStyledAttributes.getDimension(0, 1.0f);
            this.A00 = (float) this.A02;
            obtainStyledAttributes.recycle();
        }
    }

    public static void A01(ColorPickerView colorPickerView) {
        colorPickerView.A0D = C137296vE.A01(colorPickerView.A07);
        Path A0L = C108945cZ.A0L();
        A0L.setFillType(Path.FillType.WINDING);
        float[] fArr = new float[8];
        Arrays.fill(fArr, ((float) colorPickerView.A09) / 0.8f);
        A0L.addRoundRect(new RectF(1.0f, 1.0f, (float) (colorPickerView.A09 - 1), (float) (colorPickerView.A07 - 1)), fArr, Path.Direction.CW);
        Bitmap bitmap = colorPickerView.A0B;
        if (!(bitmap != null && bitmap.getWidth() == colorPickerView.A09 && colorPickerView.A0B.getHeight() == colorPickerView.A07)) {
            colorPickerView.A0B = C108945cZ.A0H(colorPickerView.A09, colorPickerView.A07);
        }
        Canvas A0I = C108945cZ.A0I(colorPickerView.A0B);
        Paint paint = colorPickerView.A0E;
        AnonymousClass3MW.A1P(paint);
        A0I.save();
        A0I.clipPath(A0L);
        paint.setStrokeWidth(1.0f);
        for (int i = 0; i < colorPickerView.A07; i++) {
            paint.setColor(colorPickerView.A0D[i]);
            float f = (float) i;
            A0I.drawLine(0.0f, f, (float) colorPickerView.A09, f, paint);
        }
        A0I.restore();
        Paint paint2 = colorPickerView.A0F;
        AnonymousClass3MX.A19(colorPickerView.getContext(), paint2, AnonymousClass1YL.A00(colorPickerView.getContext(), 2130969159, 2131100168));
        AnonymousClass3MW.A1P(paint2);
        paint2.setStrokeWidth(AnonymousClass3MW.A00(colorPickerView.getResources(), 2131168797));
        A0I.drawPath(A0L, paint2);
    }

    public void A02() {
        if (!this.A0C) {
            this.A0C = true;
            this.A03 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public float getMinSize() {
        return (float) this.A02;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C109865e9 r2 = (C109865e9) parcelable;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    public void setColorAndInvalidate(int i) {
        this.A01 = i;
        invalidate();
    }

    public void setSizeAndInvalidate(float f) {
        this.A00 = f;
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A0E = AnonymousClass3MW.A06();
        this.A0F = AnonymousClass3MZ.A0A();
        A00(context, attributeSet);
    }

    public void draw(Canvas canvas) {
        int paddingRight;
        super.draw(canvas);
        if (AnonymousClass3MY.A1b(this.A03)) {
            paddingRight = C72463Mc.A09(this);
        } else {
            paddingRight = this.A09 + getPaddingRight();
        }
        canvas.drawBitmap(this.A0B, (float) paddingRight, (float) getPaddingTop(), this.A0E);
    }

    public int getColor() {
        return this.A01;
    }

    public float getSize() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A08 != 0 && getMeasuredHeight() > this.A08) {
            setMeasuredDimension(getMeasuredWidth(), this.A08);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new C109865e9(super.onSaveInstanceState(), this.A00, this.A01);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int max = Math.max(1, C108985cd.A07(this, i2));
        this.A07 = max;
        int[] iArr = this.A0D;
        if (iArr == null || iArr.length < max) {
            this.A0D = new int[max];
        }
        A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r12 != 6) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        if (r0.A0T() == true) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0133, code lost:
        if (r12 != 1) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r12 = r14.getActionMasked()
            int r0 = r14.getPointerCount()
            r11 = 0
            r4 = 1
            if (r0 > r4) goto L_0x0046
            r3 = 5
            r5 = 2
            if (r12 == r3) goto L_0x0012
            if (r12 != 0) goto L_0x0047
        L_0x0012:
            float r2 = r14.getX()
            int r1 = X.C72463Mc.A09(r13)
            int r0 = r13.A09
            int r0 = r0 * 2
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            X.0vb r0 = r13.A03
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 != 0) goto L_0x0046
        L_0x002c:
            float r2 = r14.getX()
            int r1 = r13.getPaddingLeft()
            int r0 = r13.A09
            int r0 = r0 * 2
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            X.0vb r0 = r13.A03
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            return r11
        L_0x0047:
            r10 = 6
            if (r12 == 0) goto L_0x0059
            if (r12 == r4) goto L_0x0059
            if (r12 == r5) goto L_0x0059
            r0 = 3
            if (r12 == r0) goto L_0x0135
            if (r12 == r3) goto L_0x0059
            if (r12 == r10) goto L_0x0059
        L_0x0055:
            r13.invalidate()
            return r4
        L_0x0059:
            X.85F r0 = r13.A04
            if (r0 == 0) goto L_0x0055
            float r0 = r14.getY()
            int r1 = (int) r0
            int r0 = r13.getPaddingTop()
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x006a
            r1 = 0
        L_0x006a:
            int r0 = r13.A07
            if (r1 < r0) goto L_0x0070
            int r1 = r0 + -1
        L_0x0070:
            int[] r0 = r13.A0D
            r1 = r0[r1]
            int r0 = r13.A01
            if (r1 == r0) goto L_0x0131
            r13.A01 = r1
            X.0vb r0 = r13.A03
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x00f3
            float r5 = X.C108945cZ.A03(r13)
            float r0 = r14.getX()
            float r5 = r5 - r0
        L_0x008b:
            int r1 = r13.A09
            int r0 = r13.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r13.getPaddingRight()
            int r1 = r1 + r0
            float r3 = (float) r1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            int r1 = r13.A02
            float r2 = (float) r1
            int r0 = r13.A0A
            int r0 = r0 - r1
            float r1 = (float) r0
            float r5 = r5 - r3
            float r1 = r1 * r5
            float r0 = X.C108945cZ.A03(r13)
            float r0 = r0 - r3
            float r1 = r1 / r0
            float r2 = r2 + r1
            r13.A00 = r2
        L_0x00ae:
            r13.A06 = r4
            X.85F r1 = r13.A04
            float r5 = r13.A00
            int r9 = r13.A01
            X.7J5 r1 = (X.AnonymousClass7J5) r1
            X.87Q r0 = r1.A02
            if (r0 == 0) goto L_0x00bf
            r0.CKu(r9, r5)
        L_0x00bf:
            X.87O r8 = r1.A00
            r1 = r8
            X.7J4 r1 = (X.AnonymousClass7J4) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r3 = r1.A01
            X.5cz r3 = (X.C109205cz) r3
            X.6UC r0 = r3.A0I
            r0.A00 = r9
            X.6z9 r1 = r3.A08
            if (r1 != 0) goto L_0x00db
            java.lang.String r2 = "penDialogController"
        L_0x00d6:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        L_0x00db:
            int r0 = (int) r5
            r1.A01(r0, r9)
            X.5dT r0 = r3.A09
            java.lang.String r2 = "penButtonBackground"
            if (r0 == 0) goto L_0x00d6
            r0.A00(r9, r5)
            X.5dT r1 = r3.A09
            if (r1 == 0) goto L_0x00d6
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r3.A07
            if (r0 != 0) goto L_0x0126
            java.lang.String r2 = "colorPicker"
            goto L_0x00d6
        L_0x00f3:
            float r5 = r14.getX()
            goto L_0x008b
        L_0x00f8:
            java.lang.Object r7 = r1.A01
            X.7JF r7 = (X.AnonymousClass7JF) r7
            X.6UC r6 = r7.A0M
            r6.A00 = r9
            X.70N r0 = r7.A0V
            X.73u r0 = r0.A01
            if (r0 == 0) goto L_0x0124
            boolean r0 = r0.A0T()
            r5 = 1
            if (r0 != r4) goto L_0x0124
        L_0x010d:
            X.6uj r3 = r7.A0W
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r2 = r7.A0L
            float r1 = r2.getSelectedStrokeSize()
            com.whatsapp.mediacomposer.doodle.ColorPickerView r0 = r2.A01
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.A06
        L_0x011b:
            r3.A06(r1, r9, r0, r5)
            X.C109005cf.A0m(r2, r6, r7)
            goto L_0x012e
        L_0x0122:
            r0 = 0
            goto L_0x011b
        L_0x0124:
            r5 = 0
            goto L_0x010d
        L_0x0126:
            com.whatsapp.mediacomposer.doodle.ColorPickerView r0 = r0.A01
            if (r0 == 0) goto L_0x0167
            boolean r0 = r0.A06
        L_0x012c:
            r1.A05 = r0
        L_0x012e:
            r8.C9Z()
        L_0x0131:
            if (r12 == r10) goto L_0x0135
            if (r12 != r4) goto L_0x0055
        L_0x0135:
            r13.A06 = r11
            X.85F r3 = r13.A04
            X.7J5 r3 = (X.AnonymousClass7J5) r3
            X.87Q r0 = r3.A02
            if (r0 == 0) goto L_0x0155
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = (com.whatsapp.mediacomposer.doodle.DoodleView) r0
            X.70N r2 = r0.A0M
            X.73u r0 = r2.A02
            X.73u r1 = r2.A01
            if (r0 == 0) goto L_0x0155
            if (r0 != r1) goto L_0x0155
            X.6hH r0 = r2.A00
            X.AnonymousClass70N.A00(r0, r1, r2)
            r0 = 0
            r2.A02 = r0
            r2.A00 = r0
        L_0x0155:
            X.87O r0 = r3.A00
            r0.C9Z()
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r3.A01
            com.whatsapp.mediacomposer.doodle.ColorPickerView r1 = r0.A01
            if (r1 == 0) goto L_0x0055
            int r0 = r1.A01
            X.C137296vE.A00(r1, r0)
            goto L_0x0055
        L_0x0167:
            r0 = 0
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setColor(int i) {
        this.A01 = i;
    }

    private void setSize(float f) {
        this.A00 = f;
    }

    public void setListener(AnonymousClass85F r1) {
        this.A04 = r1;
    }

    public void setMaxHeight(int i) {
        this.A08 = i;
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        this.A0E = AnonymousClass3MW.A06();
        this.A0F = AnonymousClass3MZ.A0A();
        A00(context, attributeSet);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A0E = AnonymousClass3MW.A06();
        this.A0F = AnonymousClass3MZ.A0A();
        A00(context, attributeSet);
    }

    public ColorPickerView(Context context) {
        super(context);
        A02();
        this.A0E = AnonymousClass3MW.A06();
        this.A0F = AnonymousClass3MZ.A0A();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
