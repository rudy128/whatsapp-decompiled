package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.A7b  reason: case insensitive filesystem */
public abstract class C20098A7b {
    public static void A03(DialogFragment dialogFragment, AnonymousClass1GP r2, String str) {
        AnonymousClass8BV.A18(new C34001jj(r2), dialogFragment, str);
    }

    public static void A00(DialogFragment dialogFragment, AnonymousClass1FL r2) {
        A02(dialogFragment, r2.getSupportFragmentManager());
    }

    public static void A01(DialogFragment dialogFragment, AnonymousClass1GP r3) {
        String A0U = C17890vO.A0U(dialogFragment);
        if (r3.A0Q(A0U) == null) {
            dialogFragment.A2C(r3, A0U);
        }
    }

    public static void A02(DialogFragment dialogFragment, AnonymousClass1GP r3) {
        String A0U = C17890vO.A0U(dialogFragment);
        if (r3.A0Q(A0U) == null) {
            A03(dialogFragment, r3, A0U);
        }
    }

    public static void A04(DialogFragment dialogFragment, AnonymousClass1GP r2, String str) {
        if (r2.A0Q(str) == null) {
            dialogFragment.A2C(r2, str);
        }
    }

    public static void A05(DialogFragment dialogFragment, AnonymousClass1GP r3, String str) {
        if (r3.A0Q(str) == null) {
            dialogFragment.A0B = false;
            dialogFragment.A0C = true;
            C34001jj r0 = new C34001jj(r3);
            r0.A0G = true;
            r0.A0B(dialogFragment, str);
            r0.A03();
        }
    }
}
