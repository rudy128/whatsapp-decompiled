package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

public class DFV implements C16890tO {
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        BV5 bv5 = (BV5) obj2;
        recyclerView.setAdapter(bv5.A0D);
        recyclerView.setItemAnimator((C37961qT) null);
        C24782CKb cKb = bv5.A07;
        if (cKb == null || cKb.A00 == null) {
            int i = bv5.A03;
            if (i >= 0) {
                recyclerView.A0f(i);
                return null;
            }
        } else {
            C38251qy layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            layoutManager.A19(bv5.A07.A00);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return AnonymousClass3Ma.A1Z(((BV5) obj).A0D, ((BV5) obj2).A0D);
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C24782CKb cKb = ((BV5) obj2).A07;
        if (cKb != null) {
            C38251qy layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            cKb.A00 = layoutManager.A0u();
        }
        recyclerView.setAdapter((C38391rD) null);
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
