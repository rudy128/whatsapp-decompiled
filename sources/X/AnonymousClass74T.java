package X;

import android.animation.Animator;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.74T  reason: invalid class name */
public class AnonymousClass74T implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass74T(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                ((Animator) this.A02).removeAllListeners();
                MessageReplyActivity.A12((MessageReplyActivity) this.A01, C43251zV.A06((int[]) this.A03));
                return;
            default:
                ((Animator) this.A02).removeAllListeners();
                MessageReplyActivity.A11((MessageReplyActivity) this.A01, (C1418377d) this.A03);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                C199029zJ r1 = (C199029zJ) this.A01;
                C25974Cph.A00((C23736Boh) this.A03, r1, (E8A) this.A02);
                return;
            case 1:
                ((Animator) this.A02).removeAllListeners();
                MessageReplyActivity.A12((MessageReplyActivity) this.A01, C43251zV.A06((int[]) this.A03));
                return;
            default:
                ((Animator) this.A02).removeAllListeners();
                MessageReplyActivity.A11((MessageReplyActivity) this.A01, (C1418377d) this.A03);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
