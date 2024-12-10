package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.4ai  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C88744ai implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C80053wT A05;
    public final /* synthetic */ boolean A06;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A00;
        int i2 = this.A01;
        C80053wT r4 = this.A05;
        int i3 = this.A02;
        boolean z = this.A06;
        int i4 = this.A03;
        int i5 = this.A04;
        int A002 = (int) ((((float) i) * C72483Me.A00(valueAnimator, 7)) + ((float) i2));
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(r4);
        A0P.width = A002;
        int i6 = i3 - A002;
        int i7 = A0P.topMargin;
        int i8 = A0P.bottomMargin;
        if (z) {
            A0P.setMargins(i6, i7, i4, i8);
            int i9 = r4.A00;
            r4.setPadding(i9 - Math.min(i6, 0), i9, i9, i9);
        } else {
            A0P.setMargins(i5, i7, i6, i8);
            int i10 = r4.A00;
            r4.setPadding(i10, i10, i10 - Math.min(i6, 0), i10);
        }
        r4.setLayoutParams(A0P);
    }

    public /* synthetic */ C88744ai(C80053wT r1, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A05 = r1;
        this.A02 = i3;
        this.A06 = z;
        this.A03 = i4;
        this.A04 = i5;
    }
}
