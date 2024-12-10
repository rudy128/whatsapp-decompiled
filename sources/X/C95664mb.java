package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.4mb  reason: invalid class name and case insensitive filesystem */
public final class C95664mb implements C201511a {
    public final Context A00;

    public void A00(View view, boolean z) {
        C18070vi.A0d(view, 0);
        int i = 0;
        if (z != AnonymousClass000.A1P(view.getVisibility())) {
            view.setEnabled(z);
            view.startAnimation(AnonymousClass4GE.A00(!z));
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public C95664mb(Context context) {
        this.A00 = context;
    }
}
