package X;

import android.app.Activity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.DsN  reason: case insensitive filesystem */
public final class C28158DsN extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ Set $splitPairFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28158DsN(Set set) {
        super(2);
        this.$splitPairFilters = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Activity activity = (Activity) obj;
        Activity activity2 = (Activity) obj2;
        C18070vi.A0h(activity, activity2);
        Set set = this.$splitPairFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C25150Ca1 ca1 = (C25150Ca1) it.next();
                C26129Csr csr = C26129Csr.A00;
                if (csr.A02(activity, ca1.A00) && csr.A02(activity2, ca1.A01)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
