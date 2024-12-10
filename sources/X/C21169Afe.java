package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Afe  reason: case insensitive filesystem */
public final class C21169Afe implements C22470B9c {
    public static final C21169Afe A00 = new C21169Afe();

    public final Object BCF(C29621ca r11, C62672rm r12) {
        C29621ca r4 = r11;
        C62672rm r3 = r12;
        boolean A17 = C18070vi.A17(r11, r12);
        if (!r12.A09(r11, "product")) {
            return null;
        }
        String[] A1Z = C17880vN.A1Z();
        AnonymousClass8BR.A1K(A1Z, 0, A17 ? 1 : 0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (r3.A04(r4, String.class, C108975cc.A0X(), AnonymousClass8BV.A0g(), (Object) null, A1Z) != null) {
            return new C178439Dc(r11, (AnonymousClass9CY) C21280AhR.A00(r11, r12, AnonymousClass8BS.A1T(A17), 44));
        }
        return null;
    }
}
