package com.whatsapp.qrcode;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4Z9;
import X.AnonymousClass4aX;
import X.C88754aj;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.facebook.common.dextricks.StringTreeSet;

public class QrEducationView extends View implements AnonymousClass009 {
    public float A00;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public Paint A04;
    public RectF A05;
    public Drawable A06;
    public Drawable A07;
    public AnonymousClass031 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Drawable A0C;
    public Drawable A0D;
    public Drawable A0E;

    private void A00() {
        if (this.A03 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.A03 = ofFloat;
            ofFloat.setDuration(8000);
            this.A03.setRepeatCount(-1);
            this.A03.setInterpolator(new LinearInterpolator());
            C88754aj.A00(this.A03, this, 20);
        }
        this.A03.start();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A08;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        Drawable drawable;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        float f4;
        int width = getWidth();
        int height = getHeight();
        Canvas canvas2 = canvas;
        canvas2.translate((float) (width / 2), (float) (height / 2));
        if (this.A0D.getIntrinsicHeight() + (this.A0D.getIntrinsicWidth() / 3) > height) {
            float intrinsicHeight = ((float) height) / ((float) (this.A0D.getIntrinsicHeight() + (this.A0D.getIntrinsicWidth() / 3)));
            canvas2.scale(intrinsicHeight, intrinsicHeight);
        }
        float f5 = this.A00;
        if (f5 < 0.14f) {
            f5 = (f5 * f5) / 0.14f;
        } else if (f5 >= 0.2f && f5 < 0.3f) {
            f5 = ((float) (Math.sqrt((double) (f5 - 0.2f)) * Math.sqrt(0.10000000894069672d))) + 0.2f;
        }
        if (this.A0B) {
            this.A06.setAlpha(255);
            int intrinsicWidth = (int) ((((float) this.A06.getIntrinsicWidth()) * 1.0f) / 2.0f);
            int intrinsicHeight2 = (int) ((((float) this.A06.getIntrinsicHeight()) * 1.0f) / 2.0f);
            this.A06.setBounds(-intrinsicWidth, -intrinsicHeight2, intrinsicWidth, intrinsicHeight2);
            drawable = this.A06;
        } else {
            int intrinsicWidth2 = (int) ((((float) this.A07.getIntrinsicWidth()) / 2.0f) * 1.3f);
            int intrinsicHeight3 = (int) ((((float) this.A07.getIntrinsicHeight()) / 2.0f) * 1.3f);
            RectF rectF = this.A05;
            int i3 = intrinsicWidth2 * 2;
            rectF.left = (float) (-i3);
            rectF.top = (float) (intrinsicHeight3 * -2);
            rectF.bottom = (float) (intrinsicHeight3 * 2);
            rectF.right = (float) i3;
            float f6 = this.A01;
            canvas2.drawRoundRect(rectF, f6, f6, this.A04);
            this.A07.setBounds(-intrinsicWidth2, -intrinsicHeight3, intrinsicWidth2, intrinsicHeight3);
            this.A07.setColorFilter(this.A02, PorterDuff.Mode.SRC_IN);
            this.A07.setAlpha(255);
            drawable = this.A07;
        }
        drawable.draw(canvas2);
        float intrinsicWidth3 = (float) (this.A0D.getIntrinsicWidth() / 2);
        float intrinsicHeight4 = (float) (this.A0D.getIntrinsicHeight() / 2);
        if (f5 < 0.14f) {
            f2 = 0.0f;
            f = 1.2566371f - 0.0f;
            f3 = 0.0f;
            if (f5 > 0.0f) {
                if (f5 < 0.14f) {
                    f3 = (f5 - 0.0f) / (0.14f - 0.0f);
                }
                f3 = 1.0f;
            }
        } else {
            f2 = 1.2566371f;
            f = 1.5707964f - 1.2566371f;
            if (f5 <= 0.14f) {
                f3 = 0.0f;
            } else {
                if (f5 < 0.2f) {
                    f3 = (f5 - 0.14f) / (0.2f - 0.14f);
                }
                f3 = 1.0f;
            }
        }
        float f7 = f2 + (f * f3);
        float f8 = (-intrinsicWidth3) - ((intrinsicWidth3 * 3.0f) / 4.0f);
        float sin = f8 + (((float) Math.sin((double) f7)) * intrinsicWidth3);
        float f9 = intrinsicWidth3 / 6.0f;
        int i4 = (int) intrinsicWidth3;
        int i5 = (int) sin;
        int i6 = (int) intrinsicHeight4;
        int i7 = (int) f9;
        this.A0D.setBounds((-i4) - i5, (-i6) + i7, i4 - i5, i6 + i7);
        this.A0D.draw(canvas2);
        int i8 = this.A0D.getBounds().left;
        int i9 = this.A0D.getBounds().right;
        int i10 = (i9 - i8) / 7;
        canvas2.clipRect(i8 + i10, this.A0D.getBounds().top, i9 - i10, this.A0D.getBounds().bottom);
        float intrinsicWidth4 = (float) (this.A07.getIntrinsicWidth() / 2);
        float intrinsicHeight5 = (float) (this.A07.getIntrinsicHeight() / 2);
        float intrinsicWidth5 = (float) (this.A0E.getIntrinsicWidth() / 2);
        float intrinsicHeight6 = (float) (this.A0E.getIntrinsicHeight() / 2);
        float sin2 = sin - ((sin - (f8 + (((float) Math.sin(1.5707963267948966d)) * intrinsicWidth3))) / 3.0f);
        int i11 = (int) intrinsicWidth4;
        int i12 = (int) sin2;
        int i13 = (int) intrinsicHeight5;
        int i14 = (int) (f9 - (intrinsicHeight4 / 8.0f));
        this.A07.setBounds((-i11) - i12, (-i13) + i14, i11 - i12, i13 + i14);
        int i15 = (int) intrinsicWidth5;
        int i16 = (int) intrinsicHeight6;
        this.A0E.setBounds((-i15) - i12, (-i16) + i14, i15 - i12, i16 + i14);
        if (f5 > 0.2f) {
            float f10 = 255.0f - 0.0f;
            if (f5 <= 0.2f) {
                f4 = 0.0f;
            } else if (f5 >= 0.3f) {
                f4 = 1.0f;
            } else {
                f4 = (f5 - 0.2f) / (0.3f - 0.2f);
            }
            i2 = (int) (0.0f + (f10 * f4));
            i = (int) (255.0f + ((0.0f - 255.0f) * f4));
        } else {
            i = 255;
            i2 = 0;
        }
        this.A07.setColorFilter((ColorFilter) null);
        this.A07.setAlpha(i2);
        this.A0E.setAlpha(i);
        this.A07.draw(canvas2);
        this.A0E.draw(canvas2);
        this.A0C.setAlpha(((int) (Math.sin((double) (this.A00 * 30.0f)) * 127.0d)) + StringTreeSet.OFFSET_BASE_ENCODING);
        int intrinsicWidth6 = (int) (((float) this.A0C.getIntrinsicWidth()) / 2.0f);
        int intrinsicHeight7 = (int) (((float) this.A0C.getIntrinsicHeight()) / 2.0f);
        this.A0C.setBounds((-intrinsicWidth6) - i5, (-intrinsicHeight7) + i14, intrinsicWidth6 - i5, intrinsicHeight7 + i14);
        this.A0C.draw(canvas2);
        canvas2.translate((float) ((-width) / 2), (float) ((-height) / 2));
    }

    public QrEducationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
        this.A0A = false;
        this.A0B = true;
        this.A05 = new RectF();
        A01(context);
    }

    private void A01(Context context) {
        Resources resources = context.getResources();
        this.A07 = resources.getDrawable(2131231010);
        this.A0E = resources.getDrawable(2131231009);
        this.A06 = resources.getDrawable(2131231007);
        this.A0D = resources.getDrawable(2131231008);
        this.A0C = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131231006), AnonymousClass4Z9.A00(getContext(), 2130970875));
        int A022 = AnonymousClass3MZ.A02(getContext(), context, 2130970872, 2131102309);
        this.A02 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130970873, 2131102310);
        Paint A062 = AnonymousClass3MW.A06();
        this.A04 = A062;
        A062.setAntiAlias(true);
        this.A04.setColor(A022);
        this.A01 = getResources().getDimension(2131166092);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A00();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A03 = null;
    }

    public void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
    }

    public void onVisibilityChanged(View view, int i) {
        if (getVisibility() == 0) {
            A00();
            return;
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A03 = null;
    }

    public void setShowLaptop(boolean z) {
        this.A0B = z;
    }

    public QrEducationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
        this.A0A = false;
        this.A0B = true;
        this.A05 = new RectF();
        A01(context);
    }

    public QrEducationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
    }

    public QrEducationView(Context context) {
        super(context);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
        this.A0A = false;
        this.A0B = true;
        this.A05 = new RectF();
        A01(context);
    }
}
