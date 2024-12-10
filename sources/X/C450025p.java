package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.25p  reason: invalid class name and case insensitive filesystem */
public class C450025p extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass1YV A00;
    public final /* synthetic */ boolean A01;

    public C450025p(AnonymousClass1YV r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass1YV r2 = this.A00;
        int[] iArr = AnonymousClass1YV.A0R;
        r2.A04 = 0;
        r2.A07 = null;
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass1YV r3 = this.A00;
        r3.A0I.A03(0, this.A01);
        r3.A04 = 2;
        r3.A07 = animator;
    }
}
