package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6Bh  reason: invalid class name and case insensitive filesystem */
public final class C120066Bh extends AnonymousClass10T {
    public final AnonymousClass10I A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120066Bh(AnonymousClass10I r3) {
        super(C18150vq.A00(), false);
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public final void A00(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        Object obj;
        C112275lD r1;
        Iterable subList;
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            AnonymousClass1D6 A002 = AnonymousClass1D6.A00(Integer.valueOf(linearLayoutManager.A1O()), linearLayoutManager.A1Q());
            int A04 = AnonymousClass3MZ.A04(A002);
            int A09 = C108955ca.A09(A002);
            if (A04 > -1 && A09 > -1) {
                C38391rD r12 = recyclerView.A0B;
                if ((r12 instanceof C112275lD) && (r1 = (C112275lD) r12) != null) {
                    List A003 = C112275lD.A00(r1);
                    C18070vi.A0d(A003, 0);
                    AnonymousClass1IX copyOf = AnonymousClass1IX.copyOf((Collection) A003);
                    C18070vi.A0X(copyOf);
                    int min = Math.min(A09, copyOf.size() - 1);
                    if (A04 > min) {
                        subList = C18460wS.A00;
                    } else {
                        subList = copyOf.subList(A04, min + 1);
                    }
                    obj = C29421cF.A0R(AnonymousClass6J8.class, subList);
                    notifyAllObservers(new AnonymousClass35P(4, "UpdatesViewModel", obj));
                }
            }
            obj = C18460wS.A00;
            notifyAllObservers(new AnonymousClass35P(4, "UpdatesViewModel", obj));
        }
    }
}
