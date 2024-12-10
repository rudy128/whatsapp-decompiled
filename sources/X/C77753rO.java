package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3rO  reason: invalid class name and case insensitive filesystem */
public final class C77753rO extends C826949j {
    public final C34511kb A00;
    public final AnonymousClass1M9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77753rO(C34511kb r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass3gf r6, C18000vb r7, List list) {
        super(r5, r6, r7, list);
        C18070vi.A0s(r4, r3, r5, r7);
        this.A01 = r4;
        this.A00 = r3;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C826949j.A00(this, it);
        }
    }
}
