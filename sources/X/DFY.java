package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

public class DFY implements C16890tO {
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        BM9 bm9 = ((BV5) obj2).A06;
        if (bm9 == null) {
            return null;
        }
        bm9.A08(recyclerView);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return !AnonymousClass026.A00(((BV5) obj).A06, ((BV5) obj2).A06);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        BM9 bm9 = ((BV5) obj2).A06;
        if (bm9 != null) {
            bm9.A08((RecyclerView) null);
        }
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
