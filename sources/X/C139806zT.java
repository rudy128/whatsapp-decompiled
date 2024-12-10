package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.6zT  reason: invalid class name and case insensitive filesystem */
public final class C139806zT {
    public final AnonymousClass8B0 A00;
    public final C1409773u A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139806zT) {
                C139806zT r5 = (C139806zT) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C139806zT(AnonymousClass8B0 r1, C1409773u r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        AnonymousClass1D6 r0 = (AnonymousClass1D6) it.next();
        abstractCollection.add(new C139806zT((AnonymousClass8B0) r0.second, (C1409773u) r0.first));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExpressionsTrayShapeData(shape=");
        A10.append(this.A01);
        A10.append(", shapeCreator=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
