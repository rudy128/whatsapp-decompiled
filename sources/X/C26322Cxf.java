package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* renamed from: X.Cxf  reason: case insensitive filesystem */
public class C26322Cxf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C26568D4i A02;
    public final /* synthetic */ C25972Cpf A03;
    public final /* synthetic */ AnonymousClass1HO A04;
    public final /* synthetic */ AnonymousClass1HO A05;

    public C26322Cxf(View view, C26568D4i d4i, C25972Cpf cpf, AnonymousClass1HO r4, AnonymousClass1HO r5, int i) {
        this.A02 = d4i;
        this.A03 = cpf;
        this.A05 = r4;
        this.A04 = r5;
        this.A00 = i;
        this.A01 = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C25972Cpf cpf = this.A03;
        cpf.A00.A08(valueAnimator.getAnimatedFraction());
        AnonymousClass1HO r7 = this.A05;
        AnonymousClass1HO r12 = this.A04;
        float A052 = cpf.A00.A05();
        int i = this.A00;
        Interpolator interpolator = C22672BJn.A00;
        C28171Zd r5 = new C28171Zd(r7);
        int i2 = 1;
        do {
            int i3 = i & i2;
            C33321id A07 = r7.A07(i2);
            if (i3 != 0) {
                C33321id A072 = r12.A07(i2);
                float f = 1.0f - A052;
                A07 = AnonymousClass1HO.A00(A07, (int) (((double) (((float) (A07.A01 - A072.A01)) * f)) + 0.5d), (int) (((double) (((float) (A07.A03 - A072.A03)) * f)) + 0.5d), (int) (((double) (((float) (A07.A02 - A072.A02)) * f)) + 0.5d), (int) (((double) (((float) (A07.A00 - A072.A00)) * f)) + 0.5d));
            }
            r5.A00.A07(A07, i2);
            i2 <<= 1;
        } while (i2 <= 256);
        C22672BJn.A04(this.A01, r5.A00(), Collections.singletonList(cpf));
    }
}
