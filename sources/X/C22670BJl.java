package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.BJl  reason: case insensitive filesystem */
public class C22670BJl extends C69 {
    public final View A00;

    public void A01() {
        View view = this.A00;
        if (view != null) {
            ((InputMethodManager) BE9.A0j(view)).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void A02() {
        View view = this.A00;
        View view2 = view;
        if (view != null) {
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
                if (view == null && (view = view2.getRootView().findViewById(16908290)) == null) {
                    return;
                }
            }
            if (view.hasWindowFocus()) {
                view.post(new C21466AkX((Object) view, 2));
            }
        }
    }

    public C22670BJl(View view) {
        this.A00 = view;
    }
}
