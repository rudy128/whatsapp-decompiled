package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.66z  reason: invalid class name and case insensitive filesystem */
public abstract class C1191666z extends AnonymousClass163 {
    public /* bridge */ /* synthetic */ Object A01(Object obj, Map map) {
        C18070vi.A0d(map, 0);
        int size = map.size();
        Collection<C1404571m> values = map.values();
        if (size <= 1) {
            return new C115235tc(A03((C1404571m) C29431cG.A0X(values)));
        }
        ArrayList A0D = C29351c6.A0D(values);
        for (C1404571m A03 : values) {
            A0D.add(A03(A03));
        }
        return new C115215ta(A0D);
    }

    public abstract Throwable A03(C1404571m r1);
}
