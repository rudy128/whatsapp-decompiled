package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Afd  reason: case insensitive filesystem */
public final class C21168Afd implements C22470B9c {
    public static final C21168Afd A00 = new C21168Afd();

    public final Object BCF(C29621ca r17, C62672rm r18) {
        C29621ca r6 = r17;
        C62672rm r5 = r18;
        int A17 = C18070vi.A17(r6, r5);
        if (!r5.A09(r6, "product")) {
            return null;
        }
        String[] A1Z = C17880vN.A1Z();
        AnonymousClass8BR.A1K(A1Z, 0, A17, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (r5.A04(r6, String.class, C108975cc.A0X(), AnonymousClass8BV.A0g(), (Object) null, A1Z) == null) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "price";
        AnonymousClass9CX r12 = (AnonymousClass9CX) C21280AhR.A00(r6, r5, strArr, 21);
        String[] strArr2 = new String[A17];
        strArr2[0] = "currency";
        String[] strArr3 = new String[A17];
        strArr3[0] = "sale_price";
        return new C178449Dd(r6, r12, (AnonymousClass9DN) C21280AhR.A00(r6, r5, strArr3, 23), (AnonymousClass9CY) C21280AhR.A00(r6, r5, AnonymousClass8BS.A1T(A17), 20), (AnonymousClass9CY) C21280AhR.A00(r6, r5, strArr2, 22));
    }
}
