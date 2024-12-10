package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9F6  reason: invalid class name */
public class AnonymousClass9F6 extends AnonymousClass9EV {
    public final Object A00;

    public static C29621ca A00(C29621ca r1, AnonymousClass9F6 r2) {
        C29621ca.A04(r1, "iq");
        return (C29621ca) r2.A00;
    }

    public AnonymousClass9F6(long j, String str, String str2) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A16(A0O, "w:pay");
        AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, C29601cY.A04(str, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "get-offer");
        if (C29601cY.A03(Long.valueOf(j), 1, 9007199254740991L, false)) {
            C108965cb.A1I(A0R, "offer_id", j);
        }
        if (str2 != null && AnonymousClass8BV.A1W(str2, 1, true)) {
            C29591cX.A01(A0R, "device_locale", str2);
        }
        this.A00 = C29591cX.A00(A0R, A0O);
    }

    public AnonymousClass9F6(AnonymousClass1EC r5, C178849Er r6, String str) {
        C18070vi.A0d(r5, 1);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A17(A0Y, "w:g2");
        AnonymousClass8BT.A1E(r5, A0Y, "to");
        AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0t = C108945cZ.A0t("sub_group_suggestion");
        C20121A8g.A0A(A0t, r6);
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F6(AnonymousClass1EC r5, String str, int i) {
        String str2;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A16(A0Y, "w:g2");
        AnonymousClass8BT.A1E(r5, A0Y, "to");
        if (25 - i != 0) {
            AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            str2 = "reports";
        } else {
            AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            str2 = "linked_groups_participants";
        }
        this.A00 = C29591cX.A00(C108945cZ.A0t(str2), A0Y);
    }

    public AnonymousClass9F6(AnonymousClass1EC r7, String str, List list) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A17(A0Y, "w:g2");
        AnonymousClass8BT.A1E(r7, A0Y, "to");
        AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0t = C108945cZ.A0t("remove");
        C29591cX.A01(A0t, "linked_groups", "true");
        if (C29601cY.A05(list, 1, 1024)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C178709Ed.A00(A0t, it);
            }
        }
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F6(C178709Ed r18, String str, String str2) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O, "urn:xmpp:whatsapp:account");
        String str3 = str;
        AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("email");
        C20121A8g.A0B(A0t, r18);
        C29591cX A0t2 = C108945cZ.A0t("email_address");
        String str4 = str2;
        if (C29601cY.A04(str4, 0, 320, false)) {
            A0t2.A07(str4);
        }
        AnonymousClass8BX.A1I(A0t2, A0t, A0O);
        this.A00 = A0O.A03();
    }

    public AnonymousClass9F6(C178709Ed r19, String str, String str2, String str3, String str4, int i) {
        String str5;
        C29591cX A0O = AnonymousClass8BY.A0O();
        C29591cX.A01(A0O, "xmlns", "phoenix");
        if (17 - i != 0) {
            str5 = "set";
        } else {
            str5 = "get";
        }
        C29591cX.A01(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5);
        String str6 = str;
        AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str6, C29601cY.A04(str6, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("fds");
        String str7 = str2;
        if (C29601cY.A04(str7, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "config", str7);
        }
        String str8 = str3;
        if (str3 != null && C29601cY.A04(str8, 0, 9007199254740991L, true)) {
            C29591cX.A01(A0t, "state", str8);
        }
        String str9 = str4;
        if (str4 != null && C29601cY.A04(str9, 0, 10000, true)) {
            C29591cX.A01(A0t, "parameters", str9);
        }
        A0t.A05((C29621ca) r19.A00);
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F6(C178759Ei r5, C178759Ei r6, List list) {
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX A0t = C108945cZ.A0t("pictures");
        if (C20121A8g.A0C(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C178709Ed.A00(A0t, it);
            }
        }
        AnonymousClass8BW.A1E(A0t, r5);
        C108955ca.A1P(A0t, A0Y);
        A0Y.A06((C29621ca) r6.A00);
        this.A00 = A0Y.A03();
    }

    public AnonymousClass9F6(C178759Ei r5, String str, int i) {
        C29621ca A002;
        C29591cX A0Y = C108955ca.A0Y();
        if (12 - i != 0) {
            AnonymousClass8BT.A1E(C173428v3.A00, A0Y, "to");
            C29591cX.A01(A0Y, "xmlns", "w:g2");
            AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            A002 = C20121A8g.A04(r5, "leave").A03();
        } else {
            AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
            AnonymousClass8BY.A1A(A0Y, "xmlns", "w:pay", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C29591cX A0R = AnonymousClass8BS.A0R();
            C29591cX.A01(A0R, "action", "recover-account");
            A002 = C29591cX.A00(C20121A8g.A04(r5, "pin"), A0R);
        }
        A0Y.A05(A002);
        this.A00 = A0Y.A03();
    }

    public AnonymousClass9F6(C178819Eo r7, String str) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        C29591cX.A01(A0O, "xmlns", "urn:xmpp:whatsapp:account");
        AnonymousClass8BY.A1A(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0t = C108945cZ.A0t("accept_pay");
        C29591cX.A01(A0t, "version", "3");
        C108965cb.A1I(A0t, "tos_version", 1);
        C20121A8g.A0A(A0t, r7);
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F6(UserJid userJid, C178759Ei r7, C178759Ei r8, C178759Ei r9, String str, String str2) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        AnonymousClass8BY.A1A(A0Y, "xmlns", "w:pay", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "br-get-merchant-config");
        AnonymousClass8BT.A1E(userJid, A0R, "receiver");
        if (str2 != null && AnonymousClass8BV.A1Y(str2, 1, true)) {
            C29591cX.A01(A0R, "payment_config_id", str2);
        }
        A0R.A06((C29621ca) r7.A00);
        AnonymousClass8BW.A1E(A0R, r8);
        AnonymousClass8BW.A1E(A0R, r9);
        this.A00 = C29591cX.A00(A0R, A0Y);
    }

    public AnonymousClass9F6(UserJid userJid, C178759Ei r21, C178759Ei r22, C178759Ei r23, String str, List list, long j, long j2) {
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "fb:thrift_iq");
        C108965cb.A1I(A0Y, "smax_id", 11);
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        String str2 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, C29601cY.A04(str2, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("cart");
        C29591cX.A01(A0t, "op", "refresh");
        AnonymousClass8BT.A1E(userJid, A0t, "biz_jid");
        List list2 = list;
        if (C29601cY.A05(list2, 1, Long.MAX_VALUE)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C178709Ed.A00(A0t, it);
            }
        }
        C29591cX A0t2 = C108945cZ.A0t("image_dimensions");
        C29591cX A0t3 = C108945cZ.A0t("width");
        long j3 = j;
        C20121A8g.A08(A0t3, C29601cY.A03(Long.valueOf(j3), 0, 10000, false) ? 1 : 0, j3);
        C108955ca.A1P(A0t3, A0t2);
        C29591cX A0t4 = C108945cZ.A0t("height");
        long j4 = j2;
        C20121A8g.A08(A0t4, C29601cY.A03(Long.valueOf(j4), 0, 10000, false) ? 1 : 0, j4);
        AnonymousClass8BX.A1I(A0t4, A0t2, A0t);
        AnonymousClass8BW.A1E(A0t, r21);
        AnonymousClass8BW.A1E(A0t, r22);
        AnonymousClass8BW.A1E(A0t, r23);
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F6(UserJid userJid, C178759Ei r21, Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        C29591cX.A01(A0O, "xmlns", "w:pay");
        C29591cX.A01(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        AnonymousClass8BY.A15(A0O, str);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "br-get-p2m-checkout-session");
        C29591cX.A01(A0R, "transaction-type", "p2m");
        AnonymousClass8BT.A1E(userJid, A0R, "receiver");
        String str7 = str2;
        if (AnonymousClass8BV.A1Y(str7, 1, false)) {
            C29591cX.A01(A0R, "success_url", str7);
        }
        if (C29601cY.A04("HPP_PAYMENT_LINK", 1, 100, false)) {
            C29591cX.A01(A0R, "payment_type", "HPP_PAYMENT_LINK");
        }
        String str8 = str3;
        if (C29601cY.A04(str8, 1, 100, false)) {
            C29591cX.A01(A0R, "request_id", str8);
        }
        Long l2 = l;
        if (l != null && C29601cY.A03(l2, 1, 50, true)) {
            C108965cb.A1I(A0R, "max_installment_count", l2.longValue());
        }
        C108955ca.A1P(C20121A8g.A04(r21, "amount"), A0R);
        C29591cX A0t = C108945cZ.A0t("order");
        String str9 = str4;
        AnonymousClass8BW.A1F(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str9, C29601cY.A04(str9, 1, 100, false) ? 1 : 0);
        String str10 = str5;
        if (AnonymousClass8BU.A1Z(str10, 0, true)) {
            C29591cX.A01(A0t, "message_id", str10);
        }
        String str11 = str6;
        if (str6 != null && AnonymousClass8BV.A1Y(str11, 1, true)) {
            C29591cX.A01(A0t, "payment_config_id", str11);
        }
        AnonymousClass8BX.A1I(A0t, A0R, A0O);
        this.A00 = A0O.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        r0 = X.C29591cX.A00(X.C108945cZ.A0t(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002b, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0089, code lost:
        X.C29591cX.A01(r2, r1, r0);
        r0 = X.C29591cX.A00(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9F6(java.lang.String r5, int r6) {
        /*
            r4 = this;
            java.lang.String r2 = "id"
            switch(r6) {
                case 0: goto L_0x00aa;
                case 5: goto L_0x0091;
                case 9: goto L_0x006c;
                case 19: goto L_0x0049;
                case 21: goto L_0x002e;
                default: goto L_0x0005;
            }
        L_0x0005:
            r4.<init>()
            X.1cX r3 = X.C108955ca.A0Y()
            X.8v3 r1 = X.C173428v3.A00
            java.lang.String r0 = "to"
            X.AnonymousClass8BT.A1E(r1, r3, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.C29591cX.A01(r3, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass8BY.A1A(r3, r1, r0, r5, r2)
            java.lang.String r0 = "pre_reg_add_requests"
        L_0x0023:
            X.1cX r0 = X.C108945cZ.A0t(r0)
            X.1ca r0 = X.C29591cX.A00(r0, r3)
        L_0x002b:
            r4.A00 = r0
            return
        L_0x002e:
            r4.<init>()
            X.1cX r3 = X.C108955ca.A0Y()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C29591cX.A01(r3, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:interop"
            X.AnonymousClass8BY.A19(r3, r1, r0)
            X.AnonymousClass8BY.A18(r3, r5, r2)
            java.lang.String r0 = "reachability_settings"
            goto L_0x0023
        L_0x0049:
            r4.<init>()
            X.1cX r3 = X.C108955ca.A0Y()
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C29591cX.A01(r3, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:interop"
            X.AnonymousClass8BY.A19(r3, r1, r0)
            X.AnonymousClass8BY.A18(r3, r5, r2)
            java.lang.String r0 = "integrator"
            X.1cX r2 = X.C108945cZ.A0t(r0)
            java.lang.String r1 = "fetch"
            java.lang.String r0 = "all"
            goto L_0x0089
        L_0x006c:
            r4.<init>()
            X.1cX r3 = X.AnonymousClass8BY.A0O()
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:pay"
            X.C29591cX.A01(r3, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass8BY.A1A(r3, r1, r0, r5, r2)
            X.1cX r2 = X.AnonymousClass8BS.A0R()
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-get-info-for-income-collection"
        L_0x0089:
            X.C29591cX.A01(r2, r1, r0)
            X.1ca r0 = X.C29591cX.A00(r2, r3)
            goto L_0x002b
        L_0x0091:
            r4.<init>()
            X.1cX r3 = X.AnonymousClass8BY.A0O()
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "ar"
            X.C29591cX.A01(r3, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass8BY.A1A(r3, r1, r0, r5, r2)
            java.lang.String r0 = "ar_class"
            goto L_0x0023
        L_0x00aa:
            r4.<init>()
            X.1cX r3 = X.AnonymousClass8BY.A0O()
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "urn:xmpp:whatsapp:account"
            X.C29591cX.A01(r3, r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.AnonymousClass8BY.A1A(r3, r1, r0, r5, r2)
            java.lang.String r0 = "email"
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9F6.<init>(java.lang.String, int):void");
    }

    public AnonymousClass9F6(String str, UserJid userJid, int i) {
        C29591cX A0Y;
        C29621ca A03;
        if (6 - i != 0) {
            A0Y = C108955ca.A0Y();
            AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            AnonymousClass8BY.A1A(A0Y, "xmlns", "w:pay", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C29591cX A0R = AnonymousClass8BS.A0R();
            C29591cX.A01(A0R, "action", "get-pix-info");
            C29591cX A0t = C108945cZ.A0t(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            AnonymousClass8BT.A1E(userJid, A0t, "jid");
            A03 = C29591cX.A00(A0t, A0R);
        } else {
            String A0v = AnonymousClass8BT.A0v(userJid);
            A0Y = C108955ca.A0Y();
            C29591cX.A01(A0Y, "xmlns", "avatars");
            C108965cb.A1I(A0Y, "smax_id", 134);
            C108995ce.A1E(A0Y);
            AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, A0v);
            C29591cX A0t2 = C108945cZ.A0t("contact");
            AnonymousClass8BT.A1E(userJid, A0t2, "jid");
            A03 = A0t2.A03();
        }
        A0Y.A05(A03);
        this.A00 = A0Y.A03();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9F6(java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r17 = this;
            r11 = r19
            r0 = r17
            r5 = r18
            switch(r20) {
                case 4: goto L_0x0086;
                case 13: goto L_0x004e;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r11 = "cd7962b7"
            java.lang.String r4 = "id"
            r0.<init>()
            X.1cX r2 = X.C108955ca.A0Y()
            java.lang.String r3 = "type"
            java.lang.String r1 = "get"
            X.AnonymousClass8BY.A19(r2, r3, r1)
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "w:pay"
            X.C29591cX.A01(r2, r3, r1)
            r6 = 0
            r8 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r10 = 0
            boolean r1 = X.C29601cY.A04(r5, r6, r8, r10)
            X.AnonymousClass8BW.A1F(r2, r4, r5, r1)
            X.1cX r4 = X.AnonymousClass8BS.A0R()
            java.lang.String r3 = "action"
            java.lang.String r1 = "get-purpose-limiting-key"
            X.C29591cX.A01(r4, r3, r1)
            boolean r1 = X.AnonymousClass8BV.A1W(r11, r6, r10)
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "purpose"
        L_0x0044:
            X.C29591cX.A01(r4, r1, r11)
        L_0x0047:
            X.1ca r1 = X.C29591cX.A00(r4, r2)
        L_0x004b:
            r0.A00 = r1
            return
        L_0x004e:
            r0.<init>()
            X.1cX r2 = X.C108955ca.A0Y()
            java.lang.String r3 = "type"
            java.lang.String r1 = "set"
            X.AnonymousClass8BY.A19(r2, r3, r1)
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "w:pay"
            X.C29591cX.A01(r2, r3, r1)
            boolean r16 = X.AnonymousClass8BY.A1X(r2, r5)
            X.1cX r4 = X.AnonymousClass8BS.A0R()
            java.lang.String r3 = "action"
            java.lang.String r1 = "remove-custom-payment-method"
            X.C29591cX.A01(r4, r3, r1)
            java.lang.String r3 = "country"
            java.lang.String r1 = "BR"
            X.C29591cX.A01(r4, r3, r1)
            r12 = 1
            r14 = 200(0xc8, double:9.9E-322)
            boolean r1 = X.C29601cY.A04(r11, r12, r14, r16)
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "credential_id"
            goto L_0x0044
        L_0x0086:
            r0.<init>()
            X.1cX r4 = X.AnonymousClass8BY.A0O()
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.AnonymousClass8BY.A16(r4, r1)
            boolean r16 = X.AnonymousClass8BY.A1X(r4, r5)
            java.lang.String r1 = "verify_email"
            X.1cX r3 = X.C108945cZ.A0t(r1)
            java.lang.String r1 = "code"
            X.1cX r2 = X.C108945cZ.A0t(r1)
            r12 = 6
            r14 = r12
            boolean r1 = X.C29601cY.A04(r11, r12, r14, r16)
            if (r1 == 0) goto L_0x00ae
            r2.A07(r11)
        L_0x00ae:
            X.AnonymousClass8BX.A1I(r2, r3, r4)
            X.1ca r1 = r4.A03()
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9F6.<init>(java.lang.String, java.lang.String, int):void");
    }

    public AnonymousClass9F6(String str, String str2, String str3) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O, "urn:xmpp:whatsapp:account");
        boolean A1X = AnonymousClass8BY.A1X(A0O, str);
        C29591cX A0t = C108945cZ.A0t("verify_email");
        C29591cX A0t2 = C108945cZ.A0t("lg");
        String str4 = str2;
        if (C29601cY.A04(str4, 2, 3, A1X)) {
            A0t2.A07(str4);
        }
        C108955ca.A1P(A0t2, A0t);
        C29591cX A0t3 = C108945cZ.A0t("lc");
        String str5 = str3;
        if (C29601cY.A04(str5, 2, 3, false)) {
            A0t3.A07(str5);
        }
        AnonymousClass8BX.A1I(A0t3, A0t, A0O);
        this.A00 = A0O.A03();
    }

    public AnonymousClass9F6(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j) {
        String str3 = str2;
        C18070vi.A0d(str3, 7);
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "avatars");
        C108965cb.A1I(A0Y, "smax_id", 101);
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        String str4 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, C29601cY.A04(str4, 0, 9007199254740991L, false) ? 1 : 0);
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
        this.A00 = C29591cX.A00(C20121A8g.A05(str3), A0Y);
    }

    public AnonymousClass9F6(List list, int i, String str) {
        C29621ca r0;
        String A0v = AnonymousClass8BT.A0v(list);
        C29591cX A0Y = C108955ca.A0Y();
        if (20 - i != 0) {
            C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
            AnonymousClass8BY.A19(A0Y, "xmlns", "w:interop");
            AnonymousClass8BY.A18(A0Y, str, A0v);
            C29591cX A0t = C108945cZ.A0t("opt_in_integrators");
            C29591cX A0t2 = C108945cZ.A0t("integrator_list");
            if (C29601cY.A05(list, 0, 999)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C178709Ed.A00(A0t2, it);
                }
            }
            r0 = C29591cX.A00(A0t2, A0t);
        } else {
            C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            AnonymousClass8BY.A19(A0Y, "xmlns", "w:interop");
            AnonymousClass8BY.A18(A0Y, str, A0v);
            C29591cX A0t3 = C108945cZ.A0t("users");
            if (C29601cY.A05(list, 1, 256)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C178709Ed.A00(A0t3, it2);
                }
            }
            r0 = A0t3.A03();
        }
        A0Y.A05(r0);
        this.A00 = A0Y.A03();
    }
}
