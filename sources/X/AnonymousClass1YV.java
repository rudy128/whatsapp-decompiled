package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.1YV  reason: invalid class name */
public abstract class AnonymousClass1YV {
    public static final TimeInterpolator A0O = AnonymousClass1YW.A01;
    public static final int[] A0P = new int[0];
    public static final int[] A0Q = {16842910};
    public static final int[] A0R = {16842908, 16842910};
    public static final int[] A0S = {16843623, 16842910};
    public static final int[] A0T = {16843623, 16842908, 16842910};
    public static final int[] A0U = {16842919, 16842910};
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public Animator A07;
    public Drawable A08;
    public Drawable A09;
    public C27991Yk A0A;
    public C27991Yk A0B;
    public AnonymousClass1ZB A0C;
    public C27801Xq A0D;
    public C28011Ym A0E;
    public boolean A0F;
    public boolean A0G = true;
    public final Matrix A0H = new Matrix();
    public final AnonymousClass1YQ A0I;
    public final AnonymousClass1YZ A0J;
    public final Rect A0K = new Rect();
    public final RectF A0L = new RectF();
    public final RectF A0M = new RectF();
    public final C27911Yc A0N;

    public abstract void A05();

    public abstract void A06(float f, float f2, float f3);

    public static AnimatorSet A00(C27991Yk r9, AnonymousClass1YV r10, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass1YQ r6 = r10.A0I;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r6, View.ALPHA, new float[]{f});
        r9.A03("opacity").A00(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r6, View.SCALE_X, new float[]{f2});
        r9.A03("scale").A00(ofFloat2);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat2.setEvaluator(new C64112uF(r10));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r6, View.SCALE_Y, new float[]{f2});
        r9.A03("scale").A00(ofFloat3);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat3.setEvaluator(new C64112uF(r10));
        }
        arrayList.add(ofFloat3);
        Matrix matrix = r10.A0H;
        A03(matrix, r10, f3);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(r6, new AnonymousClass272(), new C64132uH(r10), new Matrix[]{new Matrix(matrix)});
        r9.A03("iconScale").A00(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnonymousClass2SX.A00(animatorSet, arrayList);
        return animatorSet;
    }

    public static AnimatorSet A01(AnonymousClass1YV r13, float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        AnonymousClass1YV r7 = r13;
        AnonymousClass1YQ r3 = r13.A0I;
        ofFloat.addUpdateListener(new C64162uK(new Matrix(r7.A0H), r7, r3.getAlpha(), f, r3.getScaleX(), f2, r3.getScaleY(), r13.A02, f3));
        arrayList.add(ofFloat);
        AnonymousClass2SX.A00(animatorSet, arrayList);
        animatorSet.setDuration((long) AnonymousClass1Z9.A00(r3.getContext(), i, r3.getContext().getResources().getInteger(2131492904)));
        animatorSet.setInterpolator(C29101bc.A01(AnonymousClass1YW.A02, r3.getContext(), i2));
        return animatorSet;
    }

    public static ValueAnimator A02(C27931Ye r3) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(A0O);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(r3);
        valueAnimator.addUpdateListener(r3);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (X.AnonymousClass1YQ.A00(r1, r1.A01) >= r13.A06) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r7 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r13 = this;
            android.graphics.Rect r6 = r13.A0K
            r13.A08(r6)
            android.graphics.drawable.Drawable r1 = r13.A08
            java.lang.String r0 = "Didn't initialize content background"
            X.C28111Yx.A03(r1, r0)
            X.1YZ r0 = r13.A0J
            X.1Ya r0 = (X.C27891Ya) r0
            X.1YQ r5 = r0.A00
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0044
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x0026
            X.1YQ r1 = r13.A0I
            int r0 = r1.A01
            int r1 = X.AnonymousClass1YQ.A00(r1, r0)
            int r0 = r13.A06
            if (r1 < r0) goto L_0x0044
        L_0x0026:
            android.graphics.drawable.Drawable r7 = r13.A08
            if (r7 == 0) goto L_0x002d
        L_0x002a:
            X.AnonymousClass1YV.super.setBackgroundDrawable(r7)
        L_0x002d:
            int r4 = r6.left
            int r3 = r6.top
            int r2 = r6.right
            int r1 = r6.bottom
            android.graphics.Rect r0 = r5.A0C
            r0.set(r4, r3, r2, r1)
            int r0 = r5.A00
            int r4 = r4 + r0
            int r3 = r3 + r0
            int r2 = r2 + r0
            int r1 = r1 + r0
            r5.setPadding(r4, r3, r2, r1)
            return
        L_0x0044:
            android.graphics.drawable.Drawable r8 = r13.A08
            int r9 = r6.left
            int r10 = r6.top
            int r11 = r6.right
            int r12 = r6.bottom
            android.graphics.drawable.InsetDrawable r7 = new android.graphics.drawable.InsetDrawable
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YV.A04():void");
    }

    public void A07(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable != null) {
            C27831Xu.A04(AnonymousClass1ZD.A02(colorStateList), drawable);
        }
    }

    public void A08(Rect rect) {
        int i;
        float f;
        if (this.A0F) {
            int i2 = this.A06;
            AnonymousClass1YQ r1 = this.A0I;
            i = (i2 - AnonymousClass1YQ.A00(r1, r1.A01)) / 2;
        } else {
            i = 0;
        }
        if (this.A0G) {
            f = this.A0I.getElevation() + this.A03;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil((double) f));
        int max2 = Math.max(i, (int) Math.ceil((double) (f * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public final void A09(C28011Ym r3) {
        this.A0E = r3;
        C27801Xq r0 = this.A0D;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
        Drawable drawable = this.A09;
        if (drawable instanceof AnonymousClass1Xp) {
            ((AnonymousClass1Xp) drawable).setShapeAppearanceModel(r3);
        }
        AnonymousClass1ZB r02 = this.A0C;
        if (r02 != null) {
            r02.A07 = r3;
            r02.invalidateSelf();
        }
    }

    public AnonymousClass1YV(AnonymousClass1YQ r4, AnonymousClass1YZ r5) {
        this.A0I = r4;
        this.A0J = r5;
        C27911Yc r2 = new C27911Yc();
        this.A0N = r2;
        r2.A00(A02(new C27941Yf(this)), A0U);
        r2.A00(A02(new C27961Yh(this)), A0T);
        r2.A00(A02(new C27961Yh(this)), A0R);
        r2.A00(A02(new C27961Yh(this)), A0S);
        r2.A00(A02(new C27971Yi(this)), A0Q);
        r2.A00(A02(new C27981Yj(this)), A0P);
        r4.getRotation();
    }

    public static void A03(Matrix matrix, AnonymousClass1YV r6, float f) {
        matrix.reset();
        Drawable drawable = r6.A0I.getDrawable();
        if (drawable != null && r6.A05 != 0) {
            RectF rectF = r6.A0L;
            RectF rectF2 = r6.A0M;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) r6.A05;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) r6.A05) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }
}
