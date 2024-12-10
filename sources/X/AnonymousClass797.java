package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.location.WaMapView;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.797  reason: invalid class name */
public class AnonymousClass797 implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass797(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        AnonymousClass1FL A1D;
        switch (this.A00) {
            case 0:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A02;
                if (!C72453Mb.A1a(mediaGalleryFragmentBase.A0f)) {
                    AnonymousClass3MX.A1G((View) this.A01, this);
                    A1D = mediaGalleryFragmentBase.A1D();
                } else if (!mediaGalleryFragmentBase.A1b() || mediaGalleryFragmentBase.A0j) {
                    return true;
                } else {
                    AnonymousClass3MX.A1G((View) this.A01, this);
                    A1D = mediaGalleryFragmentBase.A1B();
                    if (A1D == null) {
                        return true;
                    }
                }
                A1D.A2Z();
                return true;
            case 1:
                View view = (View) this.A01;
                int height = view.getHeight();
                View findViewById = ((AnonymousClass01E) this.A02).findViewById(2131430794);
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom() + height);
                AnonymousClass3MX.A1G(view, this);
                return false;
            case 2:
                WaMapView waMapView = (WaMapView) this.A01;
                BIC bic = waMapView.A01;
                C17960vV.A05(bic);
                AnonymousClass3MX.A1G(bic, this);
                waMapView.A01.post(new AnonymousClass7RA((Object) this, 15));
                return true;
            case 3:
                AnonymousClass3MX.A1G((View) this.A01, this);
                C1422878w.A01((C1422878w) this.A02);
                return true;
            case 4:
                UpdatesFragment updatesFragment = (UpdatesFragment) this.A02;
                ObservableRecyclerView observableRecyclerView = updatesFragment.A0C;
                if (!(observableRecyclerView == null || (viewTreeObserver = observableRecyclerView.getViewTreeObserver()) == null)) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                List list = (List) this.A01;
                if (list == null) {
                    return false;
                }
                C109085cn r5 = (C109085cn) C18070vi.A0E(updatesFragment.A1K);
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    View A0E = AnonymousClass3MX.A0E(it);
                    A0E.measure(0, 0);
                    int measuredHeight = A0E.getMeasuredHeight();
                    int[] A1W = C108945cZ.A1W();
                    A1W[0] = 0;
                    A1W[1] = measuredHeight;
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1W);
                    ofInt.addListener(new C109045cj(A0E, measuredHeight, 3));
                    C1411074h.A00(ofInt, A0E, 32);
                    A13.add(ofInt);
                }
                AnimatorSet animatorSet = r5.A00;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet A0B = C108945cZ.A0B();
                A0B.setInterpolator(new DecelerateInterpolator());
                A0B.setDuration(250);
                A0B.playTogether(A13);
                A0B.addListener(r5);
                A0B.start();
                r5.A00 = A0B;
                return false;
            default:
                AnonymousClass3MX.A1G((View) this.A02, this);
                C108945cZ.A1P(this.A01);
                return true;
        }
    }
}
