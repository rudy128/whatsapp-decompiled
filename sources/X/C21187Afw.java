package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Afw  reason: case insensitive filesystem */
public final class C21187Afw implements C22470B9c {
    public static final C21187Afw A00 = new C21187Afw();

    public final Object BCF(C29621ca r7, C62672rm r8) {
        int A17 = C18070vi.A17(r7, r8);
        if (!r8.A09(r7, PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            return null;
        }
        C22470B9c[] b9cArr = new C22470B9c[3];
        b9cArr[0] = C21188Afx.A00;
        b9cArr[A17] = C21189Afy.A00;
        Object A06 = r8.A06(r7, "IQErrorInternalServerError|IQErrorItemNotFound|IQErrorForbidden", C18070vi.A0O(C21190Afz.A00, b9cArr, 2), AnonymousClass8BS.A1b(A17, 0));
        if (A06 != null) {
            return new AnonymousClass4A3(r7, (AnonymousClass5YQ) A06);
        }
        return null;
    }
}
