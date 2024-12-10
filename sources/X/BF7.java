package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class BF7 extends Drawable {
    public ValueAnimator A00;
    public CUR A01;
    public final ValueAnimator.AnimatorUpdateListener A02 = new C26323Cxg(this, 5);
    public final Matrix A03;
    public final Paint A04;
    public final Rect A05;

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void A01() {
        CUR cur;
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && (cur = this.A01) != null && cur.A0G && getCallback() != null) {
            this.A00.start();
        }
    }

    public void A02(CUR cur) {
        boolean z;
        PorterDuff.Mode mode;
        this.A01 = cur;
        if (cur != null) {
            Paint paint = this.A04;
            if (cur.A0F) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            C108965cb.A11(paint, mode);
        }
        A00();
        if (this.A01 != null) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.A00.cancel();
                this.A00.removeAllUpdateListeners();
            } else {
                z = false;
            }
            float[] A1V = C108945cZ.A1V();
            A1V[0] = 0.0f;
            CUR cur2 = this.A01;
            A1V[1] = ((float) (cur2.A0E / cur2.A0D)) + 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
            this.A00 = ofFloat;
            ofFloat.setRepeatMode(this.A01.A0B);
            this.A00.setRepeatCount(this.A01.A0A);
            ValueAnimator valueAnimator2 = this.A00;
            CUR cur3 = this.A01;
            valueAnimator2.setDuration(cur3.A0D + cur3.A0E);
            this.A00.addUpdateListener(this.A02);
            if (z) {
                this.A00.start();
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        if (this.A01 != null) {
            Paint paint = this.A04;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians((double) this.A01.A03));
                Rect rect = this.A05;
                float height = ((float) rect.height()) + (BE6.A02(rect) * tan);
                float A022 = BE6.A02(rect) + (tan * ((float) rect.height()));
                ValueAnimator valueAnimator = this.A00;
                float f3 = 0.0f;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i = this.A01.A06;
                if (i != 1) {
                    if (i == 2) {
                        f3 = A022 + (((-A022) - A022) * f);
                    } else if (i != 3) {
                        float f4 = -A022;
                        f3 = f4 + ((A022 - f4) * f);
                    } else {
                        f2 = height + (((-height) - height) * f);
                    }
                    f2 = 0.0f;
                } else {
                    float f5 = -height;
                    f2 = f5 + ((height - f5) * f);
                }
                Matrix matrix = this.A03;
                matrix.reset();
                matrix.setRotate(this.A01.A03, BE6.A02(rect) / 2.0f, ((float) rect.height()) / 2.0f);
                matrix.postTranslate(f3, f2);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    public int getOpacity() {
        CUR cur = this.A01;
        if (cur == null) {
            return -1;
        }
        if (cur.A0H || cur.A0F) {
            return -3;
        }
        return -1;
    }

    public BF7() {
        Paint A06 = AnonymousClass3MW.A06();
        this.A04 = A06;
        this.A05 = AnonymousClass3MW.A07();
        this.A03 = C108945cZ.A0J();
        A06.setAntiAlias(true);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r12 = this;
            android.graphics.Rect r1 = r12.getBounds()
            int r0 = r1.width()
            int r6 = r1.height()
            if (r0 == 0) goto L_0x004b
            if (r6 == 0) goto L_0x004b
            X.CUR r3 = r12.A01
            if (r3 == 0) goto L_0x004b
            int r5 = r3.A08
            if (r5 > 0) goto L_0x001f
            float r1 = r3.A04
            float r0 = (float) r0
            int r5 = X.BE6.A04(r1, r0)
        L_0x001f:
            int r4 = r3.A07
            if (r4 > 0) goto L_0x002a
            float r1 = r3.A01
            float r0 = (float) r6
            int r4 = X.BE6.A04(r1, r0)
        L_0x002a:
            int r1 = r3.A0C
            r0 = 1
            if (r1 == r0) goto L_0x004e
            int r1 = r3.A06
            if (r1 == r0) goto L_0x004c
            r0 = 3
            if (r1 == r0) goto L_0x004c
            r4 = 0
        L_0x0037:
            float r6 = (float) r5
            float r7 = (float) r4
            int[] r8 = r3.A0K
            float[] r9 = r3.A0J
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r4 = 0
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0046:
            android.graphics.Paint r0 = r12.A04
            r0.setShader(r3)
        L_0x004b:
            return
        L_0x004c:
            r5 = 0
            goto L_0x0037
        L_0x004e:
            float r6 = (float) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r0
            float r7 = (float) r4
            float r7 = r7 / r0
            int r0 = java.lang.Math.max(r5, r4)
            double r0 = (double) r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.sqrt(r4)
            double r0 = r0 / r4
            float r8 = (float) r0
            int[] r9 = r3.A0K
            float[] r10 = r3.A0J
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BF7.A00():void");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A05.set(0, 0, rect.width(), rect.height());
        A00();
        A01();
    }
}
