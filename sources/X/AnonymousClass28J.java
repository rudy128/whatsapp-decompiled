package X;

import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import java.util.List;

/* renamed from: X.28J  reason: invalid class name */
public final class AnonymousClass28J extends C37911qO {
    public final /* synthetic */ StickyHeadersLinearLayoutManager A00;

    public AnonymousClass28J(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        this.A00 = stickyHeadersLinearLayoutManager;
    }

    public void A01() {
        int i;
        List list;
        DFE dfe;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list2 = stickyHeadersLinearLayoutManager.A05;
        list2.clear();
        C22707BLr bLr = stickyHeadersLinearLayoutManager.A04;
        if (bLr != null) {
            i = bLr.A03.size();
        } else {
            i = 0;
        }
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C22707BLr bLr2 = stickyHeadersLinearLayoutManager.A04;
            if (!(bLr2 == null || (list = bLr2.A03) == null || (dfe = (DFE) list.get(i2)) == null || !C24522C7q.A00(dfe.A01))) {
                list2.add(Integer.valueOf(i2));
                if (i2 == stickyHeadersLinearLayoutManager.A02) {
                    z = false;
                }
            }
        }
        if (stickyHeadersLinearLayoutManager.A03 != null && z) {
            StickyHeadersLinearLayoutManager.A0F((C37931qQ) null, stickyHeadersLinearLayoutManager);
        }
    }

    public void A03(int i, int i2) {
        List list;
        DFE dfe;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list2 = stickyHeadersLinearLayoutManager.A05;
        int size = list2.size();
        int A0A = StickyHeadersLinearLayoutManager.A0A(stickyHeadersLinearLayoutManager, i);
        if (size > 0 && A0A != -1) {
            while (A0A < size) {
                list2.set(A0A, Integer.valueOf(AnonymousClass001.A0n(list2, A0A) + i2));
                A0A++;
            }
        }
        int i3 = i2 + i;
        while (i < i3) {
            C22707BLr bLr = stickyHeadersLinearLayoutManager.A04;
            if (!(bLr == null || (list = bLr.A03) == null || (dfe = (DFE) list.get(i)) == null || !C24522C7q.A00(dfe.A01))) {
                int A0A2 = StickyHeadersLinearLayoutManager.A0A(stickyHeadersLinearLayoutManager, i);
                Integer valueOf = Integer.valueOf(i);
                if (A0A2 != -1) {
                    list2.add(A0A2, valueOf);
                } else {
                    list2.add(valueOf);
                }
            }
            i++;
        }
    }

    public void A04(int i, int i2) {
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A05;
        int size = list.size();
        if (size > 0) {
            int i3 = i + i2;
            int i4 = i3 - 1;
            boolean z = false;
            if (i <= i4) {
                while (true) {
                    int A03 = AnonymousClass1ZU.A03(Integer.valueOf(i4), list, list.size());
                    if (A03 >= 0) {
                        list.remove(Integer.valueOf(A03));
                        size--;
                        if (A03 == stickyHeadersLinearLayoutManager.A02) {
                            z = true;
                        }
                    }
                    if (i4 == i) {
                        break;
                    }
                    i4--;
                }
            }
            if (stickyHeadersLinearLayoutManager.A03 != null && z) {
                StickyHeadersLinearLayoutManager.A0F((C37931qQ) null, stickyHeadersLinearLayoutManager);
            }
            int A0A = StickyHeadersLinearLayoutManager.A0A(stickyHeadersLinearLayoutManager, i3);
            if (A0A != -1) {
                while (A0A < size) {
                    list.set(A0A, Integer.valueOf(-i2));
                    A0A++;
                }
            }
        }
    }
}
