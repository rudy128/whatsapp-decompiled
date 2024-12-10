package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2Za  reason: invalid class name and case insensitive filesystem */
public class C51632Za {
    public final Map A00 = new AnonymousClass00O(0);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.00O, java.util.Map] */
    public C51632Za(Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            Object value = A16.getValue();
            C17960vV.A07(key);
            for (Object put : (Set) key) {
                this.A00.put(put, value);
            }
        }
    }
}
