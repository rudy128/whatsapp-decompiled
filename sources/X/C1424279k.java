package X;

import android.view.ViewTreeObserver;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;

/* renamed from: X.79k  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1424279k implements C15920rQ {
    public final /* synthetic */ AnonymousClass78S A00;

    public final void Brs() {
        ViewTreeObserver viewTreeObserver;
        AnonymousClass78S r2 = this.A00;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) r2.A00;
        if (!(viewTreeObserver2 == null || !viewTreeObserver2.isAlive() || (viewTreeObserver = (ViewTreeObserver) r2.A00) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) r2.A04);
        }
        r2.A00 = null;
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) r2.A05;
        statusPlaybackBaseFragment.A07 = false;
        statusPlaybackBaseFragment.A27();
    }

    public /* synthetic */ C1424279k(AnonymousClass78S r1) {
        this.A00 = r1;
    }
}
