package X;

import android.graphics.Path;

/* renamed from: X.BTu  reason: case insensitive filesystem */
public final class C22883BTu extends C3J implements C28505E4n {
    public final BU3 A00;
    public final BUD A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22883BTu) {
                C22883BTu bTu = (C22883BTu) obj;
                if (!C18070vi.A18(this.A00, bTu.A00) || !C18070vi.A18(this.A01, bTu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C22883BTu(BU3 bu3, BUD bud) {
        this.A00 = bu3;
        this.A01 = bud;
    }

    public void BCV(Path path, C25741ClB clB) {
        C18070vi.A0h(path, clB);
        BU3 bu3 = this.A00;
        BUD bud = this.A01;
        Path A002 = clB.A00(bu3, bud);
        clB.A01(bud, new C27942Doe(A002));
        path.addPath(A002);
    }
}
