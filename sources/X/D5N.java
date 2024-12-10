package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public final class D5N implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ BLU A02;
    public final /* synthetic */ C39481t9 A03;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Animation from operation ");
            A10.append(this.A03);
            Log.v("FragmentManager", AnonymousClass000.A0y(" has reached onAnimationStart.", A10));
        }
    }

    public D5N(View view, ViewGroup viewGroup, BLU blu, C39481t9 r4) {
        this.A03 = r4;
        this.A01 = viewGroup;
        this.A00 = view;
        this.A02 = blu;
    }

    public void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup = this.A01;
        viewGroup.post(new C27081DTg(this.A02, viewGroup, this.A00, 3));
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Animation from operation ");
            A10.append(this.A03);
            Log.v("FragmentManager", AnonymousClass000.A0y(" has ended.", A10));
        }
    }
}
