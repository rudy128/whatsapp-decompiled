package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Jo  reason: invalid class name */
public final class AnonymousClass0Jo {
    public final C16670so A00;
    public final Map A01 = new LinkedHashMap();
    public final C18090vk A02;

    public final Object A00(Object obj) {
        if (obj == null) {
            return null;
        }
        C04360Mw r0 = (C04360Mw) this.A01.get(obj);
        if (r0 != null) {
            return r0.A02;
        }
        AnonymousClass0V1 r2 = (AnonymousClass0V1) ((C16610si) this.A02.invoke());
        int BSs = r2.A02.BSs(obj);
        if (BSs != -1) {
            return r2.A01.A00(BSs);
        }
        return null;
    }

    public final AnonymousClass1OS A02(Object obj, Object obj2, int i) {
        Map map = this.A01;
        C04360Mw r1 = (C04360Mw) map.get(obj);
        if (r1 == null || r1.A00 != i || !C18070vi.A18(r1.A02, obj2)) {
            r1 = new C04360Mw(this, obj, obj2, i);
            map.put(obj, r1);
        }
        return r1.A01();
    }

    public AnonymousClass0Jo(C16670so r2, C18090vk r3) {
        this.A00 = r2;
        this.A02 = r3;
    }

    public final C18090vk A01() {
        return this.A02;
    }
}
