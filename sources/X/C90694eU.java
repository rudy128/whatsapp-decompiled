package X;

import android.view.ViewTreeObserver;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.4eU  reason: invalid class name and case insensitive filesystem */
public final class C90694eU implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ WDSSearchView A00;
    public final /* synthetic */ C18090vk A01;

    public C90694eU(WDSSearchView wDSSearchView, C18090vk r2) {
        this.A00 = wDSSearchView;
        this.A01 = r2;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            WDSSearchView wDSSearchView = this.A00;
            wDSSearchView.post(new C146427Pb(this.A01, 15));
            wDSSearchView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
