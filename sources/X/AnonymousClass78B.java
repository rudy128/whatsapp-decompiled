package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.music.ui.MusicAttributionFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* renamed from: X.78B  reason: invalid class name */
public class AnonymousClass78B implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass78B(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        AnonymousClass6Gp r2;
        switch (this.A00) {
            case 0:
                AnonymousClass206 r0 = (AnonymousClass206) this.A02;
                AnonymousClass77U r5 = (AnonymousClass77U) this.A03;
                StatusPlaybackContactFragment statusPlaybackContactFragment = ((C1406472j) this.A01).A03;
                if (statusPlaybackContactFragment != null) {
                    AnonymousClass70K A2G = statusPlaybackContactFragment.A2G(r0);
                    AnonymousClass6Gp r02 = null;
                    if ((A2G instanceof AnonymousClass6Gp) && (r2 = (AnonymousClass6Gp) A2G) != null) {
                        r2.A0P();
                        r02 = r2;
                    }
                    WeakReference A0z = AnonymousClass3MW.A0z(r02);
                    MusicAttributionFragment musicAttributionFragment = new MusicAttributionFragment();
                    Bundle A0D = C17880vN.A0D();
                    A0D.putParcelable("embedded_music", r5);
                    musicAttributionFragment.A1R(A0D);
                    musicAttributionFragment.A05 = AnonymousClass3MW.A0z(new AnonymousClass759(A0z, 7));
                    musicAttributionFragment.A2C(statusPlaybackContactFragment.A1E(), "TopAttributionManager");
                    return;
                }
                return;
            case 1:
                Object obj = this.A02;
                View.OnClickListener onClickListener = (View.OnClickListener) this.A03;
                C18070vi.A0d(obj, 1);
                List list = ((C90594eK) this.A01).A01.A08;
                if (list != null) {
                    list.remove(obj);
                }
                onClickListener.onClick(view);
                return;
            case 2:
                Set set = (Set) this.A02;
                C23291Fl r1 = (C23291Fl) this.A03;
                C18070vi.A0d(set, 1);
                C41751x0.A01(r1, (C41751x0) this.A01, set);
                return;
            case 3:
                ViewSharedContactArrayActivity viewSharedContactArrayActivity = ((C112065ks) this.A01).A02;
                C72453Mb.A1P(viewSharedContactArrayActivity.A0O);
                ((AnonymousClass1VQ) viewSharedContactArrayActivity.A02).CNw(viewSharedContactArrayActivity, (AnonymousClass1E7) this.A03, 15, false);
                return;
            default:
                C41821x7 r52 = (C41821x7) this.A01;
                C129246hU r4 = (C129246hU) this.A02;
                r52.A01.CGF(new C21357Aim(r52, this.A03, 1));
                C41751x0.A01(r4.A01, r4.A02, r4.A03);
                return;
        }
    }
}
