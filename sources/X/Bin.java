package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;

public class Bin extends C25277CcZ {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public EditText A02;
    public final int A03;
    public final int A04;
    public final TimeInterpolator A05;
    public final TimeInterpolator A06;
    public final View.OnClickListener A07 = new AFE(this, 15);
    public final View.OnFocusChangeListener A08 = new C26575D4p(this, 3);

    public static void A00(Bin bin, boolean z) {
        Animator animator;
        boolean A0B = bin.A02.A0B();
        boolean A1T = AnonymousClass000.A1T(A0B ? 1 : 0, z ? 1 : 0);
        AnimatorSet animatorSet = bin.A00;
        if (!z) {
            animatorSet.cancel();
            bin.A01.start();
            if (A1T) {
                animator = bin.A01;
            } else {
                return;
            }
        } else if (!animatorSet.isRunning()) {
            bin.A01.cancel();
            bin.A00.start();
            if (A1T) {
                animator = bin.A00;
            } else {
                return;
            }
        } else {
            return;
        }
        animator.end();
    }

    public static boolean A01(Bin bin) {
        EditText editText = bin.A02;
        if (editText == null || ((!editText.hasFocus() && !bin.A01.hasFocus()) || bin.A02.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    public Bin(BIm bIm) {
        super(bIm);
        this.A03 = AnonymousClass1Z9.A00(bIm.getContext(), 2130970541, 100);
        this.A04 = AnonymousClass1Z9.A00(bIm.getContext(), 2130970541, 150);
        this.A05 = C29101bc.A01(AnonymousClass1YW.A03, bIm.getContext(), 2130970550);
        this.A06 = C29101bc.A01(AnonymousClass1YW.A04, bIm.getContext(), 2130970548);
    }
}
