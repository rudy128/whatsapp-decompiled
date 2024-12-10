package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cfd  reason: case insensitive filesystem */
public abstract class C25431Cfd {
    public static final C25842Cmw A00 = new Object();
    public static final C25842Cmw A01;

    public static final void A00(List list, int i) {
        C18070vi.A0d(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Cmw, java.lang.Object] */
    static {
        C25842Cmw cmw;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            C18070vi.A0z(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            cmw = (C25842Cmw) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            cmw = null;
        }
        A01 = cmw;
    }
}
