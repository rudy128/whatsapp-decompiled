package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.3Ij  reason: invalid class name and case insensitive filesystem */
public final class C71793Ij extends AnonymousClass11G implements C22821Di {
    public static final C71793Ij A00 = new C71793Ij();

    public C71793Ij() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C18070vi.A0d(view, 0);
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        return parent;
    }
}
