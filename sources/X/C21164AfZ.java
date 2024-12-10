package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.AfZ  reason: case insensitive filesystem */
public final class C21164AfZ implements C22470B9c {
    public static final C21164AfZ A00 = new C21164AfZ();

    public final Object BCF(C29621ca r20, C62672rm r21) {
        AnonymousClass9CZ A04;
        C29621ca r4 = r20;
        C62672rm r3 = r21;
        int A17 = C18070vi.A17(r4, r3);
        if (!r3.A09(r4, "payout")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "last4";
        Class<String> cls = String.class;
        if (r3.A05(r4, cls, 4L, 4, (Object) null, strArr, false) == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        if (r3.A05(r4, cls, AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, strArr2, 0), AnonymousClass8BU.A0j(), "prepaid-card", strArr2, false) == null || (A04 = A8Z.A04(r4, r3)) == null) {
            return null;
        }
        return new AnonymousClass9DY(r4, A04);
    }
}
