package X;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.6LS  reason: invalid class name */
public final class AnonymousClass6LS extends A34 {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C18070vi.A0d(obj, 0);
        AnonymousClass1GV r0 = (AnonymousClass1GV) this.A00.get();
        if (r0 != null) {
            r0.accept(obj);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        File file;
        C127966fE[] r4 = (C127966fE[]) objArr;
        C18070vi.A0d(r4, 0);
        C127966fE r1 = r4[0];
        if (r1 == null || (file = r1.A01) == null) {
            return C18460wS.A00;
        }
        int i = r1.A00;
        ArrayList A01 = AnonymousClass70j.A01(file);
        if (i == -1) {
            return A01;
        }
        ArrayList A0z = C17880vN.A0z(i);
        AnonymousClass6WC.A00(A01, A0z, i);
        return A0z;
    }

    public AnonymousClass6LS(AnonymousClass1GV r2) {
        this.A00 = AnonymousClass3MW.A0z(r2);
    }
}
