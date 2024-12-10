package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.3Ml  reason: invalid class name and case insensitive filesystem */
public class C72543Ml extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72543Ml(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onAnimationCancel(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationCancel(animator);
            return;
        }
        C18070vi.A0d(animator, 0);
        animator.removeListener(this);
    }

    public void onAnimationEnd(Animator animator) {
        Integer num;
        switch (this.A00) {
            case 0:
                ((ViewGroup) this.A01).removeView((View) this.A02);
                return;
            case 1:
                ReactionsTrayViewModel reactionsTrayViewModel = ((C73593Wo) this.A02).A06;
                String A13 = AnonymousClass3Ma.A13((TextView) this.A01);
                C18070vi.A0d(A13, 0);
                C41111vp r4 = reactionsTrayViewModel.A0H;
                boolean equals = A13.equals(((C86514Ry) r4.A06()).A00);
                if (equals) {
                    A13 = "";
                }
                AnonymousClass206 r3 = reactionsTrayViewModel.A0M;
                if (r3 != null) {
                    C191569mo r2 = reactionsTrayViewModel.A0E;
                    if (equals) {
                        num = AnonymousClass00R.A0N;
                    } else {
                        num = AnonymousClass00R.A0C;
                    }
                    r2.A00(r3, num, reactionsTrayViewModel.A01);
                }
                reactionsTrayViewModel.A0T(0);
                r4.A0F(new C86514Ry(((C86514Ry) r4.A06()).A00, A13, true));
                return;
            default:
                ((C37961qT) this.A02).A08((C42011xT) this.A01);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
        } else {
            AnonymousClass4a5.A04(((C73593Wo) this.A02).A06.A09);
        }
    }
}
