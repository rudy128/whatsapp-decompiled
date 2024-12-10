package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.AfY  reason: case insensitive filesystem */
public final class C21163AfY implements C22470B9c {
    public static final C21163AfY A00 = new C21163AfY();

    public final Object BCF(C29621ca r21, C62672rm r22) {
        AnonymousClass9CZ A04;
        C29621ca r5 = r21;
        C62672rm r4 = r22;
        int A17 = C18070vi.A17(r5, r4);
        if (!r4.A09(r5, "payout")) {
            return null;
        }
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "FAILED";
        A1b[A17] = "PENDING";
        List A0O = C18070vi.A0O("VERIFIED", A1b, 2);
        String[] strArr = new String[A17];
        strArr[0] = "verification-status";
        if (r4.A07(r5, A0O, strArr) == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        strArr2[0] = "account-number";
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        Long A0f = AnonymousClass8BV.A0f();
        r4.A05(r5, cls, A0X, A0f, (Object) null, strArr2, false);
        String[] strArr3 = new String[A17];
        strArr3[0] = "bank-name";
        if (r4.A05(r5, cls, A0X, A0f, (Object) null, strArr3, false) == null) {
            return null;
        }
        r4.A05(r5, cls, A0X, A0f, (Object) null, AnonymousClass8BS.A1S(A17), false);
        String[] strArr4 = new String[A17];
        if (r4.A05(r5, cls, AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, strArr4, 0), AnonymousClass8BU.A0j(), "bank", strArr4, false) == null || (A04 = A8Z.A04(r5, r4)) == null) {
            return null;
        }
        return new AnonymousClass9DX(r5, A04);
    }
}
