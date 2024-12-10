package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

/* renamed from: X.3xO  reason: invalid class name and case insensitive filesystem */
public abstract class C80563xO extends C73223Rp {
    public int A00;
    public int A01;
    public float A02;
    public C106805Xg A03;
    public Runnable A04;
    public float A05;
    public final Handler A06 = C17890vO.A0D();
    public final AnonymousClass4MX A07;
    public final float[] A08 = new float[9];
    public final Matrix A09 = new Matrix();
    public final Matrix A0A = new Matrix();
    public final Matrix A0B = new Matrix();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        A06(1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        return true;
    }

    public static int A02(AnonymousClass4MX r2) {
        Bitmap bitmap = r2.A00;
        if (bitmap == null) {
            return 0;
        }
        if (AnonymousClass4MX.A00(r2)) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r1 < r2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r8 = this;
            X.4MX r3 = r8.A07
            android.graphics.Bitmap r0 = r3.A00
            if (r0 == 0) goto L_0x0052
            android.graphics.Matrix r2 = r8.getImageViewMatrix()
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getWidth()
            float r1 = (float) r0
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r3 = 0
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r3, r3, r1, r0)
            r2.mapRect(r5)
            float r1 = r5.height()
            float r7 = r5.width()
            r6 = 1073741824(0x40000000, float:2.0)
            int r0 = r8.getHeight()
            float r4 = (float) r0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0062
            float r4 = r4 - r1
            float r4 = r4 / r6
            float r0 = r5.top
        L_0x0038:
            float r4 = r4 - r0
        L_0x0039:
            int r0 = r8.getWidth()
            float r2 = (float) r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0053
            float r2 = r2 - r7
            float r2 = r2 / r6
            float r1 = r5.left
        L_0x0046:
            float r3 = r2 - r1
        L_0x0048:
            r8.A05(r3, r4)
            android.graphics.Matrix r0 = r8.getImageViewMatrix()
            r8.setImageMatrix(r0)
        L_0x0052:
            return
        L_0x0053:
            float r1 = r5.left
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x005b
            float r3 = -r1
            goto L_0x0048
        L_0x005b:
            float r1 = r5.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0048
            goto L_0x0046
        L_0x0062:
            float r1 = r5.top
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x006a
            float r4 = -r1
            goto L_0x0039
        L_0x006a:
            float r0 = r5.bottom
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0078
            int r0 = r8.getHeight()
            float r4 = (float) r0
            float r0 = r5.bottom
            goto L_0x0038
        L_0x0078:
            r4 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80563xO.A04():void");
    }

    public void A05(float f, float f2) {
        this.A0B.postTranslate(f, f2);
    }

    public void A06(float f, float f2, float f3) {
        float f4 = this.A05;
        if (f > f4) {
            f = f4;
        }
        float scale = f / getScale();
        this.A0B.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        A04();
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.A0A;
        matrix.set(this.A09);
        matrix.postConcat(this.A0B);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.A0B;
        float[] fArr = this.A08;
        matrix.getValues(fArr);
        return fArr[0];
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.4MX, java.lang.Object] */
    public C80563xO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ? obj = new Object();
        obj.A00 = null;
        this.A07 = obj;
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 3.0f;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void A03(Matrix matrix, AnonymousClass4MX r11) {
        int i;
        Bitmap bitmap;
        int i2;
        float width = (float) getWidth();
        float height = (float) getHeight();
        Bitmap bitmap2 = r11.A00;
        if (bitmap2 == null) {
            i = 0;
        } else if (AnonymousClass4MX.A00(r11)) {
            i = bitmap2.getHeight();
        } else {
            i = bitmap2.getWidth();
        }
        float f = (float) i;
        float A022 = (float) A02(r11);
        matrix.reset();
        float f2 = this.A02;
        float min = Math.min(Math.min(width / f, f2), Math.min(height / A022, f2));
        Matrix matrix2 = new Matrix();
        if (!(r11.A01 == null || (bitmap = r11.A00) == null)) {
            int i3 = 0;
            int width2 = bitmap.getWidth() / 2;
            Bitmap bitmap3 = r11.A00;
            if (bitmap3 != null) {
                i3 = bitmap3.getHeight();
            }
            matrix2.preTranslate(-((float) width2), -((float) (i3 / 2)));
            matrix2.postConcat(r11.A01);
            Bitmap bitmap4 = r11.A00;
            if (bitmap4 == null) {
                i2 = 0;
            } else if (AnonymousClass4MX.A00(r11)) {
                i2 = bitmap4.getHeight();
            } else {
                i2 = bitmap4.getWidth();
            }
            matrix2.postTranslate(((float) i2) / 2.0f, ((float) A02(r11)) / 2.0f);
        }
        matrix.postConcat(matrix2);
        matrix.postScale(min, min);
        matrix.postTranslate((width - (f * min)) / 2.0f, (height - (A022 * min)) / 2.0f);
    }

    private void setImageBitmap(Bitmap bitmap, Matrix matrix) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            drawable.setFilterBitmap(true);
        }
        AnonymousClass4MX r0 = this.A07;
        r0.A00 = bitmap;
        r0.A01 = matrix;
    }

    public void A07(AnonymousClass4MX r6, boolean z) {
        int width;
        float max;
        if (getWidth() <= 0) {
            this.A04 = new AnonymousClass7RF(this, r6, 39, z);
            return;
        }
        Bitmap bitmap = r6.A00;
        Matrix matrix = this.A09;
        if (bitmap != null) {
            A03(matrix, r6);
            setImageBitmap(r6.A00, r6.A01);
        } else {
            matrix.reset();
            super.setImageBitmap((Bitmap) null);
        }
        if (z) {
            this.A0B.reset();
        }
        setImageMatrix(getImageViewMatrix());
        AnonymousClass4MX r4 = this.A07;
        Bitmap bitmap2 = r4.A00;
        if (bitmap2 == null) {
            max = 1.0f;
        } else {
            if (AnonymousClass4MX.A00(r4)) {
                width = bitmap2.getHeight();
            } else {
                width = bitmap2.getWidth();
            }
            max = Math.max(1.0f, Math.max(((float) width) / ((float) this.A01), ((float) A02(r4)) / ((float) this.A00)) * 4.0f);
        }
        this.A05 = max;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A01 = i3 - i;
        this.A00 = i4 - i2;
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.A04 = null;
            runnable.run();
        }
        AnonymousClass4MX r1 = this.A07;
        if (r1.A00 != null) {
            A03(this.A09, r1);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void setMaxProperScale(float f) {
        this.A02 = f;
    }

    public void setRecycler(C106805Xg r1) {
        this.A03 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4MX, java.lang.Object] */
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
            return;
        }
        ? obj = new Object();
        obj.A00 = bitmap;
        A07(obj, true);
    }
}
