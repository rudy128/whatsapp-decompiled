package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4GO  reason: invalid class name */
public abstract class AnonymousClass4GO {
    public static final Integer A00(C88534a3 r5, Collection collection) {
        C441722k r2;
        AnonymousClass7LG r0;
        C18070vi.A0d(r5, 1);
        int size = collection.size();
        C18030ve r22 = r5.A01;
        C18040vf r1 = C18040vf.A02;
        if (size <= C18020vd.A00(r1, r22, 6811) && C18020vd.A05(r1, r22, 2890) && (r5.A09() || !C18020vd.A05(r1, r22, 12747))) {
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!r5.A0C(C17880vN.A0Y(it), true)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!collection.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it2);
                    CM2 cm2 = null;
                    if (!(!(A0Y instanceof C441822l) || (r2 = (C441722k) A0Y) == null || (r0 = (AnonymousClass7LG) r2.A00.A02) == null)) {
                        cm2 = r0.A04;
                    }
                    if (!(cm2 instanceof C24126Bvs)) {
                        return AnonymousClass00R.A01;
                    }
                }
            }
            if (r5.A09()) {
                return AnonymousClass00R.A0C;
            }
        }
        return AnonymousClass00R.A00;
    }
}
