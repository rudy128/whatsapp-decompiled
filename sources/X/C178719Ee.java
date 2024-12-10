package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Ee  reason: invalid class name and case insensitive filesystem */
public class C178719Ee extends C20121A8g {
    public final Object A00;

    public static void A00(C29591cX r1, C178719Ee r2) {
        r1.A05((C29621ca) r2.A00);
    }

    public static void A01(C29591cX r1, Iterator it) {
        r1.A05((C29621ca) ((C178719Ee) it.next()).A00);
    }

    public C178719Ee() {
        C29591cX A0t = C108945cZ.A0t("api_version");
        C108965cb.A1I(A0t, "value", 4);
        this.A00 = A0t.A03();
    }

    public C178719Ee(int i) {
        String str;
        if (i != 0) {
            str = "locked";
        } else {
            str = "hidden_group";
        }
        this.A00 = C108945cZ.A0t(str).A03();
    }

    public C178719Ee(long j, long j2) {
        C29591cX A0t = C108945cZ.A0t("get_disclosure_stage_by_id");
        if (C29601cY.A03(Long.valueOf(j), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j);
        }
        if (C29601cY.A03(Long.valueOf(j2), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, "t", j2);
        }
        this.A00 = A0t.A03();
    }

    public C178719Ee(AnonymousClass1EC r9, long j) {
        C29591cX A0t = C108945cZ.A0t("item");
        AnonymousClass8BT.A1E(r9, A0t, "jid");
        if (C29601cY.A03(Long.valueOf(j), -1, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, "mute", j);
        }
        this.A00 = A0t.A03();
    }

    public C178719Ee(AnonymousClass1EC r3, C178739Eg r4) {
        C29591cX A0S = AnonymousClass8BS.A0S();
        AnonymousClass8BT.A1E(r3, A0S, "from");
        A0S.A06(r4.A00);
        this.A00 = A0S.A03();
    }

    public C178719Ee(C29681ch r3, C178739Eg r4) {
        C29591cX A0S = AnonymousClass8BS.A0S();
        AnonymousClass8BT.A1E(r3, A0S, "from");
        A0S.A06(r4.A00);
        this.A00 = A0S.A03();
    }

    public C178719Ee(C178719Ee r13, C178719Ee r14, String str, byte[] bArr, long j) {
        C29591cX A0t = C108945cZ.A0t("reporting_validation");
        if (r13 != null) {
            A00(A0t, r13);
        }
        if (r14 != null) {
            A00(A0t, r14);
        }
        C29591cX A0t2 = C108945cZ.A0t("reporting_tag");
        if (C29601cY.A04(str, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t2, "ts_s", j2);
        }
        byte[] bArr2 = bArr;
        C29601cY.A02(bArr2, 9, 128);
        A0t2.A01 = bArr2;
        this.A00 = C29591cX.A00(A0t2, A0t);
    }

    public C178719Ee(C178719Ee r7, byte[] bArr) {
        C18070vi.A0d(bArr, 1);
        C29591cX A0t = C108945cZ.A0t("single_serialized_lookup");
        A00(A0t, r7);
        C29591cX A0t2 = C108945cZ.A0t("label");
        C29601cY.A02(bArr, 0, 32);
        A0t2.A01 = bArr;
        this.A00 = C29591cX.A00(A0t2, A0t);
    }

    public C178719Ee(C178749Eh r2) {
        this.A00 = C178749Eh.A00(r2, "extension_screen").A03();
    }

    public C178719Ee(C178749Eh r18, String str, String str2) {
        C29591cX A0t = C108945cZ.A0t("coupon");
        String str3 = str;
        AnonymousClass8BW.A1F(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 1, 100, false) ? 1 : 0);
        String str4 = str2;
        AnonymousClass8BW.A1F(A0t, "code", str4, C29601cY.A04(str4, 1, 100, false) ? 1 : 0);
        this.A00 = C29591cX.A00(C178749Eh.A00(r18, "discount"), A0t);
    }

    public C178719Ee(C178759Ei r2) {
        this.A00 = C20121A8g.A04(r2, "membership_approval_mode").A03();
    }

    public C178719Ee(C178809En r3, C178739Eg r4) {
        C29591cX A0S = AnonymousClass8BS.A0S();
        A0S.A06(r4.A00);
        C20121A8g.A0A(A0S, r3);
        this.A00 = A0S.A03();
    }

    public C178719Ee(UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        C29591cX A0t = C108945cZ.A0t("contact");
        AnonymousClass8BT.A1E(userJid, A0t, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        this.A00 = A0t.A03();
    }

    public C178719Ee(String str, int i) {
        C29621ca A002;
        C29591cX A0t;
        long j;
        long j2;
        switch (i) {
            case 5:
                C29591cX A0t2 = C108945cZ.A0t("trace");
                C29591cX A0t3 = C108945cZ.A0t("flow_id");
                if (AnonymousClass8BS.A1O(str, 1, 36)) {
                    A0t3.A07(str);
                }
                A002 = C29591cX.A00(A0t3, A0t2);
                break;
            case 6:
                A0t = C108945cZ.A0t("after");
                j = 0;
                j2 = 9007199254740991L;
                break;
            default:
                A0t = C108945cZ.A0t("reason");
                j = 1;
                j2 = 100;
                break;
        }
        if (AnonymousClass8BS.A1O(str, j, j2)) {
            A0t.A07(str);
        }
        A002 = A0t.A03();
        this.A00 = A002;
    }

    public C178719Ee(String str, String str2, String str3, String str4, String str5, long j) {
        C29591cX A0t = C108945cZ.A0t("extension_screen");
        String str6 = str;
        if (C29601cY.A04(str6, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "extension_id", str6);
        }
        String str7 = str2;
        if (C29601cY.A04(str7, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "session_id", str7);
        }
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, "t", j2);
        }
        String str8 = str3;
        AnonymousClass8BW.A1F(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str8, C29601cY.A04(str8, 0, 9007199254740991L, false) ? 1 : 0);
        String str9 = str4;
        if (C29601cY.A04(str9, 0, 9007199254740991L, true)) {
            C29591cX.A01(A0t, "entry_point", str9);
        }
        C29591cX A0t2 = C108945cZ.A0t("data");
        String str10 = str5;
        if (C29601cY.A04(str10, 0, 9007199254740991L, false)) {
            A0t2.A07(str10);
        }
        this.A00 = C29591cX.A00(A0t2, A0t);
    }

    public C178719Ee(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        C29591cX A0t = C108945cZ.A0t("shipping_info");
        String str13 = str;
        AnonymousClass8BW.A1F(A0t, "country", str13, C29601cY.A04(str13, 1, 100, false) ? 1 : 0);
        C29591cX A0t2 = C108945cZ.A0t("shipping_address");
        String str14 = str2;
        if (C29601cY.A04(str14, 1, 256, false)) {
            C29591cX.A01(A0t2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str14);
        }
        String str15 = str3;
        if (C29601cY.A04(str15, 1, 12, false)) {
            C29591cX.A01(A0t2, "phone_number", str15);
        }
        String str16 = str4;
        if (C29601cY.A04(str16, 1, 6, false)) {
            C29591cX.A01(A0t2, "in_pin_code", str16);
        }
        String str17 = str5;
        if (str5 != null && AnonymousClass8BV.A1V(str17, 1, true)) {
            C29591cX.A01(A0t2, "house_number", str17);
        }
        String str18 = str6;
        if (str6 != null && AnonymousClass8BV.A1V(str18, 1, true)) {
            C29591cX.A01(A0t2, "floor_number", str18);
        }
        String str19 = str7;
        if (str7 != null && AnonymousClass8BV.A1V(str19, 1, true)) {
            C29591cX.A01(A0t2, "tower_number", str19);
        }
        String str20 = str8;
        if (str8 != null && C29601cY.A04(str20, 1, 128, true)) {
            C29591cX.A01(A0t2, "building_name", str20);
        }
        String str21 = str9;
        if (C29601cY.A04(str21, 1, 512, false)) {
            C29591cX.A01(A0t2, "address", str21);
        }
        String str22 = str10;
        if (C29601cY.A04(str22, 1, 128, false)) {
            C29591cX.A01(A0t2, "landmark_area", str22);
        }
        String str23 = str11;
        if (C29601cY.A04(str23, 1, 100, false)) {
            C29591cX.A01(A0t2, "city", str23);
        }
        String str24 = str12;
        if (C29601cY.A04(str24, 1, 100, false)) {
            C29591cX.A01(A0t2, "state", str24);
        }
        this.A00 = C29591cX.A00(A0t2, A0t);
    }

    public C178719Ee(List list) {
        C18070vi.A0d(list, 1);
        C29591cX A0t = C108945cZ.A0t("user_initiated_extension");
        if (C29601cY.A05(list, 1, 100)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A01(A0t, it);
            }
        }
        this.A00 = A0t.A03();
    }

    public C178719Ee(byte[] bArr, int i) {
        C29621ca A03;
        if (4 - i != 0) {
            C29591cX A0t = C108945cZ.A0t("reporting_content");
            C29601cY.A02(bArr, 0, 9007199254740991L);
            A0t.A01 = bArr;
            A03 = A0t.A03();
        } else {
            C18070vi.A0d(bArr, 1);
            C29591cX A0t2 = C108945cZ.A0t("key");
            C29601cY.A02(bArr, 32, 32);
            A0t2.A01 = bArr;
            A03 = A0t2.A03();
        }
        this.A00 = A03;
    }

    public C178719Ee(byte[] bArr, byte[] bArr2, long j) {
        C29591cX A0t = C108945cZ.A0t("content_validation");
        C29591cX A0t2 = C108945cZ.A0t("reporting_token");
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), -9007199254740991L, 9007199254740991L, false)) {
            C108965cb.A1I(A0t2, "v", j2);
        }
        C29601cY.A02(bArr, 6, 128);
        C108965cb.A1G(A0t2, A0t, bArr);
        C29591cX A0t3 = C108945cZ.A0t("reporting_token_key");
        C29601cY.A02(bArr2, 16, 32);
        A0t3.A01 = bArr2;
        this.A00 = C29591cX.A00(A0t3, A0t);
    }
}
