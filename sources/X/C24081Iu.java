package X;

import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Iu  reason: invalid class name and case insensitive filesystem */
public class C24081Iu {
    public final Map A00 = new LinkedHashMap();

    public final void A00() {
        Map map = this.A00;
        for (AnonymousClass1J2 r3 : map.values()) {
            r3.A02 = true;
            Map map2 = r3.A00;
            synchronized (map2) {
                for (Object A02 : map2.values()) {
                    AnonymousClass1J2.A02(A02);
                }
            }
            Set<Closeable> set = r3.A01;
            synchronized (set) {
                for (Closeable A022 : set) {
                    AnonymousClass1J2.A02(A022);
                }
            }
            set.clear();
            r3.A0S();
        }
        map.clear();
    }
}
