package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C108945cZ;
import X.C18070vi;
import X.C40501uo;
import X.C72483Me;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

public final class AddScreenshotImageView extends WaImageView {
    public int A00;
    public int A01;
    public Bitmap A02;
    public BitmapShader A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public boolean A09;
    public final Matrix A0A;
    public final RectF A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final RectF A0G;
    public final ImageView.ScaleType A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0G = AnonymousClass3MW.A08();
        this.A0B = AnonymousClass3MW.A08();
        this.A0C = C108945cZ.A0K(1);
        this.A0D = C108945cZ.A0K(1);
        this.A0E = C108945cZ.A0K(1);
        this.A0F = C108945cZ.A0K(1);
        this.A0A = C108945cZ.A0J();
        A00();
        A02(this);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Bitmap bitmap = this.A02;
        RectF rectF = this.A0G;
        float f = (float) this.A06;
        if (bitmap == null) {
            canvas.drawRoundRect(rectF, f, f, this.A0C);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (this.A05 / 2), this.A0E);
            super.onDraw(canvas);
            return;
        }
        canvas.drawRoundRect(rectF, f, f, this.A0D);
        RectF rectF2 = this.A0B;
        float f2 = this.A04;
        canvas.drawRoundRect(rectF2, f2, f2, this.A0F);
    }

    private final void A00() {
        AnonymousClass3MX.A19(getContext(), this.A0C, AnonymousClass1YL.A00(getContext(), 2130971186, 2131102518));
        AnonymousClass3MX.A19(getContext(), this.A0D, 2131102519);
        AnonymousClass3MX.A19(getContext(), this.A0E, 2131102520);
        this.A08 = getResources().getDimensionPixelSize(2131168642);
        this.A06 = getResources().getDimensionPixelSize(2131168641);
        this.A05 = getResources().getDimensionPixelSize(2131168640);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168639);
        this.A07 = dimensionPixelSize;
        float f = (float) this.A06;
        float f2 = (float) this.A08;
        this.A04 = f * ((f2 - (((float) dimensionPixelSize) * 2.0f)) / f2);
    }

    public static final void A02(AddScreenshotImageView addScreenshotImageView) {
        super.setScaleType(addScreenshotImageView.A0H);
        Resources resources = addScreenshotImageView.getResources();
        Drawable A002 = C40501uo.A00(AnonymousClass3Ma.A06(addScreenshotImageView), AnonymousClass000.A0Y(addScreenshotImageView), 2131231657);
        int A012 = AnonymousClass3Ma.A01(addScreenshotImageView.getContext(), resources, 2130971187, 2131102521);
        if (A002 != null) {
            A002.setColorFilter(A012, PorterDuff.Mode.SRC_IN);
        }
        super.setImageDrawable(A002);
        super.setContentDescription(addScreenshotImageView.getContext().getString(2131889357));
    }

    public void A05() {
        if (!this.A09) {
            this.A09 = true;
            C72483Me.A0x(this);
        }
    }

    private final void A01() {
        float width;
        float height;
        if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A02;
            if (bitmap == null) {
                A02(this);
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A03 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A0F;
                paint.setAntiAlias(true);
                paint.setShader(this.A03);
                this.A00 = bitmap.getHeight();
                this.A01 = bitmap.getWidth();
                Matrix matrix = this.A0A;
                matrix.set((Matrix) null);
                RectF rectF = this.A0B;
                float f = 0.0f;
                if (((float) this.A01) * rectF.height() > rectF.width() * ((float) this.A00)) {
                    width = rectF.height() / ((float) this.A00);
                    f = (rectF.width() - (((float) this.A01) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A01);
                    height = (rectF.height() - (((float) this.A00) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                BitmapShader bitmapShader = this.A03;
                if (bitmapShader != null) {
                    bitmapShader.setLocalMatrix(matrix);
                }
            }
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RectF rectF = this.A0G;
        float f = (float) this.A08;
        rectF.set(0.0f, 0.0f, f, f);
        RectF rectF2 = this.A0B;
        int i3 = this.A07;
        float f2 = (float) i3;
        float f3 = (float) (this.A08 - i3);
        rectF2.set(f2, f2, f3, f3);
        int i4 = this.A08;
        setMeasuredDimension(i4, i4);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A01();
    }

    public final void setScreenshot(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.A02 = bitmap;
        A01();
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddScreenshotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A05();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0G = AnonymousClass3MW.A08();
        this.A0B = AnonymousClass3MW.A08();
        this.A0C = C108945cZ.A0K(1);
        this.A0D = C108945cZ.A0K(1);
        this.A0E = C108945cZ.A0K(1);
        this.A0F = C108945cZ.A0K(1);
        this.A0A = C108945cZ.A0J();
        A00();
        A02(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddScreenshotImageView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A05();
        this.A0H = ImageView.ScaleType.CENTER;
        this.A0G = AnonymousClass3MW.A08();
        this.A0B = AnonymousClass3MW.A08();
        this.A0C = C108945cZ.A0K(1);
        this.A0D = C108945cZ.A0K(1);
        this.A0E = C108945cZ.A0K(1);
        this.A0F = C108945cZ.A0K(1);
        this.A0A = C108945cZ.A0J();
        A00();
        A02(this);
    }
}
