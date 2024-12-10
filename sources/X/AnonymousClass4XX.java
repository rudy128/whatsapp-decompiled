package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4XX  reason: invalid class name */
public final class AnonymousClass4XX {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public StickerView A03;
    public C28931bI A04;
    public final AnimatorSet A05 = new AnimatorSet();
    public final AnimatorSet A06 = new AnimatorSet();
    public final Handler A07 = C17890vO.A0D();
    public final C26631Sw A08;

    public AnonymousClass4XX(C26631Sw r2) {
        C18070vi.A0d(r2, 1);
        this.A08 = r2;
    }

    public static final AnimatorSet A00(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.4f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.4f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.2f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[3];
        AnonymousClass001.A1Q(ofFloat, ofFloat2, animatorArr);
        animatorArr[2] = ofFloat3;
        animatorSet.playTogether(animatorArr);
        animatorSet.setDuration(350);
        animatorSet.setInterpolator(new OvershootInterpolator(3.0f));
        return animatorSet;
    }

    public final void A01() {
        this.A07.removeCallbacksAndMessages((Object) null);
        AnimatorSet animatorSet = this.A06;
        animatorSet.removeAllListeners();
        animatorSet.end();
        AnimatorSet animatorSet2 = this.A05;
        animatorSet2.removeAllListeners();
        animatorSet2.end();
        AnimatorSet animatorSet3 = this.A01;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
        }
        AnimatorSet animatorSet4 = this.A01;
        if (animatorSet4 != null) {
            animatorSet4.end();
        }
        AnimatorSet animatorSet5 = this.A00;
        if (animatorSet5 != null) {
            animatorSet5.removeAllListeners();
        }
        AnimatorSet animatorSet6 = this.A00;
        if (animatorSet6 != null) {
            animatorSet6.end();
        }
    }
}
