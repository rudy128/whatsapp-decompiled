package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Vo  reason: invalid class name and case insensitive filesystem */
public abstract class C87434Vo {
    public static final void A00(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public static final void A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3MX.A0E(it).setVisibility(8);
        }
    }
}
