package com.whatsapp.qrcode;

import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3O8;
import X.AnonymousClass3OQ;
import X.AnonymousClass4IZ;
import X.AnonymousClass4Z9;
import X.C17960vV;
import X.C17970vW;
import X.C19740yt;
import X.C24291Jp;
import X.C72473Md;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.dextricks.StringTreeSet;

public class QrScannerOverlay extends AnonymousClass3O8 {
    public boolean A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public AnonymousClass3OQ A06;
    public String A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Rect A0F;
    public final RectF A0G;

    public QrScannerOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A01(Canvas canvas, int i) {
    }

    public void onDraw(Canvas canvas) {
        int A072 = C72473Md.A07(this, getWidth());
        int A042 = C72473Md.A04(this);
        int min = (Math.min(A072, A042) * 3) / 4;
        int paddingLeft = ((A072 - min) / 2) + getPaddingLeft();
        int paddingTop = ((A042 - min) / 2) + getPaddingTop();
        int i = paddingLeft + min;
        int i2 = paddingTop + min;
        float f = this.A02;
        float f2 = this.A01;
        float f3 = f + f2;
        this.A02 = f3;
        if (f3 > 1.0f || f3 < 0.0f) {
            if (f3 > 1.0f) {
                this.A02 = 1.0f;
            } else {
                this.A02 = 0.0f;
            }
            this.A01 = -f2;
        }
        Canvas canvas2 = canvas;
        canvas2.drawColor(this.A0A);
        RectF rectF = this.A0G;
        float f4 = (float) paddingLeft;
        float f5 = (float) paddingTop;
        float f6 = (float) i2;
        rectF.set(f4, f5, (float) i, f6);
        if (this.A0C == 0) {
            canvas2.drawArc(rectF, 0.0f, 360.0f, true, this.A0E);
            Paint paint = this.A0D;
            AnonymousClass3MW.A1P(paint);
            paint.setColor(this.A0B);
            paint.setAlpha(StringTreeSet.OFFSET_BASE_ENCODING);
            float f7 = this.A09 * 2.0f;
            paint.setStrokeWidth(f7);
            int i3 = (int) (f5 + f7);
            i2 = (int) (f6 - f7);
            float f8 = this.A02;
            float f9 = (f8 * 2.0f) - 1.0f;
            float f10 = (float) ((paddingLeft + i) / 2);
            float sqrt = (((float) (i - paddingLeft)) * ((float) Math.sqrt((double) (1.0f - (f9 * f9))))) / 2.0f;
            float f11 = ((float) i3) + (((float) (i2 - i3)) * f8);
            canvas2.drawLine(f10 - sqrt, f11, f10 + sqrt, f11, paint);
        } else {
            float f12 = this.A08;
            canvas2.drawRoundRect(rectF, f12, f12, this.A0E);
            Drawable drawable = this.A05;
            drawable.setAlpha((int) (this.A02 * 255.0f));
            canvas2.save();
            canvas2.translate(f4, f5);
            drawable.draw(canvas2);
            canvas2.translate((float) (i - paddingLeft), 0.0f);
            canvas2.rotate(90.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-90.0f);
            canvas2.translate(0.0f, (float) (i2 - paddingTop));
            canvas2.rotate(180.0f);
            drawable.draw(canvas2);
            canvas2.rotate(-180.0f);
            canvas2.translate((float) (paddingLeft - i), 0.0f);
            canvas2.rotate(270.0f);
            drawable.draw(canvas2);
            canvas2.restore();
        }
        String str = this.A07;
        if (str != null && this.A00) {
            Paint paint2 = this.A0D;
            AnonymousClass3MZ.A1D(-1, paint2);
            paint2.setTextSize((float) this.A03);
            int length = str.length();
            Rect rect = this.A0F;
            paint2.getTextBounds(str, 0, length, rect);
            i2 += this.A04;
            canvas2.drawText(str, ((float) (A072 - rect.width())) / 2.0f, (float) ((rect.height() / 2) + i2), paint2);
        }
        A01(canvas2, i2);
    }

    public void onVisibilityChanged(View view, int i) {
        AnonymousClass3OQ r0;
        Boolean bool = C17970vW.A03;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A06) != null) {
            startAnimation(r0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass3OQ r2 = new AnonymousClass3OQ(this);
        this.A06 = r2;
        r2.setDuration(2000);
        this.A06.setRepeatCount(-1);
        this.A06.setRepeatMode(2);
        Boolean bool = C17970vW.A03;
        startAnimation(this.A06);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Boolean bool = C17970vW.A03;
        clearAnimation();
    }

    public QrScannerOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A0D = new Paint(1);
        this.A0F = AnonymousClass3MW.A07();
        this.A0G = AnonymousClass3MW.A08();
        this.A02 = 0.0f;
        this.A00 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IZ.A04);
        int i2 = obtainStyledAttributes.getInt(0, 1);
        this.A0C = i2;
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.A07 = context.getString(resourceId);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        obtainStyledAttributes.recycle();
        this.A09 = getResources().getDimension(2131165407);
        this.A08 = getResources().getDimension(2131166092);
        this.A0B = C19740yt.A00(context, AnonymousClass4Z9.A00(context, 2130970874));
        this.A0A = C19740yt.A00(context, 2131102313);
        if (i2 == 1) {
            this.A01 = 0.0125f;
            C24291Jp A002 = C24291Jp.A00((Resources.Theme) null, getResources(), 2131233412);
            C17960vV.A07(A002);
            this.A05 = A002;
            A002.setBounds(0, 0, A002.getIntrinsicWidth(), this.A05.getIntrinsicHeight());
        } else {
            this.A01 = 0.01f;
        }
        Paint paint = new Paint(1);
        this.A0E = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public QrScannerOverlay(Context context) {
        this(context, (AttributeSet) null);
    }
}
