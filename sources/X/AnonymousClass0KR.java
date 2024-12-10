package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0KR  reason: invalid class name */
public final class AnonymousClass0KR {
    public Object[] A00;
    public Map A01;
    public Map A02;

    public final Object A00(Class cls) {
        C18070vi.A0d(cls, 0);
        Map map = this.A01;
        if (map != null) {
            return map.remove(cls);
        }
        return null;
    }

    public final Object A01(Class cls) {
        C18070vi.A0d(cls, 0);
        Map map = this.A02;
        if (map != null) {
            return map.remove(cls);
        }
        return null;
    }

    public final void A02(Class cls, Object obj, int i) {
        C18070vi.A0d(cls, 1);
        if (obj != null) {
            Map map = this.A01;
            if (map == null) {
                map = new LinkedHashMap(i);
            }
            map.put(cls, obj);
            if (this.A01 == null) {
                this.A01 = map;
            }
        }
    }

    public final void A03(Class cls, Object obj, int i) {
        C18070vi.A0d(cls, 1);
        if (obj != null) {
            Map map = this.A02;
            if (map == null) {
                map = new LinkedHashMap(i);
            }
            map.put(cls, obj);
            if (this.A02 == null) {
                this.A02 = map;
            }
        }
    }
}
