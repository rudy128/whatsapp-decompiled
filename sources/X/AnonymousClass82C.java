package X;

import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;

/* renamed from: X.82C  reason: invalid class name */
public final class AnonymousClass82C extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass8A5 $listener;
    public final /* synthetic */ AnonymousClass741 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82C(AnonymousClass741 r2, AnonymousClass8A5 r3) {
        super(1);
        this.this$0 = r2;
        this.$listener = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass741 r2 = this.this$0;
        AnonymousClass8A5 r3 = this.$listener;
        C18070vi.A0d(r3, 0);
        int i = r2.A01;
        if (i == 2 || i == 3) {
            r3.C5f();
        } else {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.25f, 1.0f, 1.25f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(220);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            C114545r0.A00(scaleAnimation, r3, 0);
            r2.A0L.startAnimation(scaleAnimation);
            r2.A05.startAnimation(scaleAnimation);
        }
        return C27621Wu.A00;
    }
}
