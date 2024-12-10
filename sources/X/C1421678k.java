package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.Iterator;

/* renamed from: X.78k  reason: invalid class name and case insensitive filesystem */
public class C1421678k implements View.OnSystemUiVisibilityChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1421678k(MediaViewFragment mediaViewFragment, AnonymousClass70X r2, int i) {
        this.A00 = i;
        this.A01 = mediaViewFragment;
        this.A02 = r2;
    }

    public final void onSystemUiVisibilityChange(int i) {
        ReactionsTrayViewModel reactionsTrayViewModel;
        C121996Mj A0A;
        C121996Mj A0A2;
        if (this.A00 != 0) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
            if (((AnonymousClass70X) this.A02).A0e()) {
                mediaViewFragment.A2L(AnonymousClass000.A1P(i & 4), false);
            }
            reactionsTrayViewModel = mediaViewFragment.A13;
        } else {
            MediaViewFragment mediaViewFragment2 = (MediaViewFragment) this.A01;
            AnonymousClass70X r3 = (AnonymousClass70X) this.A02;
            if (r3.A0e()) {
                if ((i & 4) == 0) {
                    mediaViewFragment2.A2L(true, false);
                    Iterator A0l = C17890vO.A0l(mediaViewFragment2.A1z);
                    while (A0l.hasNext()) {
                        AnonymousClass70X r0 = (AnonymousClass70X) A0l.next();
                        if (!(r0 == r3 || (A0A2 = r0.A0A()) == null)) {
                            A0A2.A0F.setVisibility(0);
                            if (A0A2.A0A) {
                                A0A2.A0D.setVisibility(0);
                            }
                            C121996Mj.A01(A0A2);
                        }
                    }
                } else {
                    mediaViewFragment2.A2L(false, false);
                    Iterator A0l2 = C17890vO.A0l(mediaViewFragment2.A1z);
                    while (A0l2.hasNext()) {
                        AnonymousClass70X r02 = (AnonymousClass70X) A0l2.next();
                        if (!(r02 == r3 || (A0A = r02.A0A()) == null)) {
                            A0A.A06();
                        }
                    }
                }
            }
            reactionsTrayViewModel = mediaViewFragment2.A13;
        }
        if (reactionsTrayViewModel != null) {
            reactionsTrayViewModel.A0T(0);
        }
    }
}
