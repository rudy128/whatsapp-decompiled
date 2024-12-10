package X;

import android.view.animation.Animation;

/* renamed from: X.3bz  reason: invalid class name and case insensitive filesystem */
public class C74583bz extends C90704eV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C90644eP A01;

    public C74583bz(C90644eP r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        AnonymousClass4VR r2 = (AnonymousClass4VR) this.A01.A02;
        r2.A03.setTranscriptMode(this.A00);
        r2.A0E = false;
    }

    public void onAnimationStart(Animation animation) {
        ((AnonymousClass4VR) this.A01.A02).A03.setTranscriptMode(2);
    }
}
