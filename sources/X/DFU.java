package X;

import android.content.Context;
import android.view.View;

public class DFU implements C16890tO {
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setNestedScrollingEnabled(((BV5) obj2).A0A);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return AnonymousClass000.A1S(((BV5) obj).A0A ? 1 : 0, ((BV5) obj2).A0A ? 1 : 0);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setNestedScrollingEnabled(true);
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
