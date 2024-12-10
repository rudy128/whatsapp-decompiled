package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class AXS implements AnonymousClass3M8 {
    public final AnonymousClass11P A00;
    public final AnonymousClass1QD A01;
    public final C18030ve A02;
    public final AnonymousClass1QL A03;

    public static synchronized void A04(C1418477e r2, AXS axs, String str, JSONObject jSONObject) {
        synchronized (axs) {
            jSONObject.put("v", "2");
            if (!C20061A5k.A02(r2)) {
                Object obj = r2.A00;
                C17960vV.A07(obj);
                jSONObject.put("vpa", obj);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("vpaId", str);
            }
            jSONObject.put("vpaTs", AnonymousClass11P.A01(axs.A00));
        }
    }

    public static void A05(A7U a7u, AXS axs, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        axs.BIG(a7u.A05(indiaUpiDeviceBindStepActivity.A0A), true);
    }

    public static synchronized void A06(AXS axs, String str, String str2, JSONObject jSONObject) {
        synchronized (axs) {
            jSONObject.put("v", "2");
            jSONObject.put("psp", str);
            jSONObject.put("sequenceNumberPrefix", str2);
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("devBindingByPsp");
                if (optJSONObject == null) {
                    optJSONObject = C17880vN.A15();
                    jSONObject.put("devBindingByPsp", optJSONObject);
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                if (optJSONObject2 == null) {
                    optJSONObject2 = C17880vN.A15();
                    optJSONObject.put(str, optJSONObject2);
                }
                optJSONObject2.put("devBinding", true);
            } catch (JSONException e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("PAY: IndiaUpiPaymentSharedPrefs getOrInsertFieldByPsP for field: ");
                A10.append("devBindingByPsp");
                C17890vO.A13(" threw: ", A10, e);
            }
        }
    }

    public static synchronized boolean A08(AXS axs, String str) {
        boolean z;
        JSONObject optJSONObject;
        boolean optBoolean;
        synchronized (axs) {
            z = false;
            try {
                String A06 = axs.A01.A06();
                if (!TextUtils.isEmpty(A06)) {
                    JSONObject A16 = C17880vN.A16(A06);
                    JSONObject optJSONObject2 = A16.optJSONObject("devBindingByPsp");
                    if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(str)) == null || !(optBoolean = optJSONObject.optBoolean("devBinding", false))) {
                        try {
                            z = A16.optBoolean("devBinding", false);
                        } catch (JSONException e) {
                            e = e;
                            z = false;
                        }
                    } else {
                        z = optBoolean;
                    }
                }
            } catch (JSONException e2) {
                e = e2;
                Log.w("PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: ", e);
                return z;
            }
        }
        return z;
    }

    public synchronized int A0A() {
        int i;
        i = 0;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                i = C17880vN.A16(A06).optInt("invalidAadhaarEntryCount", 0);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getInvalidAadhaarEntryCount threw: ", e);
        }
        return i;
    }

    public synchronized int A0B() {
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                return C17880vN.A16(A06).optInt("device_binding_sim_subscripiton_id", -1);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getSimIndex threw: ", e);
        }
        return 0;
    }

    public synchronized long A0C() {
        long j;
        j = 0;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                j = C17880vN.A16(A06).optLong("lastInvalidAadhaarEntryTs", 0);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getLastInvalidEntryTs threw: ", e);
        }
        return j;
    }

    public synchronized C1418477e A0D() {
        String str;
        str = null;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = C17880vN.A16(A06).optString("vpa", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readAccountHandle threw: ", e);
        }
        return AnonymousClass8BX.A0K(str, "upiHandle");
    }

    public synchronized C1418477e A0E() {
        C1418477e A0Y;
        synchronized (this) {
            byte[] bArr = null;
            try {
                String A06 = this.A01.A06();
                if (!TextUtils.isEmpty(A06)) {
                    JSONObject A16 = C17880vN.A16(A06);
                    String optString = A16.optString("token", (String) null);
                    long optLong = A16.optLong("tokenTs", 0);
                    long millis = TimeUnit.DAYS.toMillis(20);
                    if (!TextUtils.isEmpty(optString) && AnonymousClass11P.A01(this.A00) - optLong < millis) {
                        bArr = Base64.decode(optString, 0);
                    }
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiPaymentSharedPrefs readToken threw: ", e);
            }
            A0Y = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), byte[].class, bArr, "sessionToken");
        }
        return A0Y;
    }

    public String A0G() {
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                return C17880vN.A16(A06).optString("psp", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPsp threw: ", e);
        }
        return null;
    }

    public synchronized String A0H() {
        String[] A09;
        A09 = A09(this, "device_binding_sim_iccid");
        if (A09[0] == null) {
            A09 = A09(this, "device_binding_sim_id");
        }
        return A09[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[Catch:{ JSONException -> 0x0038 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0I() {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)
            r8 = 0
            X.1QD r0 = r11.A01     // Catch:{ JSONException -> 0x0038 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x0038 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0038 }
            if (r0 != 0) goto L_0x0043
            org.json.JSONObject r3 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x0038 }
            java.lang.String r0 = "listKeys"
            java.lang.String r9 = r3.optString(r0, r8)     // Catch:{ JSONException -> 0x0038 }
            java.lang.String r2 = "listKeysTs"
            r0 = 0
            long r6 = r3.optLong(r2, r0)     // Catch:{ JSONException -> 0x0038 }
            long r4 = X.AnonymousClass8BW.A05()     // Catch:{ JSONException -> 0x0038 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x0038 }
            if (r0 != 0) goto L_0x003f
            X.11P r0 = r11.A00     // Catch:{ JSONException -> 0x0038 }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ JSONException -> 0x0038 }
            long r2 = r2 - r6
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0040
            goto L_0x003f
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readListKeys threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0043
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            r8 = r9
        L_0x0043:
            monitor-exit(r10)
            return r8
        L_0x0045:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXS.A0I():java.lang.String");
    }

    public synchronized String A0J() {
        String str;
        str = null;
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                str = C17880vN.A16(A06).optString("vpaId", (String) null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readVpaId threw: ", e);
        }
        return str;
    }

    public synchronized void A0K() {
        try {
            AnonymousClass1QD r2 = this.A01;
            JSONObject A032 = A03(r2);
            A032.remove("listKeys");
            A032.remove("listKeysTs");
            AnonymousClass8BT.A1G(r2, A032);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0L() {
        try {
            AnonymousClass1QD r2 = this.A01;
            JSONObject A032 = A03(r2);
            A032.remove("token");
            A032.remove("tokenTs");
            A032.remove("listKeys");
            A032.remove("listKeysTs");
            AnonymousClass8BT.A1G(r2, A032);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0M() {
        try {
            AnonymousClass1QD r2 = this.A01;
            JSONObject A032 = A03(r2);
            A032.remove("invalidAadhaarEntryCount");
            A032.remove("lastInvalidAadhaarEntryTs");
            AnonymousClass8BT.A1G(r2, A032);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs resetInvalidAadhaarEntry threw: ", e);
        }
        return;
    }

    public synchronized void A0N(int i) {
        try {
            AnonymousClass1QD r2 = this.A01;
            JSONObject A032 = A03(r2);
            A032.put("device_binding_sim_subscripiton_id", i);
            AnonymousClass8BT.A1G(r2, A032);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs setSimIndex threw: ", e);
        }
        return;
    }

    public synchronized void A0O(C1418477e r3, String str) {
        try {
            AnonymousClass1QD r1 = this.A01;
            JSONObject A032 = A03(r1);
            A04(r3, this, str, A032);
            AnonymousClass8BT.A1G(r1, A032);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeVpaHandle threw: ", e);
        }
        return;
    }

    public synchronized void A0P(String str) {
        JSONObject A16;
        try {
            AnonymousClass1QD r5 = this.A01;
            String A06 = r5.A06();
            long A012 = AnonymousClass11P.A01(this.A00);
            if (TextUtils.isEmpty(A06)) {
                A16 = C17880vN.A15();
            } else {
                A16 = C17880vN.A16(A06);
            }
            A16.put("v", "2");
            A16.put("listKeys", str);
            A16.put("listKeysTs", A012);
            AnonymousClass8BT.A1G(r5, A16);
            C17900vP.A0m("PAY: IndiaUpiPaymentSharedPrefs storeListKeys at timestamp: ", AnonymousClass000.A10(), A012);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeListKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0Q(String str, String str2, String str3) {
        try {
            AnonymousClass1QD r2 = this.A01;
            JSONObject A0c = AnonymousClass8BY.A0c(r2);
            A06(this, str, str2, A0c);
            if (!TextUtils.isEmpty(str3)) {
                A0c.put("device_binding_sim_id", str3);
            }
            A0c.remove("device_binding_sim_subscripiton_id");
            AnonymousClass8BT.A1G(r2, A0c);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeDeviceBinding threw: ", e);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A02, 1644) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0R() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.1QD r0 = r3.A01     // Catch:{ all -> 0x001f }
            android.content.SharedPreferences r1 = r0.A03()     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C17880vN.A1W(r1, r0)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x001c
            X.0ve r2 = r3.A02     // Catch:{ all -> 0x001f }
            r1 = 1644(0x66c, float:2.304E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x001f }
            boolean r1 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x001f }
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            monitor-exit(r3)
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXS.A0R():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (A0U(A0G()) != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0S() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0R()     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r2.A0G()     // Catch:{ all -> 0x0015 }
            boolean r1 = r2.A0U(r0)     // Catch:{ all -> 0x0015 }
            r0 = 1
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AXS.A0S():boolean");
    }

    public boolean A0T(AnonymousClass8pS r7, AZ6 az6, String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str) || !A08(this, str)) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A02, 1661)) {
            return true;
        }
        if (r7 == null || (arrayList = r7.A0F) == null) {
            return false;
        }
        boolean contains = arrayList.contains(str);
        if (!contains) {
            C171858sO r2 = new C171858sO();
            r2.A0b = "redo_device_binding";
            r2.A08 = 0;
            r2.A01 = Boolean.valueOf(this.A03.A0G("add_bank"));
            az6.BiH(r2);
            BIG(str, true);
        }
        return contains;
    }

    public boolean A0U(String str) {
        return !TextUtils.isEmpty(str) && A08(this, str);
    }

    public synchronized void BIG(String str, boolean z) {
        try {
            AnonymousClass1QD r2 = this.A01;
            String A06 = r2.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A16 = C17880vN.A16(A06);
                if (TextUtils.isEmpty(str)) {
                    A16.remove("smsVerifDataSentToPsp");
                    A16.remove("devBindingByPsp");
                } else {
                    JSONObject optJSONObject = A16.optJSONObject("smsVerifDataSentToPsp");
                    if (optJSONObject != null) {
                        optJSONObject.remove(str);
                    }
                    JSONObject optJSONObject2 = A16.optJSONObject("devBindingByPsp");
                    if (optJSONObject2 != null) {
                        optJSONObject2.remove(str);
                    }
                }
                if (z) {
                    A16.remove("psp");
                }
                A16.remove("sequenceNumberPrefix");
                A16.remove("skipDevBinding");
                A16.remove("smsVerifData");
                A16.remove("smsVerifDataGateway");
                A16.remove("devBinding");
                A16.remove("smsVerifDataGen");
                A16.remove("device_binding_sim_iccid");
                A16.remove("device_binding_sim_id");
                A16.remove("device_binding_sim_subscripiton_id");
                AnonymousClass8BT.A1G(r2, A16);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteDeviceBinding threw: ", e);
        }
        return;
    }

    public void BII() {
    }

    public synchronized void CQQ(long j, boolean z) {
        this.A03.A0B("tos_no_wallet");
        C17880vN.A1F(AnonymousClass8BU.A07(this.A01), "payment_account_recovered", true);
    }

    public synchronized void CRC(C170278pb r6) {
        synchronized (this) {
            if (r6 != null) {
                if (r6 instanceof AnonymousClass8pS) {
                    AnonymousClass8pS r62 = (AnonymousClass8pS) r6;
                    A0O(r62.A08, r62.A0E);
                    String str = r62.A09;
                    try {
                        AnonymousClass1QD r2 = this.A01;
                        JSONObject A0c = AnonymousClass8BY.A0c(r2);
                        if (!TextUtils.isEmpty(str)) {
                            A0c.put("psp", str);
                        }
                        AnonymousClass8BT.A1G(r2, A0c);
                    } catch (JSONException unused) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storePsp threw");
                    }
                }
            }
        }
        return;
    }

    public static String A01(AnonymousClass91T r1) {
        return r1.A4m(r1.A0N.A0F());
    }

    public static String A02(AnonymousClass91T r0) {
        return r0.A0N.A0G();
    }

    public static String[] A09(AXS axs, String... strArr) {
        try {
            String A06 = axs.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                JSONObject A16 = C17880vN.A16(A06);
                int length = strArr.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = A16.optString(strArr[i], (String) null);
                }
                return strArr2;
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readFromPaymentInfo for keys threw: ", e);
        }
        return new String[strArr.length];
    }

    public String A0F() {
        try {
            String A06 = this.A01.A06();
            if (!TextUtils.isEmpty(A06)) {
                return C17880vN.A16(A06).optString("sequenceNumberPrefix", "ICIWC");
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPaymentSequenceNumberPrefix threw: ", e);
        }
        return "ICIWC";
    }

    public void BIC() {
        AnonymousClass1QD r2 = this.A01;
        C17880vN.A1B(AnonymousClass8BU.A07(r2), "payments_upi_aliases");
        try {
            JSONObject A0c = AnonymousClass8BY.A0c(r2);
            A0c.remove("token");
            A0c.remove("tokenTs");
            A0c.remove("vpa");
            A0c.remove("vpaId");
            A0c.remove("vpaTs");
            A0c.remove("listKeys");
            A0c.remove("listKeysTs");
            A0c.remove("skipDevBinding");
            A0c.remove("devBindingByPsp");
            A0c.remove("psp");
            A0c.remove("sequenceNumberPrefix");
            A0c.remove("devBinding");
            A0c.remove("signedQrCode");
            A0c.remove("signedQrCodeTs");
            AnonymousClass8BT.A1G(r2, A0c);
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
    }

    public boolean CLf() {
        if (this.A03.A0F() || !A0D().A00()) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        try {
            JSONObject A0c = AnonymousClass8BY.A0c(this.A01);
            if (!TextUtils.isEmpty(A0c.optString("listKeys"))) {
                str = "[keys exist]";
            } else {
                str = "[no keys]";
            }
            A0c.put("listKeys", str);
            String optString = A0c.optString("vpa");
            if (!TextUtils.isEmpty(optString)) {
                A0c.put("vpa", C20088A6q.A02(optString));
            }
            String optString2 = A0c.optString("smsVerifDataGateway");
            if (!TextUtils.isEmpty(optString2)) {
                A0c.put("smsVerifDataGateway", optString2);
            }
            A07("smsVerifDataGen", A0c);
            A07("smsVerifData", A0c);
            A07("token", A0c);
            JSONObject optJSONObject = A0c.optJSONObject("smsVerifDataSentToPsp");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(C17880vN.A0v(keys));
                    if (optJSONObject2 != null) {
                        A07("smsVerifData", optJSONObject2);
                    }
                }
            }
            return A0c.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs toString threw: ", e);
            return "";
        }
    }

    public AXS(AnonymousClass11P r1, C18030ve r2, AnonymousClass1QL r3, AnonymousClass1QD r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r3;
    }

    public static String A00(AXS axs) {
        return (String) axs.A0D().A00;
    }

    public static JSONObject A03(AnonymousClass1QD r1) {
        String A06 = r1.A06();
        if (TextUtils.isEmpty(A06)) {
            return new JSONObject();
        }
        return new JSONObject(A06);
    }

    public static void A07(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.put(str, C20088A6q.A00(optString));
        }
    }
}
