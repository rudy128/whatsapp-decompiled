package X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public final class BLU extends AnonymousClass2SF {
    public final C41341wC A00;

    public void A04(ViewGroup viewGroup) {
        C39481t9 r2 = this.A00.A00;
        View view = r2.A07.A0B;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        r2.A03(this);
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Animation from operation ");
            A10.append(r2);
            Log.v("FragmentManager", AnonymousClass000.A0y(" has been cancelled.", A10));
        }
    }

    public void A05(ViewGroup viewGroup) {
        C41341wC r5 = this.A00;
        if (!r5.A01()) {
            Context context = viewGroup.getContext();
            C39481t9 r4 = r5.A00;
            View view = r4.A07.A0B;
            C18070vi.A0X(context);
            C25518ChG A02 = r5.A02(context);
            if (A02 != null) {
                Animation animation = A02.A01;
                if (animation == null) {
                    throw AnonymousClass000.A0n("Required value was null.");
                } else if (r4.A00 != AnonymousClass00R.A00) {
                    view.startAnimation(animation);
                } else {
                    viewGroup.startViewTransition(view);
                    BHx bHx = new BHx(view, viewGroup, animation);
                    bHx.setAnimationListener(new D5N(view, viewGroup, this, r4));
                    view.startAnimation(bHx);
                    if (AnonymousClass1GP.A0G(2)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Animation from operation ");
                        A10.append(r4);
                        Log.v("FragmentManager", AnonymousClass000.A0y(" has started.", A10));
                        return;
                    }
                    return;
                }
            } else {
                throw AnonymousClass000.A0n("Required value was null.");
            }
        }
        r5.A00.A03(this);
    }

    public BLU(C41341wC r1) {
        this.A00 = r1;
    }
}
