package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.calling.callgrid.view.PipViewContainer;

/* renamed from: X.74i  reason: invalid class name and case insensitive filesystem */
public class C1411174i implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public final int A02 = 0;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;

    public C1411174i(ViewGroup.LayoutParams layoutParams, AnonymousClass71R r3, int i, int i2, int i3, int i4) {
        this.A05 = r3;
        this.A06 = layoutParams;
        this.A03 = i;
        this.A04 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        if (this.A02 != 0) {
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.A06;
            int i3 = this.A03;
            int i4 = this.A04;
            int i5 = this.A00;
            int i6 = this.A01;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float f = 1.0f - animatedFraction;
            layoutParams.width = (int) ((((float) i3) * animatedFraction) + (((float) i4) * f));
            layoutParams.height = (int) ((animatedFraction * ((float) i5)) + (f * ((float) i6)));
            ((AnonymousClass71R) this.A05).A04.setLayoutParams(layoutParams);
            return;
        }
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        PipViewContainer pipViewContainer = (PipViewContainer) this.A06;
        ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(pipViewContainer);
        C18000vb r6 = pipViewContainer.A0C;
        C17960vV.A07(r6);
        if (animatedFraction2 == 0.0f) {
            this.A01 = A0B.topMargin;
            if (AnonymousClass3MY.A1b(r6)) {
                i2 = A0B.leftMargin;
            } else {
                i2 = A0B.rightMargin;
            }
            this.A00 = i2;
            pipViewContainer.getWidth();
            pipViewContainer.getHeight();
        }
        View view = (View) this.A05;
        int i7 = ((int) (((float) this.A04) * animatedFraction2)) + this.A00;
        int i8 = A0B.topMargin;
        if (AnonymousClass3MY.A1b(r6)) {
            i = A0B.rightMargin;
        } else {
            i = A0B.leftMargin;
        }
        C27641Ww.A06(view, r6, i7, i8, i, A0B.bottomMargin);
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(pipViewContainer);
        A0B2.topMargin = this.A01 + ((int) (((float) this.A03) * animatedFraction2));
        pipViewContainer.setLayoutParams(A0B2);
    }

    public C1411174i(View view, PipViewContainer pipViewContainer, int i, int i2) {
        this.A06 = pipViewContainer;
        this.A05 = view;
        this.A04 = i;
        this.A03 = i2;
    }
}
