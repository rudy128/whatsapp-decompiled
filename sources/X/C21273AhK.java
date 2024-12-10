package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.AhK  reason: case insensitive filesystem */
public final class C21273AhK implements C22470B9c {
    public static final C21273AhK A00 = new C21273AhK();

    public final Object BCF(C29621ca r29, C62672rm r30) {
        C29621ca r9 = r29;
        C62672rm r8 = r30;
        int A17 = C18070vi.A17(r9, r8);
        if (!r8.A09(r9, "config")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "item";
        C178169Cb A002 = C21288AhZ.A00(r9, r8, strArr, 40);
        if (!r8.A09(r9, "config")) {
            return null;
        }
        String[] strArr2 = new String[2];
        strArr2[0] = "fbns";
        List A0O = C18070vi.A0O("gcm", strArr2, A17);
        String[] strArr3 = new String[A17];
        strArr3[0] = "platform";
        String A07 = r8.A07(r9, A0O, strArr3);
        if (A07 == null) {
            return null;
        }
        String[] strArr4 = new String[2];
        strArr4[0] = "614665046147756";
        List A0O2 = C18070vi.A0O("994766073959253", strArr4, A17);
        String[] strArr5 = new String[A17];
        strArr5[0] = PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        r8.A07(r9, A0O2, strArr5);
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "0";
        A1b[A17] = "1";
        List A0O3 = C18070vi.A0O("2", A1b, 2);
        String[] strArr6 = new String[A17];
        strArr6[0] = "voip_payload_type";
        String A072 = r8.A07(r9, A0O3, strArr6);
        String[] A1W = AnonymousClass8BS.A1W(A17, 0);
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        String str = (String) r8.A05(r9, cls, A0X, AnonymousClass8BV.A0k(), (Object) null, A1W, false);
        if (str == null) {
            return null;
        }
        String[] strArr7 = new String[A17];
        strArr7[0] = "app_mute";
        Class cls2 = Long.TYPE;
        Long A0L = C17890vO.A0L();
        C62672rm r16 = r8;
        C29621ca r17 = r9;
        String[] strArr8 = new String[A17];
        strArr8[0] = "pkey";
        String[] strArr9 = new String[A17];
        strArr9[0] = "num_acc";
        return new AnonymousClass9ER(r9, A002, new AnonymousClass9D3(r9, (Long) r16.A05(r17, cls2, A0L, AnonymousClass8BU.A0j(), (Object) null, strArr7, false), (Long) r16.A05(r17, cls2, A0L, 5L, (Object) null, strArr9, false), A07, A072, str, (String) r8.A05(r9, cls, A0X, 64L, (Object) null, strArr8, false)));
    }
}
