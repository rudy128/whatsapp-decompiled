package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1SA  reason: invalid class name */
public final class AnonymousClass1SA extends C24741Lm {
    public final Map A00 = new HashMap();

    public synchronized void A0A() {
        this.A00.clear();
    }

    public synchronized String BZc() {
        StringBuilder sb;
        sb = new StringBuilder("fpspc/");
        int i = 0;
        int i2 = 0;
        for (WeakReference weakReference : this.A00.values()) {
            List list = (List) weakReference.get();
            if (list != null) {
                i++;
                i2 += list.size();
            }
        }
        sb.append("s=");
        sb.append(i);
        sb.append("/el=");
        sb.append(i2);
        return sb.toString();
    }

    public synchronized void C9L(C122516Qr r5, boolean z) {
        Map map = this.A00;
        for (WeakReference weakReference : map.values()) {
            List list = (List) weakReference.get();
            if (list != null) {
                list.clear();
            }
            weakReference.clear();
        }
        map.clear();
    }

    public AnonymousClass1SA(C24571Kv r2) {
        super(r2);
        A09();
    }
}
