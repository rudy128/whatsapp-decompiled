package X;

import android.content.Context;
import android.view.View;

public class DFR implements C16890tO {
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        BV5 bv5 = (BV5) obj2;
        if (bv5.A01 <= 0) {
            return null;
        }
        if (bv5.A0C.A00 == 1) {
            view.setVerticalFadingEdgeEnabled(true);
        } else {
            view.setHorizontalFadingEdgeEnabled(true);
        }
        view.setFadingEdgeLength(bv5.A01);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return AnonymousClass000.A1S(((BV5) obj).A01, ((BV5) obj2).A01);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
