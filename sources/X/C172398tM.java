package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.8tM  reason: invalid class name and case insensitive filesystem */
public final class C172398tM extends AnonymousClass163 {
    public /* bridge */ /* synthetic */ Object A01(Object obj, Map map) {
        C18070vi.A0d(map, 0);
        if (!(!map.isEmpty())) {
            return new AnonymousClass8fP();
        }
        int size = map.size();
        Collection values = map.values();
        if (size > 1) {
            return new C167088fN(C29431cG.A0t(values));
        }
        return new C167098fO((C1404571m) C29431cG.A0X(values));
    }
}
