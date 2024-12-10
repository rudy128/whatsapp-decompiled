package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.9Ec  reason: invalid class name and case insensitive filesystem */
public class C178699Ec extends C20121A8g {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C178699Ec(C178749Eh r7, String str, byte[] bArr) {
        this.A00 = 3;
        String[] strArr = new String[33];
        strArr[0] = "audio";
        strArr[1] = "avatar_sticker";
        strArr[2] = "buttons_response";
        strArr[3] = "catalog";
        strArr[4] = "cataloglink";
        strArr[5] = "collection";
        strArr[6] = "contact";
        strArr[7] = "contact_array";
        strArr[8] = "document";
        strArr[9] = "genai_sticker";
        strArr[10] = "gif";
        strArr[11] = "image";
        strArr[12] = "invite";
        strArr[13] = "list";
        strArr[14] = "list_response";
        strArr[15] = "livelocation";
        strArr[16] = "location";
        strArr[17] = "native_flow_response";
        strArr[18] = "order";
        strArr[19] = "product";
        strArr[20] = "productlink";
        strArr[21] = "product_list";
        strArr[22] = "ptt";
        strArr[23] = "ptv";
        strArr[24] = "sticker";
        strArr[25] = "sticker_pack";
        strArr[26] = "system";
        strArr[27] = "unknown";
        strArr[28] = "url";
        strArr[29] = "user_created_sticker";
        strArr[30] = "vcard";
        strArr[31] = "video";
        List A0O = C18070vi.A0O("1p_sticker", strArr, 32);
        this.A01 = A0O;
        C29591cX A0t = C108945cZ.A0t("raw");
        C29601cY.A02(bArr, -9007199254740991L, 9007199254740991L);
        A0t.A01 = bArr;
        A0t.A08(str, "mediatype", A0O);
        A0t.A06((C29621ca) r7.A00);
        this.A02 = A0t.A03();
    }

    public C178699Ec(String str, String str2, String str3, String str4) {
        this.A00 = 2;
        String[] strArr = new String[2];
        strArr[0] = "image";
        List A0O = C18070vi.A0O("video", strArr, 1);
        this.A02 = A0O;
        C29591cX A0t = C108945cZ.A0t("media");
        String str5 = str;
        AnonymousClass8BW.A1F(A0t, "iv", str5, C29601cY.A04(str5, 1, 1000, false) ? 1 : 0);
        String str6 = str2;
        AnonymousClass8BW.A1F(A0t, "cipherKey", str6, C29601cY.A04(str6, 1, 1000, false) ? 1 : 0);
        String str7 = str3;
        if (C29601cY.A04(str7, 1, 2000, false)) {
            A0t.A07(str7);
        }
        A0t.A08(str4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0O);
        this.A01 = A0t.A03();
    }

    public C178699Ec(String str, int i) {
        String str2;
        String[] strArr;
        this.A00 = i;
        switch (i) {
            case 0:
                str2 = "notice";
                strArr = AnonymousClass8BR.A1b();
                strArr[0] = "br_p2p_consent";
                strArr[1] = "br_pay_privacy_policy";
                strArr[2] = "br_pay_tos";
                break;
            case 1:
                str2 = "notice";
                strArr = C17880vN.A1Z();
                strArr[0] = "pay_tos_v3";
                strArr[1] = "upi_pay_privacy_policy";
                break;
            default:
                String[] strArr2 = new String[6];
                strArr2[0] = "negative_harmful";
                strArr2[1] = "negative_inaccurate";
                strArr2[2] = "negative_irrelevant";
                strArr2[3] = "negative_other";
                strArr2[4] = "negative_repetitive";
                List A0O = C18070vi.A0O("positive", strArr2, 5);
                this.A01 = A0O;
                C29591cX A0t = C108945cZ.A0t("feedback");
                A0t.A09(str, "kind", A0O);
                this.A02 = A0t.A03();
                return;
        }
        List asList = Arrays.asList(strArr);
        C18070vi.A0X(asList);
        this.A02 = asList;
        C29591cX A0t2 = C108945cZ.A0t("additional_notice");
        A0t2.A09(str, str2, asList);
        this.A01 = A0t2.A03();
    }
}
