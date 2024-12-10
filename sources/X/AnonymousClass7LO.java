package X;

import java.util.List;

/* renamed from: X.7LO  reason: invalid class name */
public final class AnonymousClass7LO implements AnonymousClass1O5 {
    public final AnonymousClass11E A00;
    public final AnonymousClass1OZ A01;
    public final C127976fF A02;
    public final List A03;

    public void Bt9(C29621ca r5, String str) {
        AnonymousClass1NV r1;
        C18070vi.A0d(r5, 1);
        int A002 = C60482o6.A00(r5);
        if (A002 > 0) {
            C127976fF r2 = this.A02;
            if (A002 == 400 || A002 != 500) {
                r1 = r2.A00.A06;
            } else {
                C145887Mz r3 = r2.A00;
                r1 = r3.A06;
                Long A012 = r1.A01();
                if (A012 != null) {
                    C145887Mz.A00(r3, r2.A01, A012.longValue());
                    return;
                }
            }
            r1.A02();
            return;
        }
        this.A02.A00.A06.A02();
    }

    public void BrD(String str) {
        this.A02.A00.A06.A02();
    }

    public void C7Z(C29621ca r3, String str) {
        C145887Mz r1 = this.A02.A00;
        r1.A00 = null;
        r1.A06.A02();
    }

    public AnonymousClass7LO(AnonymousClass11E r1, AnonymousClass1OZ r2, C127976fF r3, List list) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = list;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
