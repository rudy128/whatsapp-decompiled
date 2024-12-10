package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.5cr  reason: invalid class name and case insensitive filesystem */
public class C109125cr extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass70F A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C109125cr(AnonymousClass70F r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public void onAnimationEnd(Animator animator) {
        C160858Af r3 = this.A00.A04;
        if (r3 != null) {
            r3.C75(this.A02, this.A01, false, false);
        }
    }

    public void onAnimationStart(Animator animator) {
        C109945eR r0 = this.A00.A05;
        if (r0 != null) {
            r0.A03();
        }
    }
}
