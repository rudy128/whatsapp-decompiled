package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.79B  reason: invalid class name */
public class AnonymousClass79B implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79B(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScrollChanged() {
        float f;
        if (this.A00 != 0) {
            C1403871f r2 = (C1403871f) this.A01;
            boolean canScrollVertically = r2.A02.canScrollVertically(1);
            View view = r2.A01;
            if (canScrollVertically) {
                f = (float) r2.A00;
            } else {
                f = 0.0f;
            }
            view.setElevation(f);
            return;
        }
        SharedTextPreviewDialogFragment.A03((SharedTextPreviewDialogFragment) this.A01);
    }
}
