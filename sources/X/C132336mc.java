package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6mc  reason: invalid class name and case insensitive filesystem */
public final class C132336mc {
    public List A00;
    public Map A01;
    public final AnonymousClass1M9 A02;

    public C132336mc(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public final List A00() {
        List list;
        List list2 = this.A00;
        if (list2 != null) {
            return list2;
        }
        synchronized (this) {
            list = this.A00;
            if (list == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A02.A0v(copyOnWriteArrayList);
                list = C29431cG.A0t(copyOnWriteArrayList);
                this.A00 = list;
            }
            C18070vi.A0z(list, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.data.WAContact>");
        }
        return list;
    }
}
