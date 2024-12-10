package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: X.4Qv  reason: invalid class name and case insensitive filesystem */
public final class C86234Qv {
    public Boolean A00;
    public final View A01;
    public final LinearLayout A02;
    public final RecyclerView A03;
    public final AnonymousClass3US A04;

    public C86234Qv(View view, C19880zA r5, AnonymousClass3US r6) {
        View A0M;
        C18070vi.A0d(view, 1);
        C18070vi.A0k(r6, r5);
        this.A01 = view;
        this.A04 = r6;
        this.A03 = (RecyclerView) AnonymousClass3MX.A0C(view, 2131430390);
        this.A02 = (LinearLayout) AnonymousClass3MX.A0C(view, 2131432700);
        AnonymousClass1HF.A0q(AnonymousClass3MX.A0C(view, 2131432739), true);
        if (r5.A07()) {
            r5.A03();
            throw AnonymousClass000.A0s("isMetaAIForBusinessEnabled");
        }
        if (!C39761tb.A03()) {
            A0M = C72463Mc.A0M(view, 2131432699);
            C18070vi.A0X(A0M);
            ((LottieAnimationView) A0M.findViewById(2131427804)).A04();
        } else {
            A0M = C72463Mc.A0M(view, 2131432737);
            C18070vi.A0z(A0M, "null cannot be cast to non-null type com.whatsapp.WaImageView");
        }
        A0M.setVisibility(0);
        C90584eJ.A00(view.getViewTreeObserver(), this, 4);
    }

    public final void A00(boolean z) {
        AlphaAnimation alphaAnimation;
        RecyclerView recyclerView = this.A03;
        if (AnonymousClass000.A1P(recyclerView.getVisibility()) != z) {
            Boolean bool = this.A00;
            Boolean valueOf = Boolean.valueOf(z);
            if (!C18070vi.A18(bool, valueOf)) {
                this.A00 = valueOf;
                recyclerView.clearAnimation();
                int height = this.A01.getHeight();
                int height2 = recyclerView.getHeight();
                LinearLayout linearLayout = this.A02;
                int height3 = linearLayout.getHeight();
                if (!z) {
                    height3 -= height2;
                }
                float f = (float) ((height - height3) / 2);
                if (linearLayout.getTranslationY() != f) {
                    linearLayout.clearAnimation();
                    linearLayout.animate().translationY(f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(300);
                }
                if (!z) {
                    alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                }
                alphaAnimation.setDuration(300);
                alphaAnimation.setAnimationListener(new C74533bu(this, z));
                recyclerView.startAnimation(alphaAnimation);
            }
        }
    }
}
