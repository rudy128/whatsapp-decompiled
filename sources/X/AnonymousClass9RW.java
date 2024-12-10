package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9RW  reason: invalid class name */
public abstract class AnonymousClass9RW {
    public static C194059r6 A00(C29621ca r3) {
        int i;
        String A0Q = r3.A0Q("v", (String) null);
        if ("2".equals(A0Q)) {
            String A0Q2 = r3.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            if ("msg".equals(A0Q2)) {
                i = 0;
            } else if ("pkmsg".equals(A0Q2)) {
                i = 1;
            } else if ("skmsg".equals(A0Q2)) {
                i = 2;
            } else if ("frskmsg".equals(A0Q2)) {
                i = 3;
            } else if ("msmsg".equals(A0Q2)) {
                i = 4;
            } else {
                throw AnonymousClass1UI.A01(AnonymousClass001.A1H("invalid encrypted node type provided: ", A0Q2, AnonymousClass000.A10()));
            }
            return new C194059r6(r3.A01, i);
        }
        throw AnonymousClass1UI.A01(AnonymousClass001.A1H("invalid encrypted node version provided: ", A0Q, AnonymousClass000.A10()));
    }
}
