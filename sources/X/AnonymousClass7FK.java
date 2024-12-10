package X;

import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.7FK  reason: invalid class name */
public class AnonymousClass7FK implements AnonymousClass1WR {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7FK(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    public void ByH(AnonymousClass206 r3, int i) {
        if (this.A00 == 0) {
            C18070vi.A0d(r3, 0);
            if ((r3 instanceof AnonymousClass24B) && ((AnonymousClass24B) r3).A01 != C179819Ka.BOT_FEEDBACK_POSITIVE) {
                C139566z3 r1 = (C139566z3) this.A03;
                r1.A00.unregisterObserver(this);
                AnonymousClass1FU A0Z = C108945cZ.A0Z((Reference) this.A02);
                if (A0Z != null) {
                    C139566z3.A00(A0Z, r1);
                }
                C108945cZ.A1Q(this.A01);
            }
        }
    }

    public /* synthetic */ void ByK(AnonymousClass206 r5, int i) {
        if (this.A00 != 0) {
            AnonymousClass205 A0U = C108965cb.A0U(r5);
            if (C18070vi.A18(A0U, ((AnonymousClass206) this.A02).A0v) && A0U.A02) {
                ((AnonymousClass1KB) this.A01).A02.post(new C70863Cu(this.A03, i, 44, r5));
            }
        }
    }

    public /* synthetic */ void ByN(AnonymousClass206 r4) {
        if (this.A00 != 0) {
            AnonymousClass205 A0U = C108965cb.A0U(r4);
            String str = A0U.A01;
            AnonymousClass206 r0 = (AnonymousClass206) this.A02;
            C17960vV.A07(r0);
            if (C18070vi.A18(str, r0.A0v.A01) && A0U.A02) {
                C120906Gm.A01((C120906Gm) this.A03);
            }
        }
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void Bya(Collection collection, Map map) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }
}
