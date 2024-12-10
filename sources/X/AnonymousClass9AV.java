package X;

import com.whatsapp.util.LRUCache;
import java.util.Map;

/* renamed from: X.9AV  reason: invalid class name */
public final class AnonymousClass9AV extends C24741Lm {
    public final Map A00 = new LRUCache(12);
    public final Map A01 = new LRUCache(12);
    public final Map A02 = new LRUCache(12);

    public String BZc() {
        String A0t;
        synchronized (this) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("LinkedAccountMediaCacheManager=");
            A10.append(this.A00.size());
            A10.append(",");
            A10.append(this.A02.size());
            A10.append(",");
            A0t = C17880vN.A0t(A10, this.A01.size());
        }
        return A0t;
    }

    public void C9L(C122516Qr r2, boolean z) {
        synchronized (this) {
            this.A00.clear();
            this.A02.clear();
            this.A01.clear();
        }
    }

    public AnonymousClass9AV(C24571Kv r3) {
        super(r3);
        A09();
    }
}
