package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Afs  reason: case insensitive filesystem */
public final class C21183Afs implements C22470B9c {
    public static final C21183Afs A00 = new C21183Afs();

    public final Object BCF(C29621ca r20, C62672rm r21) {
        C178399Cy A02;
        C29621ca r4 = r20;
        C62672rm r3 = r21;
        int A17 = C18070vi.A17(r4, r3);
        if (!r3.A09(r4, "state")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "parameters";
        Class<String> cls = String.class;
        String str = (String) r3.A05(r4, cls, C17890vO.A0L(), AnonymousClass8BV.A0l(), (Object) null, strArr, false);
        String[] strArr2 = new String[A17];
        if (r3.A05(r4, cls, AnonymousClass8BW.A0Z(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, strArr2, 0), AnonymousClass8BU.A0j(), "pass", strArr2, false) == null || (A02 = A6w.A02(r4, r3)) == null) {
            return null;
        }
        return new C178579Dq(r4, A02, str);
    }
}
