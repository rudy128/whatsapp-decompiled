package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9F5  reason: invalid class name */
public class AnonymousClass9F5 extends AnonymousClass9EV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass9F5(AnonymousClass1ED r7, String str, String str2) {
        this.A00 = 2;
        C18070vi.A0d(r7, 3);
        String[] strArr = new String[2];
        strArr[0] = "block";
        List A0O = C18070vi.A0O("unblock", strArr, 1);
        this.A01 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:interop");
        AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0t = C108945cZ.A0t("blocklist");
        C29591cX A0t2 = C108945cZ.A0t("item");
        A0t2.A09(str2, "action", A0O);
        AnonymousClass8BT.A1E(r7, A0t2, "jid");
        AnonymousClass8BX.A1I(A0t2, A0t, A0Y);
        this.A02 = A0Y.A03();
    }

    public AnonymousClass9F5(AnonymousClass9EZ r19, String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j) {
        this.A00 = 15;
        String str4 = str2;
        C18070vi.A0d(str4, 7);
        String[] strArr = new String[2];
        strArr[0] = "md_auth_at";
        List A0O = C18070vi.A0O("react", strArr, 1);
        this.A02 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "waffle");
        C108965cb.A1I(A0Y, "smax_id", 141);
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        String str5 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5, C29601cY.A04(str5, 0, 9007199254740991L, false) ? 1 : 0);
        AnonymousClass9EZ r0 = r19;
        if (r19 != null) {
            A0Y.A05(r0.A00);
        }
        C29591cX A0t = C108945cZ.A0t("encryption_metadata");
        C29591cX.A01(A0t, "version", "1");
        C29591cX.A01(A0t, "algorithm", "rsa2048");
        C29591cX A0t2 = C108945cZ.A0t("encrypted_key");
        byte[] bArr5 = bArr;
        C29601cY.A02(bArr5, 1, 2048);
        C108965cb.A1G(A0t2, A0t, bArr5);
        byte[] bArr6 = bArr2;
        C108965cb.A1G(C20121A8g.A06("nonce", bArr6), A0t, bArr6);
        C29591cX A0t3 = C108945cZ.A0t("encrypted_data");
        byte[] bArr7 = bArr3;
        C29601cY.A02(bArr7, 1, 8192);
        C108965cb.A1G(A0t3, A0t, bArr7);
        byte[] bArr8 = bArr4;
        C29591cX A06 = C20121A8g.A06("auth_tag", bArr8);
        A06.A01 = bArr8;
        AnonymousClass8BX.A1I(A06, A0t, A0Y);
        C29591cX A0t4 = C108945cZ.A0t("timestamp");
        long j2 = j;
        C20121A8g.A08(A0t4, C29601cY.A03(Long.valueOf(j2), 1, 9007199254740991L, false) ? 1 : 0, j2);
        C108955ca.A1P(A0t4, A0Y);
        C108955ca.A1P(C20121A8g.A05(str4), A0Y);
        C29591cX A0t5 = C108945cZ.A0t("reason");
        String str6 = str3;
        C29591cX.A02(str6, A0O);
        A0t5.A07(str6);
        this.A01 = C29591cX.A00(A0t5, A0Y);
    }

    public AnonymousClass9F5(C178709Ed r7, String str) {
        this.A00 = 0;
        List A0N = C18070vi.A0N("calls", "marketing_messages", C17880vN.A1Z(), 0, 1);
        this.A01 = A0N;
        C29591cX A0O = AnonymousClass8BY.A0O();
        C29591cX.A01(A0O, "xmlns", "optoutlist");
        AnonymousClass8BY.A1A(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        A0O.A08("marketing_messages", "category", A0N);
        C20121A8g.A0B(A0O, r7);
        this.A02 = A0O.A03();
    }

    public AnonymousClass9F5(C178719Ee r6, String str, byte[] bArr) {
        this.A00 = 14;
        this.A00 = 14;
        String[] strArr = new String[2];
        strArr[0] = "false";
        this.A01 = C18070vi.A0O("true", strArr, 1);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r6);
        this.A02 = C29591cX.A00(C20121A8g.A07("l1", bArr), A0Y);
    }

    public AnonymousClass9F5(Jid jid, String str, String str2) {
        this.A00 = 8;
        C18070vi.A0d(jid, 7);
        String[] A1b = AnonymousClass8BR.A1b();
        A1b[0] = "avatar";
        A1b[1] = "image";
        List A0O = C18070vi.A0O("preview", A1b, 2);
        this.A02 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "w:profile:picture");
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, AnonymousClass8BU.A1Z(str, 0, false) ? 1 : 0);
        Class[] clsArr = new Class[2];
        clsArr[0] = UserJid.class;
        C29601cY.A01(jid, "target", C18070vi.A0O(AnonymousClass1EC.class, clsArr, 1));
        AnonymousClass8BT.A1E(jid, A0Y, "target");
        C29591cX A0t = C108945cZ.A0t("picture");
        A0t.A08(str2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0O);
        this.A01 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F5(UserJid userJid, C178749Eh r21, C178719Ee r22, C178719Ee r23, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A00 = 12;
        String[] strArr = new String[2];
        strArr[0] = "HPP_PAYMENT_LINK";
        List A0O = C18070vi.A0O("UPI", strArr, 1);
        this.A01 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        AnonymousClass8BY.A15(A0Y, str);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-get-p2m-checkout-session");
        String str10 = str2;
        if (C29601cY.A04(str10, 1, 100, false)) {
            C29591cX.A01(A0R, "payment_config_id", str10);
        }
        AnonymousClass8BT.A1E(userJid, A0R, "receiver");
        String str11 = str3;
        if (C29601cY.A04(str11, 1, 100, false)) {
            C29591cX.A01(A0R, "order_id", str11);
        }
        if (l != null && AnonymousClass8BX.A1T(l)) {
            C108965cb.A1I(A0R, "expiration_time_ms", l.longValue());
        }
        String str12 = str4;
        if (C29601cY.A04(str12, 1, 100, false)) {
            C29591cX.A01(A0R, "order_message_id", str12);
        }
        String str13 = str5;
        if (C29601cY.A04(str13, 1, 100, false)) {
            C29591cX.A01(A0R, "request_id", str13);
        }
        String str14 = str6;
        if (str6 != null && AnonymousClass8BU.A1Z(str14, 1, true)) {
            C29591cX.A01(A0R, "payment_gateway_type", str14);
        }
        String str15 = str7;
        if (str7 != null && AnonymousClass8BU.A1Z(str15, 1, true)) {
            C29591cX.A01(A0R, "order_data", str15);
        }
        String str16 = str8;
        if (AnonymousClass8BV.A1V(str16, 0, true)) {
            C29591cX.A01(A0R, "version", str16);
        }
        A0R.A09(str9, "payment_type", A0O);
        C178719Ee r0 = r22;
        if (r22 != null) {
            C178719Ee.A00(A0R, r0);
        }
        C178719Ee r02 = r23;
        if (r23 != null) {
            C178719Ee.A00(A0R, r02);
        }
        AnonymousClass8BX.A1I(C178749Eh.A00(r21, "amount"), A0R, A0Y);
        this.A02 = A0Y.A03();
    }

    public AnonymousClass9F5(UserJid userJid, C178759Ei r16, C178759Ei r17, C178759Ei r18, C178759Ei r19, C178719Ee r20, String str, long j, long j2, long j3) {
        this.A00 = 7;
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "false";
        this.A01 = C18070vi.A0O("true", A1Z, 1);
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "w:biz:catalog");
        C108965cb.A1I(A0Y, "smax_id", 35);
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        String str2 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, C29601cY.A04(str2, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("collections");
        AnonymousClass8BT.A1E(userJid, A0t, "biz_jid");
        C178719Ee r2 = r20;
        if (r20 != null) {
            C178719Ee.A00(A0t, r2);
        }
        C29591cX A0t2 = C108945cZ.A0t("collection_limit");
        long j4 = j;
        C20121A8g.A08(A0t2, C29601cY.A03(Long.valueOf(j4), 0, 20, false) ? 1 : 0, j4);
        C108955ca.A1P(A0t2, A0t);
        C29591cX A0t3 = C108945cZ.A0t("item_limit");
        A0t3.A07(String.valueOf(3));
        C108955ca.A1P(A0t3, A0t);
        C29591cX A0t4 = C108945cZ.A0t("width");
        long j5 = j2;
        C20121A8g.A08(A0t4, C29601cY.A03(Long.valueOf(j5), 1, 2048, false) ? 1 : 0, j5);
        C108955ca.A1P(A0t4, A0t);
        C29591cX A0t5 = C108945cZ.A0t("height");
        long j6 = j3;
        C20121A8g.A08(A0t5, C29601cY.A03(Long.valueOf(j6), 1, 2048, false) ? 1 : 0, j6);
        C108955ca.A1P(A0t5, A0t);
        AnonymousClass8BW.A1E(A0t, r16);
        AnonymousClass8BW.A1E(A0t, r17);
        AnonymousClass8BW.A1E(A0t, r18);
        AnonymousClass8BW.A1E(A0t, r19);
        this.A02 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F5(String str) {
        this.A00 = 9;
        C18070vi.A0d(str, 1);
        List A0N = C18070vi.A0N("0", "1", C17880vN.A1Z(), 0, 1);
        this.A01 = A0N;
        C29591cX A0O = AnonymousClass8BY.A0O();
        C29591cX.A01(A0O, "xmlns", "urn:xmpp:whatsapp:push");
        AnonymousClass8BY.A1A(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0t = C108945cZ.A0t("config");
        A0t.A08("1", "version", A0N);
        this.A02 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F5(String str, UserJid userJid, String str2) {
        this.A00 = 11;
        String[] strArr = new String[2];
        strArr[0] = "false";
        List A0O = C18070vi.A0O("true", strArr, 1);
        this.A01 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-get-vpa");
        AnonymousClass8BT.A1E(userJid, A0R, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A0R.A08(str2, "is_first_send", A0O);
        this.A02 = C29591cX.A00(A0R, A0Y);
    }

    public AnonymousClass9F5(String str, String str2, String str3, String str4, long j) {
        this.A00 = 5;
        String[] strArr = new String[6];
        strArr[0] = "dismiss";
        strArr[1] = "exposure";
        strArr[2] = "impression";
        strArr[3] = "notification_received";
        strArr[4] = "primary_click";
        List A0O = C18070vi.A0O("secondary_click", strArr, 5);
        this.A01 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:comms");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        String str5 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5, C29601cY.A04(str5, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("event");
        String str6 = str2;
        if (C29601cY.A04(str6, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "promotion_id", str6);
        }
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), -9007199254740991L, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, "timestamp_sec", j2);
        }
        String str7 = str3;
        if (C29601cY.A04(str7, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "logdata", str7);
        }
        A0t.A09(str4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0O);
        this.A02 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F5(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.A00 = 13;
        String str7 = str2;
        C18070vi.A0d(str7, 2);
        String str8 = str3;
        C18070vi.A0d(str8, 4);
        String[] strArr = new String[10];
        AnonymousClass8BY.A1Q(strArr);
        AnonymousClass8BY.A1P(strArr);
        List A0O = C18070vi.A0O("UNKNOWN", strArr, 9);
        this.A01 = A0O;
        C29591cX A0O2 = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A16(A0O2, "w:pay");
        String str9 = str;
        AnonymousClass8BW.A1F(A0O2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str9, C29601cY.A04(str9, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-get-accounts");
        AnonymousClass8BY.A1C(A0R, str7, false);
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), -9007199254740991L, 9007199254740991L, false)) {
            C108965cb.A1I(A0R, "code", j2);
        }
        if (AnonymousClass8BV.A1V(str8, 1, false)) {
            C29591cX.A01(A0R, "provider-type", str8);
        }
        String str10 = str4;
        if (str4 != null && AnonymousClass8BV.A1Y(str10, 0, true)) {
            C29591cX.A01(A0R, "bank-ref-id", str10);
        }
        String str11 = str5;
        if (str5 != null) {
            AnonymousClass8BY.A14(A0R, str11);
        }
        A0R.A08(str6, "account-type", A0O);
        this.A02 = C29591cX.A00(A0R, A0O2);
    }

    public AnonymousClass9F5(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A00 = 10;
        String str10 = str4;
        String str11 = str5;
        C18070vi.A0g(str10, 4, str11);
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "AADHAAR";
        List A0O = C18070vi.A0O("BANK", A1Z, 1);
        this.A01 = A0O;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, str);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-generate-otp");
        String str12 = str2;
        if (str2 != null && AnonymousClass8BX.A1W(str12, true)) {
            C29591cX.A01(A0R, "vpa", str12);
        }
        String str13 = str3;
        if (str3 != null && AnonymousClass8BX.A1W(str13, true)) {
            C29591cX.A01(A0R, "vpa-id", str13);
        }
        if (C29601cY.A04(str10, 1, 255, false)) {
            C29591cX.A01(A0R, "device-id", str10);
        }
        if (C29601cY.A04(str11, 1, 10000, false)) {
            C29591cX.A01(A0R, "upi-bank-info", str11);
        }
        String str14 = str6;
        if (str6 != null && AnonymousClass8BV.A1W(str14, 1, true)) {
            C29591cX.A01(A0R, "partial-aadhaar", str14);
        }
        String str15 = str7;
        if (str7 != null && AnonymousClass8BV.A1V(str15, 1, true)) {
            C29591cX.A01(A0R, "provider-type", str15);
        }
        String str16 = str8;
        if (str8 != null) {
            AnonymousClass8BY.A14(A0R, str16);
        }
        A0R.A08(str9, "otp-type", A0O);
        this.A02 = C29591cX.A00(A0R, A0Y);
    }

    public AnonymousClass9F5(String str, String str2, List list, int i) {
        C29591cX r5;
        C29591cX r4;
        this.A00 = i;
        switch (i) {
            case 3:
                AnonymousClass3Ma.A1O(str2, 2, list);
                String[] strArr = new String[2];
                strArr[0] = "false";
                List A0O = C18070vi.A0O("true", strArr, 1);
                this.A02 = A0O;
                r4 = C108955ca.A0Y();
                C29591cX.A01(r4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
                AnonymousClass8BY.A19(r4, "xmlns", "w:interop");
                AnonymousClass8BY.A18(r4, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                r5 = C108945cZ.A0t("reachability_settings");
                r5.A09(str2, "enabled", A0O);
                if (C29601cY.A05(list, 0, 999)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C178709Ed.A00(r5, it);
                    }
                    break;
                }
                break;
            case 4:
                String[] strArr2 = new String[3];
                strArr2[0] = "get_participating_groups_paginated";
                strArr2[1] = "per_group_dirty_recovery";
                List A0O2 = C18070vi.A0O("per_group_dirty_recovery_truncatable", strArr2, 2);
                this.A02 = A0O2;
                r4 = C108955ca.A0Y();
                AnonymousClass8BT.A1E(C173428v3.A00, r4, "to");
                C29591cX.A01(r4, "xmlns", "w:g2");
                AnonymousClass8BY.A1A(r4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                r5 = C108945cZ.A0t("query");
                r5.A08(str2, "context", A0O2);
                if (C29601cY.A05(list, 1, 10000)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C178709Ed.A00(r5, it2);
                    }
                    break;
                }
                break;
            default:
                String[] A1Z = C17880vN.A1Z();
                A1Z[0] = "1";
                this.A01 = C18070vi.A0O("2", A1Z, 1);
                C29591cX A0Y = C108955ca.A0Y();
                AnonymousClass8BY.A19(A0Y, "xmlns", "key_transparency");
                AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (C29601cY.A05(list, 1, 2)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C178719Ee.A01(A0Y, it3);
                    }
                }
                C29591cX A0t = C108945cZ.A0t("multi_serialized_lookup");
                A0t.A08("1", "version", (List) this.A01);
                this.A02 = C29591cX.A00(A0t, A0Y);
                return;
        }
        r4.A05(r5.A03());
        this.A01 = r4.A03();
    }

    public AnonymousClass9F5(String str, List list) {
        this.A00 = 1;
        C18070vi.A0d(list, 4);
        String[] strArr = new String[4];
        strArr[0] = "1";
        strArr[1] = "2";
        strArr[2] = "3";
        List A0O = C18070vi.A0O("4", strArr, 3);
        this.A01 = A0O;
        C29591cX A0O2 = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A16(A0O2, "bot");
        AnonymousClass8BY.A18(A0O2, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0t = C108945cZ.A0t("bot");
        A0t.A08("2", "v", A0O);
        if (C29601cY.A05(list, 0, Long.MAX_VALUE)) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("getNode");
            }
        }
        this.A02 = C29591cX.A00(A0t, A0O2);
    }
}
