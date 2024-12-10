package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4Qe  reason: invalid class name and case insensitive filesystem */
public final class C86104Qe {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final AnonymousClass126 A02;
    public final C24901Mc A03;

    public final AnonymousClass4ZN A00(Collection collection) {
        C18070vi.A0d(collection, 0);
        AnonymousClass1M9 r2 = this.A00;
        C24921Me r3 = this.A01;
        ArrayList A0D = C29351c6.A0D(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0D.add(C72473Md.A0X(it));
        }
        boolean z = true;
        if (collection.size() != 1 || !((AnonymousClass1E7) C29431cG.A0X(collection)).A0B()) {
            z = false;
        }
        return AnonymousClass74H.A04(r2, r3, A0D, 3, z, true);
    }

    public C86104Qe(AnonymousClass1M9 r1, C24921Me r2, AnonymousClass126 r3, C24901Mc r4) {
        C18070vi.A0s(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
