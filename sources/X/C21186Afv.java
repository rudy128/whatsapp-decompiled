package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Afv  reason: case insensitive filesystem */
public final class C21186Afv implements C22470B9c {
    public static final C21186Afv A00 = new C21186Afv();

    public final Object BCF(C29621ca r11, C62672rm r12) {
        C29621ca r3 = r11;
        C62672rm r2 = r12;
        boolean A17 = C18070vi.A17(r11, r12);
        if (!r12.A09(r11, PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            return null;
        }
        AnonymousClass1ED r0 = (AnonymousClass1ED) r2.A05(r3, AnonymousClass1ED.class, AnonymousClass8BU.A0i(), AnonymousClass8BU.A0j(), (Object) null, AnonymousClass8BS.A1Y(A17 ? 1 : 0, 0), false);
        if (r0 != null) {
            return new AnonymousClass4A3(r0, r11);
        }
        return null;
    }
}
