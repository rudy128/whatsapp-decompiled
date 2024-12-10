package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.1rU  reason: invalid class name and case insensitive filesystem */
public abstract class C38561rU {
    public static final void A00(View view, Fragment fragment) {
        C23311Fn r1;
        C18070vi.A0d(view, 0);
        AnonymousClass1FL A1B = fragment.A1B();
        if ((A1B instanceof C23311Fn) && (r1 = (C23311Fn) A1B) != null) {
            r1.installScrollableCallbacks(view);
        }
    }
}
