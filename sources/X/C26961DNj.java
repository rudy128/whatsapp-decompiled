package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.DNj  reason: case insensitive filesystem */
public final class C26961DNj implements E89 {
    public final C26012CqT A00;

    public /* bridge */ /* synthetic */ E88 BSv(C28464E2f e2f, C25681CkC ckC, Object obj) {
        C25166CaH caH;
        C23721BoS A002;
        C28464E2f e2f2 = e2f;
        C25137CZn cZn = (C25137CZn) obj;
        if (cZn != null) {
            caH = cZn.A00;
        } else {
            caH = null;
        }
        C26953DNb dNb = (C26953DNb) e2f2;
        Map map = dNb.A02;
        C18070vi.A0b(map);
        C25681CkC ckC2 = ckC;
        String str = (String) A00(ckC2, "app_id", map);
        if (str != null) {
            Number number = (Number) A00(ckC2, "cache_ttl", map);
            if (number != null) {
                long longValue = number.longValue();
                Map map2 = (Map) A00(ckC2, "params", map);
                if (map2 == null) {
                    map2 = AnonymousClass1D7.A0I();
                }
                Map map3 = (Map) A00(ckC2, "client_params", map);
                if (map3 == null) {
                    map3 = AnonymousClass1D7.A0I();
                }
                C26012CqT cqT = this.A00;
                String A003 = C26177Ctv.A00(str, map2);
                synchronized (cqT.A07) {
                    A002 = C26012CqT.A00(cqT, caH, A003, longValue);
                }
                List list = ckC2.A06;
                C18070vi.A0W(list);
                String str2 = dNb.A00;
                C18070vi.A0X(str2);
                Object obj2 = map.get("query_id");
                AnonymousClass8BR.A1I(obj2);
                return new C26958DNg(cqT, A002, str2, (String) obj2, str, list, map2, map3, longValue);
            }
            throw AnonymousClass000.A0k("AsyncComponentQuery data manifest entry must specify a non-null cache TTL.");
        }
        throw AnonymousClass000.A0k("AsyncComponentQuery data manifest entry must specify a non-null appId.");
    }

    public C26961DNj(C26012CqT cqT) {
        this.A00 = cqT;
    }

    public static final Object A00(C25681CkC ckC, String str, Map map) {
        String str2;
        Object A002;
        Object obj = map.get(str);
        if (!(obj instanceof String) || (str2 = (String) obj) == null || (A002 = CCJ.A00(C199029zJ.A01, new C26972DNu((E9O) null, str2, ckC.A06, -1), ckC)) == null) {
            return null;
        }
        return A002;
    }

    public COB BZR(E6H e6h) {
        C25167CaI caI;
        WeakReference A0z = AnonymousClass3MW.A0z(e6h);
        C26012CqT cqT = this.A00;
        DNZ dnz = new DNZ(A0z, 2);
        synchronized (cqT.A08) {
            caI = new C25167CaI(cqT.A06.A00(dnz), new C25137CZn(cqT.A00));
        }
        return new COB(caI.A01, caI.A00);
    }
}
