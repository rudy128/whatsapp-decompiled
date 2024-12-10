package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.4Pz  reason: invalid class name and case insensitive filesystem */
public final class C86054Pz {
    public final WeakReference A00;
    public final C18100vl A01;

    public /* synthetic */ C86054Pz(View view) {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, C104765Pk.A00);
        C18070vi.A0j(view, A002);
        this.A01 = A002;
        this.A00 = AnonymousClass3MW.A0z(view);
    }

    public final void A00() {
        C18100vl r2 = this.A01;
        if (((Animator) r2.getValue()).isRunning()) {
            ((ValueAnimator) r2.getValue()).removeAllUpdateListeners();
            View view = (View) this.A00.get();
            if (view != null) {
                view.setAlpha(1.0f);
            }
            ((Animator) r2.getValue()).cancel();
        }
    }
}
