package X;

import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: X.4pn  reason: invalid class name and case insensitive filesystem */
public final class C97634pn implements C108395bd {
    public int A00;
    public int A01 = 1;
    public final LottieAnimationView A02;
    public final LottieAnimationView A03;
    public final FrameLayout A04;

    public C97634pn(FrameLayout frameLayout) {
        this.A04 = frameLayout;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(frameLayout.getContext());
        A00(lottieAnimationView, 2132017242);
        frameLayout.addView(lottieAnimationView);
        this.A03 = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = new LottieAnimationView(frameLayout.getContext());
        A00(lottieAnimationView2, 2132017232);
        frameLayout.addView(lottieAnimationView2);
        this.A02 = lottieAnimationView2;
        this.A00 = 2131099872;
        BhF(1);
    }

    private final void A00(LottieAnimationView lottieAnimationView, int i) {
        lottieAnimationView.setVisibility(8);
        AnonymousClass3MZ.A1E(lottieAnimationView, -1, 17);
        lottieAnimationView.setAnimation(i);
        D7a d7a = new D7a(lottieAnimationView, this);
        if (lottieAnimationView.A01 != null) {
            d7a.BpV();
        }
        lottieAnimationView.A0A.add(d7a);
    }

    public void BhF(int i) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        this.A01 = i;
        if (i == 1) {
            lottieAnimationView = this.A02;
            lottieAnimationView2 = this.A03;
        } else {
            lottieAnimationView = this.A03;
            lottieAnimationView2 = this.A02;
        }
        lottieAnimationView2.setVisibility(8);
        lottieAnimationView2.A03();
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setProgress(1.0f);
    }

    public void CBk(int i) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        if (i != this.A01) {
            this.A01 = i;
            if (i == 1) {
                lottieAnimationView = this.A02;
                lottieAnimationView2 = this.A03;
            } else {
                lottieAnimationView = this.A03;
                lottieAnimationView2 = this.A02;
            }
            lottieAnimationView2.setVisibility(8);
            lottieAnimationView2.A03();
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.A04();
        }
    }

    public int getTint() {
        return this.A00;
    }

    public void setTint(int i) {
        this.A00 = i;
    }
}
