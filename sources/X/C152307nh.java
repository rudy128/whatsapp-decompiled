package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7nh  reason: invalid class name and case insensitive filesystem */
public final class C152307nh extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C131126kY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152307nh(C131126kY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C131126kY r4 = this.this$0;
        List list = r4.A06;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((AnonymousClass11S) r4.A03.get()).A0S(C17880vN.A0S(it))) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
