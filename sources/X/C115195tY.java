package X;

import android.transition.Transition;
import android.view.animation.AlphaAnimation;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.5tY  reason: invalid class name and case insensitive filesystem */
public class C115195tY extends C1419277m {
    public final /* synthetic */ MediaViewBaseFragment A00;
    public final /* synthetic */ C1600787a A01;

    public C115195tY(MediaViewBaseFragment mediaViewBaseFragment, C1600787a r2) {
        this.A00 = mediaViewBaseFragment;
        this.A01 = r2;
    }

    public void onTransitionEnd(Transition transition) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        AnonymousClass1FL A1B = mediaViewBaseFragment.A1B();
        if (A1B != null && !mediaViewBaseFragment.A0j && !A1B.isFinishing()) {
            mediaViewBaseFragment.A02.setVisibility(0);
            AlphaAnimation A0Q = C72463Mc.A0Q();
            A0Q.setDuration(600);
            mediaViewBaseFragment.A02.startAnimation(A0Q);
            mediaViewBaseFragment.A2L(true, true);
            PhotoView A28 = mediaViewBaseFragment.A28(mediaViewBaseFragment.A2B(mediaViewBaseFragment.A09.getCurrentItem()));
            if (A28 != null) {
                PhotoView.A05(A28, true);
            }
            this.A01.C9F(true);
        }
    }
}
