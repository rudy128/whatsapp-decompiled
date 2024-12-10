package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.1ZT  reason: invalid class name */
public abstract class AnonymousClass1ZT {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.DcQ, X.1JC] */
    public static final C27354DcQ A01() {
        ? r1 = new AnonymousClass1JC();
        r1.backing = new Object[10];
        return r1;
    }

    public static final C27354DcQ A02(List list) {
        C27354DcQ dcQ = (C27354DcQ) list;
        C27354DcQ.A06(dcQ);
        dcQ.isReadOnly = true;
        if (dcQ.length <= 0) {
            return C27354DcQ.A00;
        }
        return dcQ;
    }

    public static final List A00(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C18070vi.A0X(singletonList);
        return singletonList;
    }
}
