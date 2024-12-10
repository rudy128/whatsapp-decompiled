package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6nO  reason: invalid class name and case insensitive filesystem */
public final class C132686nO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C145887Mz A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public C132686nO(C145887Mz r1, List list, int i, boolean z) {
        this.A01 = r1;
        this.A03 = z;
        this.A00 = i;
        this.A02 = list;
    }

    public void A00(int i) {
        C145887Mz r5 = this.A01;
        List list = this.A02;
        if (i != -1) {
            if (i == 0 || i == 400) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    AnonymousClass00H r2 = r5.A08;
                    ((C133596p2) r2.get()).A00(A0v, 3);
                    ((C133596p2) r2.get()).A01(A0v, System.currentTimeMillis());
                }
            } else if (i == 500) {
                AnonymousClass1NV r6 = r5.A05;
                Long A012 = r6.A01();
                if (A012 != null) {
                    r5.A07.CGv(r5.A0A, A012.longValue());
                    return;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C133596p2) r5.A08.get()).A01(C17880vN.A0v(it2), System.currentTimeMillis());
                }
                r6.A02();
                return;
            } else {
                return;
            }
        }
        r5.A05.A02();
    }
}
