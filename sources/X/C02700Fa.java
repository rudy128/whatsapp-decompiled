package X;

import android.view.View;
import java.util.Iterator;

/* renamed from: X.0Fa  reason: invalid class name and case insensitive filesystem */
public abstract class C02700Fa {
    public static final void A00(C01930Bz r5) {
        C18070vi.A0d(r5, 0);
        Iterator it = C60242nd.A01(r5).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.isLayoutRequested()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            if (view instanceof C01930Bz) {
                A00((C01930Bz) view);
            }
        }
    }
}
