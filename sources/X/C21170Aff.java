package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aff  reason: case insensitive filesystem */
public final class C21170Aff implements C22470B9c {
    public static final C21170Aff A00 = new C21170Aff();

    public final Object BCF(C29621ca r24, C62672rm r25) {
        C29621ca r7 = r24;
        C62672rm r6 = r25;
        int A17 = C18070vi.A17(r7, r6);
        if (!r6.A09(r7, "product")) {
            return null;
        }
        String[] strArr = new String[2];
        strArr[0] = "in stock";
        List A0O = C18070vi.A0O("out of stock", strArr, A17);
        String[] strArr2 = new String[A17];
        strArr2[0] = "availability";
        String A07 = r6.A07(r7, A0O, strArr2);
        String[] strArr3 = new String[2];
        AnonymousClass8BR.A1K(strArr3, 0, A17, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String str = (String) r6.A04(r7, String.class, C108975cc.A0X(), AnonymousClass8BV.A0g(), (Object) null, strArr3);
        if (str == null) {
            return null;
        }
        String[] strArr4 = new String[2];
        strArr4[0] = "media";
        strArr4[A17] = "image";
        ArrayList A08 = r6.A08(r7, new C21280AhR(33), strArr4, 1, 10);
        if (A08 == null) {
            return null;
        }
        C22470B9c[] b9cArr = new C22470B9c[2];
        b9cArr[0] = C21168Afd.A00;
        Object A06 = r6.A06(r7, "ItemDetailsWithPriceAndSalePrice|ItemDetailsWithoutPrice", C18070vi.A0O(C21169Afe.A00, b9cArr, A17), new String[0]);
        if (A06 != null) {
            return new C178489Dh(r7, (C22472B9e) A06, A07, str, A08);
        }
        return null;
    }
}
