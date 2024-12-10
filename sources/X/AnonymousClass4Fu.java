package X;

import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.4Fu  reason: invalid class name */
public abstract class AnonymousClass4Fu {
    public static final void A00(WDSSearchView wDSSearchView, C18090vk r3) {
        C18070vi.A0d(wDSSearchView, 0);
        if (wDSSearchView.hasWindowFocus()) {
            wDSSearchView.A09.requestFocus();
            wDSSearchView.post(new C146427Pb(r3, 15));
            return;
        }
        wDSSearchView.getViewTreeObserver().addOnWindowFocusChangeListener(new C90694eU(wDSSearchView, r3));
        wDSSearchView.A09.requestFocus();
    }
}
