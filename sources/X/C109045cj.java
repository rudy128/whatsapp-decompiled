package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.5cj  reason: invalid class name and case insensitive filesystem */
public class C109045cj extends AnimatorListenerAdapter {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C109045cj(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        switch (this.A00) {
            case 1:
                ((MessageReplyActivity) this.A02).A07.setBackgroundColor(this.A01);
                return;
            case 2:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                TextStatusComposerFragment textStatusComposerFragment = (TextStatusComposerFragment) this.A02;
                ViewGroup viewGroup = textStatusComposerFragment.A05;
                if (viewGroup != null) {
                    viewGroup.clearAnimation();
                }
                ViewGroup viewGroup2 = textStatusComposerFragment.A05;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(this.A01);
                }
                if (this.A01 == 0) {
                    ScrollView scrollView = textStatusComposerFragment.A07;
                    if (scrollView != null) {
                        scrollView.post(AnonymousClass7RI.A00(textStatusComposerFragment, 13));
                        return;
                    }
                    return;
                }
                ViewGroup viewGroup3 = textStatusComposerFragment.A05;
                if (viewGroup3 != null) {
                    layoutParams = viewGroup3.getLayoutParams();
                    if (layoutParams != null) {
                        if (layoutParams.height != -2) {
                            layoutParams.width = -1;
                            layoutParams.height = -2;
                        } else {
                            return;
                        }
                    }
                } else {
                    layoutParams = null;
                }
                ViewGroup viewGroup4 = textStatusComposerFragment.A05;
                if (viewGroup4 != null) {
                    viewGroup4.setLayoutParams(layoutParams);
                }
                ViewGroup viewGroup5 = textStatusComposerFragment.A05;
                if (viewGroup5 != null) {
                    viewGroup5.requestLayout();
                    return;
                }
                return;
            default:
                View view = (View) this.A02;
                C42491yG.A07(view, this.A01);
                view.setAlpha(1.0f);
                return;
        }
    }
}
