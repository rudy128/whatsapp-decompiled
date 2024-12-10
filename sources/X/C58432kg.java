package X;

import android.util.LruCache;
import java.util.List;

/* renamed from: X.2kg  reason: invalid class name and case insensitive filesystem */
public final class C58432kg {
    public final LruCache A00 = new LruCache(300);
    public final AnonymousClass190 A01;

    public C58432kg(AnonymousClass190 r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
    }

    public final List A00(String str) {
        if (str == null) {
            return null;
        }
        List list = (List) this.A00.get(str);
        if (list == null) {
            this.A01.A0G("mention cache miss", (String) null, false);
        }
        return list;
    }

    public final void A01(String str, List list) {
        C18070vi.A0d(str, 0);
        this.A00.put(str, list);
    }
}
