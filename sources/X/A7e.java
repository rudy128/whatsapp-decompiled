package X;

import java.util.Iterator;
import java.util.Map;

public final class A7e {
    public static final A7e A00 = new Object();

    public static final void A01(C20132A8s a8s, Object obj, String str) {
        C18070vi.A0d(obj, 2);
        String str2 = str;
        if (obj instanceof Number) {
            long A05 = C17880vN.A05(obj);
            if (str != null) {
                a8s.A04.markerAnnotate(a8s.A02, a8s.A01, str2, A05);
            }
        } else if (obj instanceof Boolean) {
            a8s.A0L(str, AnonymousClass000.A1Y(obj));
        } else {
            a8s.A0J(str, obj.toString());
        }
    }

    public static final void A03(Long l, String str, String str2, Map map, int i) {
        C18070vi.A0d(map, 3);
        C20132A8s A002 = A00(str, i);
        if (A002 != null) {
            if (l == null) {
                A002.A0F(str2);
            } else {
                A002.A0I(str2, l.longValue());
            }
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A16.getKey();
                A16.getValue();
                A02(A002, map);
            }
        }
    }

    public static final C20132A8s A00(String str, int i) {
        C198409yI r6;
        C20132A8s a8s;
        if (str == null) {
            return null;
        }
        int parseInt = Integer.parseInt(str);
        synchronized (C198409yI.A05) {
            r6 = C198409yI.A04;
            if (r6 == null) {
                r6 = new C198409yI();
                C198409yI.A04 = r6;
            }
        }
        long j = (((long) parseInt) & 4294967295L) | ((((long) i) << 32) & -4294967296L);
        synchronized (r6) {
            a8s = (C20132A8s) r6.A00.get(j);
        }
        return a8s;
    }

    public static final void A02(C20132A8s a8s, Map map) {
        String str;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            Object value = A16.getValue();
            if (value != null) {
                if (!(key instanceof Number) || key == null || (str = key.toString()) == null) {
                    str = key.toString();
                }
                A01(a8s, value, str);
            }
        }
    }
}
