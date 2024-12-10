package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class DWK implements C18140vp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C183819Zs A02;

    /* JADX WARNING: type inference failed for: r1v3, types: [X.C5o, X.BVl, X.BVk] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.CKd, java.lang.Object] */
    public final Object get() {
        C183819Zs r1 = this.A02;
        int i = this.A00;
        long j = this.A01;
        C18070vi.A0d(r1, 0);
        C25655Cjl cjl = r1.A01;
        C25017CTt cTt = new C25017CTt();
        cTt.A03 = "<override-ignore>";
        cTt.A07 = false;
        AnonymousClass8Qu r12 = new AnonymousClass8Qu(j, j, j, false, false);
        cTt.A00 = r12;
        C22919BVh bVh = new C22919BVh(2419200, false);
        cTt.A01 = bVh;
        C22920BVi bVi = cTt.A02;
        boolean z = cTt.A08;
        boolean z2 = cTt.A09;
        String str = cTt.A04;
        List list = cTt.A06;
        String str2 = cTt.A05;
        if (bVi == null) {
            C25017CTt cTt2 = new C25017CTt();
            cTt2.A03 = "<override-ignore>";
            cTt2.A04 = str;
            cTt2.A07 = false;
            cTt2.A08 = z;
            cTt2.A09 = z2;
            cTt2.A02 = null;
            cTt2.A00 = r12;
            cTt2.A01 = bVh;
            cTt2.A06 = list;
            cTt2.A05 = str2;
            cTt2.A03 = C20055A5d.A02(i);
            cTt2.A04 = null;
            cTt2.A02 = C22920BVi.A00;
            cTt2.A00 = r12;
            cTt2.A01 = bVh;
            CTY cty = new CTY(cTt2);
            String str3 = cty.A03;
            C25649Cjf cjf = new C25649Cjf(str3);
            cjf.A00(cty.A02);
            AnonymousClass8Qu r3 = cty.A00;
            if (r3 == null && cty.A01 == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Config for ");
                A10.append(str3);
                throw AnonymousClass001.A12(" didn't specify an eviction config. Is this what you want?", A10);
            }
            ? bVl = new C22923BVl(r3, cty.A01, "stash", str3);
            bVl.A00 = AnonymousClass3MW.A0z((Object) null);
            cjf.A00(bVl);
            C22916BVe bVe = cjl.A00;
            ? obj = new Object();
            String str4 = cty.A04;
            if (str4 != null) {
                Map map = obj.A00;
                if (map == null) {
                    map = C17880vN.A11();
                    obj.A00 = map;
                }
                map.put("__subdir__", str4);
            }
            Map map2 = obj.A00;
            if (map2 == null) {
                map2 = Collections.emptyMap();
            }
            C17880vN.A11().putAll(map2);
            File A022 = bVe.A00.A02(i);
            E52 e52 = cjl.A01;
            FileStash dg4 = new DG4(e52, A022);
            if (cty.A06) {
                FileStash bVb = new C22913BVb(RealtimeSinceBootClock.A00, dg4);
                C27076DTa.A01(cjl, bVb, ((E50) e52).BRR(AnonymousClass00R.A0C), 23);
                dg4 = bVb;
            }
            if (cty.A07) {
                throw C17880vN.A0y();
            }
            List emptyList = Collections.emptyList();
            List list2 = cty.A05;
            if ((list2 != null && !list2.isEmpty()) || !emptyList.isEmpty()) {
                ArrayList A13 = AnonymousClass000.A13();
                if (list2 != null) {
                    A13.addAll(list2);
                }
                A13.addAll(emptyList);
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it = A13.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0s("getClass");
                }
                dg4 = new C22914BVc(dg4, A132);
            }
            C25655Cjl.A00(dg4, cjf);
            C24571C9s.A00(bVe.A00, cjf, A022);
            return new C20373AIe(dg4, new AtomicReference(), j);
        }
        throw AnonymousClass000.A0k("Cannot override cache name or UserScopeConfig. Use CacheLike.builderForOverrides().");
    }

    public /* synthetic */ DWK(C183819Zs r1, int i, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = j;
    }
}
