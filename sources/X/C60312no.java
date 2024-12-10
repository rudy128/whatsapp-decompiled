package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.2no  reason: invalid class name and case insensitive filesystem */
public abstract class C60312no {
    public static final String A00(Resources resources, View view) {
        String str;
        if (resources == null) {
            return "no_resources";
        }
        if (view.getId() != -1) {
            str = resources.getResourceName(view.getId());
        } else {
            str = "no_id";
        }
        C18070vi.A0b(str);
        return str;
    }

    public static final void A01(View view, String str) {
        ViewParent parent;
        Resources resources = view.getResources();
        do {
            String A00 = A00(resources, view);
            StringBuilder A11 = AnonymousClass000.A11(str);
            C17900vP.A0a(view, A11);
            A11.append('/');
            C17890vO.A1A(A11, A00);
            parent = view.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
            }
            String A002 = A00(resources, view);
            StringBuilder A112 = AnonymousClass000.A11(str);
            C17900vP.A0a(view, A112);
            A112.append('/');
            C17890vO.A1A(A112, A002);
            parent = view.getParent();
            return;
        } while ((view = (View) parent) == null);
    }
}
