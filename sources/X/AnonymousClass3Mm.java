package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.3Mm  reason: invalid class name */
public class AnonymousClass3Mm extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass3Mm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A03 = obj;
    }

    public void A00(View view) {
        if (view != null) {
            view.animate().setDuration(250).alpha(1.0f).translationY(0.0f).setInterpolator((TimeInterpolator) this.A04).setListener(new AnonymousClass3Mo(this, 22));
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (2 - this.A00 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        super.onAnimationCancel(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = ((C90654eQ) this.A01).A04;
        solidColorWallpaperPreview.A05.setBackgroundColor(solidColorWallpaperPreview.getResources().getColor(C72473Md.A06(solidColorWallpaperPreview.A05)));
        solidColorWallpaperPreview.A0A = false;
        solidColorWallpaperPreview.A09.setScrollEnabled(true);
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                View view = (View) this.A01;
                C87434Vo.A00(view);
                View view2 = (View) this.A02;
                C87434Vo.A00(view2);
                View[] viewArr = new View[2];
                viewArr[0] = view;
                C87434Vo.A01(C18070vi.A0O(view2, viewArr, 1));
                view.clearAnimation();
                view2.clearAnimation();
                ((Animator) this.A03).start();
                return;
            case 1:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                ((View) this.A02).clearAnimation();
                return;
            default:
                super.onAnimationEnd(animator);
                ((C90654eQ) this.A01).A04.A06.animate().setDuration(250).alpha(1.0f).setInterpolator((TimeInterpolator) this.A04);
                A00((View) this.A02);
                A00((View) this.A03);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(animator, 0);
                super.onAnimationStart(animator);
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.A04;
                if (transitionDrawable != null) {
                    transitionDrawable.startTransition(500);
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(animator, 0);
                super.onAnimationStart(animator);
                ((View) this.A02).setAlpha(0.0f);
                ((View) this.A03).setVisibility(0);
                ((View) this.A01).setVisibility(0);
                ((View) this.A04).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
