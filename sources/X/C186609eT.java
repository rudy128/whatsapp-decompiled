package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9eT  reason: invalid class name and case insensitive filesystem */
public final class C186609eT {
    public final C188419hO A00;
    public final List A01 = AnonymousClass000.A13();
    public final List A02 = AnonymousClass000.A13();
    public final List A03 = AnonymousClass000.A13();

    public C186609eT(C188419hO r9, List list) {
        List list2;
        C18070vi.A0d(r9, 1);
        this.A00 = r9;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C178119Bw r6 = (C178119Bw) it.next();
            if (!r6.A0V()) {
                long j = r6.A01;
                C188419hO r3 = this.A00;
                if (j >= r3.A04 && r6.A0B().size() <= r3.A01) {
                    if (!r6.A0O()) {
                        list2 = this.A03;
                    } else if (r6.A0M()) {
                        list2 = this.A01;
                    } else if (r6.A0C != null) {
                        list2 = this.A02;
                    }
                    list2.add(r6);
                }
            }
        }
    }
}
