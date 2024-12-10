package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cgi  reason: case insensitive filesystem */
public class C25487Cgi {
    public List A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Cgi, java.lang.Object] */
    public static Pair A00(E9W e9w) {
        String str;
        Integer CBO = e9w.CBO();
        if (CBO != AnonymousClass00R.A0j) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Expected string while parsing string-encoded component payload, got ");
            if (CBO != null) {
                str = CCA.A00(CBO);
            } else {
                str = "null";
            }
            C25913CoX.A01(AnonymousClass000.A0y(str, A10), "BloksComponentQueryPayload");
            return null;
        }
        String COi = e9w.CBP().COi();
        ALN A0V = BEA.A0V(COi);
        Object obj = null;
        ? obj2 = new Object();
        if (A0V.A01 != AnonymousClass00R.A0C) {
            A0V.CNS();
        } else {
            while (A0V.BkN() != AnonymousClass00R.A0N) {
                String str2 = A0V.A02;
                boolean A1C = C108975cc.A1C(CCB.A00(str2), 32);
                A0V.BkN();
                if (!A1C && "components".equals(str2)) {
                    ArrayList arrayList = null;
                    if (A0V.A01 == AnonymousClass00R.A00) {
                        arrayList = AnonymousClass000.A13();
                        while (A0V.BkN() != AnonymousClass00R.A01) {
                            COE A002 = CCD.A00((C24948CQy) null, A0V, (String) null);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                    }
                    obj2.A00 = arrayList;
                }
                A0V.CNS();
            }
            obj = obj2;
        }
        return C108945cZ.A0N(COi, obj);
    }
}
