package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DFZ implements C16890tO {
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C40611uz> list = ((BV5) obj2).A08;
        if (list == null) {
            return null;
        }
        for (C40611uz A0r : list) {
            recyclerView.A0r(A0r);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return !AnonymousClass026.A00(((BV5) obj).A08, ((BV5) obj2).A08);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<C40611uz> list = ((BV5) obj2).A08;
        if (list != null) {
            for (C40611uz A0s : list) {
                recyclerView.A0s(A0s);
            }
        }
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
