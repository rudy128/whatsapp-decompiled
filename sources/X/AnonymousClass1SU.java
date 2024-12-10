package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1SU  reason: invalid class name */
public final class AnonymousClass1SU {
    public final AnonymousClass11E A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final C18180vt A03;

    public AnonymousClass1SU(AnonymousClass11E r4, C18030ve r5, AnonymousClass18K r6) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r4;
        int A002 = C18020vd.A00(C18040vf.A02, r5, 5506);
        this.A03 = new C18180vt(A002, A002, A002, true);
    }

    public final void A01(C59122ln r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass64X r0 = r4.A00;
        AnonymousClass18K r2 = this.A02;
        r2.CC7(r0);
        for (AnonymousClass184 CC7 : r4.A01) {
            r2.CC7(CC7);
        }
    }

    public final List A00(List list) {
        if (list != null && !list.isEmpty()) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 5367)) {
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    String str = (String) next;
                    if (!AnonymousClass1EG.A0H(str) && this.A03.A01(str)) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }
        }
        return C18460wS.A00;
    }
}
