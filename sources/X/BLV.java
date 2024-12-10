package X;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public final class BLV extends AnonymousClass2SF {
    public AnimatorSet A00;
    public final C41341wC A01;

    public void A03(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        C41341wC r1 = this.A01;
        if (!r1.A01()) {
            ViewGroup viewGroup2 = viewGroup;
            C25518ChG A02 = r1.A02(AnonymousClass3MY.A04(viewGroup));
            if (A02 != null) {
                animatorSet = A02.A00;
            } else {
                animatorSet = null;
            }
            this.A00 = animatorSet;
            C39481t9 r5 = r1.A00;
            Fragment fragment = r5.A07;
            boolean A1Z = AnonymousClass000.A1Z(r5.A00, AnonymousClass00R.A0C);
            View view = fragment.A0B;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet2 = this.A00;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new BEG(view, viewGroup2, this, r5, A1Z));
            }
            AnimatorSet animatorSet3 = this.A00;
            if (animatorSet3 != null) {
                animatorSet3.setTarget(view);
            }
        }
    }

    public boolean A06() {
        return true;
    }

    public void A02(C005002d r14) {
        C39481t9 r7 = this.A01.A00;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet == null) {
            r7.A03(this);
        } else if (Build.VERSION.SDK_INT >= 34 && r7.A07.A0m) {
            if (AnonymousClass1GP.A0G(2)) {
                Log.v("FragmentManager", AnonymousClass001.A1E(r7, "Adding BackProgressCallbacks for Animators to operation ", AnonymousClass000.A10()));
            }
            long A002 = C7T.A00(animatorSet);
            long j = (long) (r14.A00 * ((float) A002));
            if (j == 0) {
                j = 1;
            }
            if (j == A002) {
                j = A002 - 1;
            }
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Setting currentPlayTime to ");
                A10.append(j);
                A10.append(" for Animator ");
                A10.append(animatorSet);
                Log.v("FragmentManager", AnonymousClass001.A1E(r7, " on operation ", A10));
            }
            C25297Cd1.A01(animatorSet, j);
        }
    }

    public void A04(ViewGroup viewGroup) {
        String str;
        AnimatorSet animatorSet = this.A00;
        C41341wC r0 = this.A01;
        if (animatorSet == null) {
            r0.A00.A03(this);
            return;
        }
        C39481t9 r2 = r0.A00;
        if (!r2.A05) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C25297Cd1.A00(animatorSet);
        }
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Animator from operation ");
            A10.append(r2);
            A10.append(" has been canceled");
            if (r2.A05) {
                str = " with seeking.";
            } else {
                str = ".";
            }
            A10.append(str);
            Log.v("FragmentManager", C17890vO.A0c(A10, ' '));
        }
    }

    public void A05(ViewGroup viewGroup) {
        C39481t9 r2 = this.A01.A00;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet == null) {
            r2.A03(this);
            return;
        }
        animatorSet.start();
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Animator from operation ");
            A10.append(r2);
            Log.v("FragmentManager", AnonymousClass000.A0y(" has started.", A10));
        }
    }

    public BLV(C41341wC r1) {
        this.A01 = r1;
    }
}
