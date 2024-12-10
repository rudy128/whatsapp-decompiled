package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.9ul  reason: invalid class name and case insensitive filesystem */
public abstract class C196289ul {
    public static boolean A03(C18020vd r2) {
        C18070vi.A0d(r2, 1);
        return !C18020vd.A05(C18040vf.A02, r2, 4001);
    }

    public Integer A06() {
        return null;
    }

    public final String A09(Context context, C20285AEt aEt, C20271AEe aEe) {
        Object obj;
        C18070vi.A0d(context, 0);
        try {
            obj = A08(context, aEt, aEe);
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        Throwable A00 = C30671eK.A00(obj);
        if (A00 != null) {
            Log.e("NativeFlowAction/getButtonTextOrNull", A00);
        }
        if (obj instanceof AnonymousClass1IU) {
            obj = null;
        }
        return (String) obj;
    }

    public void A0C(Intent intent, AnonymousClass121 r2, AnonymousClass1W6 r3, AnonymousClass10I r4, int i) {
    }

    public int A04() {
        if (this instanceof C169898nk) {
            return 2131231926;
        }
        if (this instanceof C169908nl) {
            return 2131233420;
        }
        if (this instanceof C169968ns) {
            return 2131231762;
        }
        if (this instanceof C169988nu) {
            return 2131231742;
        }
        if (this instanceof C169938np) {
            return 2131231835;
        }
        if (this instanceof C169978nt) {
            return 2131232334;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r0 = r1.equals(r0);
        r1 = 2131232082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r0 = r1.equals(r0);
        r1 = 2131233223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A05(X.C20285AEt r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C169888nj
            if (r0 == 0) goto L_0x0014
            X.AEn r0 = r4.A02
            if (r0 == 0) goto L_0x0012
            int r2 = X.C20089A6r.A00(r0)
            r1 = 1
            r0 = 2131232303(0x7f08062f, float:1.8080711E38)
            if (r2 == r1) goto L_0x0013
        L_0x0012:
            r0 = -1
        L_0x0013:
            return r0
        L_0x0014:
            java.lang.String r0 = r4.A0A
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "galaxy_message"
            boolean r1 = X.AnonymousClass8BU.A1S(r4, r0)
            r0 = 1
            if (r1 != r0) goto L_0x0065
            X.AEk r0 = r4.A06
            if (r0 == 0) goto L_0x0065
            int r1 = r0.A01
            r0 = 3
            if (r1 != r0) goto L_0x0065
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto L_0x0035
            int r0 = r1.hashCode()
            switch(r0) {
                case -1776157398: goto L_0x004c;
                case -1130208402: goto L_0x0049;
                case -912917024: goto L_0x0046;
                case -542110786: goto L_0x0043;
                case -73239804: goto L_0x004f;
                case 1342932210: goto L_0x0039;
                case 2067740991: goto L_0x0059;
                default: goto L_0x0035;
            }
        L_0x0035:
            r1 = 2131231687(0x7f0803c7, float:1.8079462E38)
        L_0x0038:
            return r1
        L_0x0039:
            java.lang.String r0 = "Get offer"
            boolean r0 = r1.equals(r0)
            r1 = 2131231944(0x7f0804c8, float:1.8079983E38)
            goto L_0x0062
        L_0x0043:
            java.lang.String r0 = "Sign up"
            goto L_0x0051
        L_0x0046:
            java.lang.String r0 = "Get updates"
            goto L_0x0051
        L_0x0049:
            java.lang.String r0 = "Request appointment"
            goto L_0x005b
        L_0x004c:
            java.lang.String r0 = "Subscribe"
            goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "Apply now"
        L_0x0051:
            boolean r0 = r1.equals(r0)
            r1 = 2131232082(0x7f080552, float:1.8080263E38)
            goto L_0x0062
        L_0x0059:
            java.lang.String r0 = "Book now"
        L_0x005b:
            boolean r0 = r1.equals(r0)
            r1 = 2131233223(0x7f0809c7, float:1.8082577E38)
        L_0x0062:
            if (r0 != 0) goto L_0x0038
            goto L_0x0035
        L_0x0065:
            int r1 = r3.A04()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196289ul.A05(X.AEt):int");
    }

    public String A07() {
        if (this instanceof C169998nv) {
            return "catalog_message";
        }
        if (this instanceof C169928nn) {
            return "wa_payment_fbpin_reset";
        }
        if (this instanceof C169948nq) {
            return "view_product";
        }
        if (this instanceof C169968ns) {
            return "cta_call";
        }
        if (this instanceof C169958nr) {
            return "form_message";
        }
        if (this instanceof C169918nm) {
            return "menu_options";
        }
        if (this instanceof C169988nu) {
            return "landline_call";
        }
        if (this instanceof C169938np) {
            return "cta_copy";
        }
        if (this instanceof AnonymousClass8no) {
            return ((AnonymousClass8no) this).A00;
        }
        if (this instanceof C169978nt) {
            return "automated_greeting_message_view_catalog";
        }
        if (this instanceof C170018ny) {
            return "galaxy_message";
        }
        if (this instanceof AnonymousClass8nx) {
            return "address_message";
        }
        return "call_permission_request";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0141, code lost:
        if (r2 != 1) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A08(android.content.Context r6, X.C20285AEt r7, X.C20271AEe r8) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C169998nv
            if (r0 == 0) goto L_0x0010
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 2131897869(0x7f122e0d, float:1.943064E38)
            java.lang.String r0 = X.C18070vi.A0F(r6, r0)
            return r0
        L_0x0010:
            boolean r0 = r5 instanceof X.C169928nn
            if (r0 == 0) goto L_0x0020
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 2131892407(0x7f1218b7, float:1.9419561E38)
            java.lang.String r0 = X.C18070vi.A0F(r6, r0)
            return r0
        L_0x0020:
            boolean r0 = r5 instanceof X.C169948nq
            if (r0 == 0) goto L_0x0057
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r3 = 0
            if (r8 == 0) goto L_0x0047
            java.lang.String r2 = r8.A00
            if (r2 == 0) goto L_0x0047
            boolean r1 = X.AnonymousClass1YF.A0T(r2)
            r0 = 1
            if (r1 == r0) goto L_0x0047
            org.json.JSONObject r1 = X.C17880vN.A16(r2)
            java.lang.String r0 = "display_text"
            java.lang.Object r1 = r1.opt(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = (java.lang.String) r1
            r3 = r1
        L_0x0047:
            r0 = 2131892424(0x7f1218c8, float:1.9419596E38)
            java.lang.String r1 = X.C18070vi.A0F(r6, r0)
            if (r3 == 0) goto L_0x0056
            boolean r0 = X.AnonymousClass1YF.A0T(r3)
            if (r0 == 0) goto L_0x014b
        L_0x0056:
            return r1
        L_0x0057:
            boolean r0 = r5 instanceof X.C169968ns
            if (r0 == 0) goto L_0x006d
            r1 = 0
            if (r8 == 0) goto L_0x006c
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x006c
            org.json.JSONObject r1 = X.C17880vN.A16(r0)
            java.lang.String r0 = "display_text"
            java.lang.String r1 = r1.optString(r0)
        L_0x006c:
            return r1
        L_0x006d:
            boolean r0 = r5 instanceof X.C169958nr
            if (r0 == 0) goto L_0x007d
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 2131892422(0x7f1218c6, float:1.9419592E38)
            java.lang.String r0 = X.C18070vi.A0F(r6, r0)
            return r0
        L_0x007d:
            boolean r0 = r5 instanceof X.C169918nm
            if (r0 == 0) goto L_0x00c4
            r0 = r5
            X.8nm r0 = (X.C169918nm) r0
            boolean r0 = r0 instanceof X.C169908nl
            if (r0 == 0) goto L_0x00ac
            r1 = 0
            if (r8 == 0) goto L_0x00aa
            java.lang.String r0 = r8.A00
        L_0x008d:
            org.json.JSONObject r2 = X.C169918nm.A01(r0)
            if (r2 == 0) goto L_0x0056
            java.lang.String r1 = "title"
            boolean r0 = X.C18070vi.A15(r2, r1)
            java.lang.String r3 = X.A6n.A03(r1, r2, r0)
            java.lang.String r1 = "display_text"
            boolean r0 = X.C18070vi.A15(r2, r1)
            java.lang.String r1 = X.A6n.A03(r1, r2, r0)
            if (r3 != 0) goto L_0x014b
            return r1
        L_0x00aa:
            r0 = r1
            goto L_0x008d
        L_0x00ac:
            r3 = 0
            if (r8 == 0) goto L_0x00c2
            java.lang.String r0 = r8.A00
        L_0x00b1:
            org.json.JSONObject r2 = X.C169918nm.A01(r0)
            if (r2 == 0) goto L_0x014b
            java.lang.String r1 = "title"
            boolean r0 = X.C18070vi.A15(r2, r1)
            java.lang.String r3 = X.A6n.A03(r1, r2, r0)
            return r3
        L_0x00c2:
            r0 = r3
            goto L_0x00b1
        L_0x00c4:
            boolean r0 = r5 instanceof X.C169988nu
            if (r0 == 0) goto L_0x00e5
            r4 = r5
            X.8nu r4 = (X.C169988nu) r4
            r3 = 0
            X.C18070vi.A0d(r6, r3)
            r2 = 2131887832(0x7f1206d8, float:1.9410282E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            if (r8 == 0) goto L_0x00e3
            java.lang.String r0 = r8.A00
        L_0x00da:
            java.lang.String r0 = X.C169988nu.A00(r4, r0)
            java.lang.String r0 = X.AnonymousClass3Ma.A10(r6, r0, r1, r3, r2)
            return r0
        L_0x00e3:
            r0 = 0
            goto L_0x00da
        L_0x00e5:
            boolean r0 = r5 instanceof X.C169938np
            if (r0 == 0) goto L_0x0109
            r3 = 0
            if (r8 == 0) goto L_0x00ff
            java.lang.String r0 = r8.A00     // Catch:{ JSONException -> 0x00f5 }
            if (r0 == 0) goto L_0x00ff
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x00f5 }
            goto L_0x0100
        L_0x00f5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CopyCodeAction/getButtonText: /"
            X.C108995ce.A1M(r0, r1, r2)
        L_0x00ff:
            r1 = r3
        L_0x0100:
            if (r1 == 0) goto L_0x014b
            java.lang.String r0 = "display_text"
            java.lang.String r3 = r1.optString(r0)
            return r3
        L_0x0109:
            boolean r0 = r5 instanceof X.AnonymousClass8no
            if (r0 == 0) goto L_0x014e
            r1 = r5
            X.8no r1 = (X.AnonymousClass8no) r1
            boolean r0 = r1 instanceof X.C169888nj
            if (r0 == 0) goto L_0x014c
            X.8nj r1 = (X.C169888nj) r1
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r3 = 0
            if (r8 == 0) goto L_0x014b
            X.0ve r2 = r1.A01
            r1 = 8355(0x20a3, float:1.1708E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x014b
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "review_and_pay_v2"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x014b
            if (r7 == 0) goto L_0x0143
            X.AEn r0 = r7.A02
            if (r0 == 0) goto L_0x0143
            int r2 = X.C20089A6r.A00(r0)
            r1 = 1
            r0 = 2131888296(0x7f1208a8, float:1.9411223E38)
            if (r2 == r1) goto L_0x0146
        L_0x0143:
            r0 = 2131888290(0x7f1208a2, float:1.9411211E38)
        L_0x0146:
            java.lang.String r3 = r6.getString(r0)
            return r3
        L_0x014b:
            return r3
        L_0x014c:
            r3 = 0
            return r3
        L_0x014e:
            boolean r0 = r5 instanceof X.C169978nt
            if (r0 == 0) goto L_0x015e
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 2131897869(0x7f122e0d, float:1.943064E38)
            java.lang.String r0 = X.C18070vi.A0F(r6, r0)
            return r0
        L_0x015e:
            boolean r0 = r5 instanceof X.C170018ny
            if (r0 == 0) goto L_0x01d0
            r4 = r5
            X.8ny r4 = (X.C170018ny) r4
            r3 = 0
            X.C18070vi.A0d(r6, r3)
            X.00H r0 = r4.A00
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 8869(0x22a5, float:1.2428E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01ab
            X.00H r2 = r4.A0B
            java.lang.Object r0 = r2.get()
            X.7Gq r0 = (X.C144267Gq) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x01ab
            if (r7 == 0) goto L_0x01ab
            X.AEk r0 = r7.A06
            if (r0 == 0) goto L_0x01ab
            java.util.List r0 = r0.A03
            java.lang.Object r0 = r0.get(r3)
            X.ADl r0 = (X.C20253ADl) r0
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01ab
            java.lang.Object r1 = r2.get()
            X.7Gq r1 = (X.C144267Gq) r1
            r0 = 1
            r1.A03 = r0
            java.lang.Object r0 = r2.get()
            X.7Gq r0 = (X.C144267Gq) r0
            r0.A01(r6)
        L_0x01ab:
            if (r8 == 0) goto L_0x01c6
            java.lang.String r0 = r8.A00
        L_0x01af:
            java.util.HashMap r2 = X.A3M.A01(r0)
            java.lang.String r1 = "flow_cta"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x01c8
            java.lang.String r3 = r0.toString()
            return r3
        L_0x01c6:
            r0 = 0
            goto L_0x01af
        L_0x01c8:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x01cd:
            java.lang.String r3 = ""
            return r3
        L_0x01d0:
            boolean r0 = r5 instanceof X.AnonymousClass8nx
            if (r0 == 0) goto L_0x01e0
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r0 = 2131892421(0x7f1218c5, float:1.941959E38)
            java.lang.String r0 = X.C18070vi.A0F(r6, r0)
            return r0
        L_0x01e0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196289ul.A08(android.content.Context, X.AEt, X.AEe):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r2v33, types: [X.ADE, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0258, code lost:
        if (r2 == null) goto L_0x025a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.app.Activity r26, X.AnonymousClass5XY r27, X.AnonymousClass206 r28, X.C20271AEe r29, int r30) {
        /*
            r25 = this;
            r2 = r26
            r1 = r28
            r0 = r25
            boolean r3 = r0 instanceof X.C169998nv
            r5 = r29
            if (r3 == 0) goto L_0x006b
            X.8nv r0 = (X.C169998nv) r0
            r4 = 0
            X.AnonymousClass8BX.A1J(r2, r1, r5, r4)
            java.lang.String r3 = r5.A00
            java.lang.String r5 = X.C169998nv.A00(r0, r3)
            if (r5 == 0) goto L_0x05b7
            boolean r3 = X.AnonymousClass1YF.A0T(r5)
            if (r3 != 0) goto L_0x05b7
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "c/"
            java.lang.String r3 = X.AnonymousClass001.A1H(r3, r5, r4)
            X.2pH r3 = X.C61192pH.A00(r3)
            android.net.Uri r3 = r3.A00
            java.lang.String r3 = r3.toString()
            android.net.Uri r6 = android.net.Uri.parse(r3)
            X.0vl r3 = r0.A02
            java.lang.Object r4 = r3.getValue()
            X.1nl r4 = (X.C36361nl) r4
            r3 = 0
            r4.CGU(r2, r6, r3)
            X.0vl r2 = r0.A00
            java.lang.Object r4 = r2.getValue()
            X.0vd r4 = (X.C18020vd) r4
            r3 = 3754(0xeaa, float:5.26E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x006a
            X.0vl r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.9ea r3 = (X.C186679ea) r3
            X.205 r2 = r1.A0v
            X.C18070vi.A0W(r2)
            X.10I r1 = r3.A00
            r0 = 15
            X.C21467AkY.A00(r1, r3, r2, r5, r0)
        L_0x006a:
            return
        L_0x006b:
            boolean r3 = r0 instanceof X.C169948nq
            if (r3 == 0) goto L_0x0090
            X.8nq r0 = (X.C169948nq) r0
            r6 = 0
            X.C18070vi.A0e(r2, r6, r1)
            boolean r3 = r1 instanceof X.AnonymousClass22Q
            if (r3 == 0) goto L_0x006a
            X.22Q r1 = (X.AnonymousClass22Q) r1
            if (r1 == 0) goto L_0x006a
            com.whatsapp.jid.UserJid r5 = r1.A01
            if (r5 != 0) goto L_0x04e8
            X.0vl r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            X.1KB r1 = (X.AnonymousClass1KB) r1
            r0 = 2131888017(0x7f120791, float:1.9410657E38)
            r1.A08(r0, r6)
            return
        L_0x0090:
            boolean r3 = r0 instanceof X.C169898nk
            if (r3 == 0) goto L_0x0134
            r3 = 0
            X.AnonymousClass8BX.A1J(r2, r1, r5, r3)
            java.lang.String r3 = r5.A00
            org.json.JSONObject r7 = X.C169918nm.A01(r3)
            X.C17960vV.A07(r7)
            X.C18070vi.A0X(r7)
            r9 = 0
            r24 = 8
            X.0wS r23 = X.C18460wS.A00
            X.AEt r5 = new X.AEt
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r8 = r5
            r10 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r3 = "sections"
            java.lang.String r3 = r7.getString(r3)
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>(r3)
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            int r20 = r10.length()
            r8 = 0
        L_0x00d7:
            r3 = r20
            if (r8 >= r3) goto L_0x0526
            org.json.JSONObject r4 = r10.getJSONObject(r8)
            java.lang.String r13 = "title"
            java.lang.String r19 = X.C108955ca.A11(r13, r4)
            java.lang.String r3 = "highlight_label"
            java.lang.String r18 = r4.optString(r3)
            java.lang.String r3 = "rows"
            org.json.JSONArray r17 = r4.getJSONArray(r3)
            java.util.ArrayList r11 = X.C108965cb.A0t(r17)
            int r16 = r17.length()
            r12 = 0
        L_0x00fa:
            r3 = r16
            if (r12 >= r3) goto L_0x0125
            r3 = r17
            org.json.JSONObject r4 = r3.getJSONObject(r12)
            java.lang.String r3 = "id"
            java.lang.String r15 = X.C18070vi.A0J(r3, r4)
            java.lang.String r3 = "header"
            java.lang.String r14 = r4.optString(r3)
            java.lang.String r6 = X.C18070vi.A0J(r13, r4)
            java.lang.String r3 = "description"
            java.lang.String r4 = r4.optString(r3)
            X.AEF r3 = new X.AEF
            r3.<init>(r15, r14, r6, r4)
            r11.add(r3)
            int r12 = r12 + 1
            goto L_0x00fa
        L_0x0125:
            X.AE4 r6 = new X.AE4
            r4 = r19
            r3 = r18
            r6.<init>(r4, r3, r11)
            r9.add(r6)
            int r8 = r8 + 1
            goto L_0x00d7
        L_0x0134:
            boolean r3 = r0 instanceof X.C169908nl
            r11 = r30
            if (r3 == 0) goto L_0x01b8
            X.8nl r0 = (X.C169908nl) r0
            r3 = 0
            X.AnonymousClass8BX.A1J(r2, r1, r5, r3)
            r3 = 2097152(0x200000, double:1.0361308E-317)
            boolean r3 = r1.A11(r3)
            if (r3 == 0) goto L_0x0169
            r0 = 2131894877(0x7f12225d, float:1.9424571E38)
            java.lang.String r0 = X.C18070vi.A0F(r2, r0)
            X.3Rj r4 = X.AnonymousClass4a6.A00(r2)
            r4.A0S(r0)
            r3 = 2131899286(0x7f123396, float:1.9433514E38)
            X.1F9 r2 = (X.AnonymousClass1F9) r2
            r1 = 3
            X.AGk r0 = new X.AGk
            r0.<init>(r1)
            r4.A0g(r2, r0, r3)
            X.AnonymousClass3MY.A1G(r4)
            return
        L_0x0169:
            java.lang.String r3 = r5.A00
            org.json.JSONObject r5 = X.C169918nm.A01(r3)
            X.C17960vV.A07(r5)
            X.C18070vi.A0X(r5)
            java.lang.String r4 = "display_text"
            boolean r3 = r5.has(r4)
            if (r3 == 0) goto L_0x0549
            X.5cS r3 = X.C88404Zo.A01(r2)
            if (r3 == 0) goto L_0x0543
            boolean r2 = r1 instanceof X.AnonymousClass21K
            if (r2 == 0) goto L_0x006a
            java.lang.String r6 = r5.optString(r4)
            java.lang.String r2 = "id"
            java.lang.String r7 = r5.optString(r2)
            java.lang.Integer r5 = X.C20120A8f.A02(r1)
            r12 = 0
            r9 = 0
            java.lang.String r8 = ""
            r10 = 1
            X.2qD r4 = new X.2qD
            r13 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3.CHZ(r1, r4)
            X.C169908nl.A00(r0, r1, r11)
            X.10I r3 = r0.A04
            r10 = 15
            X.Aiu r2 = new X.Aiu
            r5 = r2
            r6 = r1
            r7 = r0
            r8 = r4
            r9 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r3.CGF(r2)
            return
        L_0x01b8:
            boolean r3 = r0 instanceof X.C169968ns
            if (r3 == 0) goto L_0x0237
            X.8ns r0 = (X.C169968ns) r0
            X.C18070vi.A0i(r2, r1)
            r10 = 3
            X.C18070vi.A0d(r5, r10)
            boolean r3 = r1 instanceof X.AnonymousClass21K
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = r5.A00
            if (r3 == 0) goto L_0x006a
            org.json.JSONObject r4 = X.C17880vN.A16(r3)
            java.lang.String r3 = "phone_number"
            java.lang.String r8 = r4.optString(r3)
            if (r8 == 0) goto L_0x006a
            java.lang.String r7 = ""
            X.2qD r6 = new X.2qD
            r9 = r7
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r3 = X.C20120A8f.A04(r1)
            boolean r3 = X.AnonymousClass1EG.A0H(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x01ff
            X.10I r4 = r0.A02
            r17 = 14
            X.Aiu r3 = new X.Aiu
            r12 = r3
            r13 = r0
            r14 = r1
            r15 = r6
            r16 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            r4.CGF(r3)
        L_0x01ff:
            com.whatsapp.jid.UserJid r5 = r1.A0I()
            if (r5 == 0) goto L_0x0211
            X.00H r3 = r0.A03
            java.lang.Object r4 = r3.get()
            X.A5M r4 = (X.A5M) r4
            r3 = 2
            r4.A02(r5, r1, r3)
        L_0x0211:
            r3 = 4194304(0x400000, double:2.0722615E-317)
            boolean r3 = r1.A11(r3)
            if (r3 == 0) goto L_0x022a
            X.00H r3 = r0.A06
            java.lang.Object r5 = r3.get()
            X.6nI r5 = (X.C132656nI) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r3 = 2
            r5.A00(r1, r4, r3)
        L_0x022a:
            X.1KB r4 = r0.A01
            r3 = 14
            X.AkY r1 = new X.AkY
            r1.<init>(r0, r2, r8, r3)
            r4.A0J(r1)
            return
        L_0x0237:
            boolean r3 = r0 instanceof X.C169958nr
            if (r3 == 0) goto L_0x0356
            X.8nr r0 = (X.C169958nr) r0
            r2 = 2
            X.C18070vi.A0d(r1, r2)
            boolean r2 = r1 instanceof X.AnonymousClass21K
            if (r2 == 0) goto L_0x006a
            X.AEt r2 = X.AnonymousClass8BR.A0g(r1)
            r7 = 0
            if (r2 == 0) goto L_0x024e
            X.AEk r7 = r2.A06
        L_0x024e:
            r6 = 0
            if (r7 == 0) goto L_0x025a
            int r3 = r7.A01
            r2 = 2
            if (r3 != r2) goto L_0x006a
            java.util.List r2 = r7.A04
            if (r2 != 0) goto L_0x025c
        L_0x025a:
            X.0wS r2 = X.C18460wS.A00
        L_0x025c:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r2.iterator()
        L_0x0264:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0276
            java.lang.Object r3 = r4.next()
            boolean r2 = r3 instanceof X.AnonymousClass465
            if (r2 == 0) goto L_0x0264
            r8.add(r3)
            goto L_0x0264
        L_0x0276:
            int r2 = X.C200510q.A00(r8)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r2)
            java.util.Iterator r4 = r8.iterator()
        L_0x0283:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0299
            java.lang.Object r2 = r4.next()
            X.465 r2 = (X.AnonymousClass465) r2
            java.lang.String r3 = r2.A01
            X.AD7 r2 = r2.A00
            java.lang.Object r2 = r2.A00
            r5.put(r3, r2)
            goto L_0x0283
        L_0x0299:
            java.util.Collection r3 = r5.values()
            if (r3 == 0) goto L_0x032d
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x032d
        L_0x02a5:
            com.whatsapp.jid.UserJid r4 = r1.A0I()
            if (r4 == 0) goto L_0x006a
            if (r7 == 0) goto L_0x02b7
            r3 = 1
            X.ADE r2 = new X.ADE
            r2.<init>()
            r2.A00 = r3
            r7.A00 = r2
        L_0x02b7:
            X.1iW r10 = r0.A00
            long r6 = r1.A0x
            X.118 r3 = r0.A02
            r2 = 2131890459(0x7f12111b, float:1.941561E38)
            java.lang.String r9 = r3.A01(r2)
            java.lang.String r11 = X.AnonymousClass8BU.A0s(r5)
            java.lang.String r5 = "form_message"
            X.1PP r2 = r10.A0x
            X.205 r4 = X.C17880vN.A0Z(r4, r2)
            X.11P r2 = r10.A0K
            long r2 = X.AnonymousClass11P.A01(r2)
            X.21g r8 = new X.21g
            r8.<init>(r4, r2)
            X.00H r2 = r10.A1L
            X.206 r3 = X.AnonymousClass1W2.A02(r2, r6)
            if (r3 == 0) goto L_0x02e8
            X.1R0 r2 = r10.A10
            r2.A00(r8, r3)
        L_0x02e8:
            r2 = 0
            X.AE2 r4 = new X.AE2
            r4.<init>(r2, r5, r11)
            X.9Je r3 = X.AnonymousClass9Je.EXTENSIONS_1
            X.AEb r2 = new X.AEb
            r2.<init>(r3, r4, r9)
            r8.A00 = r2
            X.122 r2 = r10.A0U
            r2.BBM(r8)
            X.00H r2 = r0.A05
            java.lang.Object r4 = r2.get()
            X.9lB r4 = (X.C190579lB) r4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "{\"cta\":\""
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = "\"}"
            java.lang.String r7 = X.AnonymousClass000.A0y(r2, r3)
            r11 = 1
            r5 = 0
            r9 = 0
            r10 = 4
            r8 = r5
            r6 = r5
            r12 = r11
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            X.10I r4 = r0.A04
            r3 = 16
            X.4ra r2 = new X.4ra
            r2.<init>(r1, r0, r3)
            r4.CGF(r2)
            return
        L_0x032d:
            java.util.Iterator r4 = r3.iterator()
        L_0x0331:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x02a5
            java.lang.Object r3 = r4.next()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r2 = X.C18070vi.A18(r3, r2)
            if (r2 == 0) goto L_0x0331
            X.6bI r2 = r0.A01
            X.118 r1 = r0.A02
            r0 = 2131889597(0x7f120dbd, float:1.9413862E38)
            java.lang.String r1 = X.C18070vi.A0G(r1, r0)
            X.1KB r0 = r2.A00
            r0.A0H(r1, r6)
            return
        L_0x0356:
            boolean r3 = r0 instanceof X.C169988nu
            if (r3 == 0) goto L_0x03b1
            X.8nu r0 = (X.C169988nu) r0
            r4 = 0
            X.AnonymousClass8BX.A1J(r2, r1, r5, r4)
            java.lang.String r3 = r5.A00
            java.lang.String r3 = X.C169988nu.A00(r0, r3)
            if (r3 == 0) goto L_0x0593
            boolean r3 = X.AnonymousClass1YF.A0T(r3)
            if (r3 != 0) goto L_0x0593
            X.8qk r7 = new X.8qk
            r7.<init>()
            r6 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r7.A00 = r3
            r7.A01 = r3
            X.18K r4 = r0.A02
            X.0vt r3 = new X.0vt
            r3.<init>(r6, r6)
            r4.CC0(r7, r3, r6)
            com.whatsapp.jid.UserJid r6 = r1.A0I()
            if (r6 == 0) goto L_0x0398
            X.00H r3 = r0.A03
            java.lang.Object r4 = r3.get()
            X.A5M r4 = (X.A5M) r4
            r3 = 2
            r4.A02(r6, r1, r3)
        L_0x0398:
            X.1L9 r4 = r0.A00
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "tel:"
            r3.append(r1)
            java.lang.String r1 = r5.A00
            java.lang.String r0 = X.C169988nu.A00(r0, r1)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)
            X.AnonymousClass8BV.A13(r2, r4, r0)
            return
        L_0x03b1:
            boolean r3 = r0 instanceof X.C169938np
            if (r3 == 0) goto L_0x0410
            X.8np r0 = (X.C169938np) r0
            r3 = 0
            X.AnonymousClass8BX.A1J(r2, r1, r5, r3)
            boolean r3 = r1 instanceof X.AnonymousClass21K
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = r5.A00
            if (r3 == 0) goto L_0x03cf
            org.json.JSONObject r4 = X.C17880vN.A16(r3)
            java.lang.String r3 = "copy_code"
            java.lang.String r4 = r4.optString(r3)
            if (r4 != 0) goto L_0x03d1
        L_0x03cf:
            java.lang.String r4 = ""
        L_0x03d1:
            X.00H r3 = r0.A02
            java.lang.Object r3 = r3.get()
            X.6tZ r3 = (X.C136286tZ) r3
            r3.A01(r4)
            java.lang.String r3 = X.C20120A8f.A04(r1)
            boolean r3 = X.AnonymousClass1EG.A0H(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x03f4
            X.10I r5 = r0.A00
            r4 = 40
            X.Akb r3 = new X.Akb
            r3.<init>((java.lang.Object) r0, (int) r11, (int) r4, (java.lang.Object) r1)
            r5.CGF(r3)
        L_0x03f4:
            com.whatsapp.jid.UserJid r4 = r1.A0I()
            if (r4 == 0) goto L_0x0406
            X.00H r0 = r0.A01
            java.lang.Object r3 = r0.get()
            X.A5M r3 = (X.A5M) r3
            r0 = 3
            r3.A02(r4, r1, r0)
        L_0x0406:
            X.5cS r0 = X.C88404Zo.A01(r2)
            if (r0 == 0) goto L_0x006a
            r0.CDo()
            return
        L_0x0410:
            boolean r3 = r0 instanceof X.C169888nj
            if (r3 == 0) goto L_0x0485
            X.8nj r0 = (X.C169888nj) r0
            X.C18070vi.A0i(r2, r1)
            X.0ve r7 = r0.A01
            r6 = 8355(0x20a3, float:1.1708E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r5, r7, r6)
            if (r3 == 0) goto L_0x006a
            r4 = r1
            boolean r3 = X.C18020vd.A05(r5, r7, r6)
            if (r3 == 0) goto L_0x045f
            boolean r3 = r1 instanceof X.C438521e
            if (r3 != 0) goto L_0x0434
            boolean r3 = r1 instanceof X.C438121a
            if (r3 == 0) goto L_0x045f
        L_0x0434:
            X.AEt r3 = X.AnonymousClass8BR.A0g(r4)
            if (r3 == 0) goto L_0x006a
            X.AEn r6 = r3.A02
            if (r6 == 0) goto L_0x006a
            X.10I r5 = r0.A05
            r4 = 23
            X.4rb r3 = new X.4rb
            r3.<init>(r0, r1, r6, r4)
            r5.CGF(r3)
            X.1KB r4 = r0.A00
            r18 = 8
            X.7Q7 r3 = new X.7Q7
            r12 = r3
            r13 = r0
            r14 = r1
            r15 = r6
            r16 = r2
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r4.CGP(r3)
            return
        L_0x045f:
            boolean r3 = r1 instanceof X.AnonymousClass21Z
            if (r3 == 0) goto L_0x006a
            X.205 r5 = r1.A0v
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.util.CarouselMessageKeyWrapper"
            X.C18070vi.A0z(r5, r3)
            X.2M2 r5 = (X.AnonymousClass2M2) r5
            X.21Z r4 = (X.AnonymousClass21Z) r4
            X.21L r3 = r4.BOM()
            if (r3 == 0) goto L_0x006a
            java.util.List r4 = r3.A17()
            if (r4 == 0) goto L_0x006a
            int r3 = r5.A00
            java.lang.Object r4 = r4.get(r3)
            X.206 r4 = (X.AnonymousClass206) r4
            if (r4 == 0) goto L_0x006a
            goto L_0x0434
        L_0x0485:
            boolean r3 = r0 instanceof X.C169978nt
            if (r3 == 0) goto L_0x006a
            X.8nt r0 = (X.C169978nt) r0
            r4 = 0
            X.AnonymousClass8BX.A1J(r2, r1, r5, r4)
            java.lang.String r3 = r5.A00
            java.lang.String r5 = X.C169978nt.A00(r0, r3)
            if (r5 == 0) goto L_0x059a
            boolean r3 = X.AnonymousClass1YF.A0T(r5)
            if (r3 != 0) goto L_0x059a
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "c/"
            java.lang.String r3 = X.AnonymousClass001.A1H(r3, r5, r4)
            X.2pH r3 = X.C61192pH.A00(r3)
            android.net.Uri r3 = r3.A00
            java.lang.String r3 = r3.toString()
            android.net.Uri r6 = android.net.Uri.parse(r3)
            X.0vl r3 = r0.A02
            java.lang.Object r4 = r3.getValue()
            X.1nl r4 = (X.C36361nl) r4
            r3 = 0
            r4.CGU(r2, r6, r3)
            X.0vl r2 = r0.A00
            java.lang.Object r4 = r2.getValue()
            X.0vd r4 = (X.C18020vd) r4
            r3 = 3754(0xeaa, float:5.26E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x006a
            X.0vl r0 = r0.A03
            java.lang.Object r3 = r0.getValue()
            X.9ea r3 = (X.C186679ea) r3
            X.205 r2 = r1.A0v
            X.C18070vi.A0W(r2)
            X.10I r1 = r3.A00
            r0 = 15
            X.C21467AkY.A00(r1, r3, r2, r5, r0)
            return
        L_0x04e8:
            X.0vl r3 = r0.A01
            java.lang.Object r7 = r3.getValue()
            X.A8Q r7 = (X.A8Q) r7
            X.C18070vi.A0X(r7)
            r4 = 0
            r3 = 3
            r7.A08(r3, r4, r4)
            X.0vl r3 = r0.A04
            java.lang.Object r3 = r3.getValue()
            X.11S r3 = (X.AnonymousClass11S) r3
            boolean r15 = r3.A0O(r5)
            java.lang.String r3 = r1.A06
            X.0vl r1 = r0.A02
            java.lang.Object r1 = r1.getValue()
            X.9tU r1 = (X.C195529tU) r1
            X.0vl r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.A0o r0 = (X.C19957A0o) r0
            r14 = 1
            r12 = r4
            r7 = r2
            r8 = r1
            r9 = r0
            r10 = r5
            r11 = r4
            r13 = r3
            r16 = r15
            r17 = r6
            X.C20057A5g.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0526:
            r5.A0F = r9
            java.lang.String r3 = "title"
            java.lang.String r3 = r7.getString(r3)
            r5.A0A = r3
            X.5cS r4 = X.C88404Zo.A01(r2)
            if (r4 == 0) goto L_0x0540
            r3 = 1
            X.4lq r2 = new X.4lq
            r2.<init>(r0, r4, r1, r3)
            r4.CAz(r2, r5)
            return
        L_0x0540:
            java.lang.String r0 = "SingleSelectAction/execute/error: not a click in Conversation"
            goto L_0x0545
        L_0x0543:
            java.lang.String r0 = "QuickReplyAction/executeTemplateAction/error: not clicked in Conversation activity"
        L_0x0545:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0549:
            X.1PP r3 = r0.A02
            X.205 r2 = r1.A0v
            X.1BI r2 = r2.A00
            X.205 r4 = X.C17880vN.A0Z(r2, r3)
            X.11P r2 = r0.A00
            long r2 = X.AnonymousClass11P.A01(r2)
            X.21g r7 = new X.21g
            r7.<init>(r4, r2)
            X.1R0 r2 = r0.A03
            r2.A00(r7, r1)
            java.lang.String r4 = "id"
            java.lang.String r3 = r5.optString(r4)
            org.json.JSONObject r2 = X.C17880vN.A15()
            org.json.JSONObject r3 = r2.put(r4, r3)
            java.lang.String r2 = "title"
            java.lang.String r6 = X.C18070vi.A0J(r2, r5)
            java.lang.String r5 = "menu_options"
            java.lang.String r2 = r3.toString()
            r4 = 0
            X.AE2 r3 = new X.AE2
            r3.<init>(r4, r5, r2)
            X.AEb r2 = new X.AEb
            r2.<init>(r4, r3, r6)
            r7.A00 = r2
            X.122 r2 = r0.A01
            r2.BBM(r7)
            X.C169908nl.A00(r0, r1, r11)
            return
        L_0x0593:
            X.190 r2 = r0.A01
            java.lang.String r1 = "number in params json is INVALID but it pass VALID check"
            java.lang.String r0 = "LandLineCallAction/execute"
            goto L_0x05d3
        L_0x059a:
            X.0vl r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "malformed phone="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " passed through ViewCatalogAction::isValid"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "AutomatedGreetingMessageViewCatalogAction/execute"
            goto L_0x05d3
        L_0x05b7:
            X.0vl r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            X.190 r2 = (X.AnonymousClass190) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "malformed phone="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " passed through ViewCatalogAction::isValid"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "ViewCatalogAction/execute"
        L_0x05d3:
            r2.A0G(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196289ul.A0A(android.app.Activity, X.5XY, X.206, X.AEe, int):void");
    }

    public void A0B(Activity activity, AnonymousClass5XY r5, AnonymousClass206 r6, C20271AEe aEe, Class cls) {
        if (this instanceof AnonymousClass8nz) {
            return;
        }
        if (this instanceof C169998nv) {
            C18070vi.A0d(activity, 0);
            C18070vi.A0j(aEe, r6);
            A0A(activity, r5, r6, aEe, 0);
        } else if (this instanceof C169928nn) {
            C18070vi.A0h(activity, aEe);
            C18070vi.A0d(cls, 3);
            Intent A07 = AnonymousClass8BR.A07(activity, cls);
            C17960vV.A07(aEe);
            A07.putExtra("screen_name", "brpay_p_pin_change_verify");
            activity.startActivity(A07);
        } else if (this instanceof C169948nq) {
            C18070vi.A0d(activity, 0);
            C18070vi.A0j(aEe, r6);
            A0A(activity, r5, r6, aEe, 0);
        } else if (this instanceof C169968ns) {
            throw C17880vN.A0y();
        } else if (this instanceof C169958nr) {
            throw C17880vN.A0y();
        } else if (this instanceof C169918nm) {
            throw C17880vN.A0y();
        } else if (this instanceof C169988nu) {
            C18070vi.A0d(activity, 0);
            C18070vi.A0j(aEe, r6);
            A0A(activity, r5, r6, aEe, 0);
        } else if (this instanceof C169938np) {
            throw C17880vN.A0y();
        } else if (!(this instanceof AnonymousClass8no)) {
            C18070vi.A0d(activity, 0);
            C18070vi.A0j(aEe, r6);
            A0A(activity, r5, r6, aEe, 0);
        }
    }

    public void A0D(AnonymousClass206 r6, C20271AEe aEe, String str, JSONObject jSONObject) {
        AnonymousClass21K r1;
        C20285AEt BPK;
        C20242ADa aDa;
        AnonymousClass21K r62;
        C20285AEt BPK2;
        C20277AEk aEk;
        C20253ADl aDl;
        AnonymousClass21K r12;
        C20285AEt BPK3;
        C20242ADa aDa2;
        if (this instanceof C170018ny) {
            jSONObject.put("flow_id", A3M.A01(aEe.A00).get("flow_id"));
            A4O a4o = A4O.A00;
            String str2 = r6.A0v.A01;
            C18070vi.A0X(str2);
            jSONObject.put("extensions_message_id", a4o.A01((C196109uT) C18070vi.A0E(((C170018ny) this).A0K), str2, false));
            String A0Y = AnonymousClass8BY.A0Y(str);
            C18070vi.A0X(A0Y);
            jSONObject.put("session_id", A0Y);
        } else if (this instanceof C169908nl) {
            AnonymousClass206 A00 = C20120A8f.A00(r6);
            String str3 = null;
            if (!(!(A00 instanceof AnonymousClass21K) || (r12 = (AnonymousClass21K) A00) == null || (BPK3 = r12.BPK()) == null || (aDa2 = BPK3.A04) == null)) {
                jSONObject.put("num_cards", AnonymousClass8BT.A0l(aDa2.A00).intValue());
            }
            if ((r6 instanceof AnonymousClass21K) && (r62 = (AnonymousClass21K) r6) != null && (BPK2 = r62.BPK()) != null && (aEk = BPK2.A06) != null) {
                List list = aEk.A03;
                if (list.size() > 0) {
                    Object obj = list.get(0);
                    if ((obj instanceof C20253ADl) && (aDl = (C20253ADl) obj) != null) {
                        str3 = aDl.A01.A02;
                    }
                    if (C18070vi.A18(str3, "review_and_pay_v2")) {
                        jSONObject.put("has_payments_cta", true);
                    }
                }
            }
        } else if (this instanceof C169888nj) {
            AnonymousClass206 A002 = C20120A8f.A00(r6);
            if ((A002 instanceof AnonymousClass21K) && (r1 = (AnonymousClass21K) A002) != null && (BPK = r1.BPK()) != null && (aDa = BPK.A04) != null) {
                jSONObject.put("num_cards", AnonymousClass8BT.A0l(aDa.A00).intValue());
            }
        }
    }

    public boolean A0E(C18030ve r3) {
        if (this instanceof C170018ny) {
            C18070vi.A0d(r3, 1);
            return C18020vd.A05(C18040vf.A02, r3, 2885);
        } else if (this instanceof C169998nv) {
            C18070vi.A0d(r3, 1);
            return !C18020vd.A05(C18040vf.A02, r3, 3921);
        } else if (this instanceof C169948nq) {
            C18070vi.A0d(r3, 1);
            return !C18020vd.A05(C18040vf.A02, r3, 7408);
        } else if (this instanceof C169908nl) {
            return A03(r3);
        } else {
            if (this instanceof C169968ns) {
                return A03(r3);
            }
            if (this instanceof C169938np) {
                return A03(r3);
            }
            if (!(this instanceof C169978nt)) {
                return false;
            }
            C18070vi.A0d(r3, 1);
            return !C18020vd.A05(C18040vf.A02, r3, 10399);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (r0 == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(X.C18030ve r5, X.C166418cr r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C169998nv
            if (r0 == 0) goto L_0x0013
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r1 = 3457(0xd81, float:4.844E-42)
        L_0x000a:
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            r0 = r0 ^ 1
            return r0
        L_0x0013:
            boolean r0 = r4 instanceof X.C169948nq
            if (r0 == 0) goto L_0x001e
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r1 = 7408(0x1cf0, float:1.0381E-41)
            goto L_0x000a
        L_0x001e:
            boolean r0 = r4 instanceof X.C169968ns
            if (r0 == 0) goto L_0x0027
            boolean r0 = A03(r5)
            return r0
        L_0x0027:
            boolean r0 = r4 instanceof X.C169958nr
            if (r0 == 0) goto L_0x0038
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r1 = 5124(0x1404, float:7.18E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            return r0
        L_0x0038:
            boolean r0 = r4 instanceof X.C169918nm
            if (r0 == 0) goto L_0x0083
            r0 = r4
            X.8nm r0 = (X.C169918nm) r0
            boolean r0 = r0 instanceof X.C169908nl
            if (r0 == 0) goto L_0x007e
            boolean r2 = X.C18070vi.A15(r6, r5)
            boolean r0 = X.A89.A05(r6)
            if (r0 == 0) goto L_0x007b
            X.8cp r0 = X.A89.A00(r6)
            int r1 = r0.interactiveMessageCase_
            r0 = 6
            if (r1 != r0) goto L_0x007b
            X.8cp r0 = X.A89.A00(r6)
            X.8a7 r0 = r0.A0S()
            X.EE9 r0 = r0.buttons_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x007b
            X.8cp r0 = X.A89.A00(r6)
            java.lang.String r1 = X.AnonymousClass8BX.A0b(r0, r2)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "display_text"
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r2)
            r1 = 4001(0xfa1, float:5.607E-42)
            if (r0 != 0) goto L_0x000a
        L_0x007b:
            r1 = 2960(0xb90, float:4.148E-42)
            goto L_0x000a
        L_0x007e:
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            goto L_0x007b
        L_0x0083:
            boolean r0 = r4 instanceof X.C169988nu
            if (r0 == 0) goto L_0x008f
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r1 = 4037(0xfc5, float:5.657E-42)
            goto L_0x000a
        L_0x008f:
            boolean r0 = r4 instanceof X.C169938np
            if (r0 == 0) goto L_0x0098
            boolean r0 = A03(r5)
            return r0
        L_0x0098:
            boolean r0 = r4 instanceof X.C169978nt
            if (r0 == 0) goto L_0x00a4
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r1 = 10399(0x289f, float:1.4572E-41)
            goto L_0x000a
        L_0x00a4:
            boolean r0 = r4 instanceof X.C170018ny
            if (r0 == 0) goto L_0x00f6
            boolean r2 = X.C18070vi.A15(r6, r5)
            r1 = 1694(0x69e, float:2.374E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 != 0) goto L_0x00f4
            X.8cp r0 = X.A89.A00(r6)
            java.lang.String r0 = X.AnonymousClass8BX.A0b(r0, r2)
            java.util.HashMap r0 = X.A3M.A01(r0)
            java.lang.String r1 = X.AnonymousClass9Q6.A00(r0)
            if (r1 == 0) goto L_0x00f4
            java.lang.String r0 = "2.24.24.78"
            X.2nG r3 = X.C49982Sr.A00(r0)
            r0 = 2306(0x902, float:3.231E-42)
            java.lang.String r0 = X.C108955ca.A0v(r5, r0)
            r2 = 0
            org.json.JSONObject r0 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x00e9 }
            org.json.JSONObject r1 = r0.optJSONObject(r1)     // Catch:{ JSONException -> 0x00e9 }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r0 = "min_android_app_supported_version"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x00e9 }
            X.2nG r2 = X.C49982Sr.A00(r0)     // Catch:{ JSONException -> 0x00e9 }
        L_0x00e9:
            if (r3 == 0) goto L_0x00f4
            if (r2 == 0) goto L_0x00f4
            int r0 = r3.A00(r2)
            r1 = 0
            if (r0 >= 0) goto L_0x00f5
        L_0x00f4:
            r1 = 1
        L_0x00f5:
            return r1
        L_0x00f6:
            boolean r0 = r4 instanceof X.AnonymousClass8nx
            if (r0 == 0) goto L_0x0107
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            r1 = 1538(0x602, float:2.155E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            return r0
        L_0x0107:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196289ul.A0F(X.0ve, X.8cr):boolean");
    }
}
