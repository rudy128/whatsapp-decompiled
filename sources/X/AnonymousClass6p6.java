package X;

import java.util.AbstractMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6p6  reason: invalid class name */
public final class AnonymousClass6p6 {
    public final AnonymousClass00H A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final C18100vl A02 = AnonymousClass1DF.A01(new C149887jm(this));

    public AnonymousClass6p6(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str) {
        C18070vi.A0d(str, 0);
        ((AbstractMap) this.A02.getValue()).remove(str);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.6qp, java.lang.Object] */
    public final void A01(String str, List list) {
        ((AbstractMap) this.A02.getValue()).put(str, list);
        ConcurrentHashMap concurrentHashMap = this.A01;
        if (!concurrentHashMap.contains(str)) {
            ? obj = new Object();
            obj.A01 = 0;
            obj.A00 = 0;
            concurrentHashMap.put(str, obj);
        }
    }
}
