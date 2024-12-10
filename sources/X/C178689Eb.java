package X;

import java.util.List;

/* renamed from: X.9Eb  reason: invalid class name and case insensitive filesystem */
public final class C178689Eb extends C20121A8g {
    public final C29621ca A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public C178689Eb(Long l, String str, String str2) {
        String[] strArr = new String[3];
        strArr[0] = "inappropriate";
        strArr[1] = "none";
        this.A03 = C18070vi.A0O("spam", strArr, 2);
        String[] strArr2 = new String[19];
        strArr2[0] = "biz_profile";
        strArr2[1] = "broadcast_list_context_menu";
        strArr2[2] = "catalog_link";
        strArr2[3] = "click_to_chat_link";
        strArr2[4] = "contact_card";
        strArr2[5] = "contact_search";
        strArr2[6] = "ctwa";
        strArr2[7] = "global_search_new_chat";
        strArr2[8] = "group_participant_list";
        strArr2[9] = "message_short_link";
        strArr2[10] = "other_qbm";
        strArr2[11] = "otp_qbm";
        strArr2[12] = "phone_number_hyperlink";
        strArr2[13] = "product_link";
        strArr2[14] = "promotional_qbm";
        strArr2[15] = "qr_code";
        strArr2[16] = "status";
        strArr2[17] = "transactional_qbm";
        List A0O = C18070vi.A0O("unknown", strArr2, 18);
        this.A01 = A0O;
        String[] strArr3 = new String[3];
        strArr3[0] = "false";
        strArr3[1] = "none";
        this.A02 = C18070vi.A0O("true", strArr3, 2);
        C29591cX A0t = C108945cZ.A0t("biz_opt_out");
        if (l != null && AnonymousClass8BX.A1T(l)) {
            C108965cb.A1I(A0t, "business_discovery_timestamp", l.longValue());
        }
        String str3 = str;
        if (str != null && C29601cY.A04(str3, 0, 9007199254740991L, true)) {
            C29591cX.A01(A0t, "business_discovery_id", str);
        }
        A0t.A08(str2, "business_discovery_entry_point", A0O);
        this.A00 = A0t.A03();
    }

    public C178689Eb() {
        this((Long) null, (String) null, (String) null);
    }
}
