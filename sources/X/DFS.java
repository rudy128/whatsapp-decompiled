package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

public class DFS implements C16890tO {
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((BV5) obj2).A04;
        if (rect == null) {
            return null;
        }
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return !AnonymousClass026.A00(((BV5) obj).A04, ((BV5) obj2).A04);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setPadding(0, 0, 0, 0);
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
