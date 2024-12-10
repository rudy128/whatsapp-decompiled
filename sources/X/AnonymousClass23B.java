package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.23B  reason: invalid class name */
public final class AnonymousClass23B extends AnonymousClass234 {
    public List A00;

    public final void A18(List list) {
        C18070vi.A0d(list, 0);
        C27354DcQ A01 = AnonymousClass1ZT.A01();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C58952lW r1 = (C58952lW) it.next();
            C163788Wi r2 = (C163788Wi) C165818bo.DEFAULT_INSTANCE.A0N();
            r2.A0G(r1.A01);
            C164088Xm r0 = r1.A00;
            if (r0 != null) {
                r2.A0E();
                C165818bo r12 = (C165818bo) r2.A00;
                r12.placeholderMessageResendResponse_ = r0;
                r12.bitField0_ |= 8;
            }
            A01.add(r2.A0C());
        }
        this.A00 = AnonymousClass1ZT.A02(A01);
    }
}
