package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Rc  reason: invalid class name and case insensitive filesystem */
public class C26171Rc {
    public final AnonymousClass11P A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public void A00(String[] strArr) {
        Set set = this.A03;
        synchronized (set) {
            set.removeAll(C22971Dz.A0C(strArr));
        }
    }

    public boolean A01(AnonymousClass205 r3) {
        boolean add;
        Set set = this.A02;
        synchronized (set) {
            add = set.add(r3);
        }
        return add;
    }

    public C26171Rc(AnonymousClass11P r2) {
        this.A00 = r2;
    }
}
