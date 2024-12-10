package androidx.lifecycle;

import X.AnonymousClass1FD;
import X.AnonymousClass1JO;
import X.AnonymousClass1b2;
import X.C18070vi;
import X.C71793Ij;
import X.C71803Ik;
import android.view.View;

public abstract class ViewTreeViewModelStoreOwner {
    public static final AnonymousClass1FD A00(View view) {
        C18070vi.A0d(view, 0);
        return (AnonymousClass1FD) AnonymousClass1b2.A04(AnonymousClass1b2.A0A(C71803Ik.A00, AnonymousClass1JO.A03(view, C71793Ij.A00)));
    }

    public static final void A01(View view, AnonymousClass1FD r2) {
        C18070vi.A0d(view, 0);
        view.setTag(2131436829, r2);
    }
}
