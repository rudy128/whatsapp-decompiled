package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3Ha  reason: invalid class name and case insensitive filesystem */
public final class C71443Ha extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62582rd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71443Ha(C62582rd r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A13 = C17880vN.A13();
        Iterator it = ((C63332st) this.this$0.A05.get()).A02().iterator();
        while (it.hasNext()) {
            C59762mq r1 = (C59762mq) it.next();
            C17880vN.A1O(r1, A13, r1.A00);
        }
        return A13;
    }
}
