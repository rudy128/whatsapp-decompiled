package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: X.2uK  reason: invalid class name and case insensitive filesystem */
public class C64162uK implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ Matrix A07;
    public final /* synthetic */ AnonymousClass1YV A08;

    public C64162uK(Matrix matrix, AnonymousClass1YV r2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A08 = r2;
        this.A00 = f;
        this.A05 = f2;
        this.A02 = f3;
        this.A06 = f4;
        this.A03 = f5;
        this.A01 = f6;
        this.A04 = f7;
        this.A07 = matrix;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A042 = AnonymousClass000.A04(valueAnimator.getAnimatedValue());
        AnonymousClass1YV r4 = this.A08;
        AnonymousClass1YQ r3 = r4.A0I;
        r3.setAlpha(AnonymousClass1YW.A00(this.A00, this.A05, 0.0f, 0.2f, A042));
        float f = this.A02;
        float f2 = this.A06;
        r3.setScaleX(C17880vN.A00(f2, f, A042));
        r3.setScaleY(C17880vN.A00(f2, this.A03, A042));
        float A002 = C17880vN.A00(this.A04, this.A01, A042);
        r4.A02 = A002;
        Matrix matrix = this.A07;
        AnonymousClass1YV.A03(matrix, r4, A002);
        r3.setImageMatrix(matrix);
    }
}
