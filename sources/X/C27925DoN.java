package X;

import android.app.Activity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.DoN  reason: case insensitive filesystem */
public final class C27925DoN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Set $activityFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27925DoN(Set set) {
        super(1);
        this.$activityFilters = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        C18070vi.A0d(activity, 0);
        Set set = this.$activityFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C26129Csr.A00.A02(activity, ((C25129CZc) it.next()).A00)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
