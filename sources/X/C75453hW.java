package X;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.whatsapp.profile.ProfileInfoActivity;

/* renamed from: X.3hW  reason: invalid class name and case insensitive filesystem */
public class C75453hW extends C1419277m {
    public final int A00;
    public final Object A01;

    public C75453hW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onTransitionEnd(Transition transition) {
        ViewGroup A0F;
        switch (this.A00) {
            case 0:
                C76733o2 r3 = (C76733o2) this.A01;
                r3.A0Y = false;
                if (r3.A01 == null && (A0F = AnonymousClass3MX.A0F(r3, 2131428706)) != null) {
                    View BHS = r3.A0D.BHS(r3, r3.A02, (C135166rl) null, r3.A0E, (AnonymousClass1BI) null);
                    r3.A01 = BHS;
                    C72453Mb.A1E(BHS, A0F);
                    r3.A0D.setVisibilityChangeListener(new C94124k5(r3, 1));
                    return;
                }
                return;
            case 1:
                ((C78463sq) this.A01).A0A = false;
                return;
            case 2:
                ((ProfileInfoActivity) this.A01).A02.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
                return;
            default:
                super.onTransitionEnd(transition);
                return;
        }
    }

    public void onTransitionStart(Transition transition) {
        float f;
        ViewPropertyAnimator viewPropertyAnimator;
        switch (this.A00) {
            case 0:
                ((C76733o2) this.A01).A0Y = true;
                return;
            case 1:
                ((C78463sq) this.A01).A0A = true;
                return;
            case 3:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A01;
                profileInfoActivity.A02.setScaleX(1.0f);
                profileInfoActivity.A02.setScaleY(1.0f);
                viewPropertyAnimator = profileInfoActivity.A02.animate();
                f = 0.0f;
                break;
            case 4:
                ProfileInfoActivity profileInfoActivity2 = (ProfileInfoActivity) this.A01;
                profileInfoActivity2.A02.setScaleX(0.0f);
                profileInfoActivity2.A02.setScaleY(0.0f);
                viewPropertyAnimator = profileInfoActivity2.A02.animate();
                f = 1.0f;
                break;
            default:
                super.onTransitionStart(transition);
                return;
        }
        viewPropertyAnimator.scaleX(f).scaleY(f).setDuration(125);
    }
}
