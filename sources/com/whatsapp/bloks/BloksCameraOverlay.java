package com.whatsapp.bloks;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C108945cZ;
import X.C108965cb;
import X.C18070vi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public final class BloksCameraOverlay extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Path A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public Path A09;
    public String A0A;
    public final Paint A0B = AnonymousClass3MZ.A0A();

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Paint paint = this.A0B;
        paint.setARGB(this.A06, 45, 52, 54);
        C108945cZ.A1L(paint);
        Path path = this.A09;
        if (path != null) {
            canvas.drawPath(path, paint);
        }
        if (TextUtils.equals(this.A0A, "selfie")) {
            paint.setARGB(180, 50, 50, 50);
            C108945cZ.A1L(paint);
            Path path2 = this.A04;
            if (path2 != null) {
                canvas.drawPath(path2, paint);
            }
        }
        AnonymousClass3MW.A1P(paint);
        paint.setColor(-2147418368);
        paint.setStrokeWidth(this.A05 * 2.0f);
    }

    public final void A00(String str) {
        String str2 = str;
        this.A0A = str2;
        DisplayMetrics A072 = C108965cb.A07();
        int i = A072.widthPixels;
        this.A08 = i;
        int i2 = A072.heightPixels;
        this.A07 = i2;
        this.A06 = 125;
        if (TextUtils.equals(str2, "card")) {
            i = (this.A08 * 3) / 4;
            i2 = this.A07 / 4;
        } else if (TextUtils.equals(str2, "square")) {
            i2 = this.A08 - ((int) (32.0f * A072.density));
            this.A06 = 255;
            i = i2;
        } else if (TextUtils.equals(str2, "selfie")) {
            i = (this.A08 * 4) / 5;
            i2 = (this.A07 * 3) / 5;
            this.A06 = 255;
        }
        int i3 = (this.A08 - i) / 2;
        this.A01 = i3;
        int i4 = (this.A07 - i2) / 2;
        this.A03 = i4;
        this.A02 = i3 + i;
        this.A00 = i4 + i2;
        this.A05 = AnonymousClass000.A0Y(this).getDimension(2131165407);
        Path A0L = C108945cZ.A0L();
        A0L.setFillType(Path.FillType.EVEN_ODD);
        A0L.addRect(C108965cb.A04((float) this.A08, (float) this.A07), Path.Direction.CW);
        RectF rectF = new RectF((float) this.A01, (float) this.A03, (float) this.A02, (float) this.A00);
        float f = 16.0f * A072.density;
        A0L.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.A09 = A0L;
        if (TextUtils.equals(str2, "selfie")) {
            int i5 = this.A01;
            int i6 = this.A03;
            int i7 = this.A02;
            int i8 = this.A00;
            float f2 = (float) i5;
            float f3 = f2 + (((float) (i7 - i5)) / 2.0f);
            float f4 = (float) i6;
            float f5 = (float) (i8 - i6);
            float f6 = f5 * 0.4f;
            float f7 = f4 + f6;
            float f8 = f5 * 0.5f;
            float f9 = f4 + (0.8f * f5);
            float f10 = f5 * 0.25f;
            float f11 = f10 / 10.0f;
            float f12 = f6 / 2.0f;
            float f13 = f8 / 2.0f;
            RectF rectF2 = new RectF(f3 - f12, f7 - f13, f12 + f3, f7 + f13);
            float f14 = (1.5f * f10) / 2.0f;
            float f15 = f10 / 2.0f;
            RectF rectF3 = new RectF(f3 - f14, f9 - f15, f3 + f14, f9 + f15);
            Path A0L2 = C108945cZ.A0L();
            A0L2.setFillType(Path.FillType.EVEN_ODD);
            Path.Direction direction = Path.Direction.CW;
            A0L2.addOval(rectF2, direction);
            A0L2.addRoundRect(rectF3, f11, f11, direction);
            A0L2.addRect(f2, f4, (float) i7, (float) i8, direction);
            this.A04 = A0L2;
        }
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context) {
        super(context);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i, String str) {
        super(context, attributeSet, i);
        A00(str);
    }
}
