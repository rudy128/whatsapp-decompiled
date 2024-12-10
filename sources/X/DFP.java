package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class DFP implements C16890tO {
    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C18070vi.A0d(recyclerView, 1);
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (obj3 instanceof BVB)) {
            ((GridLayoutManager) layoutManager).A01 = new BLi(C29431cG.A0t(((BVB) obj3).A00), 1);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 != null) {
            BVB bvb = (BVB) obj3;
            if (obj4 != null) {
                return !C18070vi.A18(bvb.A00, ((BVB) obj4).A00);
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
