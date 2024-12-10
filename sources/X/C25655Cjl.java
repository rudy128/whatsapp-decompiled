package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.stash.core.FileStash;
import com.facebook.stash.core.Stash;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cjl  reason: case insensitive filesystem */
public final class C25655Cjl {
    public final C22916BVe A00;
    public final E52 A01;

    public static void A00(Stash stash, C25649Cjf cjf) {
        Iterator A0y = AnonymousClass8BV.A0y(cjf.A01.values());
        while (A0y.hasNext()) {
            C24473C5o c5o = (C24473C5o) A0y.next();
            if (c5o instanceof C22922BVk) {
                ((C22922BVk) c5o).A00 = AnonymousClass3MW.A0z(stash);
            }
        }
    }

    public C25655Cjl(C22916BVe bVe, DGC dgc) {
        this.A01 = dgc;
        this.A00 = bVe;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.C5o, X.BVl, X.BVk] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.CKd, java.lang.Object] */
    public FileStash A01(int i) {
        AnonymousClass8Qu A002 = C20055A5d.A00(i);
        C22919BVh A012 = C20055A5d.A01(i);
        C25017CTt cTt = new C25017CTt();
        String A02 = C20055A5d.A02(i);
        cTt.A03 = A02;
        cTt.A04 = null;
        C22920BVi bVi = C22920BVi.A00;
        cTt.A02 = bVi;
        cTt.A00 = A002;
        cTt.A01 = A012;
        if (A02 != null) {
            boolean z = cTt.A07;
            boolean z2 = cTt.A08;
            List list = cTt.A06;
            String str = cTt.A05;
            C25649Cjf cjf = new C25649Cjf(A02);
            cjf.A00(bVi);
            if (A002 == null && A012 == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Config for ");
                A10.append(A02);
                throw AnonymousClass001.A12(" didn't specify an eviction config. Is this what you want?", A10);
            }
            ? bVl = new C22923BVl(A002, A012, "stash", A02);
            bVl.A00 = BE8.A0m();
            cjf.A00(bVl);
            C22916BVe bVe = this.A00;
            ? obj = new Object();
            if (str != null) {
                Map map = obj.A00;
                if (map == null) {
                    map = C17880vN.A11();
                    obj.A00 = map;
                }
                map.put("__subdir__", str);
            }
            C17880vN.A11().putAll(new CNX(obj).A00);
            File A022 = bVe.A00.A02(i);
            E52 e52 = this.A01;
            FileStash dg4 = new DG4(e52, A022);
            if (z) {
                FileStash bVb = new C22913BVb(RealtimeSinceBootClock.A00, dg4);
                C27076DTa.A01(this, bVb, ((E50) e52).BRR(AnonymousClass00R.A0C), 23);
                dg4 = bVb;
            }
            if (z2) {
                throw C17880vN.A0y();
            }
            List emptyList = Collections.emptyList();
            if ((list != null && !list.isEmpty()) || !emptyList.isEmpty()) {
                ArrayList A13 = AnonymousClass000.A13();
                if (list != null) {
                    A13.addAll(list);
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
            A00(dg4, cjf);
            C24571C9s.A00(bVe.A00, cjf, A022);
            return dg4;
        }
        throw AnonymousClass000.A0n("Cache name must not be null");
    }
}
