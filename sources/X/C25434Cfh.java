package X;

import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.Cfh  reason: case insensitive filesystem */
public abstract class C25434Cfh {
    public static final Map A00 = C108975cc.A0h("component_tag", "vito2");
    public static final Map A01;

    static {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        C72463Mc.A1H("origin", "memory_bitmap", r2);
        C108985cd.A1G("origin_sub", "shortcut", r2);
        A01 = AnonymousClass1D7.A0B(r2);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.CSn, java.lang.Object] */
    public static final void A00(DRN drn, C26048CrF crF, BFG bfg) {
        Map map;
        EBA eba;
        E4V e4v;
        Map map2 = A00;
        Map map3 = A01;
        Map map4 = null;
        if (crF != null) {
            map = crF.A04;
        } else {
            map = null;
        }
        Rect rect = bfg.A01;
        C26738DBr dBr = bfg.A02;
        if (dBr != null) {
            eba = dBr.A01.A0E;
        } else {
            eba = null;
        }
        String valueOf = String.valueOf(eba);
        if (!(drn == null || (e4v = (E4V) drn.A05()) == null)) {
            map4 = e4v.BRV();
        }
        Object obj = bfg.A04;
        C18070vi.A0d(map3, 1);
        ? obj2 = new Object();
        if (rect != null) {
            rect.width();
            rect.height();
        }
        obj2.A01 = valueOf;
        obj2.A00 = obj;
        obj2.A03 = map;
        obj2.A04 = map4;
        obj2.A05 = map3;
        obj2.A02 = map2;
    }
}
