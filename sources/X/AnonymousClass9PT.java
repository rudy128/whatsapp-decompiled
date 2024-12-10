package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9PT  reason: invalid class name */
public abstract class AnonymousClass9PT {
    public static final AnonymousClass773 A00(C29621ca r4) {
        String A0M;
        String A0I;
        C18070vi.A0d(r4, 0);
        C29621ca A0K = r4.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29621ca A0K2 = r4.A0K("thumbnail_url");
        C29621ca A0K3 = r4.A0K("original_video_url");
        String str = null;
        if (A0K == null || (A0M = A0K.A0M()) == null || (A0I = AnonymousClass1YF.A0I(A0M)) == null || A0I.length() == 0) {
            return null;
        }
        String A0o = AnonymousClass8BU.A0o(A0K2);
        if (A0K3 != null) {
            str = A0K3.A0M();
        }
        return new AnonymousClass773(A0I, A0o, str);
    }
}
