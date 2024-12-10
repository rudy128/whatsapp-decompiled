package X;

import java.util.List;

/* renamed from: X.7LN  reason: invalid class name */
public final class AnonymousClass7LN implements AnonymousClass1O5 {
    public final AnonymousClass11E A00;
    public final AnonymousClass1OZ A01;
    public final C132686nO A02;
    public final List A03;

    public void Bt9(C29621ca r3, String str) {
        C18070vi.A0d(r3, 1);
        int A002 = C60482o6.A00(r3);
        if (A002 > 0) {
            this.A02.A00(A002);
        } else {
            this.A02.A00(0);
        }
    }

    public void C7Z(C29621ca r4, String str) {
        C18070vi.A0d(r4, 1);
        C132686nO r2 = this.A02;
        C139866zZ A002 = C124226Xn.A00(r4);
        C145887Mz r1 = r2.A01;
        r1.A03(A002);
        if (r2.A03) {
            C17880vN.A1C(C108995ce.A0E(((C133596p2) r1.A08.get()).A01), "tos_fetch_iteration", r2.A00);
        }
    }

    public void BrD(String str) {
        this.A02.A00(-1);
    }

    public AnonymousClass7LN(AnonymousClass11E r1, AnonymousClass1OZ r2, C132686nO r3, List list) {
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
