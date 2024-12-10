package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7FL  reason: invalid class name */
public final class AnonymousClass7FL implements AnonymousClass1WR {
    public boolean A00;
    public final /* synthetic */ AnonymousClass1KB A01;
    public final /* synthetic */ AnonymousClass206 A02;
    public final /* synthetic */ C120896Gl A03;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByH(AnonymousClass206 r1, int i) {
    }

    public void ByK(AnonymousClass206 r8, int i) {
        AnonymousClass206 r4 = r8;
        AnonymousClass205 A0U = C108965cb.A0U(r8);
        C120896Gl r2 = this.A03;
        if (C18070vi.A18(A0U, r2.A07.A0v) && !A0U.A02) {
            AnonymousClass1KB r0 = this.A01;
            r0.A02.post(new C146607Px(r2, this, r4, i, 6));
        }
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByQ(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
    }

    public /* synthetic */ void ByZ(AnonymousClass1BI r1) {
    }

    public void Bya(Collection collection, Map map) {
        Object obj;
        C62572rc r0;
        C18070vi.A0d(collection, 0);
        AnonymousClass206 r4 = this.A02;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((AnonymousClass206) obj).A0v, r4.A0v)) {
                break;
            }
        }
        AnonymousClass206 r3 = (AnonymousClass206) obj;
        if (r3 != null) {
            C120896Gl r2 = this.A03;
            r2.A08.A07().A04(8);
            r4.A0z = true;
            if ((r3 instanceof AnonymousClass21V) && (r0 = ((AnonymousClass21V) r3).A02) != null && !r0.A0V) {
                r2.A0N();
            }
        }
    }

    public /* synthetic */ void Byb(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void Byc(AnonymousClass1BI r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Byd(Collection collection) {
    }

    public /* synthetic */ void Bz8(C29681ch r1) {
    }

    public /* synthetic */ void Bz9(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public AnonymousClass7FL(AnonymousClass1KB r1, AnonymousClass206 r2, C120896Gl r3) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }
}
