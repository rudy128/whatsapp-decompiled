package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass47H;
import X.AnonymousClass4IZ;
import X.AnonymousClass4aW;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class WallpaperImagePreview extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public boolean A02;
    public final Path A03;
    public final RectF A04;
    public final boolean A05;
    public final float[] A06;

    public WallpaperImagePreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A02) {
            canvas.clipPath(this.A03);
        }
        super.onDraw(canvas);
    }

    public void setRoundBottomCorners(boolean z) {
        this.A02 = z;
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02) {
            Path path = this.A03;
            path.reset();
            RectF rectF = this.A04;
            rectF.right = (float) getMeasuredWidth();
            rectF.bottom = (float) getMeasuredHeight();
            path.addRoundRect(rectF, this.A06, Path.Direction.CW);
            path.close();
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            float f = 1.0f;
            if (this.A05) {
                f = 0.93f;
            }
            float f2 = intrinsicHeight * f;
            Point A002 = AnonymousClass4aW.A00(getContext());
            float f3 = (float) A002.x;
            float f4 = (float) A002.y;
            float f5 = ((float) (i3 - i)) / f3;
            float max = Math.max(f3 / intrinsicWidth, f4 / f2) * f5;
            Matrix imageMatrix = getImageMatrix();
            float f6 = 0.0f;
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            float f7 = ((f3 * f5) - (intrinsicWidth * max)) / 2.0f;
            float f8 = ((f4 * f5) - (f2 * max)) / 2.0f;
            if (getResources().getConfiguration().orientation != 2) {
                f6 = f8;
            }
            imageMatrix.postTranslate(f7, f6);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    /* JADX INFO: finally extract failed */
    public WallpaperImagePreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = new Path();
        this.A04 = AnonymousClass3MW.A08();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.A06 = fArr;
        this.A02 = false;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(2131169296);
        fArr[4] = dimensionPixelSize;
        fArr[5] = dimensionPixelSize;
        fArr[6] = dimensionPixelSize;
        fArr[7] = dimensionPixelSize;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IZ.A09);
        try {
            this.A02 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.A05 = AnonymousClass1L9.A00(context) instanceof AnonymousClass47H;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public WallpaperImagePreview(Context context) {
        this(context, (AttributeSet) null);
    }
}
