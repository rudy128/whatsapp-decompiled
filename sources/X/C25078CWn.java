package X;

import android.content.Context;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.CWn  reason: case insensitive filesystem */
public final class C25078CWn {
    public final long A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final Map A04;

    public void A00(Context context, C22403B6g b6g, CLX clx) {
        C22403B6g b6g2 = b6g;
        int BYg = b6g2.BYg();
        AnonymousClass0O7.A01("BloksScreenQuery.parallelFetch");
        String str = this.A01;
        Map map = this.A04;
        long j = this.A00;
        C18070vi.A0d(map, 2);
        Integer valueOf = Integer.valueOf(BYg);
        LinkedHashMap A09 = AnonymousClass1D7.A09(map, C108975cc.A0h("__infra__container_config_id", valueOf));
        CLX clx2 = clx;
        Object obj = clx2.A00.get(2131428152);
        if (obj != null) {
            C26012CqT cqT = (C26012CqT) obj;
            C18070vi.A0X(cqT);
            Set A0P = C18070vi.A0P("__infra__container_config_id");
            C24285Byi byi = C24285Byi.PARALLEL_FETCH;
            C18070vi.A0h(str, A09);
            C18070vi.A0d(byi, 5);
            cqT.A0B.execute(new DTK(byi, cqT, str, A09, A0P, j, true, true));
            AnonymousClass0O7.A00();
            AnonymousClass0O7.A01("BloksScreenQuery.loadPrebundledRoot");
            Context context2 = context;
            C26235CvV A002 = C25372CeX.A00(context2, (Integer) null);
            AnonymousClass0O7.A00();
            Map map2 = this.A03;
            DVM dvm = new DVM();
            dvm.put("__infra__app_id", str);
            String str2 = this.A02;
            if (str2 == null) {
                str2 = String.valueOf(new SecureRandom().nextInt());
            }
            dvm.put("__infra__screen_id", str2);
            dvm.put("__infra__cache_ttl", Long.valueOf(j));
            dvm.put("__infra__enable_disk_cache", true);
            dvm.put("__infra__preloaded_params", map);
            dvm.put("__infra__ttrc_marker_id", 719983200);
            LinkedHashMap A092 = AnonymousClass1D7.A09(AnonymousClass1D7.A09(map2, C200610r.A05(dvm)), C108975cc.A0h("__infra__container_config_id", valueOf));
            C18070vi.A0e(A002, 1, A092);
            AHz aHz = new AHz(b6g2, A002, (Boolean) null, (String) null, C18460wS.A00, A092, (Map) null, false, false);
            AnonymousClass0O7.A01("BloksScreenQuery.openScreen");
            C196419v1.A01(context2, aHz, clx2, BYg, false);
            AnonymousClass0O7.A00();
            return;
        }
        throw AnonymousClass000.A0s("Attempting to extract missing value. Please ensure that the value is passed to the BloksObjectSet correctly");
    }

    public C25078CWn(String str, String str2, Map map, Map map2, long j) {
        this.A01 = str;
        this.A03 = map;
        this.A04 = map2;
        this.A00 = j;
        this.A02 = str2;
    }
}
