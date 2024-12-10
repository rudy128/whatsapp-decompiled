package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ne  reason: invalid class name and case insensitive filesystem */
public final class C152277ne extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C131126kY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152277ne(C131126kY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C32171gl r4;
        if (((C19880zA) this.this$0.A02.get()).A07()) {
            r4 = (C32171gl) ((C19880zA) this.this$0.A02.get()).A03();
        } else {
            r4 = null;
        }
        List list = this.this$0.A06;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                if (C22971Dz.A0e(A0Q) && r4 != null && r4.Bey(A0Q)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
