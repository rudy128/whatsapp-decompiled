package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CrZ  reason: case insensitive filesystem */
public abstract class C26060CrZ {
    public static void A03(E7q e7q, C24322BzJ bzJ, CUT cut, Map map) {
        C26052CrM crM = cut.A06;
        C26159CtX.A01(crM);
        HashMap A06 = crM.A06(bzJ);
        if (A06 == null) {
            throw new BW4();
        }
        Iterator A0i = C17890vO.A0i(A06);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            int A04 = AnonymousClass8BV.A04(A16);
            C25833Cmm cmm = (C25833Cmm) A16.getValue();
            long A01 = C26162Ctb.A01(e7q, cmm, cut.A08.A02());
            SparseArray sparseArray = (SparseArray) map.get(bzJ);
            if (sparseArray == null) {
                sparseArray = BE6.A0Q();
                map.put(bzJ, sparseArray);
            }
            long j = cmm.A00;
            sparseArray.put(A04, new A5W(TimeUnit.MICROSECONDS, j, j + A01));
        }
    }

    public static BW8 A00(E1S e1s, E1T e1t, CZT czt, Map map) {
        HashMap A11 = C17880vN.A11();
        SparseArray sparseArray = (SparseArray) map.get(C24322BzJ.VIDEO);
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                A11.put(Integer.toString(sparseArray.keyAt(i)), sparseArray.valueAt(i));
            }
        }
        return new BW8(czt, e1s, e1t, A11, 1);
    }

    public static BW9 A01(C26052CrM crM, E1Q e1q, E1R e1r, CZT czt) {
        HashMap A11 = C17880vN.A11();
        C26159CtX.A01(crM);
        Iterator A0i = C17890vO.A0i(crM.A05(C24322BzJ.VIDEO));
        int i = 0;
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            Integer num = (Integer) A16.getKey();
            Iterator A13 = AnonymousClass8BR.A13(A16.getValue());
            while (A13.hasNext()) {
                A11.put(Integer.toString(i), new C24920CPr((C6M) A13.next(), num));
                i++;
            }
        }
        HashMap A112 = C17880vN.A11();
        Iterator A0i2 = C17890vO.A0i(A11);
        while (A0i2.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A0i2);
            A5W a5w = ((C24920CPr) A162.getValue()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long max = Math.max(0, a5w.A03(timeUnit));
            long A02 = a5w.A02(timeUnit);
            if (A02 < 0) {
                A02 = Long.MAX_VALUE;
            }
            A112.put(A162.getKey(), new A5W(timeUnit, max, A02));
        }
        return new BW9(e1q, e1r, czt, A112, A11);
    }

    public static ArrayList A02(C24322BzJ bzJ, Map map, long j) {
        ArrayList A13 = AnonymousClass000.A13();
        SparseArray sparseArray = (SparseArray) map.get(bzJ);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Object valueAt = sparseArray.valueAt(i);
                C26159CtX.A01(valueAt);
                if (((A5W) valueAt).A05(j, TimeUnit.MICROSECONDS)) {
                    C17890vO.A1D(A13, keyAt);
                }
            }
        }
        return A13;
    }
}
