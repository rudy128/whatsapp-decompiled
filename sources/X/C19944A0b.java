package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A0b  reason: case insensitive filesystem */
public class C19944A0b {
    public final AnonymousClass118 A00;

    public C19944A0b(AnonymousClass118 r1) {
        this.A00 = r1;
    }

    public static boolean A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C21347Aib) it.next()).A0C) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        r1 = X.C17880vN.A0q(r4, r8.A04, new java.lang.Object[1], 0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        r0 = X.AnonymousClass8BR.A0B(r3, r1);
        r7 = (java.lang.String) r0.A00;
        r4 = r0.A01;
        r5.put("card_verify_otp_type", r2);
        r1 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0103, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        r5.put("card_verify_otp_receiver_info", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010a, code lost:
        r5.put("card_verify_otp_resend_interval_sec", java.lang.String.valueOf(r8.A01));
        r9 = r8.A00;
        r5.put("otp_length", java.lang.String.valueOf(r9));
        r2 = X.AnonymousClass000.A10();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012a, code lost:
        if (r1 >= r9) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012c, code lost:
        r2.append("#  ");
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0134, code lost:
        r5.put("otp_mask", r2.toString().trim());
        r5.put("card_verify_method_disabled_state", r8.A0C);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONArray A01(java.util.List r17) {
        /*
            r16 = this;
            org.json.JSONArray r6 = X.AnonymousClass8BR.A1A()     // Catch:{ JSONException -> 0x01bd }
            java.util.Iterator r15 = r17.iterator()     // Catch:{ JSONException -> 0x01bd }
        L_0x0008:
            boolean r0 = r15.hasNext()     // Catch:{ JSONException -> 0x01bd }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r8 = r15.next()     // Catch:{ JSONException -> 0x01bd }
            X.Aib r8 = (X.C21347Aib) r8     // Catch:{ JSONException -> 0x01bd }
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r1 = "card_verify_identifier"
            java.lang.String r0 = r8.A03     // Catch:{ JSONException -> 0x01bd }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "card_verify_type"
            java.lang.String r4 = r8.A0B     // Catch:{ JSONException -> 0x01bd }
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x01bd }
            X.C17960vV.A07(r4)     // Catch:{ JSONException -> 0x01bd }
            int r2 = r4.hashCode()     // Catch:{ JSONException -> 0x01bd }
            r0 = -1302107194(0xffffffffb2636bc6, float:-1.3237644E-8)
            r3 = 2
            r9 = 0
            r1 = 1
            if (r2 == r0) goto L_0x004f
            r0 = -119226117(0xfffffffff8e4c0fb, float:-3.711743E34)
            if (r2 == r0) goto L_0x0047
            r0 = 110379(0x1af2b, float:1.54674E-40)
            if (r2 != r0) goto L_0x0058
            java.lang.String r0 = "otp"
            boolean r0 = r4.equals(r0)     // Catch:{ JSONException -> 0x01bd }
            r2 = 0
            goto L_0x0056
        L_0x0047:
            java.lang.String r0 = "app-to-app"
            boolean r0 = r4.equals(r0)     // Catch:{ JSONException -> 0x01bd }
            r2 = 2
            goto L_0x0056
        L_0x004f:
            java.lang.String r0 = "customer-service"
            boolean r0 = r4.equals(r0)     // Catch:{ JSONException -> 0x01bd }
            r2 = 1
        L_0x0056:
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            r2 = -1
        L_0x0059:
            java.lang.String r10 = "card_verify_method_disabled_state"
            r0 = r16
            if (r2 == 0) goto L_0x0087
            if (r2 == r1) goto L_0x0068
            if (r2 == r3) goto L_0x0145
            java.lang.String r7 = ""
            r4 = r7
            goto L_0x0196
        L_0x0068:
            X.118 r4 = r0.A00     // Catch:{ JSONException -> 0x01bd }
            r0 = 2131887428(0x7f120544, float:1.9409463E38)
            java.lang.String r7 = r4.A01(r0)     // Catch:{ JSONException -> 0x01bd }
            r3 = 2131887427(0x7f120543, float:1.940946E38)
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r1 = r8.A0A     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = X.AnonymousClass9RO.A00(r1)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r4 = X.AnonymousClass8BS.A0f(r4, r0, r2, r9, r3)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "support_phone_number"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x01bd }
            goto L_0x0196
        L_0x0087:
            X.118 r0 = r0.A00     // Catch:{ JSONException -> 0x01bd }
            android.content.Context r4 = r0.A00     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r3 = ""
            java.lang.String r2 = r8.A05     // Catch:{ JSONException -> 0x01bd }
            int r0 = r2.hashCode()     // Catch:{ JSONException -> 0x01bd }
            switch(r0) {
                case 82233: goto L_0x00d4;
                case 2467610: goto L_0x00bd;
                case 66081660: goto L_0x00aa;
                case 81425707: goto L_0x0098;
                default: goto L_0x0096;
            }     // Catch:{ JSONException -> 0x01bd }
        L_0x0096:
            goto L_0x0128
        L_0x0098:
            java.lang.String r0 = "VACAT"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01bd }
            if (r0 == 0) goto L_0x0128
            r0 = 2131887434(0x7f12054a, float:1.9409475E38)
            java.lang.String r0 = r4.getString(r0)     // Catch:{ JSONException -> 0x01bd }
            r1 = r3
            r3 = r0
            goto L_0x00ee
        L_0x00aa:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01bd }
            if (r0 == 0) goto L_0x0128
            r0 = 2131887432(0x7f120548, float:1.940947E38)
            java.lang.String r3 = r4.getString(r0)     // Catch:{ JSONException -> 0x01bd }
            r7 = 2131887431(0x7f120547, float:1.9409469E38)
            goto L_0x00e6
        L_0x00bd:
            java.lang.String r0 = "PUSH"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01bd }
            if (r0 == 0) goto L_0x0128
            r0 = 2131887430(0x7f120546, float:1.9409467E38)
            java.lang.String r3 = r4.getString(r0)     // Catch:{ JSONException -> 0x01bd }
            r0 = 2131887429(0x7f120545, float:1.9409465E38)
            java.lang.String r1 = r4.getString(r0)     // Catch:{ JSONException -> 0x01bd }
            goto L_0x00ee
        L_0x00d4:
            java.lang.String r0 = "SMS"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x01bd }
            if (r0 == 0) goto L_0x0128
            r0 = 2131887434(0x7f12054a, float:1.9409475E38)
            java.lang.String r3 = r4.getString(r0)     // Catch:{ JSONException -> 0x01bd }
            r7 = 2131887433(0x7f120549, float:1.9409473E38)
        L_0x00e6:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = r8.A04     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r1 = X.C17880vN.A0q(r4, r0, r1, r9, r7)     // Catch:{ JSONException -> 0x01bd }
        L_0x00ee:
            X.0yx r0 = X.AnonymousClass8BR.A0B(r3, r1)     // Catch:{ JSONException -> 0x01bd }
            java.lang.Object r7 = r0.A00     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x01bd }
            java.lang.Object r4 = r0.A01     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "card_verify_otp_type"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r1 = r8.A04     // Catch:{ JSONException -> 0x01bd }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x01bd }
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "card_verify_otp_receiver_info"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x01bd }
        L_0x010a:
            java.lang.String r1 = "card_verify_otp_resend_interval_sec"
            int r0 = r8.A01     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x01bd }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r1 = "otp_length"
            int r9 = r8.A00     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ JSONException -> 0x01bd }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r3 = "otp_mask"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x01bd }
            r1 = 0
            goto L_0x012a
        L_0x0128:
            r1 = r3
            goto L_0x00ee
        L_0x012a:
            if (r1 >= r9) goto L_0x0134
            java.lang.String r0 = "#  "
            r2.append(r0)     // Catch:{ JSONException -> 0x01bd }
            int r1 = r1 + 1
            goto L_0x012a
        L_0x0134:
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = r0.trim()     // Catch:{ JSONException -> 0x01bd }
            r5.put(r3, r0)     // Catch:{ JSONException -> 0x01bd }
            boolean r0 = r8.A0C     // Catch:{ JSONException -> 0x01bd }
            r5.put(r10, r0)     // Catch:{ JSONException -> 0x01bd }
            goto L_0x0196
        L_0x0145:
            java.lang.String r11 = r8.A07     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r3 = r8.A08     // Catch:{ JSONException -> 0x01bd }
            X.0yx r2 = X.C196809vg.A00(r11, r3)     // Catch:{ JSONException -> 0x01bd }
            X.118 r12 = r0.A00     // Catch:{ JSONException -> 0x01bd }
            r0 = 2131887426(0x7f120542, float:1.9409459E38)
            java.lang.String r7 = r12.A01(r0)     // Catch:{ JSONException -> 0x01bd }
            if (r2 == 0) goto L_0x01ab
            java.lang.Object r14 = r2.A00     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ JSONException -> 0x01bd }
            java.lang.Object r13 = r2.A01     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r4 = r8.A09     // Catch:{ JSONException -> 0x01bd }
            android.content.Intent r2 = X.C17880vN.A0A()     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "android.intent.extra.TEXT"
            r2.putExtra(r0, r4)     // Catch:{ JSONException -> 0x01bd }
            r2.setPackage(r14)     // Catch:{ JSONException -> 0x01bd }
            r2.setAction(r13)     // Catch:{ JSONException -> 0x01bd }
            android.content.Context r0 = r12.A00     // Catch:{ JSONException -> 0x01bd }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ JSONException -> 0x01bd }
            android.content.ComponentName r0 = r2.resolveActivity(r0)     // Catch:{ JSONException -> 0x01bd }
            if (r0 == 0) goto L_0x01ab
            java.lang.String r4 = r8.A06     // Catch:{ JSONException -> 0x01bd }
            r2 = r4
        L_0x0180:
            java.lang.String r1 = "app_to_app_request_payload"
            java.lang.String r0 = r8.A09     // Catch:{ JSONException -> 0x01bd }
            r5.put(r1, r0)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "app_to_app_partner_app_package"
            r5.put(r0, r11)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "app_to_app_partner_app_name"
            r5.put(r0, r2)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "app_to_app_partner_intent_action"
            r5.put(r0, r3)     // Catch:{ JSONException -> 0x01bd }
        L_0x0196:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x01bd }
            if (r0 != 0) goto L_0x01a6
            java.lang.String r0 = "card_verify_method_title"
            r5.put(r0, r7)     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r0 = "card_verify_method_description"
            r5.put(r0, r4)     // Catch:{ JSONException -> 0x01bd }
        L_0x01a6:
            r6.put(r5)     // Catch:{ JSONException -> 0x01bd }
            goto L_0x0008
        L_0x01ab:
            r5.put(r10, r1)     // Catch:{ JSONException -> 0x01bd }
            r8.A0C = r1     // Catch:{ JSONException -> 0x01bd }
            r4 = 2131887425(0x7f120541, float:1.9409457E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r2 = r8.A06     // Catch:{ JSONException -> 0x01bd }
            java.lang.String r4 = X.AnonymousClass8BS.A0f(r12, r2, r0, r9, r4)     // Catch:{ JSONException -> 0x01bd }
            goto L_0x0180
        L_0x01bc:
            return r6
        L_0x01bd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: BrazilPayBloksActivity cardVerifyMethodsToJsonArray: "
            X.C17900vP.A0X(r2, r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19944A0b.A01(java.util.List):org.json.JSONArray");
    }

    public JSONObject A02(List list) {
        try {
            JSONObject A15 = C17880vN.A15();
            JSONArray A1A = AnonymousClass8BR.A1A();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8pY r5 = (AnonymousClass8pY) it.next();
                AnonymousClass8pK r6 = (AnonymousClass8pK) r5.A08();
                JSONObject A152 = C17880vN.A15();
                A152.put("credential_id", r5.A0H);
                if (r6 != null) {
                    A152.put("network_name", C20085A6m.A03(r6.A01));
                }
                if (!TextUtils.isEmpty(r5.A0E)) {
                    A152.put("card_image_url", r5.A0E);
                }
                A152.put("last4", r5.A0J);
                A152.put("readable_name", A8e.A02(this.A00.A00, r6));
                A152.put("verified_state", r5.A0a);
                A1A.put(A152);
            }
            A15.put("card_list", A1A);
            return A15;
        } catch (JSONException e) {
            Log.e("PAY: BrazilPayBloksActivity BrazilCardsToJsonArrayException: ", e);
            return null;
        }
    }
}
