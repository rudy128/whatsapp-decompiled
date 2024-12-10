package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9F7  reason: invalid class name */
public class AnonymousClass9F7 extends AnonymousClass9EV {
    public final Object A00;

    public AnonymousClass9F7(AnonymousClass1EC r5, C178709Ed r6, C178709Ed r7, C178709Ed r8, C178709Ed r9, C178709Ed r10, C178709Ed r11, String str) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A17(A0Y, "w:g2");
        AnonymousClass8BT.A1E(r5, A0Y, "to");
        AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C20121A8g.A0B(A0Y, r6);
        C20121A8g.A0B(A0Y, r7);
        C20121A8g.A0B(A0Y, r8);
        C20121A8g.A0B(A0Y, r9);
        C20121A8g.A0B(A0Y, r10);
        C20121A8g.A0B(A0Y, r11);
        this.A00 = A0Y.A03();
    }

    public AnonymousClass9F7(AnonymousClass1EC r5, C178709Ed r6, C178709Ed r7, C178709Ed r8, String str) {
        C18070vi.A0d(r5, 1);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A17(A0Y, "w:g2");
        AnonymousClass8BT.A1E(r5, A0Y, "to");
        AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0t = C108945cZ.A0t("sub_group_suggestions_action");
        C20121A8g.A0B(A0t, r6);
        C20121A8g.A0B(A0t, r7);
        C20121A8g.A0B(A0t, r8);
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F7(AnonymousClass1EC r18, UserJid userJid, AnonymousClass4A4 r20, String str, String str2, List list) {
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        String str3 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("spam_list");
        AnonymousClass8BT.A1E(r18, A0t, "jid");
        UserJid userJid2 = userJid;
        if (userJid != null) {
            AnonymousClass8BT.A1E(userJid2, A0t, "source");
        }
        String str4 = str2;
        if (C29601cY.A04(str4, 0, 65536, false)) {
            C29591cX.A01(A0t, "subject", str4);
        }
        List list2 = list;
        if (C29601cY.A05(list2, 0, 210)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C178719Ee.A01(A0t, it);
            }
        }
        C108955ca.A1P(A0t, A0Y);
        C20121A8g.A09(A0Y, r20);
        this.A00 = A0Y.A03();
    }

    public AnonymousClass9F7(AnonymousClass1EC r18, String str, String str2) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A17(A0Y, "w:g2");
        AnonymousClass8BT.A1E(r18, A0Y, "to");
        String str3 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("reports");
        C29591cX A0t2 = C108945cZ.A0t("report");
        String str4 = str2;
        if (C29601cY.A04(str4, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t2, "message_id", str4);
        }
        AnonymousClass8BX.A1I(A0t2, A0t, A0Y);
        this.A00 = A0Y.A03();
    }

    public AnonymousClass9F7(C29681ch r18, AnonymousClass4A4 r19, String str, String str2, List list) {
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        String str3 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("spam_list");
        AnonymousClass8BT.A1E(r18, A0t, "jid");
        String str4 = str2;
        if (C29601cY.A04(str4, 0, 65536, false)) {
            C29591cX.A01(A0t, "subject", str4);
        }
        List list2 = list;
        if (C29601cY.A05(list2, 0, 30)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C178719Ee.A01(A0t, it);
            }
        }
        C108955ca.A1P(A0t, A0Y);
        C20121A8g.A09(A0Y, r19);
        this.A00 = A0Y.A03();
    }

    public AnonymousClass9F7(C29681ch r12, C178789El r13, Long l, String str, long j) {
        C18070vi.A0d(r12, 1);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A16(A0Y, "newsletter");
        AnonymousClass8BT.A1E(r12, A0Y, "to");
        boolean A1X = AnonymousClass8BY.A1X(A0Y, str);
        C29591cX A0t = C108945cZ.A0t("message_updates");
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), 1, 300, A1X)) {
            C108965cb.A1I(A0t, "count", j2);
        }
        if (l != null && AnonymousClass8BX.A1T(l)) {
            C108965cb.A1I(A0t, "since", l.longValue());
        }
        C20121A8g.A0A(A0t, r13);
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F7(C29681ch r5, String str) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A17(A0Y, "newsletter");
        AnonymousClass8BT.A1E(r5, A0Y, "to");
        AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        this.A00 = C29591cX.A00(C108945cZ.A0t("live_updates"), A0Y);
    }

    public AnonymousClass9F7(C29681ch r10, String str, long j) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A16(A0O, "newsletter");
        AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, C29601cY.A04(str, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("my_addons");
        if (C29601cY.A03(Long.valueOf(j), 0, 5000, false)) {
            C108965cb.A1I(A0t, "limit", j);
        }
        if (r10 != null) {
            AnonymousClass8BT.A1E(r10, A0t, "jid");
        }
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F7(C178719Ee r5, String str) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r5);
        this.A00 = C29591cX.A00(C108945cZ.A0t("delete"), A0Y);
    }

    public AnonymousClass9F7(C178719Ee r11, String str, String str2, String str3) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A16(A0O, "w:mex");
        boolean A1X = AnonymousClass8BY.A1X(A0O, str);
        if (r11 != null) {
            C178719Ee.A00(A0O, r11);
        }
        C29591cX A0t = C108945cZ.A0t("query");
        String str4 = str2;
        if (str2 != null && C29601cY.A04(str4, 1, 20, true)) {
            C29591cX.A01(A0t, "query_id", str2);
        }
        if (C29601cY.A04(str3, 1, 8448000, A1X)) {
            A0t.A07(str3);
        }
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F7(C178719Ee r5, String str, byte[] bArr) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r5);
        this.A00 = C29591cX.A00(C20121A8g.A07("r1", bArr), A0Y);
    }

    public AnonymousClass9F7(C178779Ek r10, AnonymousClass4A4 r11, String str, long j) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A16(A0O, "newsletter");
        boolean A1X = AnonymousClass8BY.A1X(A0O, str);
        C29591cX A0t = C108945cZ.A0t("messages");
        if (C29601cY.A03(Long.valueOf(j), 1, 300, A1X)) {
            C108965cb.A1I(A0t, "count", j);
        }
        C20121A8g.A09(A0t, r11);
        if (r10 != null) {
            C20121A8g.A0A(A0t, r10);
        }
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F7(Jid jid, C178759Ei r14, C178749Eh r15, AnonymousClass4A4 r16, String str, List list, List list2, List list3) {
        List list4 = list3;
        C18070vi.A0d(list4, 5);
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        String str2 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2, C29601cY.A04(str2, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("spam_list");
        if (jid != null) {
            Class[] clsArr = new Class[2];
            clsArr[0] = AnonymousClass1ED.class;
            C29601cY.A01(jid, "spam_list->jid", C18070vi.A0O(UserJid.class, clsArr, 1));
            AnonymousClass8BT.A1E(jid, A0t, "jid");
        }
        List list5 = list;
        if (C29601cY.A05(list5, 0, 210)) {
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                C178719Ee.A01(A0t, it);
            }
        }
        List<C178679Ea> list6 = list2;
        if (C29601cY.A05(list6, 0, 5)) {
            for (C178679Ea r5 : list6) {
                A0t.A05(r5.A00);
            }
        }
        if (C29601cY.A05(list4, 0, 5)) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                C178719Ee.A01(A0t, it2);
            }
        }
        AnonymousClass8BW.A1E(A0t, r14);
        AnonymousClass8BV.A1G(A0t, r15);
        C108955ca.A1P(A0t, A0Y);
        C20121A8g.A09(A0Y, r16);
        this.A00 = A0Y.A03();
    }

    public AnonymousClass9F7(UserJid userJid, C178759Ei r12, C178759Ei r13, C178719Ee r14, String str, String str2) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "fb:thrift_iq");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        boolean A1X = AnonymousClass8BY.A1X(A0Y, str);
        C29591cX A0t = C108945cZ.A0t("request");
        C29591cX.A01(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "report_product");
        AnonymousClass8BT.A1E(userJid, A0t, "biz_jid");
        C178719Ee.A00(A0t, r14);
        C29591cX A0t2 = C108945cZ.A0t(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String str3 = str2;
        if (C29601cY.A04(str3, 1, 200, A1X)) {
            A0t2.A07(str3);
        }
        C108955ca.A1P(A0t2, A0t);
        A0t.A06((C29621ca) r12.A00);
        AnonymousClass8BW.A1E(A0t, r13);
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F7(String str, int i) {
        C29591cX r4;
        String str2;
        AnonymousClass1MD r2;
        switch (i) {
            case 10:
                str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                r4 = C108955ca.A0Y();
                C29591cX.A01(r4, "xmlns", "passkey");
                C108965cb.A1I(r4, "smax_id", 127);
                C108995ce.A1E(r4);
                r2 = AnonymousClass8BR.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                break;
            case 11:
                str2 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                r4 = C108955ca.A0Y();
                C29591cX.A01(r4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                C29591cX.A01(r4, "xmlns", "w:p");
                r2 = new AnonymousClass1MD((Jid) C173438v4.A00, "to");
                break;
            default:
                r4 = AnonymousClass8BY.A0O();
                C29591cX.A01(r4, "xmlns", "w:sync:app:state");
                AnonymousClass8BY.A1A(r4, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                C108955ca.A1P(C108945cZ.A0t("delete_all_data"), r4);
                break;
        }
        r4.A04(r2);
        AnonymousClass8BY.A18(r4, str, str2);
        this.A00 = r4.A03();
    }

    public AnonymousClass9F7(String str, int i, long j, long j2) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O, "tos");
        AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, C29601cY.A04(str, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("notice");
        long j3 = j;
        if (C29601cY.A03(Long.valueOf(j3), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j3);
        }
        C108965cb.A1I(A0t, "stage", 5);
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F7(String str, long j) {
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O, "tos");
        AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, C29601cY.A04(str, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("delete");
        if (C29601cY.A03(Long.valueOf(j), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j);
        }
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F7(String str, String str2, int i) {
        C29591cX A0O;
        C29621ca A002;
        String str3 = str;
        String str4 = str2;
        if (3 - i != 0) {
            A0O = C108955ca.A0Y();
            AnonymousClass8BY.A19(A0O, "xmlns", "urn:xmpp:whatsapp:push");
            C29591cX.A01(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 0, 9007199254740991L, false) ? 1 : 0);
            C29591cX A0t = C108945cZ.A0t("pn");
            if (C29601cY.A04(str4, 0, 300, false)) {
                A0t.A07(str4);
            }
            A002 = A0t.A03();
        } else {
            A0O = AnonymousClass8BY.A0O();
            AnonymousClass8BY.A16(A0O, "w:growth");
            AnonymousClass8BY.A18(A0O, str3, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C29591cX A0t2 = C108945cZ.A0t("invite");
            C29591cX A0t3 = C108945cZ.A0t("get_sender");
            if (str2 != null && C29601cY.A04(str4, 0, 1024, true)) {
                C29591cX.A01(A0t3, "code", str4);
            }
            A002 = C29591cX.A00(A0t3, A0t2);
        }
        A0O.A05(A002);
        this.A00 = A0O.A03();
    }

    public AnonymousClass9F7(String str, String str2, String str3, String str4, String str5) {
        String str6 = str3;
        C18070vi.A0d(str6, 4);
        String str7 = str4;
        String str8 = str5;
        C72473Md.A1J(str7, str8);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        AnonymousClass8BY.A18(A0Y, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-validate-international-qr");
        C108965cb.A1I(A0R, "version", 1);
        String str9 = str2;
        if (C29601cY.A04(str9, 1, 1000, false)) {
            C29591cX.A01(A0R, "device-id", str9);
        }
        if (AnonymousClass8BV.A1U(str6, 0)) {
            C29591cX.A01(A0R, "seq-no", str6);
        }
        if (C29601cY.A04(str7, 1, 10000, false)) {
            C29591cX.A01(A0R, "qr-payload", str7);
        }
        if (C29601cY.A04(str8, 1, 1000, false)) {
            C29591cX.A01(A0R, "vpa", str8);
        }
        this.A00 = C29591cX.A00(A0R, A0Y);
    }

    public AnonymousClass9F7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str2;
        String str10 = str6;
        String str11 = str7;
        String str12 = str8;
        C72483Me.A16(str9, str10, str11, str12, 3);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        String str13 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str13, C29601cY.A04(str13, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-deactivate-international-payments");
        C108965cb.A1I(A0R, "version", 1);
        if (C29601cY.A04(str9, 1, 1000, false)) {
            C29591cX.A01(A0R, "vpa", str9);
        }
        String str14 = str3;
        if (C29601cY.A04(str14, 1, 1000, false)) {
            C29591cX.A01(A0R, "vpa-id", str14);
        }
        AnonymousClass8BY.A1B(A0R, str4, false);
        String str15 = str5;
        if (C29601cY.A04(str15, 1, 1000, false)) {
            C29591cX.A01(A0R, "device-id", str15);
        }
        if (C29601cY.A04(str10, 1, 1000, false)) {
            C29591cX.A01(A0R, "mpin", str10);
        }
        if (AnonymousClass8BV.A1U(str11, 0)) {
            C29591cX.A01(A0R, "seq-no", str11);
        }
        if (C29601cY.A04(str12, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0R, "upi-bank-info", str12);
        }
        this.A00 = C29591cX.A00(A0R, A0Y);
    }

    public AnonymousClass9F7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, long j2) {
        String str9 = str2;
        C18070vi.A0d(str9, 5);
        String str10 = str6;
        C18070vi.A0d(str10, 10);
        String str11 = str7;
        String str12 = str8;
        C72473Md.A1L(str11, str12);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        String str13 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str13, C29601cY.A04(str13, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-activate-international-payments");
        long j3 = j;
        if (C29601cY.A03(Long.valueOf(j3), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0R, "start-ts", j3);
        }
        long j4 = j2;
        if (C29601cY.A03(Long.valueOf(j4), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0R, "end-ts", j4);
        }
        C108965cb.A1I(A0R, "version", 1);
        if (C29601cY.A04(str9, 1, 1000, false)) {
            C29591cX.A01(A0R, "vpa", str9);
        }
        String str14 = str3;
        if (C29601cY.A04(str14, 1, 1000, false)) {
            C29591cX.A01(A0R, "vpa-id", str14);
        }
        AnonymousClass8BY.A1B(A0R, str4, false);
        String str15 = str5;
        if (C29601cY.A04(str15, 1, 1000, false)) {
            C29591cX.A01(A0R, "device-id", str15);
        }
        if (C29601cY.A04(str10, 1, 1000, false)) {
            C29591cX.A01(A0R, "mpin", str10);
        }
        if (AnonymousClass8BV.A1U(str11, 0)) {
            C29591cX.A01(A0R, "seq-no", str11);
        }
        if (C29601cY.A04(str12, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0R, "upi-bank-info", str12);
        }
        this.A00 = C29591cX.A00(A0R, A0Y);
    }

    public AnonymousClass9F7(String str, String str2, List list) {
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "fb:thrift_iq");
        C108965cb.A1I(A0Y, "smax_id", 138);
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        String str3 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3, C29601cY.A04(str3, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0S = AnonymousClass8BS.A0S();
        String str4 = str2;
        AnonymousClass8BW.A1F(A0S, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, C29601cY.A04(str4, 0, 9007199254740991L, false) ? 1 : 0);
        C108955ca.A1P(A0S, A0Y);
        C29591cX A0t = C108945cZ.A0t("feedback_list");
        List<C20121A8g> list2 = list;
        if (C29601cY.A05(list2, 1, 10)) {
            for (C20121A8g BVP : list2) {
                A0t.A05(BVP.BVP());
            }
        }
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F7(String str, byte[] bArr, int i) {
        C29621ca A03;
        if (12 - i != 0) {
            String A0v = AnonymousClass8BT.A0v(bArr);
            C29591cX A0O = AnonymousClass8BY.A0O();
            AnonymousClass8BY.A16(A0O, "cover");
            AnonymousClass8BY.A18(A0O, str, A0v);
            C29591cX A0t = C108945cZ.A0t("ta_pad");
            C29591cX.A01(A0t, "stage", "message_publish");
            C29601cY.A02(bArr, 0, 100000);
            A0t.A01 = bArr;
            A03 = C29591cX.A00(A0t, A0O);
        } else {
            String A0v2 = AnonymousClass8BT.A0v(bArr);
            C29591cX A0Y = C108955ca.A0Y();
            C29591cX.A01(A0Y, "xmlns", "privatestats");
            AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            AnonymousClass8BY.A18(A0Y, str, A0v2);
            C29591cX A0t2 = C108945cZ.A0t("sign_credential");
            C29591cX.A01(A0t2, "version", "1");
            C29591cX A0t3 = C108945cZ.A0t("blinded_credential");
            C29601cY.A02(bArr, 32, 32);
            A0t3.A01 = bArr;
            AnonymousClass8BX.A1I(A0t3, A0t2, A0Y);
            A03 = A0Y.A03();
        }
        this.A00 = A03;
    }

    public AnonymousClass9F7(String str, byte[] bArr, String str2) {
        String str3 = str2;
        byte[] bArr2 = bArr;
        C18070vi.A0k(str3, bArr2);
        C29591cX A0O = AnonymousClass8BY.A0O();
        AnonymousClass8BY.A17(A0O, "md");
        String str4 = str;
        AnonymousClass8BW.A1F(A0O, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, C29601cY.A04(str4, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("primary_ephemeral_identity");
        if (C29601cY.A04(str3, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0t, "companion_ref", str3);
        }
        C29601cY.A02(bArr2, -9007199254740991L, 9007199254740991L);
        A0t.A01 = bArr2;
        this.A00 = C29591cX.A00(A0t, A0O);
    }

    public AnonymousClass9F7(List list, int i, String str) {
        C29591cX r5;
        if (21 - i != 0) {
            r5 = AnonymousClass8BY.A0O();
            AnonymousClass8BY.A16(r5, "tos");
            AnonymousClass8BY.A18(r5, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (C29601cY.A05(list, 0, Long.MAX_VALUE)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C178719Ee.A01(r5, it);
                }
            }
        } else {
            r5 = C108955ca.A0Y();
            AnonymousClass8BY.A19(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
            C29591cX.A01(r5, "xmlns", "w:pay");
            AnonymousClass8BY.A18(r5, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            C29591cX A0R = AnonymousClass8BS.A0R();
            C29591cX.A01(A0R, "action", "get-contacts-payment-status");
            if (C29601cY.A05(list, 0, Long.MAX_VALUE)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C178719Ee.A01(A0R, it2);
                }
            }
            C108955ca.A1P(A0R, r5);
        }
        this.A00 = r5.A03();
    }
}
