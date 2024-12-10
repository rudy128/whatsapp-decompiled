package X;

import com.instagram.common.bloks.payload.BloksACQResources;
import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Dr3  reason: case insensitive filesystem */
public final class C28089Dr3 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ String $appId;
    public final /* synthetic */ C28463E2e $onFetchCallback = null;
    public final /* synthetic */ Map $params;
    public final /* synthetic */ boolean $shouldPrefetchSubqueries;
    public final /* synthetic */ C26012CqT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28089Dr3(C26012CqT cqT, String str, Map map, boolean z) {
        super(1);
        this.$shouldPrefetchSubqueries = z;
        this.this$0 = cqT;
        this.$params = map;
        this.$appId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        BloksComponentQueryResources bloksComponentQueryResources;
        CO8 co8 = (CO8) obj;
        C18070vi.A0d(co8, 0);
        if (co8 instanceof C23724BoV) {
            try {
                if (this.$shouldPrefetchSubqueries && (bloksComponentQueryResources = ((C23724BoV) co8).A00) != null) {
                    C26012CqT cqT = this.this$0;
                    Map map = this.$params;
                    List list = bloksComponentQueryResources.asyncComponentQueries;
                    if (list != null && AnonymousClass000.A1a(list)) {
                        List<BloksACQResources> list2 = bloksComponentQueryResources.asyncComponentQueries;
                        C18070vi.A0W(list2);
                        for (BloksACQResources bloksACQResources : list2) {
                            LinkedHashMap A13 = C17880vN.A13();
                            Map map2 = bloksACQResources.consumedParams;
                            if (map2 != null) {
                                Iterator A15 = AnonymousClass000.A15(map2);
                                while (A15.hasNext()) {
                                    Map.Entry A16 = AnonymousClass000.A16(A15);
                                    Object key = A16.getKey();
                                    C18070vi.A0X(key);
                                    A13.put(key, map.get(A16.getValue()));
                                }
                            }
                            String str2 = bloksACQResources.appId;
                            C18070vi.A0W(str2);
                            Set set = bloksACQResources.cacheKeys;
                            Long l = bloksACQResources.cacheTtl;
                            C18070vi.A0W(l);
                            long longValue = l.longValue();
                            C24285Byi byi = C24285Byi.PARALLEL_FETCH;
                            C18070vi.A0h(str2, A13);
                            C18070vi.A0d(byi, 5);
                            cqT.A0B.execute(new DTK(byi, cqT, str2, A13, set, longValue, true, false));
                        }
                    }
                }
            } catch (ClassCastException unused) {
                C26012CqT cqT2 = this.this$0;
                String str3 = this.$appId;
                Map map3 = this.$params;
                C24278Byb[] bybArr = new C24278Byb[2];
                bybArr[0] = C24278Byb.MEMORY;
                cqT2.A02(str3, map3, BE6.A15(C24278Byb.DISK, bybArr, 1));
            }
        } else if ((co8 instanceof C23723BoU) || (co8 instanceof C23726BoX)) {
            C26012CqT cqT3 = this.this$0;
            ArrayList A132 = AnonymousClass000.A13();
            synchronized (cqT3.A07) {
                Iterator it = cqT3.A0A.iterator();
                while (it.hasNext()) {
                    CQJ cqj = (CQJ) it.next();
                    C22821Di r2 = cqj.A01;
                    String str4 = cqj.A00;
                    if (co8 instanceof C23725BoW) {
                        str = ((C23725BoW) co8).A01;
                    } else {
                        str = co8.A01;
                    }
                    if (C18070vi.A18(str4, str)) {
                        A132.add(r2);
                        it.remove();
                    }
                }
            }
            Iterator it2 = A132.iterator();
            while (it2.hasNext()) {
                ((C22821Di) it2.next()).invoke(co8);
            }
        }
        return C27621Wu.A00;
    }
}
