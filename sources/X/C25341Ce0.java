package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Ce0  reason: case insensitive filesystem */
public abstract class C25341Ce0 {
    public static Object A00(E9W e9w) {
        String str;
        Integer CBO = e9w.CBO();
        if (CBO == AnonymousClass00R.A0C) {
            return A01(e9w);
        }
        if (CBO == AnonymousClass00R.A00) {
            ArrayList A13 = AnonymousClass000.A13();
            while (e9w.BkN() != AnonymousClass00R.A01) {
                A13.add(A00(e9w));
            }
            return A13;
        } else if (CBO == AnonymousClass00R.A19) {
            return null;
        } else {
            if (CBO == AnonymousClass00R.A18) {
                return Boolean.valueOf(e9w.CBP().BDH());
            }
            if (CBO == AnonymousClass00R.A15) {
                Number BkY = e9w.CBP().BkY();
                if (BkY instanceof Long) {
                    return Long.valueOf(BkY.longValue());
                }
                return Double.valueOf(BkY.doubleValue());
            } else if (CBO == AnonymousClass00R.A0j) {
                return e9w.CBP().COi();
            } else {
                if (CBO == AnonymousClass00R.A0u) {
                    return CCI.A00((E9O) null, e9w.CBP());
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("unsupported token type ");
                if (CBO != null) {
                    str = CCA.A00(CBO);
                } else {
                    str = "null";
                }
                throw AnonymousClass000.A0o(str, A10);
            }
        }
    }

    public static HashMap A01(E9W e9w) {
        if (e9w.CBO() != AnonymousClass00R.A0C) {
            return null;
        }
        HashMap A11 = C17880vN.A11();
        while (e9w.BkN() != AnonymousClass00R.A0N) {
            String CBN = e9w.CBN();
            e9w.BkN();
            A11.put(CBN, A00(e9w));
        }
        return A11;
    }
}
