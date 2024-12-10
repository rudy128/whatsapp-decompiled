package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Q7  reason: invalid class name */
public class AnonymousClass1Q7 {
    public int A00 = 0;
    public final C002100z A01 = new AnonymousClass27K(this);
    public final Map A02 = new HashMap();

    public synchronized AnonymousClass206 A00(AnonymousClass205 r5) {
        AnonymousClass206 r2;
        C002100z r3 = this.A01;
        r2 = (AnonymousClass206) r3.A04(r5);
        if (r2 == null) {
            Map map = this.A02;
            WeakReference weakReference = (WeakReference) map.get(r5);
            if (weakReference != null) {
                r2 = (AnonymousClass206) weakReference.get();
                map.remove(r5);
                if (r2 != null) {
                    r3.A08(r5, r2);
                }
            }
        }
        return r2;
    }

    public synchronized void A01(AnonymousClass206 r2, AnonymousClass205 r3) {
        this.A02.remove(r3);
        this.A01.A08(r3, r2);
    }

    public synchronized void A02(AnonymousClass205 r2) {
        this.A02.remove(r2);
        this.A01.A05(r2);
    }
}
