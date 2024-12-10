package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C108995ce;
import X.C115045tF;
import X.C72473Md;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircleWaImageView extends C115045tF {
    public static final Bitmap.Config A0A = Bitmap.Config.ARGB_8888;
    public static final ImageView.ScaleType A0B = ImageView.ScaleType.CENTER_CROP;
    public int A00;
    public int A01;
    public BitmapShader A02;
    public boolean A03;
    public boolean A04;
    public float A05;
    public Bitmap A06;
    public final Matrix A07;
    public final RectF A08;
    public final Paint A09;

    private void A02() {
        float width;
        float height;
        if (!this.A03) {
            this.A04 = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A06;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A02 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A09;
                paint.setAntiAlias(true);
                paint.setShader(this.A02);
                this.A00 = this.A06.getHeight();
                this.A01 = this.A06.getWidth();
                RectF rectF = this.A08;
                int A032 = C108995ce.A03(this);
                int A042 = C72473Md.A04(this);
                int min = Math.min(A032, A042);
                float paddingLeft = ((float) getPaddingLeft()) + (((float) (A032 - min)) / 2.0f);
                float paddingTop = ((float) getPaddingTop()) + (((float) (A042 - min)) / 2.0f);
                float f = (float) min;
                rectF.set(new RectF(paddingLeft, paddingTop, f + paddingLeft, f + paddingTop));
                this.A05 = C108945cZ.A01(rectF.width(), 2.0f, rectF.height() / 2.0f);
                Matrix matrix = this.A07;
                matrix.set((Matrix) null);
                float f2 = 0.0f;
                if (((float) this.A01) * rectF.height() > rectF.width() * ((float) this.A00)) {
                    width = rectF.height() / ((float) this.A00);
                    f2 = (rectF.width() - (((float) this.A01) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A01);
                    height = (rectF.height() - (((float) this.A00) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f2 + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                this.A02.setLocalMatrix(matrix);
            }
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.A06 != null) {
            RectF rectF = this.A08;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A05, this.A09);
        }
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw AnonymousClass000.A0k("adjustViewBounds not supported.");
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != A0B) {
            throw AnonymousClass000.A0k(String.format("ScaleType %s not supported.", AnonymousClass000.A1b(scaleType, 1)));
        }
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A08 = AnonymousClass3MW.A08();
        this.A09 = AnonymousClass3MW.A06();
        this.A07 = C108945cZ.A0J();
        super.setScaleType(A0B);
        this.A03 = true;
        if (this.A04) {
            A02();
            this.A04 = false;
        }
    }

    private void A01() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), A0A);
                    Canvas A0I = C108945cZ.A0I(createBitmap);
                    drawable.setBounds(0, 0, A0I.getWidth(), A0I.getHeight());
                    drawable.draw(A0I);
                    bitmap = createBitmap;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.A06 = bitmap;
        A02();
    }

    public ImageView.ScaleType getScaleType() {
        return A0B;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A02();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A01();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        A01();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        A01();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A01();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        A02();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        A02();
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleWaImageView(Context context) {
        this(context, (AttributeSet) null);
    }
}
