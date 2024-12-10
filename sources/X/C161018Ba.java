package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.8Ba  reason: invalid class name and case insensitive filesystem */
public class C161018Ba extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public C161018Ba(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.A01;
                viewGroup.removeAllViews();
                ViewParent parent = viewGroup.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewGroup);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                AnonymousClass3MW.A1S(((C1776299t) this.A01).A05);
                return;
            default:
                super.onAnimationEnd(animator);
                C1776299t r2 = (C1776299t) this.A01;
                r2.A06.setQueryHint(C1776299t.A0H);
                AnonymousClass3MW.A1S(r2.A04);
                r2.A04.setAlpha(0.0f);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 1:
                super.onAnimationStart(animator);
                C1776299t r2 = (C1776299t) this.A01;
                r2.A05.setAlpha(1.0f);
                r2.A05.setText(C1776299t.A0F);
                r2.A06.setQueryHint("");
                return;
            case 2:
                super.onAnimationStart(animator);
                ((C1776299t) this.A01).A04.setText(C1776299t.A0H);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
