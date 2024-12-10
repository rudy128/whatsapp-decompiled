package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

/* renamed from: X.6ut  reason: invalid class name and case insensitive filesystem */
public abstract class C137086ut {
    public static void A01(DialogFragment dialogFragment, Fragment fragment) {
        if (!fragment.A0Z) {
            AnonymousClass1GP A1E = fragment.A1E();
            String A0U = C17890vO.A0U(dialogFragment);
            if (A1E.A0Q(A0U) == null) {
                dialogFragment.A2C(fragment.A1E(), A0U);
            }
        }
    }

    public static void A00(Intent intent, Fragment fragment, AnonymousClass11P r3) {
        C60442o2.A00(intent, r3, C108955ca.A0x(fragment));
        fragment.A1k(intent);
    }
}
