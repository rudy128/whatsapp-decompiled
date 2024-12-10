package X;

import com.whatsapp.util.LRUCache;

/* renamed from: X.A3i  reason: case insensitive filesystem */
public abstract class C20016A3i {
    public static final LRUCache A00 = new LRUCache(16);

    public static final void A01(C143887Fe r2, String str) {
        C18070vi.A0d(str, 0);
        LRUCache lRUCache = A00;
        synchronized (lRUCache) {
            lRUCache.put(str, r2);
        }
    }

    public static final C143887Fe A00(String str) {
        C143887Fe r0;
        LRUCache lRUCache = A00;
        synchronized (lRUCache) {
            if (str == null) {
                r0 = null;
            } else {
                r0 = (C143887Fe) lRUCache.get(str);
            }
        }
        return r0;
    }
}
