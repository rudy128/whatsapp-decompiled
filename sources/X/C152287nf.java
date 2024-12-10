package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7nf  reason: invalid class name and case insensitive filesystem */
public final class C152287nf extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C131126kY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152287nf(C131126kY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list = this.this$0.A06;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C22971Dz.A0S(C17880vN.A0S(it))) {
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
