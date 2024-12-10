package X;

import android.animation.Animator;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaTextView;

/* renamed from: X.2uB  reason: invalid class name and case insensitive filesystem */
public final class C64072uB implements Animator.AnimatorListener {
    public Integer A00 = AnonymousClass00R.A00;
    public Runnable A01;
    public final View A02;
    public final LottieAnimationView A03;
    public final WaTextView A04;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
        this.A01 = null;
    }

    public C64072uB(View view) {
        this.A02 = view;
        View findViewById = view.findViewById(2131432202);
        C18070vi.A0X(findViewById);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById;
        this.A03 = lottieAnimationView;
        View findViewById2 = view.findViewById(2131432201);
        C18070vi.A0X(findViewById2);
        WaTextView waTextView = (WaTextView) findViewById2;
        this.A04 = waTextView;
        lottieAnimationView.setAnimation(2132017161);
        lottieAnimationView.A09.A0d.addListener(this);
        C42491yG.A02(view);
        AnonymousClass1Y5.A07(view, "Button");
        C43421zm.A04(waTextView);
        waTextView.setTextColor(C19740yt.A03(waTextView.getContext(), 2131102479));
    }
}
