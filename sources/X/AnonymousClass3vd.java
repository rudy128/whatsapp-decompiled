package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3vd  reason: invalid class name */
public final class AnonymousClass3vd extends C95094lg {
    public final C34511kb A00;
    public final AnonymousClass1LU A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3vd(X.C19880zA r9, X.AnonymousClass1KB r10, X.AnonymousClass18O r11, X.C34511kb r12, X.AnonymousClass1LU r13, X.AnonymousClass1c4 r14, X.AnonymousClass00H r15, X.AnonymousClass00H r16, X.AnonymousClass00H r17) {
        /*
            r8 = this;
            r2 = r10
            r3 = r11
            r4 = r14
            X.C18070vi.A0w(r10, r13, r11, r14, r12)
            r1 = r9
            r5 = r15
            r6 = r16
            X.C18070vi.A0q(r15, r6, r9)
            r0 = 9
            r7 = r17
            X.C18070vi.A0d(r7, r0)
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.A01 = r13
            r8.A00 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3vd.<init>(X.0zA, X.1KB, X.18O, X.1kb, X.1LU, X.1c4, X.00H, X.00H, X.00H):void");
    }

    public boolean CMC(Collection collection) {
        C62572rc r0;
        C18070vi.A0d(collection, 0);
        if (super.CMC(collection)) {
            return true;
        }
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if ((A0Y instanceof AnonymousClass21V) && (r0 = ((AnonymousClass21V) A0Y).A02) != null && !r0.A0V) {
                return true;
            }
        }
        return false;
    }
}
