package X;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* renamed from: X.0FE  reason: invalid class name */
public abstract class AnonymousClass0FE {
    public static final void A00(View view, C16990tY r3) {
        int i;
        boolean z = r3 instanceof C05920Wg;
        Context context = view.getContext();
        if (z) {
            i = ((C05920Wg) r3).A00;
        } else {
            i = 1000;
        }
        PointerIcon systemIcon = PointerIcon.getSystemIcon(context, i);
        if (!C18070vi.A18(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
