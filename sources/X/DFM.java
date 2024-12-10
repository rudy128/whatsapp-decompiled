package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DFM implements AnonymousClass0sW {
    public CO4 A00 = null;
    public final C26962DNk A01;

    public /* bridge */ /* synthetic */ void BFI(Object obj) {
        C28462E2d[] e2dArr;
        String str;
        String str2;
        CO4 co4 = (CO4) obj;
        this.A00 = co4;
        C26962DNk dNk = this.A01;
        co4.getClass();
        C25011CTl cTl = co4.A01;
        C26176Ctu.A02("Committing Variables and Bound tree is only supported from the UI Thread");
        dNk.A05 = cTl;
        DOZ doz = (DOZ) dNk.A07.get();
        List<C25609Cip> list = cTl.A05;
        for (C25609Cip cip : list) {
            dNk.A04 = dNk.A04.A05(cip.A06).A01(cip.A00).A02(cip.A03).A06(cip.A07).A03(cip.A04);
        }
        list.clear();
        HashMap A11 = C17880vN.A11();
        HashMap hashMap = cTl.A03;
        Iterator A0i = C17890vO.A0i(hashMap);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            E88 e88 = (E88) A16.getValue();
            A11.put(A16.getKey(), e88.BSx());
            e88.BFH(dNk.A0D, dNk);
        }
        hashMap.clear();
        dNk.A04 = dNk.A04.A07(A11);
        dNk.A08 = cTl.A08;
        List list2 = dNk.A0F;
        synchronized (list2) {
            e2dArr = (C28462E2d[]) list2.toArray(new C28462E2d[0]);
        }
        if (0 < e2dArr.length) {
            throw AnonymousClass000.A0s("onCommit");
        } else if (doz != null) {
            for (CQI cqi : cTl.A04) {
                DFL dfl = cqi.A01;
                Object A04 = C26272CwJ.A04(doz, dfl);
                if (A04 == null) {
                    str = "BloksTreeManager";
                    str2 = "Binding was targeting a controller but the returned controller was null";
                } else {
                    int i = dfl.A05;
                    int i2 = cqi.A00;
                    Object obj2 = cqi.A02;
                    if (i == 13688) {
                        DNR dnr = (DNR) A04;
                        if (obj2 == null) {
                            str = "ViewTransformsBindControllerOverride";
                            str2 = "Trying to set null value for a view transform property";
                        } else {
                            dnr.CHw((DOZ) null, obj2, i2);
                        }
                    } else {
                        Object[] A1a = AnonymousClass3MW.A1a();
                        C17880vN.A1T(A1a, i, 0);
                        throw BE8.A0X("No implementation bound to key: %s", A1a);
                    }
                }
                C25913CoX.A01(str, str2);
            }
        }
    }

    public DFM(C26962DNk dNk) {
        this.A01 = dNk;
    }
}
