package X;

import android.view.animation.Animation;

/* renamed from: X.3c0  reason: invalid class name and case insensitive filesystem */
public class C74593c0 extends C90704eV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4VR A01;
    public final /* synthetic */ C74323Zj A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    public C74593c0(AnonymousClass4VR r1, C74323Zj r2, Runnable runnable, Runnable runnable2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = runnable;
        this.A00 = i;
        this.A03 = runnable2;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass4VR r2 = this.A01;
        r2.A02.setVisibility(8);
        r2.A02.getLayoutParams().height = this.A00;
        this.A03.run();
        this.A02.setEnabled(true);
        r2.A0E = false;
    }

    public void onAnimationStart(Animation animation) {
        this.A02.setEnabled(false);
        this.A04.run();
    }
}
