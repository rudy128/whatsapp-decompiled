package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8hx  reason: invalid class name and case insensitive filesystem */
public abstract class C167898hx extends C20997Acp {
    public final UserJid A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167898hx(C26911Ty r2, UserJid userJid) {
        super(r2);
        C18070vi.A0d(r2, 1);
        this.A00 = userJid;
    }

    public void A03() {
        C222119a A002;
        C29621ca A0a;
        C178759Ei r6;
        C178759Ei r5;
        C178759Ei r2;
        C178719Ee r14;
        C222119a A003;
        if (this instanceof C167848hs) {
            C167848hs r9 = (C167848hs) this;
            String A0B = r9.A04.A0B();
            r9.A05.A03("view_product_tag");
            C19949A0g a0g = r9.A03;
            C195469tO r62 = r9.A02;
            C26911Ty r0 = r9.A01;
            UserJid userJid = r62.A01;
            String A0A = r0.A0A(userJid);
            String str = r62.A04;
            C17960vV.A0G(AnonymousClass8BR.A1S(str), "catalog productId cannot be null or empty");
            ArrayList A13 = AnonymousClass000.A13();
            AnonymousClass8BU.A1J("product_id", str, A13);
            Integer num = r62.A03;
            if (num != null) {
                AnonymousClass8BU.A1J("width", num.toString(), A13);
            }
            Integer num2 = r62.A02;
            if (num2 != null) {
                AnonymousClass8BU.A1J("height", num2.toString(), A13);
            }
            AnonymousClass8BU.A1J("catalog_session_id", r62.A05, A13);
            if (r62.A06) {
                AnonymousClass8BU.A1J("fetch_compliance_info", "true", A13);
            }
            AnonymousClass9PV.A00(r62.A00, A13, false);
            if (!TextUtils.isEmpty(A0A)) {
                AnonymousClass8BU.A1J("direct_connection_encrypted_info", A0A, A13);
            }
            AnonymousClass1MD[] r22 = new AnonymousClass1MD[1];
            C17880vN.A1I(userJid, "jid", r22, 0);
            C29621ca A0l = AnonymousClass8BR.A0l("product", r22, C17890vO.A1Y(A13, 0));
            AnonymousClass1MD[] r23 = new AnonymousClass1MD[4];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r23, 0);
            C17880vN.A1Q("xmlns", "w:biz:catalog", r23, 1);
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r23);
            a0g.A02(r9, C29621ca.A00(C173438v4.A00, A0l, r23), A0B, 196);
        } else if (this instanceof C167878hv) {
            C167878hv r92 = (C167878hv) this;
            String A0B2 = r92.A05.A0B();
            C195539tV r12 = r92.A01;
            String str2 = r12.A06;
            if (str2 == null && (A003 = C20004A2u.A00(r92.A06, "catalog_collections_view_tag")) != null) {
                A003.A07("datasource_collections");
            }
            C195049si r1 = r92.A07;
            UserJid userJid2 = r12.A05;
            r1.A02(A0B2, userJid2, 271);
            C19949A0g a0g2 = r92.A04;
            if (C18020vd.A05(C18040vf.A02, r92.A03, 5886)) {
                String A0A2 = r92.A01.A0A(userJid2);
                C178759Ei r7 = null;
                if (A0A2 != null) {
                    r6 = new C178759Ei(A0A2, 21);
                } else {
                    r6 = null;
                }
                C194359rb r24 = r12.A00;
                if (r24 != null) {
                    r5 = new C178759Ei(C29431cG.A0h(",", r24.A02, C22338B3p.A00), 22);
                    r2 = new C178759Ei((long) r24.A01, (long) r24.A00);
                } else {
                    r5 = null;
                    r2 = null;
                }
                long j = (long) r12.A01;
                long j2 = (long) r12.A03;
                long j3 = (long) r12.A02;
                if (str2 != null) {
                    r14 = new C178719Ee(str2, 6);
                } else {
                    r14 = null;
                }
                String str3 = r12.A07;
                if (str3 != null) {
                    r7 = new C178759Ei(str3, 20);
                }
                UserJid userJid3 = userJid2;
                AnonymousClass9F5 r142 = new AnonymousClass9F5(userJid3, r7, r6, r5, r2, r14, A0B2, j, j2, j3);
                r92.A08.A00.put(A0B2, r142);
                A0a = r142.BVP();
            } else {
                ArrayList A132 = AnonymousClass000.A13();
                AnonymousClass8BU.A1J("width", String.valueOf(r12.A03), A132);
                AnonymousClass8BU.A1J("height", String.valueOf(r12.A02), A132);
                if (str2 != null) {
                    AnonymousClass8BU.A1J("after", str2, A132);
                }
                String str4 = r12.A07;
                if (str4 != null) {
                    AnonymousClass8BU.A1J("catalog_session_id", str4, A132);
                }
                AnonymousClass8BU.A1J("collection_limit", String.valueOf(r12.A01), A132);
                AnonymousClass8BU.A1J("item_limit", String.valueOf(3), A132);
                String A0A3 = r92.A01.A0A(userJid2);
                if (A0A3 != null) {
                    AnonymousClass8BU.A1J("direct_connection_encrypted_info", A0A3, A132);
                }
                AnonymousClass9PV.A00(r12.A00, A132, false);
                AnonymousClass1MD[] r25 = new AnonymousClass1MD[1];
                C17880vN.A1I(userJid2, "biz_jid", r25, 0);
                C29621ca A0l2 = AnonymousClass8BR.A0l("collections", r25, C17890vO.A1Y(A132, 0));
                AnonymousClass1MD[] r26 = new AnonymousClass1MD[5];
                C17880vN.A1I(r12.A04, "to", r26, 0);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, r26, 1);
                C17890vO.A12("smax_id", "35", r26);
                AnonymousClass8BV.A1O("xmlns", "w:biz:catalog", r26);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r26, 4);
                A0a = AnonymousClass8BT.A0a(A0l2, r26);
            }
            a0g2.A02(r92, A0a, A0B2, 271);
        } else if (this instanceof C167868hu) {
            C167868hu r93 = (C167868hu) this;
            AN6.A00(r93.A02, 0);
            String A0B3 = r93.A04.A0B();
            C26911Ty r02 = r93.A01;
            UserJid userJid4 = r93.A00;
            String A0A4 = r02.A0A(userJid4);
            r93.A05.A03("plm_details_view_tag");
            C19949A0g a0g3 = r93.A03;
            List list = r93.A08;
            String str5 = r93.A07;
            String str6 = r93.A06;
            ArrayList A133 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8BT.A1J(new C29621ca(PublicKeyCredentialControllerUtility.JSON_KEY_ID, C17880vN.A0v(it), (AnonymousClass1MD[]) null), "product", A133, (AnonymousClass1MD[]) null);
            }
            AnonymousClass8BU.A1J("width", str5, A133);
            AnonymousClass8BU.A1J("height", str6, A133);
            if (A0A4 != null) {
                AnonymousClass8BU.A1J("direct_connection_encrypted_info", A0A4, A133);
            }
            C29621ca A0l3 = AnonymousClass8BR.A0l("product_list", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) userJid4, "jid")}, C17890vO.A1Y(A133, 0));
            AnonymousClass1MD[] r3 = new AnonymousClass1MD[5];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B3, r3, 0);
            C17880vN.A1Q("xmlns", "w:biz:catalog", r3, 1);
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r3);
            AnonymousClass8BV.A1O("smax_id", "21", r3);
            a0g3.A02(r93, AnonymousClass8BW.A0Q(A0l3, new AnonymousClass1MD((Jid) C173438v4.A00, "to"), r3), A0B3, 164);
            C17900vP.A0Y(userJid4, "RequestBizProductListProtocolHelper/doSendRequest/jid=", AnonymousClass000.A10());
        } else if (this instanceof C167888hw) {
            C167888hw r94 = (C167888hw) this;
            String A0B4 = r94.A04.A0B();
            C188519hY r8 = r94.A02;
            String str7 = r8.A09;
            if (str7 == null && (A002 = C20004A2u.A00(r94.A05, "catalog_collections_view_tag")) != null) {
                A002.A07("datasource_catalog");
            }
            C19949A0g a0g4 = r94.A03;
            C26911Ty r03 = r94.A01;
            UserJid userJid5 = r8.A08;
            String A0A5 = r03.A0A(userJid5);
            ArrayList A134 = AnonymousClass000.A13();
            AnonymousClass8BU.A1J("limit", Integer.toString(r8.A05), A134);
            AnonymousClass8BU.A1J("width", Integer.toString(r8.A07), A134);
            AnonymousClass8BU.A1J("height", Integer.toString(r8.A06), A134);
            if (str7 != null) {
                AnonymousClass8BU.A1J("after", str7, A134);
            }
            String str8 = r8.A0A;
            if (str8 != null) {
                AnonymousClass8BU.A1J("catalog_session_id", str8, A134);
            }
            if (A0A5 != null) {
                AnonymousClass8BU.A1J("direct_connection_encrypted_info", A0A5, A134);
            }
            AnonymousClass9PV.A00(r8.A01, A134, false);
            ArrayList A135 = AnonymousClass000.A13();
            C17890vO.A0n(userJid5, "jid", A135);
            Boolean bool = Boolean.TRUE;
            if (bool == r8.A02) {
                C17890vO.A11("allow_shop_source", bool.toString(), A135);
            }
            if (r8.A03) {
                C17890vO.A11("consumer_visible_only", bool.toString(), A135);
            }
            C29621ca A0l4 = AnonymousClass8BR.A0l("product_catalog", AnonymousClass8BT.A1b(A135, A135.size()), C17890vO.A1Y(A134, 0));
            AnonymousClass1MD[] r27 = new AnonymousClass1MD[4];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B4, r27, 0);
            AnonymousClass8BV.A1N("xmlns", "w:biz:catalog", r27);
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r27);
            a0g4.A02(r94, C29621ca.A00(C173438v4.A00, A0l4, r27), A0B4, 164);
        } else {
            C167858ht r95 = (C167858ht) this;
            AnonymousClass1OZ r10 = r95.A02;
            String A0B5 = r10.A0B();
            C26911Ty r13 = r95.A01;
            AnonymousClass4S5 r04 = r95.A04;
            UserJid userJid6 = r95.A00;
            String A0A6 = r13.A0A(r04.A00(userJid6));
            if (A0A6 != null) {
                C29621ca r52 = new C29621ca("direct_connection_encrypted_info", A0A6, (AnonymousClass1MD[]) null);
                AnonymousClass1MD[] r15 = new AnonymousClass1MD[1];
                C17880vN.A1I(userJid6, "biz_jid", r15, 0);
                C29621ca r63 = new C29621ca(r52, "verify_postcode", r15);
                AnonymousClass1MD[] r53 = new AnonymousClass1MD[5];
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B5, r53, 0);
                C17880vN.A1Q("xmlns", "w:biz:catalog", r53, 1);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r53, 2);
                AnonymousClass8BV.A1O("smax_id", "70", r53);
                C29621ca A0Q = AnonymousClass8BW.A0Q(r63, new AnonymousClass1MD((Jid) C173438v4.A00, "to"), r53);
                r95.A03.A02(A0B5, userJid6, 317);
                r10.A0J(r95, A0Q, A0B5, 317, 32000);
                return;
            }
            r95.A01.C1G("error", 422);
        }
    }

    public final void A04() {
        C26911Ty r2 = this.A01;
        UserJid userJid = this.A00;
        if (r2.A0K(userJid)) {
            A03();
        } else {
            C20478AMp.A00(r2, userJid, this, 0);
        }
    }

    public final void A05(AEW aew) {
        String str;
        if (aew == null || !aew.A0Y) {
            A03();
            return;
        }
        C20259ADr aDr = aew.A03;
        if (!(aDr == null || (str = aDr.A00) == null)) {
            this.A01.A0H(this.A00, str);
        }
        this.A01.A0E(this, this.A00, false);
    }

    public void A06(String str, UserJid userJid, int i) {
        AnonymousClass190 r3;
        String A1I;
        boolean z;
        String str2;
        if (this instanceof C167848hs) {
            C167848hs r2 = (C167848hs) this;
            C17900vP.A0i("ProductRequestProtocolHelper/onError/error - ", AnonymousClass000.A10(), i);
            r2.A05.A02("view_product_tag");
            r2.A00.Bu8(r2.A02, i);
        } else if (this instanceof C167878hv) {
            C167878hv r22 = (C167878hv) this;
            if (str != null) {
                r22.A08.A00.remove(str);
            }
            C167878hv.A00(r22);
            if (str != null) {
                r22.A07.A00(str);
            }
            C17900vP.A0i("GetCollectionsProtocol/onError/error - ", AnonymousClass000.A10(), i);
            r22.A00.A01(r22.A01, i);
        } else {
            if (this instanceof C167868hu) {
                C167868hu r23 = (C167868hu) this;
                r23.A05.A02("plm_details_view_tag");
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A19(A10, AnonymousClass8BS.A0g(userJid, "RequestBizProductListProtocolHelper/onError/response-error, jid = ", A10));
                AN6.A00(r23.A02, 2);
                r3 = r23.A00;
                A1I = AnonymousClass001.A1I("error_code=", AnonymousClass000.A10(), i);
                z = true;
                str2 = "RequestBizProductListProtocolHelper/get product list error";
            } else if (this instanceof C167888hw) {
                C167888hw r24 = (C167888hw) this;
                C167888hw.A00(r24);
                C17900vP.A0X(userJid, "sendGetBizProductCatalog/response-error/jid=", AnonymousClass000.A10());
                r24.A01.Btn(r24.A02, i);
                r3 = r24.A00;
                A1I = AnonymousClass001.A1I("error_code=", AnonymousClass000.A10(), i);
                z = true;
                str2 = "RequestBizProductCatalogProtocolHelper/get product catalog error";
            } else {
                C167858ht r25 = (C167858ht) this;
                if (str != null) {
                    r25.A03.A00(str);
                }
                r25.A00.A03();
                r25.A01.C1G("error", i);
                return;
            }
            r3.A0G(str2, A1I, z);
        }
    }

    public void Brd(UserJid userJid) {
        StringBuilder A0K = C18070vi.A0K(userJid);
        C17890vO.A19(A0K, AnonymousClass8BS.A0g(userJid, "LOG_TAG/onDirectConnectionError, jid = ", A0K));
        A06((String) null, userJid, 422);
    }

    public void Bre(UserJid userJid) {
        StringBuilder A0K = C18070vi.A0K(userJid);
        C17890vO.A1A(A0K, AnonymousClass8BS.A0g(userJid, "DirectConnectionProtocolHelperEntryPoint/onDirectConnectionSucceeded, jid =  ", A0K));
        A03();
    }

    public void Bt9(C29621ca r5, String str) {
        boolean A16 = C18070vi.A16(str, r5);
        int A002 = C60482o6.A00(r5);
        if (A002 != 421 || this.A00) {
            A06(str, this.A00, A002);
            return;
        }
        if (this instanceof C167848hs) {
            Log.i("ProductRequestProtocolHelper/onDirectConnectionRevokeKey");
            ((C167848hs) this).A05.A02("view_product_tag");
        } else if (this instanceof C167878hv) {
            C167878hv r3 = (C167878hv) this;
            C167878hv.A00(r3);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GetCollectionsProtocol/onDirectConnectionRevokeKey/jid - ");
            C17900vP.A0b(r3.A01.A05, A10);
        } else if (this instanceof C167868hu) {
            C167868hu r32 = (C167868hu) this;
            r32.A05.A02("plm_details_view_tag");
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("RequestBizProductListProtocolHelper/onDirectConnectionRevokeKey, jid = ");
            C17890vO.A1A(A102, r32.A00.getRawString());
        } else if (this instanceof C167888hw) {
            C167888hw r33 = (C167888hw) this;
            C167888hw.A00(r33);
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("sendGetBizProductCatalog/onDirectConnectionRevokeKey/jid=");
            C17900vP.A0b(r33.A00, A103);
        } else {
            Log.i("DCPostcodeVerificationProtocolHelper/onDirectConnectionRevokeKey");
        }
        this.A00 = A16;
        this.A01.A0E(this, this.A00, A16);
    }
}
