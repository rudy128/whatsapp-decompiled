package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.25q  reason: invalid class name and case insensitive filesystem */
public class C450125q extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ AnonymousClass1YV A01;
    public final /* synthetic */ boolean A02;

    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public C450125q(AnonymousClass1YV r1, boolean z) {
        this.A01 = r1;
        this.A02 = z;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass1YV r2 = this.A01;
        int[] iArr = AnonymousClass1YV.A0R;
        r2.A04 = 0;
        r2.A07 = null;
        if (!this.A00) {
            AnonymousClass1YQ r22 = r2.A0I;
            boolean z = this.A02;
            int i = 4;
            if (z) {
                i = 8;
            }
            r22.A03(i, z);
        }
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass1YV r3 = this.A01;
        r3.A0I.A03(0, this.A02);
        r3.A04 = 1;
        r3.A07 = animator;
        this.A00 = false;
    }
}
