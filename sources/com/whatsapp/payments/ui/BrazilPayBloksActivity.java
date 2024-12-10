package com.whatsapp.payments.ui;

import X.A0R;
import X.A2C;
import X.A2V;
import X.A4K;
import X.A54;
import X.A5F;
import X.A5H;
import X.A5Y;
import X.A71;
import X.A8e;
import X.AGC;
import X.AOY;
import X.AYX;
import X.AZ2;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass17K;
import X.AnonymousClass17L;
import X.AnonymousClass198;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KH;
import X.AnonymousClass1KI;
import X.AnonymousClass1QO;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VT;
import X.AnonymousClass4a6;
import X.AnonymousClass7G3;
import X.AnonymousClass89U;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8pK;
import X.AnonymousClass8pT;
import X.AnonymousClass8pY;
import X.AnonymousClass91q;
import X.AnonymousClass93V;
import X.B7X;
import X.C000200d;
import X.C010105w;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C130136iw;
import X.C137116uw;
import X.C170648qR;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C184809bY;
import X.C186529eL;
import X.C187619g6;
import X.C190699lN;
import X.C191129m4;
import X.C191369mU;
import X.C191389mW;
import X.C191529mk;
import X.C191619mt;
import X.C191949nS;
import X.C192469oR;
import X.C194839sN;
import X.C195019sf;
import X.C195929uA;
import X.C197609wy;
import X.C197909xT;
import X.C198599yb;
import X.C19944A0b;
import X.C20031A4a;
import X.C20037A4g;
import X.C20074A6a;
import X.C20085A6m;
import X.C20151A9n;
import X.C20284AEs;
import X.C20751AXg;
import X.C20763AXs;
import X.C20775AYe;
import X.C20778AYh;
import X.C21347Aib;
import X.C221618v;
import X.C25011Mn;
import X.C26551So;
import X.C30931ek;
import X.C31051ew;
import X.C31061ex;
import X.C31071ey;
import X.C33701jF;
import X.C33711jG;
import X.C56382hN;
import X.C58042k3;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import X.CXN;
import X.CXY;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;

public class BrazilPayBloksActivity extends AnonymousClass91q implements AnonymousClass89U {
    public C187619g6 A00;
    public C194839sN A01;
    public AnonymousClass1KI A02;
    public C20284AEs A03;
    public AnonymousClass1KH A04;
    public C19944A0b A05;
    public C20751AXg A06;
    public C20074A6a A07;
    public AnonymousClass1QO A08;
    public C191369mU A09;
    public C58042k3 A0A;
    public C191949nS A0B;
    public C184809bY A0C;
    public C191129m4 A0D;
    public C31071ey A0E;
    public C20037A4g A0F;
    public AnonymousClass93V A0G;
    public A5Y A0H;
    public A0R A0I;
    public A5F A0J;
    public C192469oR A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public String A0P;
    public boolean A0Q;

    public static int A0d(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!((C21347Aib) list.get(i)).A0C) {
                return i;
            }
        }
        return -1;
    }

    public static void A0v(C194839sN r10, BrazilPayBloksActivity brazilPayBloksActivity, String str, List list, List list2, int i) {
        List list3 = list;
        C194839sN r3 = r10;
        int i2 = i;
        if (i >= list.size()) {
            r10.A00("on_failure");
            return;
        }
        BrazilPayBloksActivity brazilPayBloksActivity2 = brazilPayBloksActivity;
        C58042k3 r11 = brazilPayBloksActivity.A0A;
        File file = (File) list.get(i);
        C26551So r13 = C26551So.A0g;
        C130136iw r2 = new C130136iw(r3, brazilPayBloksActivity2, str, list2, list3, i2);
        Context context = r11.A01;
        AnonymousClass1KB r5 = r11.A02;
        C31061ex r7 = r11.A04;
        C33711jG A0a = AnonymousClass8BR.A0a(r11.A06);
        A54 a54 = r11.A05;
        C191619mt r32 = new C191619mt(context, r5, A0a, r7, a54, "DOC-UPLOAD");
        AZ2 A012 = a54.A01("FB", "DOC-UPLOAD");
        if (A012 != null) {
            r11.A00(A012, r2, r13, file);
        } else {
            r32.A00(new C20778AYh(file, r11, r2, r13, 1), "FB");
        }
    }

    public static void A0w(C194839sN r23, BrazilPayBloksActivity brazilPayBloksActivity, Map map, int i) {
        String A1G;
        String str;
        Map map2 = map;
        String A0Q2 = AnonymousClass91q.A0Q("full_name", map2);
        String replaceAll = AnonymousClass91q.A0V("tax_id", map2).replaceAll("[^\\d]", "");
        BrazilPayBloksActivity brazilPayBloksActivity2 = brazilPayBloksActivity;
        String A0B2 = brazilPayBloksActivity2.A02.A0B();
        C17960vV.A07(A0B2);
        String replaceAll2 = AnonymousClass17K.A06(A0B2).replaceAll("[^\\d]", "");
        String replaceAll3 = AnonymousClass91q.A0Q("address_postal_code", map2).replaceAll("[^\\d]", "");
        String A0s = C17880vN.A0s("address_street_name", map2);
        String A0s2 = C17880vN.A0s("address_city", map2);
        String A0s3 = C17880vN.A0s("address_state", map2);
        String A0s4 = C17880vN.A0s("address_houe_number", map2);
        String A0s5 = C17880vN.A0s("address_extra_line", map2);
        String A0s6 = C17880vN.A0s("address_neighborhood", map2);
        String A1G2 = C108945cZ.A1G("fds_manager_id", AnonymousClass8BW.A0p(brazilPayBloksActivity2));
        Stack stack = brazilPayBloksActivity2.A0A.A02;
        if (stack.isEmpty()) {
            A1G = null;
        } else {
            A1G = C108945cZ.A1G("onboarding_context", (AbstractMap) stack.peek());
        }
        C18030ve r2 = brazilPayBloksActivity2.A0E;
        C18040vf r3 = C18040vf.A02;
        if ((!C18020vd.A05(r3, r2, 2928) || !"p2m_context".equals(A1G)) && !C18020vd.A05(r3, brazilPayBloksActivity2.A0E, 12428)) {
            str = null;
        } else {
            str = "SAVE_KYC_DATA";
        }
        AnonymousClass1KB r7 = brazilPayBloksActivity2.A05;
        C30931ek r11 = brazilPayBloksActivity2.A0Q;
        C198599yb r5 = new C198599yb(brazilPayBloksActivity2, r7, AnonymousClass8BU.A0P(brazilPayBloksActivity2), brazilPayBloksActivity2.A0A, brazilPayBloksActivity2.A0H, r11, A0Q2, replaceAll, replaceAll2, A0s, A0s4, A0s5, A0s6, A0s2, A0s3, replaceAll3);
        AYX ayx = new AYX(r23, brazilPayBloksActivity2, A1G, A1G2, map2, i);
        A54 a54 = r5.A05;
        AZ2 A012 = a54.A01("FB", "KYC");
        if (A012 == null || !A012.A05.equalsIgnoreCase("FB")) {
            new C191619mt(r5.A01, r5.A02, r5.A03, r5.A04, a54, "KYC").A00(new C20775AYe(r5, ayx, str), "FB");
            return;
        }
        C198599yb.A00(r5, ayx, A012, str);
    }

    public static void A0y(C21347Aib aib, Map map) {
        String str;
        String str2;
        map.put("card_verify_identifier", aib.A03);
        String str3 = aib.A0B;
        map.put("card_verify_type", str3);
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1302107194:
                    if (!str3.equals("customer-service")) {
                        return;
                    }
                    break;
                case -119226117:
                    if (str3.equals("app-to-app")) {
                        map.put("app_to_app_partner_app_name", aib.A06);
                        map.put("app_to_app_partner_app_package", aib.A07);
                        map.put("app_to_app_partner_intent_action", aib.A08);
                        map.put("app_to_app_request_payload", aib.A09);
                        break;
                    } else {
                        return;
                    }
                case 110379:
                    if (str3.equals("otp")) {
                        map.put("card_verify_otp_type", aib.A05);
                        map.put("card_verify_otp_resend_interval_sec", String.valueOf(aib.A01));
                        map.put("card_verify_otp_receiver_info", aib.A04);
                        int i = aib.A00;
                        map.put("otp_length", String.valueOf(i));
                        map.put("remaining_validates", String.valueOf(1));
                        StringBuilder A10 = AnonymousClass000.A10();
                        for (int i2 = 0; i2 < i; i2++) {
                            A10.append("#  ");
                        }
                        str2 = A10.toString().trim();
                        str = "otp_mask";
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            str = "support_phone_number";
            str2 = aib.A0A;
            map.put(str, str2);
        }
    }

    public void A2y() {
        if (!this.A0Q) {
            this.A0Q = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r1 = r3.A00;
            C63932tv.A01(r3, r1, this);
            C63662tU.A00(r3, r1, this, r1.A5A);
            this.A06 = AnonymousClass3Ma.A0g(r3);
            this.A01 = (A71) r1.AC6.get();
            this.A05 = r1.A2Q();
            this.A00 = (C56382hN) A002.A64.get();
            this.A03 = AnonymousClass1K1.A0D(A002);
            this.A07 = (AnonymousClass198) r3.AC0.get();
            this.A08 = AnonymousClass1K1.A01(A002);
            this.A05 = (C25011Mn) r3.A9o.get();
            this.A0S = (A2V) r3.AB2.get();
            this.A0E = (C191529mk) r1.AEk.get();
            this.A0R = C108975cc.A0O(r3);
            this.A0D = AnonymousClass3MZ.A0z(r3);
            this.A0Q = AnonymousClass8BT.A0V(r3);
            this.A04 = AnonymousClass3MZ.A0n(r3);
            this.A0O = (A4K) r1.AET.get();
            this.A01 = (C170648qR) r1.A6h.get();
            this.A02 = (C186529eL) r1.A6o.get();
            this.A0M = AnonymousClass8BV.A0H(r3);
            this.A0J = (C20031A4a) r3.AcX.get();
            this.A0G = (C190699lN) r1.AEb.get();
            this.A09 = AnonymousClass8BU.A0Q(r3);
            this.A0X = C000200d.A00(r3.Ao4);
            this.A07 = AnonymousClass8BT.A0R(r3);
            this.A03 = AnonymousClass3Ma.A0b(r3);
            this.A0T = C000200d.A00(A002.A5P);
            this.A0A = AnonymousClass8BU.A0R(r3);
            this.A0P = (C195929uA) r1.AEU.get();
            this.A0L = (C191389mW) r3.AaX.get();
            this.A0B = AnonymousClass8BV.A0G(r3);
            this.A0I = AnonymousClass8BU.A0S(r3);
            this.A0C = (C33701jF) r3.A8I.get();
            this.A0F = (A2C) r1.AEZ.get();
            this.A0U = C000200d.A00(r3.A84);
            this.A0N = (A5H) r1.AER.get();
            this.A0H = (A54) r3.Acu.get();
            this.A08 = (C31051ew) r3.Ace.get();
            this.A0V = C000200d.A00(r3.Acm);
            this.A04 = (AnonymousClass1KH) r3.A94.get();
            this.A0O = C000200d.A00(r3.A6N);
            this.A0L = C000200d.A00(r1.A6l);
            this.A05 = (C19944A0b) r1.A70.get();
            this.A0G = (AnonymousClass93V) r1.A76.get();
            this.A00 = (C187619g6) r1.A6i.get();
            this.A0D = (C191129m4) r1.AEf.get();
            this.A0B = (C191949nS) r1.A77.get();
            this.A0F = (C20037A4g) r1.A71.get();
            this.A08 = AnonymousClass3Ma.A0q(r3);
            this.A09 = (C191369mU) r1.ADk.get();
            this.A02 = AnonymousClass8BT.A0I(r3);
            this.A0K = (C192469oR) r1.A72.get();
            this.A07 = (C20074A6a) r3.AFz.get();
            this.A06 = AnonymousClass1K1.A1M(A002);
            this.A0E = (C31071ey) r3.A6H.get();
            this.A0J = (A5F) r1.A6z.get();
            this.A0H = (A5Y) r1.A7B.get();
            this.A0I = AnonymousClass1K1.A1T(A002);
            this.A0A = (C58042k3) r1.AEa.get();
            this.A0M = C000200d.A00(r1.A74);
            this.A0C = (C184809bY) r1.A78.get();
        }
    }

    public B7X A4b() {
        return new AOY(this);
    }

    public CXY Bbg() {
        return this.A00.A00(this, getSupportFragmentManager(), new C197609wy(this.A08));
    }

    public boolean BcG(int i) {
        if (i != 442) {
            return super.BcG(i);
        }
        Hilt_BrazilReTosFragment hilt_BrazilReTosFragment = new Hilt_BrazilReTosFragment();
        hilt_BrazilReTosFragment.A2M();
        CMl(hilt_BrazilReTosFragment);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x020b, code lost:
        return "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0283, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String CBa(java.lang.String r9, java.util.Map r10) {
        /*
            r8 = this;
            java.lang.String r3 = "case"
            java.lang.Object r2 = r10.remove(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0284
            int r0 = r2.hashCode()
            r7 = -1
            switch(r0) {
                case -1618032200: goto L_0x015f;
                case -1539179277: goto L_0x0167;
                case -1333887770: goto L_0x016f;
                case -1067148390: goto L_0x017a;
                case -450144912: goto L_0x0185;
                case 96330030: goto L_0x0190;
                case 493597816: goto L_0x019b;
                case 595125212: goto L_0x01a6;
                case 1867705314: goto L_0x01b1;
                case 2027790727: goto L_0x01bd;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r5 = "1"
            java.lang.String r4 = "0"
            r6 = 0
            switch(r7) {
                case 0: goto L_0x021b;
                case 1: goto L_0x020c;
                case 2: goto L_0x026a;
                case 3: goto L_0x026f;
                case 4: goto L_0x027d;
                case 5: goto L_0x0066;
                case 6: goto L_0x01c9;
                case 7: goto L_0x01d8;
                case 8: goto L_0x0202;
                case 9: goto L_0x0028;
                default: goto L_0x0020;
            }
        L_0x0020:
            r10.put(r3, r2)
            java.lang.String r6 = super.CBa(r9, r10)
        L_0x0027:
            return r6
        L_0x0028:
            java.lang.String r0 = "credential_id"
            java.lang.String r2 = X.C17880vN.A0s(r0, r10)
            java.lang.String r0 = "payment_method_field_name"
            java.lang.String r3 = X.C17880vN.A0s(r0, r10)
            X.AEs r1 = r8.A03
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = r1.A0A
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0048
        L_0x0040:
            X.1KH r0 = r8.A04
            X.AEs r1 = r0.A08(r2)
            r8.A03 = r1
        L_0x0048:
            X.8pb r2 = r1.A08
            X.8pY r2 = (X.AnonymousClass8pY) r2
            java.lang.String r0 = "p2p_receive"
            boolean r0 = r3.equals(r0)
            java.lang.String r1 = "DISABLED"
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "p2p_send"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.A0N
        L_0x0060:
            if (r0 == 0) goto L_0x0283
            return r0
        L_0x0063:
            java.lang.String r0 = r2.A0M
            goto L_0x0060
        L_0x0066:
            X.00H r0 = r8.A0N
            java.lang.Object r0 = r0.get()
            X.17L r0 = (X.AnonymousClass17L) r0
            java.util.Map r0 = r0.A00
            r0.putAll(r10)
            java.util.Iterator r5 = X.AnonymousClass000.A15(r10)
        L_0x0077:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r5)
            java.lang.String r2 = X.C17880vN.A0x(r4)
            int r0 = r2.hashCode()
            r3 = -1
            switch(r0) {
                case -1823090409: goto L_0x0157;
                case -1787697648: goto L_0x014f;
                case -1422091778: goto L_0x0144;
                case -1057402635: goto L_0x0139;
                case -554367363: goto L_0x012e;
                case -97971314: goto L_0x0123;
                case -13138338: goto L_0x0118;
                case 17961485: goto L_0x010d;
                case 17962411: goto L_0x0102;
                case 82874128: goto L_0x00f7;
                case 180337583: goto L_0x00ec;
                case 552892207: goto L_0x00e1;
                case 629885866: goto L_0x00d6;
                case 672839619: goto L_0x00cb;
                case 1287484568: goto L_0x00c0;
                case 1595342407: goto L_0x00b5;
                case 2069092435: goto L_0x00aa;
                default: goto L_0x008d;
            }
        L_0x008d:
            java.lang.String r2 = "[^\\d]"
            switch(r3) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x009e;
                case 2: goto L_0x009e;
                case 3: goto L_0x009e;
                case 4: goto L_0x009e;
                case 5: goto L_0x00a2;
                case 6: goto L_0x009e;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0093;
                case 9: goto L_0x009e;
                case 10: goto L_0x009e;
                case 11: goto L_0x009e;
                case 12: goto L_0x009e;
                case 13: goto L_0x009e;
                case 14: goto L_0x009e;
                case 15: goto L_0x009e;
                case 16: goto L_0x009e;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x0077
        L_0x0093:
            java.lang.String r0 = X.AnonymousClass8BR.A10(r4)
            X.C17960vV.A06(r0)
            X.A3L.A02(r0)
            goto L_0x0077
        L_0x009e:
            r4.getValue()
            goto L_0x0077
        L_0x00a2:
            java.lang.String r0 = X.AnonymousClass8BR.A10(r4)
            r0.replaceAll(r2, r1)
            goto L_0x0077
        L_0x00aa:
            java.lang.String r0 = "business_address_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 16
            goto L_0x008d
        L_0x00b5:
            java.lang.String r0 = "business_address_state"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 15
            goto L_0x008d
        L_0x00c0:
            java.lang.String r0 = "business_address_neighborhood"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 14
            goto L_0x008d
        L_0x00cb:
            java.lang.String r0 = "bank_branch_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 13
            goto L_0x008d
        L_0x00d6:
            java.lang.String r0 = "business_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 12
            goto L_0x008d
        L_0x00e1:
            java.lang.String r0 = "bank_account_type"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 11
            goto L_0x008d
        L_0x00ec:
            java.lang.String r0 = "owner_full_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 10
            goto L_0x008d
        L_0x00f7:
            java.lang.String r0 = "owner_email"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 9
            goto L_0x008d
        L_0x0102:
            java.lang.String r0 = "owner_dob"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 8
            goto L_0x008d
        L_0x010d:
            java.lang.String r0 = "owner_cpf"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 7
            goto L_0x008d
        L_0x0118:
            java.lang.String r0 = "business_address_street_extra"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 6
            goto L_0x008d
        L_0x0123:
            java.lang.String r0 = "business_tax_id"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 5
            goto L_0x008d
        L_0x012e:
            java.lang.String r0 = "business_address_street_name"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 4
            goto L_0x008d
        L_0x0139:
            java.lang.String r0 = "business_address_city"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 3
            goto L_0x008d
        L_0x0144:
            java.lang.String r0 = "bank_account_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x008d
            r3 = 2
            goto L_0x008d
        L_0x014f:
            java.lang.String r0 = "bank_code"
            short r3 = X.AnonymousClass8BV.A10(r0, r2)
            goto L_0x008d
        L_0x0157:
            java.lang.String r0 = "business_address_postcode"
            short r3 = X.AnonymousClass8BV.A0z(r0, r2)
            goto L_0x008d
        L_0x015f:
            java.lang.String r0 = "get_consumer_next_screen"
            short r7 = X.AnonymousClass8BV.A0z(r0, r2)
            goto L_0x0018
        L_0x0167:
            java.lang.String r0 = "smb_business_name"
            short r7 = X.AnonymousClass8BV.A10(r0, r2)
            goto L_0x0018
        L_0x016f:
            java.lang.String r0 = "get_formatted_phone_number"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 2
            goto L_0x0018
        L_0x017a:
            java.lang.String r0 = "clear_merchant_reg_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 3
            goto L_0x0018
        L_0x0185:
            java.lang.String r0 = "open_fb_pay_hub"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 4
            goto L_0x0018
        L_0x0190:
            java.lang.String r0 = "store_merchant_reg_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 5
            goto L_0x0018
        L_0x019b:
            java.lang.String r0 = "is_purchase_enabled"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 6
            goto L_0x0018
        L_0x01a6:
            java.lang.String r0 = "is_p2p_eligible_card_available"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 7
            goto L_0x0018
        L_0x01b1:
            java.lang.String r0 = "is_smb_build"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 8
            goto L_0x0018
        L_0x01bd:
            java.lang.String r0 = "get_card_method_field_data"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r7 = 9
            goto L_0x0018
        L_0x01c9:
            X.1QO r0 = r8.A08
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x020b
            X.1QO r0 = r8.A08
            boolean r0 = r0.A0B()
            goto L_0x0208
        L_0x01d8:
            X.1KH r0 = r8.A04
            java.util.ArrayList r0 = r0.A0B()
            java.util.Iterator r2 = r0.iterator()
        L_0x01e2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0201
            X.AEs r1 = X.AnonymousClass8BR.A0P(r2)
            boolean r0 = X.A8e.A08(r1)
            if (r0 == 0) goto L_0x01e2
            X.8pb r1 = r1.A08
            if (r1 == 0) goto L_0x01e2
            boolean r0 = r1 instanceof X.AnonymousClass8pY
            if (r0 == 0) goto L_0x01e2
            X.8pY r1 = (X.AnonymousClass8pY) r1
            boolean r0 = r1.A0X
            if (r0 == 0) goto L_0x01e2
            return r5
        L_0x0201:
            return r4
        L_0x0202:
            X.1QO r0 = r8.A08
            boolean r0 = r0.A01()
        L_0x0208:
            if (r0 != 0) goto L_0x020b
            return r4
        L_0x020b:
            return r5
        L_0x020c:
            X.1QO r0 = r8.A08
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0284
            X.11S r0 = r8.A02
            java.lang.String r1 = r0.A0D()
            return r1
        L_0x021b:
            java.lang.String r0 = "payment_flow"
            java.lang.String r4 = X.C17880vN.A0s(r0, r10)
            X.A5Y r3 = r8.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x022b
            java.lang.String r4 = "p2p_context"
        L_0x022b:
            r2 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0265
            java.lang.String r2 = X.A5Y.A00(r3)
        L_0x0238:
            if (r2 == 0) goto L_0x0283
            int r0 = r2.hashCode()
            switch(r0) {
                case -1412891550: goto L_0x025a;
                case 823631114: goto L_0x024f;
                case 1027588136: goto L_0x0244;
                default: goto L_0x0241;
            }
        L_0x0241:
            java.lang.String r6 = "p_add_card"
            return r6
        L_0x0244:
            java.lang.String r0 = "brpay_p_compliance_kyc_next_screen_router"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0241
            java.lang.String r6 = "p_compliance_kyc"
            return r6
        L_0x024f:
            java.lang.String r0 = "brpay_p_pin_nux_create"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0241
            java.lang.String r6 = "p_pin_nux_create"
            return r6
        L_0x025a:
            java.lang.String r0 = "brpay_p_tos"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0241
            java.lang.String r6 = "p_tos"
            return r6
        L_0x0265:
            java.lang.String r2 = X.A5Y.A01(r3, r4, r2)
            goto L_0x0238
        L_0x026a:
            java.lang.String r6 = X.AnonymousClass9RO.A00(r9)
            return r6
        L_0x026f:
            X.00H r0 = r8.A0N
            java.lang.Object r0 = r0.get()
            X.17L r0 = (X.AnonymousClass17L) r0
            java.util.Map r0 = r0.A00
            r0.clear()
            return r6
        L_0x027d:
            java.lang.Class<com.whatsapp.payments.ui.BrazilFbPayHubActivity> r0 = com.whatsapp.payments.ui.BrazilFbPayHubActivity.class
            X.AnonymousClass8BT.A16(r8, r0)
            return r6
        L_0x0283:
            return r1
        L_0x0284:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.CBa(java.lang.String, java.util.Map):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        X.AnonymousClass91q.A0q(r8.A01, (java.util.Map) null, -232);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r26, int r27, android.content.Intent r28) {
        /*
            r25 = this;
            r8 = r25
            r1 = r26
            r2 = r27
            r5 = r28
            super.onActivityResult(r1, r2, r5)
            r0 = 100
            if (r1 != r0) goto L_0x0036
            X.9sN r1 = r8.A01
            if (r1 == 0) goto L_0x0036
            r4 = -232(0xffffffffffffff18, float:NaN)
            r0 = -1
            r3 = 0
            if (r2 != r0) goto L_0x00c6
            java.lang.String r2 = "on_success"
            if (r28 == 0) goto L_0x00c2
            android.os.Bundle r1 = r5.getExtras()
            java.lang.String r0 = "STEP_UP_RESPONSE"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "issuerMobileAppAuthResponse"
            java.lang.String r0 = r1.getString(r0, r3)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "PAY: BrazilPayBloksActivity onActivityResult - response is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            java.lang.String r1 = X.AnonymousClass8BS.A0n(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1086574198: goto L_0x00b1;
                case 568196142: goto L_0x00a8;
                case 1185244855: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            return
        L_0x0043:
            java.lang.String r0 = "approved"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = "STEP_UP_AUTH_CODE"
            boolean r0 = r5.hasExtra(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "TAV"
        L_0x0055:
            java.lang.String r4 = r5.getStringExtra(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00c0
            java.lang.String r23 = X.AnonymousClass8BW.A0c(r8)
            X.11P r11 = r8.A05
            X.1KB r9 = r8.A05
            X.11S r10 = r8.A02
            X.1KH r13 = r8.A04
            X.00H r0 = r8.A0O
            X.1OZ r14 = X.C17880vN.A0U(r0)
            X.1QS r6 = r8.A0D
            X.9nS r5 = r8.A0B
            X.1ex r3 = r8.A0A
            X.1KI r12 = r8.A02
            X.A6a r15 = r8.A07
            X.1jG r16 = X.AnonymousClass8BU.A0P(r8)
            X.A54 r2 = r8.A0H
            java.lang.String r1 = r8.A0P
            X.9kZ r0 = new X.9kZ
            r0.<init>(r8, r4)
            X.8yx r7 = new X.8yx
            r19 = r2
            r20 = r5
            r21 = r0
            r22 = r4
            r24 = r1
            r18 = r6
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.10I r2 = r8.A05
            r1 = 18
            X.Ajt r0 = new X.Ajt
            r0.<init>(r7, r1)
            r2.CGF(r0)
            return
        L_0x00a8:
            java.lang.String r0 = "declined"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ba
            return
        L_0x00b1:
            java.lang.String r0 = "failure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ba
            return
        L_0x00ba:
            X.9sN r0 = r8.A01
            X.AnonymousClass91q.A0q(r0, r3, r4)
            return
        L_0x00c0:
            X.9sN r1 = r8.A01
        L_0x00c2:
            r1.A00(r2)
            return
        L_0x00c6:
            X.AnonymousClass91q.A0q(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public BrazilPayBloksActivity(int i) {
        this.A0Q = false;
        AGC.A00(this, 19);
    }

    public static void A0t(C194839sN r9, AnonymousClass8pK r10, BrazilPayBloksActivity brazilPayBloksActivity, String str, List list, boolean z) {
        C21347Aib aib;
        HashMap A11 = C17880vN.A11();
        AnonymousClass8pT r8 = (AnonymousClass8pT) r10.A08;
        A0x(r10, brazilPayBloksActivity, str, A11);
        if (z) {
            A11.put("verified_state", "1");
        } else {
            if (list == null || list.isEmpty()) {
                if (r8 != null && r8.A07) {
                    A11.put("verified_state", "0");
                    A11.put("card_need_device_binding", "1");
                }
            } else if (!C19944A0b.A00(list)) {
                int A022 = AnonymousClass8BX.A02(brazilPayBloksActivity, list);
                JSONArray A012 = brazilPayBloksActivity.A05.A01(list);
                if (A012 != null) {
                    int A0d = A0d(list);
                    if (!(!C18020vd.A05(C18040vf.A02, brazilPayBloksActivity.A0E, A022) || A0d == -1 || (aib = (C21347Aib) list.get(A0d)) == null)) {
                        A11.put("default_selected_position", String.valueOf(A0d));
                        A0y(aib, A11);
                    }
                    A11.put("verify_methods", A012.toString());
                }
                A11.put("verified_state", "0");
            }
            AnonymousClass91q.A0q(r9, (Map) null, -233);
            return;
        }
        r9.A01("on_success", A11);
    }

    public static void A0u(C194839sN r4, BrazilPayBloksActivity brazilPayBloksActivity) {
        C73203Rj A002 = AnonymousClass4a6.A00(brazilPayBloksActivity);
        A002.A0k(brazilPayBloksActivity.getString(2131889536));
        C108955ca.A1D(brazilPayBloksActivity, A002, 2131889535);
        A002.A0L(new C20151A9n(r4, 46), brazilPayBloksActivity.getString(2131894173));
        A002.A0C();
    }

    public static void A0x(AnonymousClass8pK r4, BrazilPayBloksActivity brazilPayBloksActivity, String str, Map map) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            map.put("callback_url", str);
        }
        map.put("credential_id", r4.A0A);
        int i = r4.A00;
        boolean z = true;
        map.put("is_combo_card", String.valueOf(AnonymousClass000.A1T(i, 6)));
        if (i != 4) {
            z = false;
        }
        map.put("is_credit_card", String.valueOf(z));
        map.put("readable_name", A8e.A02(brazilPayBloksActivity, r4));
        AnonymousClass8pY r2 = (AnonymousClass8pY) r4.A08;
        if (r2 != null && ((str2 = r2.A0N) == null || !(!"DISABLED".equals(str2)))) {
            map.put("p2p_ineligible", "1");
        }
        map.put("network_name", C20085A6m.A03(r4.A01));
        if (r2 != null && !TextUtils.isEmpty(r2.A0E)) {
            map.put("card_image_url", r2.A0E);
        }
    }

    public CXN BNV() {
        return this.A05;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass3MY.A0H(this, 2131428237).setBackgroundResource(2131232890);
        if (getIntent().getIntExtra("extra_setup_mode", 0) != 0) {
            getIntent().putExtra("screen_name", A5Y.A01(this.A0H, "p2p_context", false));
        }
        String stringExtra = getIntent().getStringExtra("screen_name");
        C17960vV.A06(stringExtra);
        if ("brpay_p_tos".equalsIgnoreCase(stringExtra) || "brpay_p_compliance_kyc_next_screen_router".equalsIgnoreCase(stringExtra)) {
            C197909xT r7 = this.A0C.A00;
            Intent intent = getIntent();
            if (intent == null || !intent.hasExtra("perf_origin")) {
                r7.A01.A0D("unknown", -1);
            } else {
                long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
                String stringExtra2 = intent.getStringExtra("perf_origin");
                if (stringExtra2 != null) {
                    r7.A01.A0D(stringExtra2, longExtra);
                }
            }
        }
        C187619g6 r1 = this.A00;
        AnonymousClass4VT A002 = this.A0G.A00();
        C18070vi.A0d(A002, 0);
        r1.A00 = A002;
        if (!this.A01.A0C() || !this.A01.A0D()) {
            View findViewById = findViewById(2131428254);
            findViewById.setVisibility(0);
            this.A01.A0B(new AnonymousClass7G3(findViewById, this, 1), "on_demand", false);
        } else {
            this.A0Y = true;
        }
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        if (A0G2 != null) {
            A0G2.setLogo((Drawable) null);
            A0G2.setTitle((CharSequence) null);
        }
        ((C195019sf) this.A0V.get()).A02(new C20763AXs(this, 0));
    }

    public Dialog onCreateDialog(int i) {
        if (i == 2131887421) {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0E(2131887421);
            A002.A0D(2131887418);
            C20151A9n.A00(A002, this, 45, 2131887420);
            A002.A0X((DialogInterface.OnClickListener) null, 2131887419);
            return A002.create();
        }
        C010105w A012 = this.A0I.A01((Bundle) null, this, i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public void onDestroy() {
        super.onDestroy();
        C191949nS r1 = this.A0B;
        r1.A00 = null;
        r1.A03 = false;
        r1.A02 = false;
    }

    /* JADX WARNING: type inference failed for: r0v186 */
    /* JADX WARNING: type inference failed for: r10v27, types: [X.8yw] */
    /* JADX WARNING: type inference failed for: r10v29, types: [X.8yt] */
    /* JADX WARNING: type inference failed for: r9v26, types: [X.8yu] */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x061b, code lost:
        if (r5.equals(r4) == false) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0645, code lost:
        X.AnonymousClass4Yv.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0648, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x06a1, code lost:
        r3.A09(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0ba1, code lost:
        r0.A0I(r10, r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0ba5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x03e0, code lost:
        r1 = new java.lang.Void[0];
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x03e3, code lost:
        r3.CGD(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x03e6, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0629  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CBV(X.C194839sN r37, java.lang.String r38, java.util.Map r39) {
        /*
            r36 = this;
            r5 = r38
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r4 = ""
            r2 = r37
            if (r0 == 0) goto L_0x000f
            r2.A00(r4)
        L_0x000f:
            int r0 = r5.hashCode()
            r3 = 1
            r8 = -1
            switch(r0) {
                case -1828362259: goto L_0x052d;
                case -1789788977: goto L_0x0525;
                case -1579572125: goto L_0x051a;
                case -1326006358: goto L_0x050f;
                case -1265267765: goto L_0x0504;
                case -1264881022: goto L_0x04f9;
                case -1236338706: goto L_0x04ee;
                case -1157449815: goto L_0x04e3;
                case -1017011091: goto L_0x04d7;
                case -981053487: goto L_0x04cb;
                case -857462632: goto L_0x04bf;
                case -803962306: goto L_0x04b3;
                case -641808715: goto L_0x04a7;
                case -553110595: goto L_0x049b;
                case -524241064: goto L_0x048f;
                case -491008410: goto L_0x0483;
                case -468036698: goto L_0x0477;
                case -438460728: goto L_0x046b;
                case 159220715: goto L_0x045f;
                case 243254635: goto L_0x0453;
                case 580608584: goto L_0x0447;
                case 1043595284: goto L_0x043b;
                case 1410504463: goto L_0x042f;
                case 1564995942: goto L_0x0423;
                case 1684922085: goto L_0x0417;
                case 1760388972: goto L_0x040b;
                case 2069491034: goto L_0x03ff;
                case 2124929861: goto L_0x03f3;
                case 2146747614: goto L_0x03e7;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r7 = "referral_screen"
            java.lang.String r6 = "on_success"
            r1 = r36
            r0 = r39
            switch(r8) {
                case 0: goto L_0x0649;
                case 1: goto L_0x0643;
                case 2: goto L_0x058d;
                case 3: goto L_0x0bb6;
                case 4: goto L_0x0bb1;
                case 5: goto L_0x0a8d;
                case 6: goto L_0x031e;
                case 7: goto L_0x056d;
                case 8: goto L_0x0a20;
                case 9: goto L_0x00fc;
                case 10: goto L_0x09cf;
                case 11: goto L_0x0543;
                case 12: goto L_0x091d;
                case 13: goto L_0x0635;
                case 14: goto L_0x0631;
                case 15: goto L_0x08d9;
                case 16: goto L_0x0601;
                case 17: goto L_0x0829;
                case 18: goto L_0x05fa;
                case 19: goto L_0x0783;
                case 20: goto L_0x06a5;
                case 21: goto L_0x0092;
                case 22: goto L_0x05eb;
                case 23: goto L_0x0681;
                case 24: goto L_0x0654;
                case 25: goto L_0x0027;
                case 26: goto L_0x05e1;
                case 27: goto L_0x059b;
                case 28: goto L_0x01c1;
                default: goto L_0x0023;
            }
        L_0x0023:
            super.CBV(r2, r5, r0)
        L_0x0026:
            return
        L_0x0027:
            java.lang.String r3 = "bank_account_number"
            java.lang.String r23 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r3 = "bank_code"
            java.lang.String r24 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r3 = "bank_branch_number"
            java.lang.String r25 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r3 = "bank_account_type"
            java.lang.String r3 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r26 = X.AnonymousClass8BW.A0c(r1)
            X.1KB r13 = r1.A05
            X.10I r12 = r1.A05
            X.00H r0 = r1.A0W
            java.lang.Object r9 = r0.get()
            X.17E r9 = (X.AnonymousClass17E) r9
            X.1ek r11 = r1.A0Q
            X.1QS r10 = r1.A0D
            X.1QD r8 = r1.A09
            X.00H r0 = r1.A0X
            java.lang.Object r7 = r0.get()
            X.2Ui r7 = (X.C50412Ui) r7
            X.1ex r6 = r1.A0A
            X.1KI r5 = r1.A02
            X.11E r4 = r1.A07
            X.1jG r14 = X.AnonymousClass8BU.A0P(r1)
            int r27 = java.lang.Integer.parseInt(r3)
            X.9jT r3 = new X.9jT
            r3.<init>(r2)
            X.8yu r0 = new X.8yu
            r19 = r11
            r20 = r9
            r21 = r7
            r22 = r12
            r15 = r8
            r16 = r6
            r17 = r10
            r18 = r3
            r11 = r13
            r12 = r4
            r13 = r5
            r9 = r0
            r10 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r1 = "PAY: BrazilUpdateMerchantAccountAction updateMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.10I r3 = r0.A09
            goto L_0x03e0
        L_0x0092:
            java.lang.String r4 = "cvv"
            java.lang.String r24 = X.C17880vN.A0s(r4, r0)
            java.lang.String r4 = "expiry_date"
            java.lang.String r4 = X.AnonymousClass91q.A0Q(r4, r0)
            int[] r14 = X.AnonymousClass91q.A0s(r4)
            java.lang.String r4 = "credential_id"
            java.lang.String r26 = X.C17880vN.A0s(r4, r0)
            X.11P r5 = r1.A05
            X.11S r4 = r1.A02
            r0 = 0
            java.lang.String r25 = X.AnonymousClass1PP.A00(r4, r5, r0)
            X.1KB r13 = r1.A05
            X.10I r12 = r1.A05
            X.00H r4 = r1.A0W
            java.lang.Object r9 = r4.get()
            X.17E r9 = (X.AnonymousClass17E) r9
            X.1QS r11 = r1.A0D
            X.1QD r10 = r1.A09
            X.00H r4 = r1.A0X
            java.lang.Object r8 = r4.get()
            X.2Ui r8 = (X.C50412Ui) r8
            X.A4g r7 = r1.A0F
            X.1ex r6 = r1.A0A
            X.1KI r5 = r1.A02
            X.11E r4 = r1.A07
            X.1jG r15 = X.AnonymousClass8BU.A0P(r1)
            r27 = r14[r3]
            r28 = r14[r0]
            X.9ka r3 = new X.9ka
            r3.<init>(r2, r1)
            X.8yt r0 = new X.8yt
            r20 = r3
            r21 = r9
            r22 = r8
            r23 = r12
            r16 = r10
            r17 = r6
            r18 = r11
            r19 = r7
            r12 = r13
            r13 = r4
            r14 = r5
            r10 = r0
            r11 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.10I r3 = r0.A0A
            goto L_0x03e0
        L_0x00fc:
            java.lang.String r3 = "verify_type"
            java.lang.String r7 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r3 = "verify_id"
            java.lang.String r25 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r6 = "BANK"
            boolean r3 = r7.equals(r6)
            r4 = 0
            if (r3 == 0) goto L_0x019d
            java.lang.String r3 = "bank_code"
            java.lang.String r26 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r3 = "branch_name"
            java.lang.String r27 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r3 = "bank_account_type"
            java.lang.String r28 = X.AnonymousClass91q.A0V(r3, r0)
            java.lang.String r3 = "bank_account_number"
            java.lang.String r29 = X.AnonymousClass91q.A0V(r3, r0)
            r30 = r4
        L_0x012b:
            X.11P r15 = r1.A05
            X.1KB r14 = r1.A05
            X.11S r13 = r1.A02
            X.10I r12 = r1.A05
            X.00H r0 = r1.A0W
            java.lang.Object r8 = r0.get()
            X.17E r8 = (X.AnonymousClass17E) r8
            X.1ek r11 = r1.A0Q
            X.1QD r10 = r1.A09
            X.00H r0 = r1.A0X
            java.lang.Object r5 = r0.get()
            X.2Ui r5 = (X.C50412Ui) r5
            X.1ex r9 = r1.A0A
            X.11E r4 = r1.A07
            X.1jG r16 = X.AnonymousClass8BU.A0P(r1)
            X.9jU r3 = new X.9jU
            r3.<init>(r2)
            X.8yv r0 = new X.8yv
            r20 = r11
            r21 = r8
            r22 = r5
            r23 = r12
            r24 = r7
            r17 = r10
            r18 = r9
            r19 = r3
            r12 = r14
            r14 = r4
            r10 = r0
            r11 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "PAY: BrazilMerchantLinkAction preLinkMerchant: "
            r2.append(r1)
            java.lang.String r4 = r0.A0F
            X.C17890vO.A1A(r2, r4)
            int r3 = r4.hashCode()
            r1 = -1136784465(0xffffffffbc3e0baf, float:-0.011599465)
            r2 = 0
            if (r3 == r1) goto L_0x0535
            r1 = 2031164(0x1efe3c, float:2.846267E-39)
            if (r3 == r1) goto L_0x0191
            r1 = 399611855(0x17d197cf, float:1.354463E-24)
            if (r3 != r1) goto L_0x0535
            java.lang.String r6 = "PREPAID"
        L_0x0191:
            boolean r1 = r4.equals(r6)
            if (r1 == 0) goto L_0x0535
            X.10I r3 = r0.A08
            java.lang.Void[] r1 = new java.lang.Void[r2]
            goto L_0x03e3
        L_0x019d:
            java.lang.String r3 = "PREPAID"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x01b5
            java.lang.String r3 = "serial_number"
            java.lang.String r30 = X.AnonymousClass91q.A0V(r3, r0)
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            goto L_0x012b
        L_0x01b5:
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r4
            r30 = r4
            goto L_0x012b
        L_0x01c1:
            java.lang.String r4 = "card_verify_type"
            java.lang.String r5 = X.AnonymousClass91q.A0V(r4, r0)
            java.lang.String r4 = "app-to-app"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x02b8
            java.lang.String r4 = "otp"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0026
            java.lang.String r4 = "credential_id"
            java.lang.String r20 = X.AnonymousClass91q.A0V(r4, r0)
            java.lang.String r4 = "card_verify_identifier"
            java.lang.String r21 = X.AnonymousClass91q.A0V(r4, r0)
            java.lang.String r19 = X.AnonymousClass8BW.A0c(r1)
            java.lang.String r4 = "card_verify_otp_resend_interval_sec"
            java.lang.String r6 = X.C17880vN.A0s(r4, r0)
            X.1KB r5 = r1.A05
            X.00H r0 = r1.A0O
            X.1OZ r16 = X.C17880vN.A0U(r0)
            X.9nS r4 = r1.A0B
            X.1KI r0 = r1.A02
            X.1jG r17 = X.AnonymousClass8BU.A0P(r1)
            X.9hL r12 = new X.9hL
            r13 = r1
            r14 = r5
            r15 = r0
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.9lR r0 = new X.9lR
            r0.<init>(r2, r1, r6)
            r4 = 0
            X.1OZ r7 = r12.A03
            java.lang.String r5 = r7.A0B()
            java.lang.String r8 = r12.A06
            java.lang.String r13 = r12.A07
            java.lang.String r6 = r12.A08
            X.9nS r9 = r12.A05
            X.1KH r1 = r9.A08
            X.AEs r1 = r1.A08(r8)
            X.8pK r1 = (X.AnonymousClass8pK) r1
            if (r1 == 0) goto L_0x02b6
            int r1 = r1.A01
            r2 = 5
            if (r1 != r2) goto L_0x02b6
            X.9mW r1 = r9.A0D
            java.lang.String r10 = r1.A00(r2)
            X.C18070vi.A0d(r10, r3)
            java.lang.String r1 = "elo"
            X.1cX r9 = X.C108945cZ.A0t(r1)
            r3 = 1
            r1 = 255(0xff, double:1.26E-321)
            boolean r1 = X.AnonymousClass8BS.A1O(r10, r3, r1)
            if (r1 == 0) goto L_0x0248
            java.lang.String r1 = "network_device_id"
            X.C29591cX.A01(r9, r1, r10)
        L_0x0248:
            X.1ca r4 = r9.A03()
            r11 = 1
        L_0x024d:
            X.C18070vi.A0k(r8, r13)
            X.1cX r3 = X.C108955ca.A0Y()
            X.AnonymousClass8BY.A13(r3)
            boolean r1 = X.AnonymousClass8BY.A1X(r3, r5)
            X.1cX r2 = X.AnonymousClass8BS.A0R()
            java.lang.String r10 = "action"
            java.lang.String r9 = "br-select-otp-verification-method"
            X.C29591cX.A01(r2, r10, r9)
            X.AnonymousClass8BY.A1B(r2, r8, r1)
            r16 = 1000(0x3e8, double:4.94E-321)
            r14 = 1
            r18 = r1
            boolean r8 = X.C29601cY.A04(r13, r14, r16, r18)
            if (r8 == 0) goto L_0x027a
            java.lang.String r8 = "identifier"
            X.C29591cX.A01(r2, r8, r13)
        L_0x027a:
            r19 = 1000(0x3e8, double:4.94E-321)
            r16 = r6
            r17 = r14
            r21 = r1
            boolean r1 = X.C29601cY.A04(r16, r17, r19, r21)
            if (r1 == 0) goto L_0x028d
            java.lang.String r1 = "nonce"
            X.C29591cX.A01(r2, r1, r6)
        L_0x028d:
            if (r11 == 0) goto L_0x0292
            r2.A05(r4)
        L_0x0292:
            X.1ca r8 = X.C29591cX.A00(r2, r3)
            android.content.Context r3 = r12.A00
            X.1KB r2 = r12.A01
            X.1jG r1 = r12.A04
            r19 = 10
            X.8yh r13 = new X.8yh
            r14 = r3
            r15 = r1
            r16 = r2
            r17 = r0
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r10 = 204(0xcc, float:2.86E-43)
            r11 = 30000(0x7530, double:1.4822E-319)
            r6 = r7
            r7 = r13
            r9 = r5
            r6.A0I(r7, r8, r9, r10, r11)
            return
        L_0x02b6:
            r11 = 0
            goto L_0x024d
        L_0x02b8:
            r1.A01 = r2
            java.lang.String r3 = "credential_id"
            java.lang.String r3 = X.AnonymousClass91q.A0V(r3, r0)
            r1.A0P = r3
            java.lang.String r3 = "app_to_app_partner_app_package"
            java.lang.String r5 = X.C17880vN.A0s(r3, r0)
            java.lang.String r3 = "app_to_app_partner_intent_action"
            java.lang.String r4 = X.C17880vN.A0s(r3, r0)
            java.lang.String r3 = "app_to_app_request_payload"
            java.lang.String r6 = X.C17880vN.A0s(r3, r0)
            X.0yx r3 = X.C196809vg.A00(r5, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0c50
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0c50
            if (r3 == 0) goto L_0x0c50
            java.lang.Object r5 = r3.A00
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r3.A01
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r0 = "android.intent.extra.TEXT"
            r3.putExtra(r0, r6)
            r3.setPackage(r5)
            r3.setAction(r4)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: BrazilPayBloksActivity appToApp package: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " action "
            X.C17900vP.A0f(r0, r4, r2)
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            android.content.ComponentName r0 = r3.resolveActivity(r0)
            if (r0 == 0) goto L_0x0026
            r0 = 100
            r1.startActivityForResult(r3, r0)
            return
        L_0x031e:
            java.lang.String r4 = "cvv"
            java.lang.String r31 = X.C17880vN.A0s(r4, r0)
            java.lang.String r4 = "expiry_date"
            java.lang.String r4 = X.AnonymousClass91q.A0Q(r4, r0)
            int[] r16 = X.AnonymousClass91q.A0s(r4)
            java.lang.String r4 = "card_number"
            java.lang.String r30 = X.C17880vN.A0s(r4, r0)
            X.0ve r5 = r1.A0E
            r4 = 1482(0x5ca, float:2.077E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x03ca
            X.A5Y r4 = r1.A0H
            java.lang.String r0 = "generic_context"
            boolean r0 = r4.A06(r0)
            java.lang.Boolean r29 = X.C108945cZ.A1A(r0)
        L_0x034c:
            X.11P r0 = r1.A05
            r19 = r0
            X.1KB r0 = r1.A05
            r35 = r0
            X.11S r0 = r1.A02
            r34 = r0
            X.10I r15 = r1.A05
            X.00H r0 = r1.A0O
            X.1OZ r17 = X.C17880vN.A0U(r0)
            X.00H r0 = r1.A0W
            java.lang.Object r8 = r0.get()
            X.17E r8 = (X.AnonymousClass17E) r8
            X.1ek r14 = r1.A0Q
            X.1QS r13 = r1.A0D
            X.1QD r12 = r1.A09
            X.00H r0 = r1.A0X
            java.lang.Object r7 = r0.get()
            X.2Ui r7 = (X.C50412Ui) r7
            X.A4g r11 = r1.A0F
            X.9nS r10 = r1.A0B
            X.1KI r9 = r1.A02
            X.1ex r6 = r1.A0A
            X.11E r5 = r1.A07
            X.1jG r18 = X.AnonymousClass8BU.A0P(r1)
            r0 = 0
            r32 = r16[r0]
            r33 = r16[r3]
            X.9kY r4 = new X.9kY
            r4.<init>(r2, r1)
            X.8yw r0 = new X.8yw
            r20 = r6
            r21 = r13
            r22 = r10
            r23 = r11
            r24 = r4
            r25 = r14
            r26 = r8
            r27 = r7
            r28 = r15
            r15 = r19
            r16 = r9
            r19 = r12
            r12 = r35
            r13 = r34
            r14 = r5
            r10 = r0
            r11 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.9nS r5 = r1.A0B
            X.9bV r4 = new X.9bV
            r4.<init>(r0, r5)
            X.00H r2 = r5.A0E
            X.10T r1 = X.C17880vN.A0V(r2)
            r1.unregisterObserver(r4)
            boolean r1 = r5.A03
            if (r1 == 0) goto L_0x03cd
            X.C72453Mb.A1Q(r2, r4)
            return
        L_0x03ca:
            r29 = 0
            goto L_0x034c
        L_0x03cd:
            X.9go r2 = r5.A00
            boolean r1 = r5.A02
            if (r1 != 0) goto L_0x0026
            r5.A02 = r3
            r5.A00 = r2
            X.1QE r2 = r0.A0D
            java.lang.String r1 = "sendAddCard"
            r2.A06(r1)
            X.10I r3 = r0.A0K
        L_0x03e0:
            r1 = 0
            java.lang.Void[] r1 = new java.lang.Void[r1]
        L_0x03e3:
            r3.CGD(r0, r1)
            return
        L_0x03e7:
            java.lang.String r0 = "submit_verification_method"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 28
            goto L_0x0018
        L_0x03f3:
            java.lang.String r0 = "get_kyc_status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 27
            goto L_0x0018
        L_0x03ff:
            java.lang.String r0 = "set_onboarding_started"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 26
            goto L_0x0018
        L_0x040b:
            java.lang.String r0 = "update_merchant_account"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 25
            goto L_0x0018
        L_0x0417:
            java.lang.String r0 = "handle_error_native"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 24
            goto L_0x0018
        L_0x0423:
            java.lang.String r0 = "verify_card_phoenix"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 23
            goto L_0x0018
        L_0x042f:
            java.lang.String r0 = "show_contact_picker"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 22
            goto L_0x0018
        L_0x043b:
            java.lang.String r0 = "tokenize_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 21
            goto L_0x0018
        L_0x0447:
            java.lang.String r0 = "get_card_network"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 20
            goto L_0x0018
        L_0x0453:
            java.lang.String r0 = "reset_pin_from_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 19
            goto L_0x0018
        L_0x045f:
            java.lang.String r0 = "dismiss_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 18
            goto L_0x0018
        L_0x046b:
            java.lang.String r0 = "document_upload_submit_document"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 17
            goto L_0x0018
        L_0x0477:
            java.lang.String r0 = "open_setup_payments_warning_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 16
            goto L_0x0018
        L_0x0483:
            java.lang.String r0 = "refetch_verification_methods"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 15
            goto L_0x0018
        L_0x048f:
            java.lang.String r0 = "show_confirm_cancel_add_card_alert_dialog"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 14
            goto L_0x0018
        L_0x049b:
            java.lang.String r0 = "open_fbpay_pin_bottom_sheet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 13
            goto L_0x0018
        L_0x04a7:
            java.lang.String r0 = "add_credential"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 12
            goto L_0x0018
        L_0x04b3:
            java.lang.String r0 = "add_card_phoenix"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 11
            goto L_0x0018
        L_0x04bf:
            java.lang.String r0 = "bind_device"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 10
            goto L_0x0018
        L_0x04cb:
            java.lang.String r0 = "pre_link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 9
            goto L_0x0018
        L_0x04d7:
            java.lang.String r0 = "link_merchant"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 8
            goto L_0x0018
        L_0x04e3:
            java.lang.String r0 = "dial_phone_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 7
            goto L_0x0018
        L_0x04ee:
            java.lang.String r0 = "add_card"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 6
            goto L_0x0018
        L_0x04f9:
            java.lang.String r0 = "verify_card_otp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 5
            goto L_0x0018
        L_0x0504:
            java.lang.String r0 = "send_kyc_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 4
            goto L_0x0018
        L_0x050f:
            java.lang.String r0 = "get_filtered_card_verification_options"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 3
            goto L_0x0018
        L_0x051a:
            java.lang.String r0 = "get_merchant_reg_data"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0018
            r8 = 2
            goto L_0x0018
        L_0x0525:
            java.lang.String r0 = "show_account_removal_dialog"
            short r8 = X.AnonymousClass8BV.A10(r0, r5)
            goto L_0x0018
        L_0x052d:
            java.lang.String r0 = "get_compliance_status"
            short r8 = X.AnonymousClass8BV.A0z(r0, r5)
            goto L_0x0018
        L_0x0535:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid Verify Type: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r4, r1)
            throw r0
        L_0x0543:
            java.lang.String r3 = X.C17880vN.A0s(r7, r0)
            X.9oR r6 = r1.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0550
            r4 = r3
        L_0x0550:
            r0 = 0
            X.AbQ r5 = new X.AbQ
            r5.<init>(r2, r1, r0)
            X.Aal r3 = new X.Aal
            r3.<init>(r2, r1, r0)
            X.AbF r0 = new X.AbF
            r0.<init>()
            X.Af0 r3 = r6.A00(r3, r0, r5, r4)
            r0 = 12
            X.Aef r2 = new X.Aef
            r2.<init>(r1, r0)
            goto L_0x06a1
        L_0x056d:
            java.lang.String r2 = "phone_number"
            java.lang.Object r0 = r0.get(r2)
            r2 = r4
            if (r0 == 0) goto L_0x057a
            java.lang.String r2 = r0.toString()
        L_0x057a:
            java.lang.String r0 = "[^\\d+]"
            java.lang.String r3 = r2.replaceAll(r0, r4)
            java.lang.String r2 = "tel"
            r0 = 0
            android.net.Uri r2 = android.net.Uri.fromParts(r2, r3, r0)
            java.lang.String r0 = "android.intent.action.DIAL"
            X.AnonymousClass8BT.A14(r1, r2, r0)
            return
        L_0x058d:
            X.00H r0 = r1.A0N
            java.lang.Object r0 = r0.get()
            X.17L r0 = (X.AnonymousClass17L) r0
            java.util.Map r0 = r0.A00
            r2.A01(r6, r0)
            return
        L_0x059b:
            java.lang.String r10 = "FB"
            X.1KB r6 = r1.A05
            X.1ek r5 = r1.A0Q
            X.1ex r4 = r1.A0A
            X.1jG r14 = X.AnonymousClass8BU.A0P(r1)
            X.A54 r0 = r1.A0H
            X.9gn r7 = new X.9gn
            r11 = r7
            r12 = r1
            r13 = r6
            r15 = r4
            r16 = r0
            r17 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.AYW r6 = new X.AYW
            r6.<init>(r2, r1)
            X.1ex r2 = r7.A03
            r0 = 2
            X.1MD[] r1 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = "action"
            java.lang.String r9 = "get-kyc-state"
            X.AnonymousClass8BV.A1M(r0, r9, r1)
            java.lang.String r0 = "provider"
            X.C17880vN.A1Q(r0, r10, r1, r3)
            java.lang.String r0 = "account"
            X.1ca r0 = X.AnonymousClass8BR.A0k(r0, r1)
            android.content.Context r4 = r7.A00
            X.1KB r8 = r7.A01
            X.1jG r5 = r7.A02
            X.8yk r3 = new X.8yk
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.AnonymousClass8BW.A1C(r2, r3, r0)
            return
        L_0x05e1:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r1)
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C17880vN.A1F(r1, r0, r3)
            return
        L_0x05eb:
            java.lang.Class<com.whatsapp.payments.ui.PaymentContactPicker> r0 = com.whatsapp.payments.ui.PaymentContactPicker.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r1, r0)
            java.lang.String r0 = "for_payments"
            r2.putExtra(r0, r3)
            r1.startActivity(r2)
            return
        L_0x05fa:
            r0 = 2131887421(0x7f12053d, float:1.9409449E38)
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x0601:
            java.lang.String r2 = "onboarding_context"
            java.lang.String r5 = X.C17880vN.A0s(r2, r0)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x061d
            java.lang.String r4 = "p2m_context"
            boolean r2 = r5.equals(r4)
            if (r2 != 0) goto L_0x061f
            java.lang.String r4 = "p2p_context"
            boolean r2 = r5.equals(r4)
            if (r2 != 0) goto L_0x061f
        L_0x061d:
            java.lang.String r4 = "generic_context"
        L_0x061f:
            java.lang.String r2 = X.C17880vN.A0s(r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x062b
            java.lang.String r2 = "payment_home"
        L_0x062b:
            X.A5F r0 = r1.A0J
            r0.A03(r1, r2, r4, r3)
            return
        L_0x0631:
            r0 = 2131887421(0x7f12053d, float:1.9409449E38)
            goto L_0x0645
        L_0x0635:
            X.A5F r0 = r1.A0J
            X.9mU r4 = r0.A0F
            X.AYn r2 = new X.AYn
            r2.<init>(r1, r0, r3)
            r0 = 0
            r4.A00(r2, r0)
            return
        L_0x0643:
            r0 = 102(0x66, float:1.43E-43)
        L_0x0645:
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x0649:
            X.9mU r4 = r1.A09
            X.AYl r0 = new X.AYl
            r0.<init>(r2, r1)
            r4.A00(r0, r3)
            return
        L_0x0654:
            java.lang.String r2 = "error_code"
            java.lang.String r2 = X.C17880vN.A0s(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x066b
            int r4 = java.lang.Integer.parseInt(r2)
            boolean r0 = r1.BcG(r4)
            if (r0 == 0) goto L_0x066c
            return
        L_0x066b:
            r4 = -1
        L_0x066c:
            X.AXg r3 = r1.A06
            X.0ve r2 = r1.A0E
            r8 = 2131893867(0x7f121e6b, float:1.9422523E38)
            X.A27 r0 = r1.A0I
            r5 = r2
            r6 = r0
            r7 = r4
            r4 = r1
            X.05w r0 = r3.A01(r4, r5, r6, r7, r8)
            r0.show()
            return
        L_0x0681:
            java.lang.String r3 = "credential_id"
            java.lang.String r7 = X.AnonymousClass91q.A0V(r3, r0)
            X.9oR r3 = r1.A0K
            r0 = 1
            X.AbQ r6 = new X.AbQ
            r6.<init>(r2, r1, r0)
            X.Aal r4 = new X.Aal
            r4.<init>(r2, r1, r0)
            r5 = 0
            java.lang.String r8 = "add_card"
            X.Af0 r3 = r3.A01(r4, r5, r6, r7, r8)
            r0 = 3
            X.Aei r2 = new X.Aei
            r2.<init>(r0, r7, r1)
        L_0x06a1:
            r3.A09(r2)
            return
        L_0x06a5:
            java.lang.String r5 = "card_number"
            java.lang.String r5 = X.C17880vN.A0s(r5, r0)
            java.lang.String r0 = "\\s"
            java.lang.String r7 = r5.replaceAll(r0, r4)
            java.util.HashMap r8 = X.C17880vN.A11()
            int r5 = r7.length()
            r4 = 0
            r0 = 6
            if (r5 >= r0) goto L_0x06c8
            java.lang.String r1 = "network_name"
            java.lang.String r0 = "unknown"
            r8.put(r1, r0)
        L_0x06c4:
            r2.A01(r6, r8)
            return
        L_0x06c8:
            java.lang.String r21 = r7.substring(r4, r0)
            X.9nS r4 = r1.A0B
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x06c4
            r4.A03 = r3
            X.11P r7 = r1.A05
            X.1KB r6 = r1.A05
            X.11S r5 = r1.A02
            X.00H r0 = r1.A0O
            X.1OZ r17 = X.C17880vN.A0U(r0)
            X.9mW r4 = r1.A0L
            X.1jG r18 = X.AnonymousClass8BU.A0P(r1)
            X.A54 r0 = r1.A0H
            X.9hI r12 = new X.9hI
            r13 = r1
            r14 = r6
            r15 = r5
            r16 = r7
            r19 = r0
            r20 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.9lT r5 = new X.9lT
            r5.<init>(r2, r1, r8)
            X.9mW r1 = r12.A07
            r0 = 5
            java.lang.String r11 = r1.A00(r0)
            X.11P r1 = r12.A03
            X.11S r0 = r12.A02
            r7 = 0
            java.lang.String r10 = X.AnonymousClass1PP.A00(r0, r1, r7)
            X.1OZ r4 = r12.A04
            java.lang.String r2 = r4.A0B()
            java.lang.String r13 = r12.A08
            X.C18070vi.A0d(r11, r3)
            java.lang.String r8 = "nonce"
            r9 = 2
            java.lang.String r0 = "elo"
            X.1cX r6 = X.C108945cZ.A0t(r0)
            r0 = 1
            boolean r3 = X.AnonymousClass8BV.A1X(r11, r0, r7)
            if (r3 == 0) goto L_0x072c
            java.lang.String r3 = "network_device_id"
            X.C29591cX.A01(r6, r3, r11)
        L_0x072c:
            boolean r0 = X.AnonymousClass8BV.A1Y(r10, r0, r7)
            X.AnonymousClass8BW.A1F(r6, r8, r10, r0)
            X.1ca r8 = r6.A03()
            X.C18070vi.A0d(r13, r9)
            X.1cX r6 = X.AnonymousClass8BY.A0O()
            java.lang.String r0 = "w:pay"
            X.AnonymousClass8BY.A16(r6, r0)
            X.AnonymousClass8BY.A15(r6, r2)
            X.1cX r3 = X.AnonymousClass8BS.A0R()
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-fetch-network-info"
            X.C29591cX.A01(r3, r1, r0)
            r14 = 6
            r16 = r14
            r18 = r7
            boolean r0 = X.C29601cY.A04(r13, r14, r16, r18)
            if (r0 == 0) goto L_0x0762
            java.lang.String r0 = "bin"
            X.C29591cX.A01(r3, r0, r13)
        L_0x0762:
            r3.A05(r8)
            X.1ca r6 = X.C29591cX.A00(r3, r6)
            android.content.Context r3 = r12.A00
            X.1KB r1 = r12.A01
            X.1jG r0 = r12.A05
            r13 = 7
            X.8yh r7 = new X.8yh
            r8 = r3
            r9 = r0
            r10 = r1
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r9 = 30000(0x7530, double:1.4822E-319)
            r8 = 204(0xcc, float:2.86E-43)
            r5 = r7
            r7 = r2
            r4.A0I(r5, r6, r7, r8, r9)
            return
        L_0x0783:
            java.lang.String r3 = "credential_id"
            java.lang.String r11 = X.AnonymousClass91q.A0Q(r3, r0)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.lang.String r3 = "card_num"
            java.lang.String r5 = X.AnonymousClass91q.A0Q(r3, r0)
            java.lang.String r3 = "\\s"
            java.lang.String r4 = r5.replace(r3, r4)
            java.lang.String r3 = "creditCardNumber"
            X.AnonymousClass3Ma.A1P(r3, r4, r10)
            X.11P r12 = r1.A05
            X.1KB r9 = r1.A05
            X.11S r8 = r1.A02
            X.9mk r7 = r1.A0E
            X.1ek r6 = r1.A0Q
            X.9uA r5 = r1.A0P
            X.1ex r4 = r1.A0A
            X.1jG r17 = X.AnonymousClass8BU.A0P(r1)
            X.A54 r3 = r1.A0H
            java.lang.String r13 = "pin"
            java.lang.String r24 = X.C17880vN.A0s(r13, r0)
            java.lang.String r13 = "provider"
            java.lang.String r25 = X.C17880vN.A0s(r13, r0)
            X.9yp r0 = new X.9yp
            r22 = r6
            r23 = r11
            r26 = r10
            r18 = r4
            r19 = r7
            r20 = r3
            r21 = r5
            r14 = r9
            r15 = r8
            r16 = r12
            r12 = r0
            r13 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.9lU r4 = new X.9lU
            r4.<init>(r2, r1, r11)
            java.lang.String r3 = r0.A0B
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0808
            java.lang.String r5 = r0.A0C
            X.C17960vV.A07(r5)
            X.A54 r2 = r0.A06
            java.lang.String r1 = "PIN"
            X.AZ2 r2 = r2.A01(r5, r1)
            if (r2 != 0) goto L_0x07ff
            X.9mt r3 = r0.A05
            r2 = 0
            X.AYd r1 = new X.AYd
            r1.<init>(r0, r4, r2)
            r3.A00(r1, r5)
            return
        L_0x07ff:
            X.9zC r1 = new X.9zC
            r1.<init>(r2)
            X.C198739yp.A00(r0, r1, r4, r3)
            return
        L_0x0808:
            X.9mk r2 = r0.A04
            java.util.List r9 = r0.A0D
            r1 = 1
            X.AXu r6 = new X.AXu
            r6.<init>(r4, r0, r1)
            X.10I r0 = r2.A05
            X.17E r7 = r2.A03
            X.1QD r3 = r2.A01
            X.2Ui r8 = r2.A04
            X.1ex r4 = r2.A02
            X.11E r2 = r2.A00
            r10 = -1
            r5 = 0
            X.8yr r1 = new X.8yr
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.C17890vO.A0u(r1, r0)
            return
        L_0x0829:
            java.lang.String r4 = "on_failure"
            java.lang.String r3 = "document_type"
            java.lang.String r8 = X.AnonymousClass91q.A0Q(r3, r0)
            java.lang.String r3 = "doc_file_name_list"
            java.lang.String r0 = X.AnonymousClass91q.A0Q(r3, r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            org.json.JSONObject r6 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x08cf }
            X.00H r0 = r1.A0L     // Catch:{ JSONException -> 0x08cf }
            java.lang.Object r3 = r0.get()     // Catch:{ JSONException -> 0x08cf }
            X.9iy r3 = (X.C189369iy) r3     // Catch:{ JSONException -> 0x08cf }
            java.lang.String r0 = "front"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x08cf }
            java.io.File r7 = r3.A00(r0)     // Catch:{ JSONException -> 0x08cf }
            X.00H r0 = r1.A0L     // Catch:{ JSONException -> 0x08cf }
            java.lang.Object r3 = r0.get()     // Catch:{ JSONException -> 0x08cf }
            X.9iy r3 = (X.C189369iy) r3     // Catch:{ JSONException -> 0x08cf }
            java.lang.String r0 = "back"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x08cf }
            java.io.File r6 = r3.A00(r0)     // Catch:{ JSONException -> 0x08cf }
            if (r7 == 0) goto L_0x08c6
            if (r6 == 0) goto L_0x08c6
            boolean r0 = r7.exists()     // Catch:{ JSONException -> 0x08cf }
            if (r0 == 0) goto L_0x08c6
            boolean r0 = r6.exists()     // Catch:{ JSONException -> 0x08cf }
            if (r0 == 0) goto L_0x08c6
            java.lang.String r0 = r7.getPath()     // Catch:{ JSONException -> 0x08cf }
            java.lang.String r3 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)     // Catch:{ JSONException -> 0x08cf }
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ JSONException -> 0x08cf }
            java.lang.String r0 = r0.getMimeTypeFromExtension(r3)     // Catch:{ JSONException -> 0x08cf }
            boolean r0 = X.AnonymousClass747.A05(r0)     // Catch:{ JSONException -> 0x08cf }
            if (r0 == 0) goto L_0x08c0
            java.lang.String r0 = r6.getPath()     // Catch:{ JSONException -> 0x08cf }
            java.lang.String r3 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)     // Catch:{ JSONException -> 0x08cf }
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ JSONException -> 0x08cf }
            java.lang.String r0 = r0.getMimeTypeFromExtension(r3)     // Catch:{ JSONException -> 0x08cf }
            boolean r0 = X.AnonymousClass747.A05(r0)     // Catch:{ JSONException -> 0x08cf }
            if (r0 == 0) goto L_0x08c0
            r5.add(r7)     // Catch:{ JSONException -> 0x08cf }
            r5.add(r6)     // Catch:{ JSONException -> 0x08cf }
            int r0 = r5.size()
            if (r0 != 0) goto L_0x08b4
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload no file to upload"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A00(r4)
            return
        L_0x08b4:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            r11 = 0
            r6 = r2
            r7 = r1
            r9 = r5
            A0v(r6, r7, r8, r9, r10, r11)
            return
        L_0x08c0:
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload format not allowed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x08cf }
            goto L_0x08cb
        L_0x08c6:
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x08cf }
        L_0x08cb:
            r2.A00(r4)     // Catch:{ JSONException -> 0x08cf }
            return
        L_0x08cf:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilPayBloksActivity performDocumentUpload threw exception "
            com.whatsapp.util.Log.e(r0, r1)
            r2.A00(r4)
            return
        L_0x08d9:
            java.lang.String r3 = "credential_id"
            java.lang.String r10 = X.C17880vN.A0s(r3, r0)
            X.11P r12 = r1.A05
            X.1KB r11 = r1.A05
            X.11S r9 = r1.A02
            X.00H r0 = r1.A0O
            X.1OZ r17 = X.C17880vN.A0U(r0)
            X.1ek r8 = r1.A0Q
            X.1QS r7 = r1.A0D
            X.1ex r6 = r1.A0A
            X.9mW r5 = r1.A0L
            X.1KI r3 = r1.A02
            X.A6a r0 = r1.A07
            X.1jG r19 = X.AnonymousClass8BU.A0P(r1)
            X.9nO r4 = new X.9nO
            r21 = r7
            r22 = r5
            r23 = r8
            r24 = r10
            r16 = r3
            r18 = r0
            r20 = r6
            r13 = r11
            r14 = r9
            r15 = r12
            r11 = r4
            r12 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = 1
            X.AY6 r0 = new X.AY6
            r0.<init>(r2, r1, r10, r3)
            r4.A00(r0)
            return
        L_0x091d:
            java.lang.String r3 = "credential_push_data"
            java.lang.String r22 = X.C17880vN.A0s(r3, r0)
            java.lang.String r3 = "credential_card_network"
            java.lang.String r23 = X.C17880vN.A0s(r3, r0)
            X.11S r0 = r1.A02
            java.lang.String r0 = r0.A0B()
            X.C17960vV.A07(r0)
            java.lang.String r3 = X.AnonymousClass17K.A06(r0)
            java.lang.String r0 = "[^\\d]"
            java.lang.String r24 = r3.replaceAll(r0, r4)
            X.0ve r4 = r1.A0E
            r3 = 1482(0x5ca, float:2.077E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 == 0) goto L_0x09b0
            X.A5Y r3 = r1.A0H
            java.lang.String r0 = "generic_context"
            boolean r0 = r3.A06(r0)
            java.lang.Boolean r21 = X.C108945cZ.A1A(r0)
        L_0x0954:
            X.11P r10 = r1.A05
            X.1KB r9 = r1.A05
            X.11S r8 = r1.A02
            X.00H r0 = r1.A0O
            X.1OZ r15 = X.C17880vN.A0U(r0)
            X.1QS r7 = r1.A0D
            X.A4g r6 = r1.A0F
            X.1ex r5 = r1.A0A
            X.1KI r4 = r1.A02
            X.1jG r16 = X.AnonymousClass8BU.A0P(r1)
            X.A54 r3 = r1.A0H
            X.9ym r0 = new X.9ym
            r19 = r3
            r20 = r6
            r14 = r4
            r17 = r5
            r18 = r7
            r11 = r9
            r12 = r8
            r13 = r10
            r9 = r0
            r10 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.1ek r3 = r1.A0Q
            java.lang.String r25 = r3.A01()
            X.9bb r4 = new X.9bb
            r4.<init>(r2, r1)
            X.A54 r8 = r0.A06
            java.lang.String r9 = "KYC"
            java.lang.String r2 = "FB"
            X.AZ2 r3 = r8.A01(r2, r9)
            if (r3 == 0) goto L_0x09b3
            java.lang.String r1 = r3.A05
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x09b3
            r1 = r3
            r2 = r4
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            X.C198709ym.A00(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x09b0:
            r21 = 0
            goto L_0x0954
        L_0x09b3:
            X.AYi r1 = new X.AYi
            r19 = r0
            r20 = r4
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            android.content.Context r4 = r0.A00
            X.1KB r5 = r0.A01
            X.1ex r7 = r0.A04
            X.1jG r6 = r0.A03
            X.9mt r3 = new X.9mt
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.A00(r1, r2)
            return
        L_0x09cf:
            java.lang.String r3 = "credential_id"
            java.lang.String r3 = X.AnonymousClass91q.A0V(r3, r0)
            X.1QS r0 = r1.A0D
            X.1KH r0 = X.AnonymousClass8BR.A0R(r0)
            X.AEs r12 = r0.A08(r3)
            X.C17960vV.A07(r12)
            X.8pK r12 = (X.AnonymousClass8pK) r12
            X.11P r11 = r1.A05
            X.1KB r10 = r1.A05
            X.11S r9 = r1.A02
            X.00H r0 = r1.A0O
            X.1OZ r19 = X.C17880vN.A0U(r0)
            X.1QS r8 = r1.A0D
            X.1ex r7 = r1.A0A
            X.9mW r6 = r1.A0L
            X.1KI r5 = r1.A02
            X.A6a r4 = r1.A07
            X.1jG r21 = X.AnonymousClass8BU.A0P(r1)
            r0 = 0
            X.AY2 r3 = new X.AY2
            r3.<init>(r2, r1, r0)
            X.A0N r0 = new X.A0N
            r23 = r8
            r24 = r3
            r25 = r6
            r18 = r5
            r20 = r4
            r22 = r7
            r15 = r10
            r16 = r9
            r17 = r11
            r13 = r0
            r14 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.A01(r12)
            return
        L_0x0a20:
            java.lang.String r3 = "credential_id"
            java.lang.String r13 = X.AnonymousClass91q.A0V(r3, r0)
            X.1KB r7 = r1.A05
            X.1ek r6 = r1.A0Q
            X.1QS r5 = r1.A0D
            X.1ex r4 = r1.A0A
            X.1KI r3 = r1.A02
            X.1jG r8 = X.AnonymousClass8BU.A0P(r1)
            X.9jS r0 = new X.9jS
            r0.<init>(r2)
            X.9hK r14 = new X.9hK
            r9 = r4
            r10 = r5
            r11 = r0
            r12 = r6
            r6 = r7
            r7 = r3
            r4 = r14
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction linkMerchant"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = r14.A08
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String r1 = "action"
            java.lang.String r0 = "br-link-merchant"
            X.C17890vO.A11(r1, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0a86
            java.lang.String r0 = "credential-id"
            X.C17890vO.A11(r0, r3, r2)
            X.1ek r0 = r14.A07
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "device-id"
            X.C17890vO.A11(r0, r1, r2)
            X.1ex r0 = r14.A04
            X.1ca r2 = X.AnonymousClass8BX.A0P(r2)
            android.content.Context r11 = r14.A00
            X.1KB r13 = r14.A01
            X.1jG r12 = r14.A03
            r15 = 5
            X.8yf r10 = new X.8yf
            r10.<init>(r11, r12, r13, r14, r15)
            r4 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r3 = "set"
            goto L_0x0ba1
        L_0x0a86:
            java.lang.String r0 = "Credential id missing"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0a8d:
            java.lang.String r5 = "otp"
            java.lang.String r6 = X.AnonymousClass91q.A0V(r5, r0)
            java.lang.String r5 = " "
            java.lang.String r30 = r6.replace(r5, r4)
            java.lang.String r4 = "card_verify_type"
            r0.get(r4)
            java.lang.String r4 = "credential_id"
            java.lang.String r32 = X.C17880vN.A0s(r4, r0)
            java.lang.String r4 = "card_verify_identifier"
            java.lang.String r33 = X.C17880vN.A0s(r4, r0)
            java.lang.String r4 = "card_verify_otp_resend_interval_sec"
            java.lang.String r0 = X.C17880vN.A0s(r4, r0)
            java.lang.String r31 = X.AnonymousClass8BW.A0c(r1)
            X.11P r15 = r1.A05
            X.1KB r14 = r1.A05
            X.11S r13 = r1.A02
            X.1KH r12 = r1.A04
            X.00H r4 = r1.A0O
            X.1OZ r21 = X.C17880vN.A0U(r4)
            X.1QS r11 = r1.A0D
            X.9nS r10 = r1.A0B
            X.1ex r9 = r1.A0A
            X.1KI r8 = r1.A02
            X.9mW r7 = r1.A0L
            X.A6a r6 = r1.A07
            X.1jG r23 = X.AnonymousClass8BU.A0P(r1)
            X.A54 r5 = r1.A0H
            X.9lS r4 = new X.9lS
            r4.<init>(r2, r1, r0)
            X.8yy r0 = new X.8yy
            r24 = r9
            r25 = r11
            r26 = r5
            r27 = r10
            r28 = r7
            r29 = r4
            r19 = r8
            r20 = r12
            r22 = r6
            r16 = r14
            r17 = r13
            r18 = r15
            r14 = r0
            r15 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r5 = r0.A05
            X.1KH r4 = r0.A04
            X.AEs r1 = r4.A08(r5)
            if (r1 == 0) goto L_0x0b1b
            X.8pb r1 = r1.A08
            X.8pT r1 = (X.AnonymousClass8pT) r1
            if (r1 == 0) goto L_0x0b1b
            java.lang.String r2 = "VISA"
            java.lang.String r1 = r1.A02
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0b1b
            java.lang.String r1 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification with encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r0.A01()
            return
        L_0x0b1b:
            X.AEs r1 = r4.A08(r5)
            X.8pK r1 = (X.AnonymousClass8pK) r1
            if (r1 == 0) goto L_0x0ba6
            int r2 = r1.A01
            r1 = 5
            if (r2 != r1) goto L_0x0ba6
            java.lang.String r1 = "PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.9nS r1 = r0.A09
            X.9go r4 = r1.A00
            r2 = 0
            if (r4 == 0) goto L_0x0b3e
            java.lang.String r1 = r4.A02
            r4.A02 = r2
            if (r1 == 0) goto L_0x0b3e
            r0.A03(r2, r1)
            return
        L_0x0b3e:
            X.11P r7 = r0.A03
            android.content.Context r6 = r0.A00
            X.1KB r5 = r0.A01
            X.11S r4 = r0.A02
            X.1ex r2 = r0.A06
            X.1jG r1 = r0.A05
            X.9gI r9 = new X.9gI
            r13 = r7
            r14 = r1
            r15 = r2
            r10 = r6
            r11 = r5
            r12 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.9Y8 r14 = new X.9Y8
            r14.<init>(r0)
            java.lang.String r7 = "ADD_CARD"
            java.lang.String r8 = "elo"
            X.11P r1 = r9.A03
            X.11S r0 = r9.A02
            r6 = 0
            java.lang.String r5 = X.AnonymousClass1PP.A00(r0, r1, r6)
            X.1ex r1 = r9.A05
            r0 = 4
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]
            java.lang.String r2 = "action"
            java.lang.String r0 = "br-request-new-challenge"
            X.C17880vN.A1Q(r2, r0, r4, r6)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r8.toUpperCase(r0)
            java.lang.String r0 = "network_type"
            X.C17880vN.A1Q(r0, r2, r4, r3)
            java.lang.String r0 = "scope"
            X.C17890vO.A12(r0, r7, r4)
            java.lang.String r0 = "nonce"
            X.AnonymousClass8BV.A1O(r0, r5, r4)
            java.lang.String r0 = "account"
            X.1ca r2 = X.AnonymousClass8BR.A0k(r0, r4)
            android.content.Context r11 = r9.A00
            X.1KB r13 = r9.A01
            X.1jG r12 = r9.A04
            r16 = 9
            X.8yh r10 = new X.8yh
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r4 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r3 = "set"
            r0 = r1
        L_0x0ba1:
            r1 = r10
            r0.A0I(r1, r2, r3, r4)
            return
        L_0x0ba6:
            java.lang.String r1 = "PAY: BrazilVerifyCardOTPSendAction sendRequestCardVerification without encrypted value"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = r0.A06
            X.C175598yy.A00(r0, r1)
            return
        L_0x0bb1:
            r3 = 0
            A0w(r2, r1, r0, r3)
            return
        L_0x0bb6:
            java.lang.String r1 = "verify_methods"
            java.lang.String r3 = X.C17880vN.A0s(r1, r0)
            java.lang.String r1 = "keys"
            java.lang.String r0 = X.C17880vN.A0s(r1, r0)
            if (r3 == 0) goto L_0x0c4a
            if (r0 == 0) goto L_0x0c4a
            java.util.HashMap r5 = X.C17880vN.A11()
            java.util.List r8 = X.AnonymousClass8BW.A0t(r0)
            java.io.StringWriter r7 = new java.io.StringWriter
            r7.<init>()
            android.util.JsonWriter r4 = new android.util.JsonWriter
            r4.<init>(r7)
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0c4a }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0c4a }
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ IOException -> 0x0c4a }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0c4a }
            r4.beginObject()     // Catch:{ all -> 0x0c40 }
            java.lang.String r0 = "verification_options"
            r4.name(r0)     // Catch:{ all -> 0x0c40 }
        L_0x0bea:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0c40 }
            if (r0 == 0) goto L_0x0c2d
            r3.beginArray()     // Catch:{ all -> 0x0c40 }
            r4.beginArray()     // Catch:{ all -> 0x0c40 }
        L_0x0bf6:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0c40 }
            if (r0 == 0) goto L_0x0c29
            r3.beginObject()     // Catch:{ all -> 0x0c40 }
            r4.beginObject()     // Catch:{ all -> 0x0c40 }
        L_0x0c02:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0c40 }
            if (r0 == 0) goto L_0x0c22
            java.lang.String r1 = r3.nextName()     // Catch:{ all -> 0x0c40 }
            boolean r0 = r8.contains(r1)     // Catch:{ all -> 0x0c40 }
            if (r0 == 0) goto L_0x0c1e
            android.util.JsonWriter r1 = r4.name(r1)     // Catch:{ all -> 0x0c40 }
            java.lang.String r0 = r3.nextString()     // Catch:{ all -> 0x0c40 }
            r1.value(r0)     // Catch:{ all -> 0x0c40 }
            goto L_0x0c02
        L_0x0c1e:
            r3.skipValue()     // Catch:{ all -> 0x0c40 }
            goto L_0x0c02
        L_0x0c22:
            r3.endObject()     // Catch:{ all -> 0x0c40 }
            r4.endObject()     // Catch:{ all -> 0x0c40 }
            goto L_0x0bf6
        L_0x0c29:
            r4.endArray()     // Catch:{ all -> 0x0c40 }
            goto L_0x0bea
        L_0x0c2d:
            r4.endObject()     // Catch:{ all -> 0x0c40 }
            r3.close()     // Catch:{ IOException -> 0x0c4a }
            java.lang.String r1 = "payload"
            java.lang.String r0 = r7.toString()
            r5.put(r1, r0)
            r2.A02(r6, r5)
            return
        L_0x0c40:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0c45 }
            goto L_0x0c49
        L_0x0c45:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0c4a }
        L_0x0c49:
            throw r1     // Catch:{ IOException -> 0x0c4a }
        L_0x0c4a:
            java.lang.String r0 = "on_failure"
            r2.A00(r0)
            return
        L_0x0c50:
            java.util.HashMap r1 = X.C17880vN.A11()
            java.lang.String r0 = "on_failure"
            r2.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.CBV(X.9sN, java.lang.String, java.util.Map):void");
    }

    public BrazilPayBloksActivity() {
        this(0);
        this.A0N = C221618v.A00(AnonymousClass17L.class);
        this.A01 = null;
        this.A0P = null;
        this.A03 = null;
    }
}
