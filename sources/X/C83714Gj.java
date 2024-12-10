package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4Gj  reason: invalid class name and case insensitive filesystem */
public abstract class C83714Gj {
    public static final ArrayList A00(ViewGroup viewGroup, Class cls) {
        ArrayList A0s = C72463Mc.A0s(viewGroup);
        Iterator A00 = C99434so.A00(viewGroup, 1);
        while (A00.hasNext()) {
            View A0E = AnonymousClass3MX.A0E(A00);
            if (cls.isInstance(A0E)) {
                C18070vi.A0z(A0E, "null cannot be cast to non-null type T of com.whatsapp.extensions.ViewGroupExtKt.findViewsOfClass");
                A0s.add(A0E);
            }
            if (A0E instanceof ViewGroup) {
                A0s.addAll(A00((ViewGroup) A0E, cls));
            }
        }
        return A0s;
    }
}
