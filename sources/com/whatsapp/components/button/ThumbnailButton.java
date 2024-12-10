package com.whatsapp.components.button;

import X.AnonymousClass3MW;
import X.AnonymousClass3N5;
import X.C43011z6;
import X.C75323gt;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

public class ThumbnailButton extends C75323gt {
    public float A00;
    public float A01 = 0.0f;
    public int A02;
    public int A03 = 419430400;
    public Paint A04;
    public C43011z6 A05;
    public boolean A06;
    public float A07;
    public final Rect A08 = AnonymousClass3MW.A07();
    public final RectF A09 = AnonymousClass3MW.A08();

    private void A01(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(new AnonymousClass3N5());
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0S);
            this.A01 = obtainStyledAttributes.getDimension(4, this.A01);
            this.A07 = obtainStyledAttributes.getFloat(0, this.A07);
            this.A03 = obtainStyledAttributes.getInteger(5, this.A03);
            this.A00 = obtainStyledAttributes.getDimension(2, this.A00);
            this.A02 = obtainStyledAttributes.getInteger(1, this.A02);
            this.A06 = obtainStyledAttributes.getBoolean(3, this.A06);
            z = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
        }
        Paint A062 = AnonymousClass3MW.A06();
        this.A04 = A062;
        A062.setAntiAlias(true);
        this.A04.setDither(true);
        this.A04.setFilterBitmap(true);
        this.A04.setColor(-1);
        if (z) {
            setOutlineProvider(new ViewOutlineProvider());
        }
    }

    public void A06(Canvas canvas) {
        int i;
        if (this.A00 > 0.0f && (i = this.A02) != 0) {
            this.A04.setColor(i);
            this.A04.setStrokeWidth(this.A00);
            AnonymousClass3MW.A1P(this.A04);
            C43011z6 r1 = this.A05;
            if (r1 != null) {
                canvas.drawPath((Path) r1.apply(this.A09), this.A04);
                return;
            }
            float f = this.A01;
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            RectF rectF = this.A09;
            Paint paint = this.A04;
            if (i2 >= 0) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawOval(rectF, paint);
            }
        }
    }

    public float getBorderSize() {
        return this.A00;
    }

    public int getBorderSizeAdjustment() {
        return (int) ((this.A00 + 2.0f) / 2.0f);
    }

    public void onMeasure(int i, int i2) {
        if (this.A07 == 1.0f) {
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
            return;
        }
        super.onMeasure(i, i2);
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2 A[Catch:{ RuntimeException -> 0x0204 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca A[Catch:{ RuntimeException -> 0x0204 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            int r3 = r10.getBorderSizeAdjustment()
            android.graphics.RectF r2 = r10.A09
            int r0 = r10.getPaddingLeft()
            int r0 = r0 + r3
            float r0 = (float) r0
            r2.left = r0
            int r0 = X.C72463Mc.A09(r10)
            int r0 = r0 - r3
            float r0 = (float) r0
            r2.right = r0
            int r0 = r10.getPaddingTop()
            int r0 = r0 + r3
            float r0 = (float) r0
            r2.top = r0
            int r1 = r10.getHeight()
            int r0 = r10.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r3
            float r0 = (float) r1
            r2.bottom = r0
            boolean r0 = r10.A06     // Catch:{ RuntimeException -> 0x0204 }
            if (r0 != 0) goto L_0x019c
            android.graphics.drawable.Drawable r0 = r10.getDrawable()     // Catch:{ RuntimeException -> 0x0204 }
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ RuntimeException -> 0x0204 }
            if (r0 == 0) goto L_0x019c
            float r1 = r10.A01     // Catch:{ RuntimeException -> 0x0204 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x019c
            android.graphics.drawable.Drawable r1 = r10.getDrawable()     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ RuntimeException -> 0x0204 }
            if (r1 == 0) goto L_0x019f
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x0204 }
            if (r0 == 0) goto L_0x019f
            android.graphics.Bitmap r6 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x0204 }
            int r8 = r6.getWidth()     // Catch:{ RuntimeException -> 0x0204 }
            int r7 = r6.getHeight()     // Catch:{ RuntimeException -> 0x0204 }
            android.widget.ImageView$ScaleType r1 = r10.getScaleType()     // Catch:{ RuntimeException -> 0x0204 }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ RuntimeException -> 0x0204 }
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r1 != r0) goto L_0x011d
            android.graphics.Rect r4 = r10.A08     // Catch:{ RuntimeException -> 0x0204 }
            r4.set(r5, r5, r8, r7)     // Catch:{ RuntimeException -> 0x0204 }
            float r8 = (float) r8     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.height()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r8 * r0
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r0 * r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0107
            float r3 = r2.width()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 * r1
            float r3 = r3 / r8
            float r1 = r2.top     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.bottom     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            r2.top = r1     // Catch:{ RuntimeException -> 0x0204 }
        L_0x008a:
            float r1 = r1 + r3
            r2.bottom = r1     // Catch:{ RuntimeException -> 0x0204 }
        L_0x008d:
            android.graphics.Paint r1 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            r0 = -1
            r1.setColor(r0)     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.Paint r1 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL     // Catch:{ RuntimeException -> 0x0204 }
            r1.setStyle(r0)     // Catch:{ RuntimeException -> 0x0204 }
            X.1z6 r0 = r10.A05     // Catch:{ RuntimeException -> 0x0204 }
            r1 = 31
            r7 = 0
            r9 = 0
            if (r0 == 0) goto L_0x00ca
            int r5 = r11.saveLayer(r2, r7, r1)     // Catch:{ RuntimeException -> 0x0204 }
            X.1z6 r0 = r10.A05     // Catch:{ RuntimeException -> 0x0204 }
            java.lang.Object r0 = r0.apply(r2)     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.Path r0 = (android.graphics.Path) r0     // Catch:{ RuntimeException -> 0x0204 }
            r11.clipPath(r0)     // Catch:{ RuntimeException -> 0x0204 }
        L_0x00b1:
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            r11.drawBitmap(r6, r4, r2, r0)     // Catch:{ RuntimeException -> 0x0204 }
            X.1z6 r0 = r10.A05     // Catch:{ RuntimeException -> 0x0204 }
            if (r0 != 0) goto L_0x00c0
            float r0 = r10.A01     // Catch:{ RuntimeException -> 0x0204 }
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x019f
        L_0x00c0:
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            r0.setXfermode(r7)     // Catch:{ RuntimeException -> 0x0204 }
            r11.restoreToCount(r5)     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x019f
        L_0x00ca:
            float r0 = r10.A01     // Catch:{ RuntimeException -> 0x0204 }
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00b1
            int r8 = r11.saveLayer(r2, r7, r1)     // Catch:{ RuntimeException -> 0x0204 }
            r11.drawARGB(r5, r5, r5, r5)     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = r10.A01     // Catch:{ RuntimeException -> 0x0204 }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00ef
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            r11.drawRoundRect(r2, r1, r1, r0)     // Catch:{ RuntimeException -> 0x0204 }
        L_0x00e2:
            android.graphics.Paint r3 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.PorterDuffXfermode r0 = new android.graphics.PorterDuffXfermode     // Catch:{ RuntimeException -> 0x0204 }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x0204 }
            r3.setXfermode(r0)     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x0105
        L_0x00ef:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ff
            android.graphics.Path r1 = X.AnonymousClass204.A07(r2)     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            r11.drawPath(r1, r0)     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x00e2
        L_0x00ff:
            android.graphics.Paint r0 = r10.A04     // Catch:{ RuntimeException -> 0x0204 }
            r11.drawOval(r2, r0)     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x00e2
        L_0x0105:
            r5 = r8
            goto L_0x00b1
        L_0x0107:
            float r3 = r2.height()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 * r8
            float r3 = r3 / r1
            float r1 = r2.left     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.right     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            r2.left = r1     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = r1 + r3
            r2.right = r1     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x008d
        L_0x011d:
            android.widget.ImageView$ScaleType r1 = r10.getScaleType()     // Catch:{ RuntimeException -> 0x0204 }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ RuntimeException -> 0x0204 }
            android.graphics.Rect r4 = r10.A08     // Catch:{ RuntimeException -> 0x0204 }
            if (r1 != r0) goto L_0x0143
            r4.set(r5, r5, r8, r7)     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r2.centerX()     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = (float) r8     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r1 / r9
            float r3 = r3 - r0
            r2.left = r3     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 + r1
            r2.right = r3     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r2.centerY()     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r1 / r9
            float r3 = r3 - r0
            r2.top = r3     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x008a
        L_0x0143:
            r4.set(r5, r5, r8, r7)     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = (float) r8     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.height()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 * r0
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = r1 * r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0179
            int r0 = r4.height()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = (float) r0     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 * r0
            float r0 = r2.height()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 / r0
            int r1 = r4.left     // Catch:{ RuntimeException -> 0x0204 }
            int r0 = r4.right     // Catch:{ RuntimeException -> 0x0204 }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x0204 }
            r4.left = r0     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r0 + r3
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x0204 }
            r4.right = r0     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x008d
        L_0x0179:
            int r0 = r4.width()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = (float) r0     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r2.height()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 * r0
            float r0 = r2.width()     // Catch:{ RuntimeException -> 0x0204 }
            float r3 = r3 / r0
            int r1 = r4.top     // Catch:{ RuntimeException -> 0x0204 }
            int r0 = r4.bottom     // Catch:{ RuntimeException -> 0x0204 }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x0204 }
            float r1 = r1 / r9
            float r0 = r3 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x0204 }
            r4.top = r0     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x0204 }
            float r0 = r0 + r3
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x0204 }
            r4.bottom = r0     // Catch:{ RuntimeException -> 0x0204 }
            goto L_0x008d
        L_0x019c:
            super.onDraw(r11)     // Catch:{ RuntimeException -> 0x0204 }
        L_0x019f:
            r10.A06(r11)
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x01e0
            boolean r0 = r10.isSelected()
            if (r0 != 0) goto L_0x01b4
            boolean r0 = r10.isPressed()
            if (r0 == 0) goto L_0x01e0
        L_0x01b4:
            android.graphics.Paint r1 = r10.A04
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            android.graphics.Paint r1 = r10.A04
            int r0 = r10.A03
            r1.setColor(r0)
            X.1z6 r0 = r10.A05
            if (r0 == 0) goto L_0x01e1
            r1 = 0
            r0 = 31
            int r1 = r11.saveLayer(r2, r1, r0)
            X.1z6 r0 = r10.A05
            java.lang.Object r0 = r0.apply(r2)
            android.graphics.Path r0 = (android.graphics.Path) r0
            r11.clipPath(r0)
            android.graphics.Paint r0 = r10.A04
            r11.drawRect(r2, r0)
            r11.restoreToCount(r1)
        L_0x01e0:
            return
        L_0x01e1:
            float r1 = r10.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01ee
            android.graphics.Paint r0 = r10.A04
            r11.drawRoundRect(r2, r1, r1, r0)
            return
        L_0x01ee:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01fe
            android.graphics.Path r1 = X.AnonymousClass204.A07(r2)
            android.graphics.Paint r0 = r10.A04
            r11.drawPath(r1, r0)
            return
        L_0x01fe:
            android.graphics.Paint r0 = r10.A04
            r11.drawOval(r2, r0)
            return
        L_0x0204:
            r1 = move-exception
            java.lang.String r0 = "thumbnailbutton/"
            X.C60312no.A01(r10, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.button.ThumbnailButton.onDraw(android.graphics.Canvas):void");
    }

    public void setBorderColor(int i) {
        this.A02 = i;
    }

    public void setBorderSize(float f) {
        this.A00 = f;
    }

    public void setClipPathProducer(C43011z6 r1) {
        this.A05 = r1;
    }

    public void setCornerRadius(float f) {
        this.A01 = f;
    }

    public void setForegroundOnly(boolean z) {
        this.A06 = z;
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        A01(context, attributeSet);
    }

    public ThumbnailButton(Context context) {
        super(context);
        A05();
        A01(context, (AttributeSet) null);
    }
}
