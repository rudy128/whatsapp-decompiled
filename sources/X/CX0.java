package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class CX0 {
    public final E9K A00;
    public final CQK A01;
    public final Map A02 = C17880vN.A13();
    public final Set A03 = C17880vN.A14();
    public final CMB A04;

    public final void A00(C25206Caz caz, String str, String str2, Executor executor, C22821Di r25, boolean z) {
        String str3 = str;
        C18070vi.A0d(str3, 0);
        C25206Caz caz2 = caz;
        String str4 = str2;
        C18070vi.A0j(str4, caz2);
        Executor executor2 = executor;
        C22821Di r14 = r25;
        C18070vi.A0g(executor2, 4, r14);
        Map map = this.A02;
        Set set = (Set) map.get(str3);
        C24285Byi byi = caz2.A01;
        if (set != null) {
            map.put(str3, C41841x9.A05(byi, set));
            return;
        }
        map.put(str3, C18070vi.A0P(byi));
        CO6 co6 = new CO6();
        CXM cxm = new CXM(this, co6, caz2, str3, str4, executor2, r14, z);
        Long valueOf = Long.valueOf(this.A00.currentMonotonicTimestamp());
        Map map2 = co6.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("component_query_fetcher");
        map2.put(C17890vO.A0Z("request_start", A10, '_'), valueOf);
        co6.A00.put(C17890vO.A0Z("query_src", AnonymousClass000.A11("component_query_fetcher"), '_'), "www");
        LinkedHashMap A08 = AnonymousClass1D7.A08(caz2.A03);
        CMB cmb = this.A04;
        String str5 = caz2.A02;
        StringBuilder A0u = BE6.A0u("{\"server_params\":");
        C18070vi.A0z(A08, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
        String A0n = BEA.A0n(new JSONObject(A08).toString(), A0u);
        C18070vi.A0X(A0n);
        ((C19995A2i) cmb.A00.get()).A03(new ADL(0, "ASYNC_COMPONENT", false), new DRD(cxm), (Boolean) null, str5, A0n, (String) null);
    }

    public CX0(E9K e9k, CQK cqk, CMB cmb) {
        this.A04 = cmb;
        this.A00 = e9k;
        this.A01 = cqk;
    }
}
