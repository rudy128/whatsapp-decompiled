package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4ad  reason: invalid class name and case insensitive filesystem */
public class C88694ad implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C88694ad(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(valueAnimator, 0);
                int A022 = C72473Md.A02(valueAnimator);
                AnonymousClass3Re r1 = (AnonymousClass3Re) this.A02;
                r1.A00 = AnonymousClass000.A1T(A022, this.A01);
                C88694ad.super.setProgress(A022);
                return;
            case 1:
                int i = this.A01;
                view = (View) this.A02;
                C18070vi.A0d(valueAnimator, 2);
                int A023 = C72473Md.A02(valueAnimator);
                if (A023 != i) {
                    C18070vi.A0b(view);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginEnd(A023);
                        marginLayoutParams.setMarginStart(A023);
                        break;
                    } else {
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    return;
                }
            default:
                int i2 = this.A01;
                view = (View) this.A02;
                C18070vi.A0d(valueAnimator, 2);
                int A024 = C72473Md.A02(valueAnimator);
                if (A024 != i2) {
                    C18070vi.A0b(view);
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.topMargin = A024;
                        break;
                    } else {
                        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    return;
                }
        }
        view.setLayoutParams(marginLayoutParams);
    }
}
