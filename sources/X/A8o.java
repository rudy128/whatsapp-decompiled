package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class A8o {
    public static AE1 A02(JSONObject jSONObject) {
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        long j = jSONObject.getLong("value");
        int i = jSONObject.getInt("offset");
        String optString = jSONObject.optString("description");
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        return new AE1(j, i, str);
    }

    public static C20279AEn A05(AnonymousClass1KI r43, JSONObject jSONObject) {
        byte[] bArr;
        ADZ adz;
        ArrayList A13;
        AE0 ae0;
        String str = null;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject2.optString("thumb");
        if (!TextUtils.isEmpty(optString)) {
            bArr = Base64.decode(optString, 0);
        } else {
            bArr = null;
        }
        String optString2 = jSONObject2.optString("title");
        AE1 A02 = A02(jSONObject2.optJSONObject("total_amount"));
        String string = jSONObject2.getString("reference_id");
        String optString3 = jSONObject2.optString("order_request_id", (String) null);
        AnonymousClass1KJ A01 = r43.A01(jSONObject2.optString("currency"));
        String optString4 = jSONObject2.optString("payment_configuration");
        String optString5 = jSONObject2.optString("payment_type");
        String optString6 = jSONObject2.optString("transaction_id");
        int optInt = jSONObject2.optInt("transaction_status");
        if (TextUtils.isEmpty(optString6)) {
            optString6 = null;
        }
        String optString7 = jSONObject2.optString("payment_status", (String) null);
        String optString8 = jSONObject2.optString("payment_method");
        if (TextUtils.isEmpty(optString8)) {
            optString8 = null;
        }
        long optLong = jSONObject2.optLong("payment_timestamp");
        String optString9 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (!TextUtils.isEmpty(optString9)) {
            str = optString9;
        }
        boolean optBoolean = jSONObject2.optBoolean("is_interactive");
        String optString10 = jSONObject2.optString("additional_note");
        JSONObject optJSONObject = jSONObject2.optJSONObject("installment");
        if (optJSONObject == null) {
            adz = null;
        } else {
            adz = new ADZ(optJSONObject.getInt("max_installment_count"));
        }
        AEU A012 = A01(jSONObject2.getJSONObject("order"));
        ArrayList A07 = A07(jSONObject2.optJSONArray("beneficiaries"));
        ArrayList A08 = A08(jSONObject2.optJSONArray("external_payment_configurations"));
        boolean optBoolean2 = jSONObject2.optBoolean("maybe_paid_externally");
        ArrayList A09 = A09(jSONObject2.optJSONArray("payment_settings"));
        ARR A00 = A00(jSONObject2.optJSONObject("paid_amount"));
        JSONArray optJSONArray = jSONObject2.optJSONArray("native_payment_methods");
        if (optJSONArray == null) {
            A13 = null;
        } else {
            A13 = AnonymousClass000.A13();
            for (int i = 0; i < optJSONArray.length(); i = AnonymousClass8BU.A05(A13, optJSONArray, i)) {
            }
        }
        String optString11 = jSONObject2.optString("logging_id");
        AES A002 = AnonymousClass9QO.A00(jSONObject2.optJSONObject("shipping_info"));
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("flow_configuration");
        if (optJSONObject2 != null) {
            ae0 = new AE0(C108955ca.A11("flow_id", optJSONObject2), optJSONObject2.optString("flow_message_version"), optJSONObject2.optString("flow_token"));
        } else {
            ae0 = null;
        }
        ArrayList A0A = A0A(jSONObject2);
        boolean optBoolean3 = jSONObject2.optBoolean("share_payment_status", false);
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("coupon");
        C20266ADy aDy = null;
        if (optJSONObject3 != null) {
            String optString12 = optJSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String optString13 = optJSONObject3.optString("code");
            JSONObject jSONObject3 = (JSONObject) optJSONObject3.opt("discount");
            if (!TextUtils.isEmpty(optString13) && jSONObject3 != null) {
                aDy = new C20266ADy(new AE1(jSONObject3.optLong("value"), jSONObject3.optInt("offset"), (String) null), optString12, optString13);
            }
        }
        return new C20279AEn(A01, A00, A002, aDy, ae0, A012, adz, A02, optString2, string, optString3, str, optString4, optString5, optString6, optString7, optString8, optString10, optString11, jSONObject2.optString("preferred_payment_setting_type"), A07, A08, A09, A13, A0A, bArr, optInt, optLong, jSONObject2.optLong("order_updated_time"), optBoolean, optBoolean2, optBoolean3);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2r3, java.lang.Object] */
    public static ARR A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ? obj = new Object();
        obj.A02 = AnonymousClass1KL.A0C;
        obj.A00();
        return AnonymousClass8BU.A0I(jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0132, code lost:
        if (r2.equals(r1) == false) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AEU A01(org.json.JSONObject r29) {
        /*
            java.lang.String r1 = "status"
            r0 = r29
            java.lang.String r18 = r0.getString(r1)
            java.lang.String r10 = "description"
            java.lang.String r19 = r0.optString(r10)
            java.lang.String r1 = "subtotal"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            X.AE1 r14 = A02(r1)
            java.lang.String r1 = "tax"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            X.AE1 r15 = A02(r1)
            java.lang.String r1 = "discount"
            org.json.JSONObject r2 = r0.optJSONObject(r1)
            X.AE1 r16 = A02(r2)
            if (r2 == 0) goto L_0x00d8
            java.lang.String r1 = "discount_program_name"
            java.lang.String r20 = r2.optString(r1)
        L_0x0034:
            java.lang.String r1 = "shipping"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            X.AE1 r17 = A02(r1)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.lang.String r1 = "items"
            org.json.JSONArray r8 = r0.optJSONArray(r1)
            if (r8 == 0) goto L_0x00dc
            r1 = 0
        L_0x004b:
            int r2 = r8.length()
            if (r1 >= r2) goto L_0x00dc
            org.json.JSONObject r2 = X.AnonymousClass8BR.A1B(r8, r1)
            java.lang.String r3 = "amount"
            org.json.JSONObject r13 = r2.getJSONObject(r3)
            java.lang.String r3 = "sale_amount"
            org.json.JSONObject r12 = r2.optJSONObject(r3)
            java.lang.String r3 = "product_id"
            java.lang.String r25 = r2.optString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r25)
            if (r3 == 0) goto L_0x006f
            r25 = 0
        L_0x006f:
            java.lang.String r3 = "image"
            org.json.JSONObject r4 = r2.optJSONObject(r3)
            if (r4 == 0) goto L_0x00d5
            java.lang.String r3 = "base64Thumbnail"
            java.lang.String r27 = r4.optString(r3)
        L_0x007d:
            java.lang.String r3 = "variant_info_list"
            org.json.JSONArray r6 = r2.optJSONArray(r3)
            if (r6 != 0) goto L_0x00af
            r7 = 0
        L_0x0086:
            java.lang.String r3 = "retailer_id"
            java.lang.String r24 = r2.optString(r3)
            java.lang.String r3 = "name"
            java.lang.String r26 = r2.getString(r3)
            X.AE1 r22 = A02(r13)
            X.AE1 r23 = A02(r12)
            java.lang.String r3 = "quantity"
            int r29 = r2.getInt(r3)
            X.AET r2 = new X.AET
            r21 = r2
            r28 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            r11.add(r2)
            int r1 = r1 + 1
            goto L_0x004b
        L_0x00af:
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            r5 = 0
        L_0x00b4:
            int r3 = r6.length()
            if (r5 >= r3) goto L_0x0086
            org.json.JSONObject r4 = X.AnonymousClass8BR.A1B(r6, r5)
            java.lang.String r3 = "name"
            java.lang.String r9 = r4.optString(r3)
            java.lang.String r3 = "value"
            java.lang.String r4 = r4.optString(r3)
            X.ADk r3 = new X.ADk
            r3.<init>(r9, r4)
            r7.add(r3)
            int r5 = r5 + 1
            goto L_0x00b4
        L_0x00d5:
            r27 = 0
            goto L_0x007d
        L_0x00d8:
            r20 = 0
            goto L_0x0034
        L_0x00dc:
            java.lang.String r1 = "expiration"
            org.json.JSONObject r3 = r0.optJSONObject(r1)
            if (r3 == 0) goto L_0x013c
            java.lang.String r1 = "timestamp"
            long r1 = r3.getLong(r1)
            java.lang.String r4 = r3.optString(r10)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L_0x00f5
            r4 = 0
        L_0x00f5:
            X.ADi r13 = new X.ADi
            r13.<init>(r1, r4)
        L_0x00fa:
            java.lang.String r1 = "order_type"
            java.lang.String r2 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0135
            if (r2 == 0) goto L_0x010f
            int r0 = r2.hashCode()
            switch(r0) {
                case -654271210: goto L_0x012c;
                case -577862400: goto L_0x0129;
                case 75468590: goto L_0x0126;
                case 1301104470: goto L_0x0123;
                default: goto L_0x010f;
            }
        L_0x010f:
            java.lang.String r1 = "UNKNOWN"
        L_0x0111:
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 == 0) goto L_0x0119
            r20 = 0
        L_0x0119:
            X.AEU r12 = new X.AEU
            r21 = r1
            r22 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r12
        L_0x0123:
            java.lang.String r1 = "quick_pay"
            goto L_0x012e
        L_0x0126:
            java.lang.String r1 = "ORDER"
            goto L_0x012e
        L_0x0129:
            java.lang.String r1 = "ORDER_WITHOUT_AMOUNT"
            goto L_0x012e
        L_0x012c:
            java.lang.String r1 = "PAYMENT_REQUEST"
        L_0x012e:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x0111
            goto L_0x010f
        L_0x0135:
            java.lang.String r1 = "type"
            java.lang.String r1 = r0.optString(r1)
            goto L_0x0111
        L_0x013c:
            r13 = 0
            goto L_0x00fa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8o.A01(org.json.JSONObject):X.AEU");
    }

    public static C20935Abp A03(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new C20935Abp(jSONObject.getString("vpa"), jSONObject.getString("pn"), jSONObject.getString("mcc"), jSONObject.getString("pc"), jSONObject.getString("tr"));
        }
        return null;
    }

    public static C20279AEn A04(AnonymousClass11P r39, AnonymousClass1KI r40, String str, byte[] bArr, boolean z) {
        ADZ adz;
        ArrayList arrayList;
        AE0 ae0;
        String str2;
        String str3 = str;
        if (TextUtils.isEmpty(str3)) {
            Log.e("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
            return null;
        }
        try {
            JSONObject A16 = C17880vN.A16(str3);
            String string = A16.getString("reference_id");
            String optString = A16.optString("order_request_id", (String) null);
            String optString2 = A16.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            AnonymousClass1KJ A01 = r40.A01(A16.optString("currency"));
            AE1 A02 = A02(A16.optJSONObject("total_amount"));
            String optString3 = A16.optString("payment_configuration");
            String optString4 = A16.optString("payment_type");
            JSONObject optJSONObject = A16.optJSONObject("installment");
            if (optJSONObject == null) {
                adz = null;
            } else {
                adz = new ADZ(optJSONObject.getInt("max_installment_count"));
            }
            AEU A012 = A01(A16.getJSONObject("order"));
            ArrayList A07 = A07(A16.optJSONArray("beneficiaries"));
            ArrayList A08 = A08(A16.optJSONArray("external_payment_configurations"));
            String optString5 = A16.optString("transaction_id");
            String optString6 = A16.optString("payment_method");
            String optString7 = A16.optString("payment_status", (String) null);
            String optString8 = A16.optString("additional_note");
            long optLong = A16.optLong("payment_timestamp");
            ArrayList A09 = A09(A16.optJSONArray("payment_settings"));
            ARR A00 = A00(A16.optJSONObject("paid_amount"));
            JSONArray optJSONArray = A16.optJSONArray("native_payment_methods");
            if (optJSONArray == null) {
                arrayList = null;
            } else {
                arrayList = AnonymousClass000.A13();
                for (int i = 0; i < optJSONArray.length(); i = AnonymousClass8BU.A05(arrayList, optJSONArray, i)) {
                }
            }
            AES A002 = AnonymousClass9QO.A00(A16.optJSONObject("shipping_info"));
            JSONObject optJSONObject2 = A16.optJSONObject("flow_configuration");
            if (optJSONObject2 != null) {
                ae0 = new AE0(C108955ca.A11("flow_id", optJSONObject2), optJSONObject2.optString("flow_message_version"), optJSONObject2.optString("flow_token"));
            } else {
                ae0 = null;
            }
            ArrayList A0A = A0A(A16);
            boolean optBoolean = A16.optBoolean("share_payment_status", false);
            String optString9 = A16.optString("preferred_payment_setting_type");
            List list = A012.A09;
            if (list == null || list.isEmpty()) {
                str2 = null;
            } else {
                str2 = C29431cG.A0h(", ", list, B3I.A00);
            }
            return new C20279AEn(A01, A00, A002, (C20266ADy) null, ae0, A012, adz, A02, str2, string, optString, optString2, optString3, optString4, optString5, optString7, optString6, optString8, (String) null, optString9, A07, A08, A09, arrayList, A0A, bArr, 0, optLong, AnonymousClass11P.A01(r39), z, false, optBoolean);
        } catch (JSONException unused) {
            C17900vP.A0e("CheckoutInfoContentParser/parseE2ECheckoutInfo/invalid paramsJson=", str3, AnonymousClass000.A10());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.formatCase_ == 5) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r0 = r4.templateMessage_;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = X.C166348ck.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r0.formatCase_ != 5) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r2 = X.C166348ck.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r2.formatCase_ != 5) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r0 = (X.C166398cp) r2.format_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        return ((X.AnonymousClass8Z3) r0.A0S().buttons_.get(0)).buttonParamsJson_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r2 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        r0 = r4.interactiveMessage_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        r0 = X.C166398cp.DEFAULT_INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A06(X.C166418cr r4) {
        /*
            int r3 = r4.bitField1_
            r0 = r3 & 1
            if (r0 == 0) goto L_0x0014
            X.8bs r1 = r4.buttonsMessage_
            if (r1 != 0) goto L_0x000c
            X.8bs r1 = X.C165858bs.DEFAULT_INSTANCE
        L_0x000c:
            r0 = 0
            X.8Yx r0 = X.AnonymousClass8BX.A0N(r1, r0)
            java.lang.String r0 = r0.paramsJson_
            return r0
        L_0x0014:
            boolean r2 = r4.A0R()
            if (r2 == 0) goto L_0x004d
            X.8ck r0 = r4.templateMessage_
            if (r0 != 0) goto L_0x0020
            X.8ck r0 = X.C166348ck.DEFAULT_INSTANCE
        L_0x0020:
            int r1 = r0.formatCase_
            r0 = 5
            if (r1 != r0) goto L_0x004d
        L_0x0025:
            X.8ck r0 = r4.templateMessage_
            r2 = r0
            if (r0 != 0) goto L_0x002c
            X.8ck r0 = X.C166348ck.DEFAULT_INSTANCE
        L_0x002c:
            int r0 = r0.formatCase_
            r1 = 5
            if (r0 != r1) goto L_0x0054
            if (r2 != 0) goto L_0x0035
            X.8ck r2 = X.C166348ck.DEFAULT_INSTANCE
        L_0x0035:
            int r0 = r2.formatCase_
            if (r0 != r1) goto L_0x0058
            java.lang.Object r0 = r2.format_
            X.8cp r0 = (X.C166398cp) r0
        L_0x003d:
            X.8a7 r0 = r0.A0S()
            r1 = 0
            X.EE9 r0 = r0.buttons_
            java.lang.Object r0 = r0.get(r1)
            X.8Z3 r0 = (X.AnonymousClass8Z3) r0
            java.lang.String r0 = r0.buttonParamsJson_
            return r0
        L_0x004d:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x0054
            goto L_0x0025
        L_0x0054:
            X.8cp r0 = r4.interactiveMessage_
            if (r0 != 0) goto L_0x003d
        L_0x0058:
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
            goto L_0x003d
        L_0x005b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8o.A06(X.8cr):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.ADC, java.lang.Object] */
    public static ArrayList A07(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject A1B = AnonymousClass8BR.A1B(jSONArray, i);
            String optString = A1B.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String optString2 = A1B.optString("address_line1");
            String optString3 = A1B.optString("address_line2");
            String optString4 = A1B.optString("city");
            String optString5 = A1B.optString("state");
            String optString6 = A1B.optString("country");
            String optString7 = A1B.optString("postal_code");
            C18070vi.A0w(optString, optString2, optString3, optString4, optString5);
            C18070vi.A0l(optString6, optString7);
            ? obj = new Object();
            obj.A04 = optString;
            obj.A00 = optString2;
            obj.A01 = optString3;
            obj.A02 = optString4;
            obj.A06 = optString5;
            obj.A03 = optString6;
            obj.A05 = optString7;
            A13.add(obj);
        }
        return A13;
    }

    public static ArrayList A0A(JSONObject jSONObject) {
        C20937Abr abr;
        JSONArray optJSONArray = jSONObject.optJSONArray("preferred_payment_methods");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject A1B = AnonymousClass8BR.A1B(optJSONArray, i);
            String string = A1B.getString("method");
            JSONObject optJSONObject = A1B.optJSONObject("offer_details");
            if (optJSONObject != null) {
                abr = new C20937Abr(A00(optJSONObject.optJSONObject("offer_amount")), A00(optJSONObject.optJSONObject("offer_percentage")), optJSONObject.getString("description"), optJSONObject.getString("offer_type"), optJSONObject.getString("offer_amount_type"));
            } else {
                abr = null;
            }
            A13.add(new C20928Abi(abr, string));
        }
        return A13;
    }

    public static ArrayList A08(JSONArray jSONArray) {
        ArrayList A13 = AnonymousClass000.A13();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject A1B = AnonymousClass8BR.A1B(jSONArray, i);
                A13.add(new C20267ADz(A1B.optString("uri"), A1B.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A1B.optString("payment_instruction")));
            }
        }
        return A13;
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [java.lang.Object, X.Abg] */
    public static ArrayList A09(JSONArray jSONArray) {
        BDZ bdz;
        C20251ADj aDj;
        BDZ abo;
        BDZ abj;
        C20932Abm abm;
        C20932Abm abm2;
        ArrayList arrayList;
        ArrayList A13 = AnonymousClass000.A13();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject A1B = AnonymousClass8BR.A1B(jSONArray, i);
                String optString = A1B.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                if (optString.equals("payment_gateway")) {
                    JSONObject optJSONObject = A1B.optJSONObject("payment_gateway");
                    if (optJSONObject != null) {
                        String optString2 = optJSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        String optString3 = optJSONObject.optString("configuration_name");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject(optString2);
                        ArrayList A0A = A0A(optJSONObject);
                        JSONArray optJSONArray = optJSONObject.optJSONArray("enabled_payment_options");
                        if (optJSONArray != null) {
                            arrayList = AnonymousClass000.A13();
                            for (int i2 = 0; i2 < optJSONArray.length(); i2 = AnonymousClass8BU.A05(arrayList, optJSONArray, i2)) {
                            }
                        } else {
                            arrayList = null;
                        }
                        bdz = new C20936Abq(optString2, optString3, A0A, arrayList, optJSONObject2);
                        aDj = new C20251ADj(bdz, optString);
                    }
                } else {
                    if (optString.equals("payment_link")) {
                        JSONObject optJSONObject3 = A1B.optJSONObject("payment_link");
                        if (optJSONObject3 != null) {
                            abm2 = new C20932Abm(optJSONObject3.optString("uri"), optJSONObject3.optString("cancel_url"), optJSONObject3.optString("success_url"));
                        }
                    } else {
                        String str = "pix_static_code";
                        if (optString.equals(str) || optString.equals("pix_dynamic_code")) {
                            if (optString.equals("pix_dynamic_code")) {
                                str = "pix_dynamic_code";
                            }
                            JSONObject optJSONObject4 = A1B.optJSONObject(str);
                            if (optJSONObject4 != null) {
                                abo = new C20934Abo(optJSONObject4.optString("key"), optJSONObject4.optString("key_type"), optJSONObject4.optString("merchant_name"), optJSONObject4.optString("code"));
                            }
                        } else {
                            if (optString.equals("boleto")) {
                                JSONObject optJSONObject5 = A1B.optJSONObject("boleto");
                                if (optJSONObject5 != null) {
                                    abo = new C20927Abh(optJSONObject5.optString("digitable_line"));
                                }
                            } else if (optString.equals("cards")) {
                                JSONObject optJSONObject6 = A1B.optJSONObject("cards");
                                if (optJSONObject6 != null) {
                                    boolean optBoolean = optJSONObject6.optBoolean("enabled", true);
                                    String optString4 = optJSONObject6.optString("configuration_name");
                                    boolean optBoolean2 = optJSONObject6.optBoolean("payment_gateway_checkout_enabled");
                                    ? obj = new Object();
                                    obj.A01 = optBoolean;
                                    obj.A00 = optString4;
                                    obj.A02 = optBoolean2;
                                    abm2 = obj;
                                }
                            } else if (optString.equals("upi_merchant_configuration")) {
                                JSONObject optJSONObject7 = A1B.optJSONObject("upi_merchant_configuration");
                                String optString5 = optJSONObject7.optString("configuration_name");
                                String optString6 = optJSONObject7.optString("tr");
                                JSONObject optJSONObject8 = optJSONObject7.optJSONObject("payment_link");
                                if (optJSONObject8 != null) {
                                    abm = new C20932Abm(optJSONObject8.optString("uri"), optJSONObject8.optString("cancel_url"), optJSONObject8.optString("success_url"));
                                } else {
                                    abm = null;
                                }
                                bdz = new C20933Abn(abm, optString6, optString5);
                                aDj = new C20251ADj(bdz, optString);
                            } else {
                                if (optString.equals("upi_merchant_vpa")) {
                                    JSONObject jSONObject = A1B.getJSONObject("upi_merchant_vpa");
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("internal_metadata");
                                    abj = new C20930Abk(A03(jSONObject.optJSONObject("merchant_details")), new C20931Abl(jSONObject2.optString("metadata_payment_identifier"), jSONObject2.optString("metadata_encryption_key"), jSONObject2.optString("configuration_name")));
                                } else if (optString.equals("upi_intent_link")) {
                                    JSONObject jSONObject3 = A1B.getJSONObject("upi_intent_link");
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("internal_metadata");
                                    abj = new C20929Abj(A03(jSONObject3.optJSONObject("merchant_details")), new C20931Abl(jSONObject4.optString("metadata_payment_identifier"), jSONObject4.optString("metadata_encryption_key"), jSONObject4.optString("configuration_name")));
                                }
                                aDj = new C20251ADj(abj, optString);
                            }
                        }
                        aDj = new C20251ADj(abo, optString);
                    }
                    aDj = new C20251ADj(abm2, optString);
                }
                A13.add(aDj);
            }
        }
        return A13;
    }
}
