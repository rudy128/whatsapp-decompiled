package X;

import android.util.Base64;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A2e  reason: case insensitive filesystem */
public final class C19991A2e {
    public AnonymousClass1QD A00;
    public AnonymousClass00H A01;
    public final C18030ve A02;
    public final C25241Nl A03;
    public final C185059bx A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public static final String A00(AnonymousClass1BI r1) {
        Integer num;
        C18070vi.A0d(r1, 0);
        if (C22971Dz.A0e(r1)) {
            num = AnonymousClass00R.A01;
        } else if (C22971Dz.A0O(r1)) {
            num = AnonymousClass00R.A0C;
        } else if (C22971Dz.A0V(r1)) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A00;
        }
        switch (num.intValue()) {
            case 0:
                return "individual";
            case 1:
                return "group";
            case 2:
                return "broadcast";
            default:
                return "newsletter";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r13.A02, 11966) != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.whatsapp.jid.Jid r14, java.lang.Boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20) {
        /*
            r13 = this;
            r11 = r17
            r9 = r16
            java.lang.String r0 = "link_preview"
            r6 = r18
            boolean r3 = r6.equals(r0)
            r7 = r13
            if (r3 != 0) goto L_0x0024
            java.lang.String r0 = "link"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0023
            X.0ve r2 = r13.A02
            r1 = 11856(0x2e50, float:1.6614E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x0050
            java.lang.String r0 = "link"
            boolean r4 = r6.equals(r0)     // Catch:{ JSONException -> 0x007a }
            if (r4 == 0) goto L_0x003d
            X.0ve r2 = r13.A02     // Catch:{ JSONException -> 0x007a }
            r1 = 11908(0x2e84, float:1.6687E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x007a }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ JSONException -> 0x007a }
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r3 = 0
            if (r0 != 0) goto L_0x0042
            r9 = r3
        L_0x0042:
            if (r4 == 0) goto L_0x0077
            X.0ve r2 = r13.A02     // Catch:{ JSONException -> 0x007a }
            r1 = 11966(0x2ebe, float:1.6768E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ JSONException -> 0x007a }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ JSONException -> 0x007a }
            if (r0 == 0) goto L_0x0077
        L_0x0050:
            r8 = r15
            r10 = r19
            r12 = r5
            r7.A04(r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r0 = "interaction_component"
            r5.put(r0, r6)     // Catch:{ JSONException -> 0x007a }
            X.00H r0 = r13.A05     // Catch:{ JSONException -> 0x007a }
            java.lang.Object r0 = r0.get()     // Catch:{ JSONException -> 0x007a }
            X.9lB r0 = (X.C190579lB) r0     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = r5.toString()     // Catch:{ JSONException -> 0x007a }
            java.lang.Integer r2 = X.C17880vN.A0i()     // Catch:{ JSONException -> 0x007a }
            r8 = 1
            r4 = 0
            r5 = 5
            r6 = 0
            r1 = r14
            r7 = r20
            r0.A00(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x007a }
            goto L_0x0079
        L_0x0077:
            r11 = r3
            goto L_0x0050
        L_0x0079:
            return
        L_0x007a:
            java.lang.String r0 = "PaymentLinksWamStatistic/logPaymentLinksClickEvent failed to construct message class attributes"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19991A2e.A03(com.whatsapp.jid.Jid, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final void A04(Boolean bool, String str, String str2, String str3, JSONObject jSONObject) {
        jSONObject.put("cta", "payment_link");
        jSONObject.put("p2m_flow", C108975cc.A0e("payment_link"));
        jSONObject.put("referral", "chat");
        if (str != null) {
            jSONObject.put("payment_provider", str);
        }
        if (str3 != null) {
            jSONObject.put("funnel_id", str3);
        }
        if (str2 != null) {
            jSONObject.put("chat_type", str2);
        }
        if (C18020vd.A05(C18040vf.A02, this.A02, 12571) && bool != null) {
            jSONObject.put("is_ctwa_originated", bool.booleanValue());
        }
    }

    public C19991A2e(C18030ve r1, C25241Nl r2, AnonymousClass1QD r3, C185059bx r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r1, r5, r3, r6, r7);
        C18070vi.A0l(r2, r4);
        this.A02 = r1;
        this.A01 = r5;
        this.A00 = r3;
        this.A06 = r6;
        this.A05 = r7;
        this.A03 = r2;
        this.A04 = r4;
    }

    public final String A01(String str, String str2) {
        C18070vi.A0h(str, str2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(Base64.encodeToString(this.A03.A08(), 2));
        String A0y = AnonymousClass000.A0y("receiver_log_key", A10);
        try {
            String A0A = C17900vP.A0A(str, str2);
            String str3 = C19620yd.A0A;
            C18070vi.A0Z(str3);
            byte[] A002 = AnonymousClass9QC.A00(AnonymousClass8BX.A1a(str3, A0A), AnonymousClass8BX.A1a(str3, A0y));
            C18070vi.A0X(A002);
            String encodeToString = Base64.encodeToString(A002, 2);
            C18070vi.A0X(encodeToString);
            return encodeToString;
        } catch (Exception e) {
            Log.e("PaymentLinksWamLogger/getHashOfMessageIdAndReceiverJid failed to generate hash", e);
            return "";
        }
    }

    public final void A02(Jid jid, Boolean bool, String str, String str2, String str3, int i, int i2) {
        try {
            JSONObject A15 = C17880vN.A15();
            A04(bool, str, str3, str2, A15);
            C186739eg r2 = (C186739eg) this.A06.get();
            String obj = A15.toString();
            r2.A03.CGF(new C21443AkA(r2, jid, Integer.valueOf(i2), (Integer) null, obj, (String) null, (String) null, 0, i));
        } catch (JSONException unused) {
            Log.e("PaymentLinksWamStatistic/logPaymentLinksReceiveEvent failed to construct message class attributes");
        }
    }
}
