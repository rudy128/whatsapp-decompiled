package X;

import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.DoO  reason: case insensitive filesystem */
public final class C27926DoO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Set $activityFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27926DoO(Set set) {
        super(1);
        this.$activityFilters = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent intent = (Intent) obj;
        C18070vi.A0d(intent, 0);
        Set set = this.$activityFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C26129Csr.A00.A03(intent, ((C25129CZc) it.next()).A00)) {
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
