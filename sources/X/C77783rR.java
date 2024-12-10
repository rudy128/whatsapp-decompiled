package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3rR  reason: invalid class name and case insensitive filesystem */
public final class C77783rR extends C826949j {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1MZ A02;
    public final AnonymousClass1EC A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77783rR(AnonymousClass11S r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass3gf r6, C18000vb r7, AnonymousClass1MZ r8, AnonymousClass1EC r9, List list) {
        super(r5, r6, r7, list);
        C18070vi.A0w(r3, r4, r8, r5, r7);
        C18070vi.A0d(r9, 7);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r8;
        this.A03 = r9;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C826949j.A00(this, it);
        }
    }
}
