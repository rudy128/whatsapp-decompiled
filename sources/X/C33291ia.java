package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.1ia  reason: invalid class name and case insensitive filesystem */
public abstract class C33291ia {
    public static void A01(View view, int i) {
        view.setScrollIndicators(i, 3);
    }

    public static AnonymousClass1HO A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        AnonymousClass1HO A01 = AnonymousClass1HO.A01((View) null, rootWindowInsets);
        AnonymousClass1ZX r1 = A01.A00;
        if (r1 instanceof AnonymousClass1ZY) {
            ((AnonymousClass1ZY) r1).A02 = A01;
        }
        r1.A0A(view.getRootView());
        return A01;
    }
}
