package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.178  reason: invalid class name */
public final class AnonymousClass178 {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final WeakReference A00(String str) {
        C18070vi.A0d(str, 0);
        return (WeakReference) this.A00.get(str);
    }

    public final void A01(C23291Fl r4) {
        this.A00.put(r4.BSb(), new WeakReference(r4));
    }

    public final void A02(C23291Fl r3) {
        this.A00.remove(r3.BSb());
    }
}
