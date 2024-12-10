package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4mK  reason: invalid class name and case insensitive filesystem */
public class C95494mK implements AnonymousClass1WR {
    public final C107475Zv A00;
    public final AnonymousClass1EC A01;

    public /* synthetic */ void BmY(AnonymousClass206 r1, int i) {
    }

    public /* synthetic */ void BsP(AnonymousClass206 r1) {
    }

    public /* synthetic */ void Bwj(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void ByG(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByN(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByR(AnonymousClass206 r1) {
    }

    public /* synthetic */ void ByY(Collection collection, int i) {
        AnonymousClass2TK.A00(this, collection, i);
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

    public /* synthetic */ void BzA(C29681ch r1, boolean z) {
    }

    public /* synthetic */ void BzC(C29681ch r1) {
    }

    public /* synthetic */ void C0d(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    public /* synthetic */ void C0h(AnonymousClass206 r1, AnonymousClass206 r2) {
    }

    private boolean A00(AnonymousClass206 r3) {
        if (!(r3 instanceof AnonymousClass23S) || !r3.A0v.A02) {
            return false;
        }
        return this.A01.equals(((AnonymousClass23S) r3).A02);
    }

    public void ByH(AnonymousClass206 r5, int i) {
        AnonymousClass1EC r3 = this.A01;
        AnonymousClass205 r1 = r5.A0v;
        AnonymousClass1BI r2 = r1.A00;
        if ((r3.equals(r2) && !r1.A02 && r5.A0u == 5) || A00(r5) || (r3.equals(r2) && r5.A0u == 92)) {
            this.A00.C9c();
        }
    }

    public void ByK(AnonymousClass206 r4, int i) {
        AnonymousClass1EC r2 = this.A01;
        AnonymousClass1BI r1 = r4.A0v.A00;
        if ((r2.equals(r1) && AnonymousClass25A.A0H(r4.A0u) && i == 3) || A00(r4) || i == 30 || (r2.equals(r1) && r4.A0u == 92)) {
            this.A00.C9c();
        }
    }

    public void ByQ(AnonymousClass206 r3, AnonymousClass206 r4) {
        if (AnonymousClass3Ma.A1X(r4, this.A01) && r4.A0u == 92) {
            this.A00.C9c();
        }
    }

    public void Byc(AnonymousClass1BI r4, Collection collection, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (AnonymousClass3Ma.A1X(C17880vN.A0Y(it), this.A01)) {
                }
            }
            return;
        } else if (r4 == null || this.A01.equals(r4)) {
            this.A00.C9c();
        } else {
            return;
        }
        this.A00.C9c();
    }

    public C95494mK(C107475Zv r1, AnonymousClass1EC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bya(Collection collection, Map map) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (AnonymousClass3Ma.A1X(A0Y, this.A01)) {
                int i = A0Y.A0u;
                if (AnonymousClass25A.A0H(i) || A0Y.A0q || i == 92) {
                    this.A00.C9c();
                    return;
                }
            }
            if (A00(A0Y)) {
                this.A00.C9c();
            }
        }
    }
}
