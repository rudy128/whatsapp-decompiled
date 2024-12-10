package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.2lN  reason: invalid class name and case insensitive filesystem */
public final class C58862lN {
    public final C18100vl A00;

    public C58862lN(AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = new C18110vm(new AnonymousClass3HR(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C60192nY A00(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            monitor-enter(r2)
            X.0vl r0 = r2.A00     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0020 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0020 }
            java.lang.Object r1 = r0.get(r3)     // Catch:{ all -> 0x0020 }
            X.2nY r1 = (X.C60192nY) r1     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001d
            boolean r0 = r1.A0J()     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001d
            monitor-exit(r2)
            return r1
        L_0x001d:
            monitor-exit(r2)
            r1 = 0
            return r1
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58862lN.A00(java.lang.String):X.2nY");
    }

    public final List A01() {
        ArrayList A13;
        synchronized (this) {
            Collection A0g = C17890vO.A0g(this.A00);
            A13 = AnonymousClass000.A13();
            for (Object next : A0g) {
                if (((C60192nY) next).A0J()) {
                    A13.add(next);
                }
            }
        }
        return A13;
    }

    public final Set A02() {
        List<C60192nY> A01 = A01();
        ArrayList A0D = C29351c6.A0D(A01);
        for (C60192nY A0E : A01) {
            A0D.add(A0E.A0E());
        }
        return C29431cG.A12(A0D);
    }
}
