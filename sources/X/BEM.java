package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

public class BEM extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ C26147CtC A04;

    public BEM(TextView textView, TextView textView2, C26147CtC ctC, int i, int i2) {
        this.A04 = ctC;
        this.A01 = i;
        this.A02 = textView;
        this.A00 = i2;
        this.A03 = textView2;
    }

    public void onAnimationEnd(Animator animator) {
        TextView textView;
        C26147CtC ctC = this.A04;
        ctC.A00 = this.A01;
        ctC.A05 = null;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.A00 == 1 && (textView = ctC.A0A) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.A03;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            textView3.setAlpha(1.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
