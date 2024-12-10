package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass4q0;
import X.AnonymousClass5YM;
import X.AnonymousClass74M;
import X.C17900vP;
import X.C18070vi;
import X.C72483Me;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public final class WallPaperView extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass5YM A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public boolean A03;
    public RectF A04;
    public float[] A05;
    public final Path A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WallPaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A06 = new Path();
        setScaleType(ImageView.ScaleType.MATRIX);
        float A002 = AnonymousClass3MW.A00(getResources(), 2131169303);
        float[] fArr = new float[8];
        fArr[0] = A002;
        C72483Me.A19(fArr, A002);
        this.A05 = fArr;
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        AnonymousClass5YM r0;
        AnonymousClass74M r02;
        C18070vi.A0d(canvas, 0);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = this.A04;
        boolean z2 = false;
        if (rectF == null) {
            if (!isInEditMode()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("WallPaperView/redraw:");
                A10.append(measuredWidth);
                C17900vP.A0j(" | ", A10, measuredHeight);
            }
            rectF = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight);
            this.A04 = rectF;
        } else {
            float f = (float) measuredWidth;
            if (rectF.width() == f && rectF.height() == ((float) measuredHeight)) {
                z = false;
                Path path = this.A06;
                path.rewind();
                path.addRoundRect(rectF, this.A05, Path.Direction.CW);
                canvas.clipPath(path);
                super.onDraw(canvas);
                if (measuredHeight > 0 && measuredWidth > 0) {
                    z2 = true;
                }
                if ((z || this.A03) && z2 && (r0 = this.A00) != null && (r02 = ((AnonymousClass4q0) r0).A00.A4h) != null) {
                    r02.A0k.A0T();
                }
                return;
            }
            rectF.set(0.0f, 0.0f, f, (float) measuredHeight);
            if (!isInEditMode()) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("WallPaperView/redraw changed:");
                A102.append(measuredWidth);
                C17900vP.A0j(" | ", A102, measuredHeight);
            }
        }
        z = true;
        Path path2 = this.A06;
        path2.rewind();
        path2.addRoundRect(rectF, this.A05, Path.Direction.CW);
        canvas.clipPath(path2);
        super.onDraw(canvas);
        z2 = true;
        if (z || this.A03) {
            r02.A0k.A0T();
        }
    }

    public final void setDrawable(Drawable drawable) {
        this.A03 = true;
        setImageDrawable(drawable);
        invalidate();
    }

    public final void setRadii(float[] fArr) {
        C18070vi.A0d(fArr, 0);
        this.A05 = fArr;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float intrinsicWidth = ((float) (i3 - i)) / ((float) drawable.getIntrinsicWidth());
            float intrinsicHeight = ((float) (i4 - i2)) / ((float) drawable.getIntrinsicHeight());
            if (intrinsicWidth < intrinsicHeight) {
                intrinsicWidth = intrinsicHeight;
            }
            imageMatrix.setScale(intrinsicWidth, intrinsicWidth, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public final void setOnSizeChangedListener(AnonymousClass5YM r1) {
        this.A00 = r1;
    }

    public WallPaperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
