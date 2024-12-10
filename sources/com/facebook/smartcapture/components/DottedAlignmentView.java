package com.facebook.smartcapture.components;

import X.AnonymousClass3MZ;
import X.AnonymousClass6VZ;
import X.C108945cZ;
import X.C108955ca;
import X.C1411074h;
import X.C18070vi;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.dextricks.StringTreeSet;

public final class DottedAlignmentView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public Bitmap A06;
    public float A07;
    public final float A08 = getResources().getDimension(2131166145);
    public final float A09;
    public final float A0A;
    public final Paint A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DottedAlignmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        Paint A0K = C108945cZ.A0K(1);
        this.A0B = A0K;
        A0K.setColor(AnonymousClass6VZ.A00(context, 2130971021));
        float dimension = getResources().getDimension(2131166146);
        this.A09 = dimension;
        this.A0A = dimension / 2.0f;
    }

    public void onDraw(Canvas canvas) {
        int i;
        C18070vi.A0d(canvas, 0);
        super.onDraw(canvas);
        int i2 = (int) this.A07;
        int i3 = this.A04;
        for (int i4 = 0; i4 < i3; i4++) {
            Paint paint = this.A0B;
            int i5 = this.A02;
            if (i5 <= i4) {
                i5 += this.A04;
            }
            int i6 = i5 - i4;
            if (i6 >= this.A04 / 2) {
                i = StringTreeSet.OFFSET_BASE_ENCODING;
            } else {
                i = 255 - ((int) (((float) i6) * this.A00));
            }
            paint.setAlpha(i);
            Bitmap bitmap = this.A06;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, (float) i2, paint);
                i2 += bitmap.getHeight();
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.A09;
        float f2 = this.A08;
        float f3 = f + (2.0f * f2);
        int i5 = (int) f3;
        int i6 = i / i5;
        this.A03 = i6;
        int i7 = i2 / i5;
        this.A04 = i7;
        float f4 = (float) i7;
        this.A00 = 127.5f / (f4 / 2.0f);
        this.A01 = (((float) i) - (((float) i6) * f3)) / 2.0f;
        this.A07 = (((float) i2) - (f4 * f3)) / 2.0f;
        Bitmap A0H = C108945cZ.A0H(i, i5);
        Canvas A0E = C108955ca.A0E(A0H);
        this.A06 = A0H;
        float f5 = this.A0A;
        float f6 = this.A01 + f2 + f5;
        float f7 = f2 + f5;
        Paint A0A2 = AnonymousClass3MZ.A0A();
        A0A2.setColor(-1);
        int i8 = this.A03;
        for (int i9 = 0; i9 < i8; i9++) {
            A0E.drawCircle(f6, f7, f5, A0A2);
            f6 += f3;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(700);
        int[] A1W = C108945cZ.A1W();
        A1W[0] = 0;
        A1W[1] = this.A04 + 1;
        valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("animation_property", A1W)});
        C1411074h.A00(valueAnimator, this, 2);
        this.A05 = valueAnimator;
    }
}
