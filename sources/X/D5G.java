package X;

import android.view.View;
import android.view.ViewTreeObserver;

public final class D5G implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ DNR A01;

    public D5G(View view, DNR dnr) {
        this.A01 = dnr;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        View view;
        DNR dnr = this.A01;
        if (dnr.A0E && dnr.A0B == (view = this.A00)) {
            C26089Cs7.A01(view, dnr);
        }
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
