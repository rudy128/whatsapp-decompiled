package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3sw  reason: invalid class name and case insensitive filesystem */
public class C78523sw extends C94154k8 {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78523sw(C78543sy r2) {
        super(r2);
        this.A01 = r2;
    }

    public void Bq0(Collection collection) {
        int i = this.A00;
        C18070vi.A0d(collection, 0);
        Iterator it = collection.iterator();
        if (i != 0) {
            while (it.hasNext()) {
                AnonymousClass1BI A0l = C72453Mb.A0l(it);
                C78913tt r2 = (C78913tt) this.A01;
                if (AnonymousClass3MZ.A1Y(r2.A03, A0l)) {
                    r2.A03 = r2.A0w.A01(AnonymousClass205.A00(r2.A0I));
                }
            }
            return;
        }
        while (it.hasNext()) {
            AnonymousClass1BI A0l2 = C72453Mb.A0l(it);
            C78913tt r22 = (C78913tt) this.A01;
            if (AnonymousClass3MZ.A1Y(r22.A03, A0l2)) {
                r22.A03 = r22.A0w.A01(AnonymousClass205.A00(r22.A0I));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78523sw(C78953tz r2) {
        super(r2);
        this.A01 = r2;
    }
}
