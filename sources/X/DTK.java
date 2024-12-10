package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class DTK implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C24285Byi A01;
    public final /* synthetic */ C26012CqT A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public DTK(C24285Byi byi, C26012CqT cqT, String str, Map map, Set set, long j, boolean z, boolean z2) {
        this.A02 = cqT;
        this.A03 = str;
        this.A04 = map;
        this.A05 = set;
        this.A00 = j;
        this.A01 = byi;
        this.A06 = z;
        this.A07 = z2;
    }

    public final void run() {
        C26012CqT cqT = this.A02;
        String str = this.A03;
        Map map = this.A04;
        Set set = this.A05;
        LinkedHashMap linkedHashMap = map;
        if (set != null) {
            LinkedHashMap A13 = C17880vN.A13();
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (set.contains(A16.getKey())) {
                    C108985cd.A1R(A13, A16);
                }
            }
            linkedHashMap = A13;
        }
        String A002 = C26177Ctv.A00(str, linkedHashMap);
        C25206Caz caz = new C25206Caz(this.A01, str, map, this.A00);
        CX0 cx0 = cqT.A04;
        boolean z = this.A06;
        Executor executor = cqT.A0B;
        C28089Dr3 dr3 = new C28089Dr3(cqT, str, map, this.A07);
        C18070vi.A0d(executor, 4);
        StringBuilder A11 = AnonymousClass000.A11(A002);
        A11.append(':');
        long j = caz.A00;
        String A0u = C17880vN.A0u(A11, j);
        Set set2 = cx0.A03;
        if (!set2.contains(A0u)) {
            set2.add(A0u);
            CWI cwi = cx0.A01.A01;
            C28095Dr9 dr9 = new C28095Dr9(cx0, caz, A0u, A002, str, executor, dr3, z);
            long now = cwi.A00.now();
            LinkedHashMap A132 = C17880vN.A13();
            LinkedHashMap A133 = C17880vN.A13();
            A133.put(C17890vO.A0Z("query_src", AnonymousClass000.A11("write_through_cache"), '_'), "cache");
            CO9 COx = cwi.A02.COx(A002);
            if (COx == null || !(COx instanceof C23727BoY) || !C26177Ctv.A02(COx, j, now)) {
                dr9.invoke((Object) null);
                return;
            }
            A133.put(C17890vO.A0Z("cache_src", AnonymousClass000.A11("write_through_cache"), '_'), "memory");
            dr9.invoke(new C25139CZp(AnonymousClass1D6.A01(COx, new CO7(AnonymousClass1D7.A0F(A132), AnonymousClass1D7.A0F(A133)))));
        }
    }
}
