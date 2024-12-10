package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.5eR  reason: invalid class name and case insensitive filesystem */
public class C109945eR extends View implements AnonymousClass009 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public Bitmap A0P;
    public Bitmap A0Q;
    public Bitmap A0R;
    public Matrix A0S;
    public Paint A0T;
    public Paint A0U;
    public Paint A0V;
    public Paint A0W;
    public RectF A0X;
    public RectF A0Y;
    public C18000vb A0Z;
    public AnonymousClass031 A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public int A0e;
    public int A0f;
    public AnimatorSet A0g;

    public void setPercentageLocked(float f) {
        C17960vV.A0G(AnonymousClass000.A1Q((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))), "Percentage must be >= 0.0");
        float min = Math.min(1.0f, f);
        if (this.A09 != min) {
            this.A09 = min;
            float f2 = (float) (this.A0M - this.A0I);
            float height = ((float) this.A0R.getHeight()) * 0.39f;
            this.A0e = 255 - ((int) (C108945cZ.A01(min, 0.65f, 1.0f) * 255.0f));
            int i = this.A0M;
            this.A0f = Math.min(i, Math.max((int) (((float) i) - (f2 * min)), this.A0I));
            setTranslationY((-f2) * Math.min(min, 1.0f));
            if (min >= 0.15f) {
                if (this.A0c) {
                    A04();
                    this.A01 = this.A0B;
                    this.A00 = this.A0A;
                }
                float min2 = Math.min(1.0f, min);
                this.A03 = (min2 * 2.5f) - 1.75f;
                this.A02 = this.A0C - (height * min2);
                postInvalidate();
                invalidateOutline();
            } else if (this.A0d && !this.A0c) {
                A01(this);
            }
        }
    }

    public static void A00(C109945eR r4) {
        r4.A01 = r4.A0B;
        r4.A00 = r4.A06;
        r4.A04 = r4.A08;
        r4.A02 = r4.A07;
        r4.A0K = 0;
        r4.A0f = r4.A0M;
        r4.A0e = 255;
        r4.A09 = 0.0f;
        r4.setTranslationY(0.0f);
        C108975cc.A0s(r4);
        int i = r4.A0L;
        if (i == 1 || i == 2) {
            r4.setTranslationX((float) r4.A0H);
        }
        r4.A0W.setColorFilter(new PorterDuffColorFilter(r4.A0O, PorterDuff.Mode.SRC_IN));
        if (r4.getMeasuredHeight() != 0 && r4.getMeasuredWidth() != 0) {
            r4.setPivotY((float) (r4.getMeasuredHeight() / 2));
            r4.setPivotX((float) (r4.getMeasuredWidth() / 2));
        }
    }

    public static void A01(C109945eR r6) {
        if (!r6.A0c) {
            r6.A0g = C108945cZ.A0B();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(800);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            C108955ca.A1A(ofFloat);
            C1411074h.A00(ofFloat, r6, 39);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(400);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setInterpolator(new AccelerateInterpolator());
            C1411074h.A00(ofFloat2, r6, 40);
            AnimatorSet animatorSet = r6.A0g;
            Animator[] animatorArr = new Animator[2];
            AnonymousClass001.A1Q(ofFloat, ofFloat2, animatorArr);
            animatorSet.playTogether(animatorArr);
            C109195cy.A02(r6.A0g, r6, 38);
            r6.A0g.start();
        }
    }

    public static void A02(C109945eR r3, Runnable runnable, long j) {
        if (!r3.A0d) {
            float[] A1V = C108945cZ.A1V();
            // fill-array-data instruction
            A1V[0] = 0;
            A1V[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
            ofFloat.setDuration(j);
            C108955ca.A1A(ofFloat);
            C1411074h.A00(ofFloat, r3, 41);
            ofFloat.addListener(new C109105cp(r3, runnable, 6));
            ofFloat.start();
        }
    }

    public void A03() {
        if (this.A0d) {
            A04();
            int alpha = (int) (getAlpha() * 200.0f);
            animate().setListener((Animator.AnimatorListener) null).cancel();
            C108985cd.A0F(this).setDuration((long) alpha).setListener(new C109195cy(this, 39)).start();
        }
    }

    public void A04() {
        if (this.A0c) {
            AnimatorSet animatorSet = this.A0g;
            if (animatorSet != null) {
                animatorSet.end();
                this.A0g.removeAllListeners();
            }
            this.A0g = null;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0a;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0a = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A0I, (int) (((float) this.A0M) + this.A05));
    }

    public int getCollapsedHeightPx() {
        return this.A0I;
    }

    public int getExpandedHeightPx() {
        return this.A0M;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A0U.setAlpha(this.A0K);
        RectF rectF = this.A0X;
        rectF.left = 0.0f;
        float f = (float) ((int) this.A01);
        rectF.top = f;
        rectF.right = 0.0f + ((float) this.A0I);
        rectF.bottom = f + ((float) this.A0f);
        float f2 = (float) this.A0J;
        canvas.drawRoundRect(rectF, f2, f2, this.A0U);
        float A002 = C108955ca.A00(this);
        this.A0S.setTranslate(A002 - ((float) (this.A0R.getWidth() / 2)), this.A04);
        this.A0S.postRotate(this.A03, (float) (this.A0R.getWidth() / 2), (float) this.A0R.getHeight());
        canvas.drawBitmap(this.A0R, this.A0S, this.A0W);
        Bitmap bitmap = this.A0Q;
        canvas.drawBitmap(bitmap, A002 - ((float) (bitmap.getWidth() / 2)), this.A02, this.A0W);
        this.A0T.setAlpha(this.A0e);
        Bitmap bitmap2 = this.A0P;
        canvas.drawBitmap(bitmap2, A002 - ((float) (bitmap2.getWidth() / 2)), this.A00, this.A0T);
    }
}
