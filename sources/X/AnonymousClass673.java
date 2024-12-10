package X;

import java.util.Map;

/* renamed from: X.673  reason: invalid class name */
public final class AnonymousClass673 extends AnonymousClass163 {
    public /* bridge */ /* synthetic */ Object A01(Object obj, Map map) {
        Integer num;
        C18070vi.A0d(map, 0);
        if (C108965cb.A1a(map, 4177005)) {
            return new AnonymousClass6SV();
        }
        if (C108965cb.A1a(map, 1675030)) {
            return new AnonymousClass6SU();
        }
        if (C108965cb.A1a(map, 4177007)) {
            return new AnonymousClass6SX();
        }
        if (C108965cb.A1a(map, 4177006)) {
            return new AnonymousClass6SW();
        }
        if (C108965cb.A1a(map, 4177004)) {
            return new AnonymousClass6SZ();
        }
        if (C108965cb.A1a(map, 4177001)) {
            return new AnonymousClass6SY();
        }
        if (!(!map.isEmpty())) {
            return null;
        }
        C1404571m r0 = (C1404571m) C29431cG.A0Y(map.values());
        if (r0 != null) {
            num = Integer.valueOf(r0.A01);
        } else {
            num = null;
        }
        return new AnonymousClass6ST(num);
    }
}
