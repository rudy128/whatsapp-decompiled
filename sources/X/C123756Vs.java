package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Vs  reason: invalid class name and case insensitive filesystem */
public abstract class C123756Vs {
    public static AnonymousClass62C A00(String str, List list, Map map, int i, int i2, int i3) {
        boolean A1P = AnonymousClass000.A1P(list.size() % 4);
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A15("BloksFieldStatParser/parseFieldStat/invalid serialization/length=", A10, list);
        C17960vV.A0G(A1P, A10.toString());
        int size = list.size() / 4;
        ArrayList A13 = AnonymousClass000.A13();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = i4 * 4;
            int A0n = AnonymousClass001.A0n(list, i5 + 2);
            Object obj = list.get(i5 + 3);
            Object A00 = C181109Pe.A00(obj, A0n, false);
            if (A00 != null) {
                int A0n2 = AnonymousClass001.A0n(list, i5);
                A13.add(new C128976gz(A00, C181109Pe.A00(obj, A0n, true), C17880vN.A0w(list, i5 + 1), A0n2));
            }
        }
        return new AnonymousClass62C(new C18180vt(C20099A7c.A01(C17880vN.A0s("sample_rate_debug", map), 1), C20099A7c.A01(C17880vN.A0s("sample_rate_beta", map), 20), C20099A7c.A01(C17880vN.A0s("sample_rate_beta", map), 20), C20099A7c.A01(C17880vN.A0s("sample_rate_release", map), 20), "1".equals(map.get("log_all_for_debug"))), str, (C128976gz[]) A13.toArray(new C128976gz[0]), i, i2, i3);
    }
}
