package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public abstract class CCD {
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.COE] */
    public static COE A00(C24948CQy cQy, E9W e9w, String str) {
        COE coe;
        C24948CQy cQy2 = new C24948CQy(cQy);
        ? obj = new Object();
        if (e9w.CBO() != AnonymousClass00R.A0C) {
            e9w.CNS();
            coe = null;
        } else {
            while (e9w.BkN() != AnonymousClass00R.A0N) {
                String CBN = e9w.CBN();
                boolean A1C = C108975cc.A1C(CCB.A00(CBN), 32);
                e9w.BkN();
                if (!A1C) {
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(CBN)) {
                        obj.A01 = BEB.A0c(e9w);
                    } else if ("payload".equals(CBN)) {
                        obj.A00 = C25884Cnv.A00(cQy2, e9w);
                    }
                }
                e9w.CNS();
            }
            coe = obj;
        }
        if (str != null) {
            String[] A1Z = C17880vN.A1Z();
            A1Z[0] = str;
            A1Z[1] = coe.A01;
            C29401cD.A0L(cQy2.A03, A1Z);
        }
        return coe;
    }
}
