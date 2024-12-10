package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9zX  reason: invalid class name and case insensitive filesystem */
public class C199159zX {
    public JSONObject A00;
    public final C18030ve A01;

    public static String A00(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        return indiaUpiSendPaymentActivity.A03.A01(indiaUpiSendPaymentActivity.A0V, indiaUpiSendPaymentActivity.A0d, indiaUpiSendPaymentActivity.A0o);
    }

    public String A01(String str, String str2, boolean z) {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 1955)) {
            return null;
        }
        int A002 = C18020vd.A00(r1, r2, 1956);
        Integer valueOf = Integer.valueOf(A002);
        boolean A05 = C18020vd.A05(r1, r2, 1955);
        String str3 = "";
        String str4 = str3;
        if (A05) {
            if (str != null) {
                if (str2 != null) {
                    Object[] A1b = AnonymousClass3MW.A1b();
                    AnonymousClass001.A1Q(str, str2, A1b);
                    str3 = String.format("%s,%s", A1b);
                } else {
                    str3 = str;
                }
            }
            try {
                JSONObject jSONObject = this.A00;
                if (jSONObject == null || jSONObject.get(str3) == null) {
                    str3 = str4;
                } else {
                    str3 = jSONObject.get(str3).toString();
                }
            } catch (JSONException unused) {
                str3 = null;
            }
            if (AnonymousClass1EG.A0H(str3)) {
                try {
                    JSONObject jSONObject2 = this.A00;
                    if (jSONObject2 == null || jSONObject2.get(str) == null) {
                        str3 = str4;
                    } else {
                        str3 = jSONObject2.get(str).toString();
                    }
                } catch (JSONException unused2) {
                    str3 = null;
                }
            }
        }
        if (!AnonymousClass1EG.A0H(str3)) {
            return str3;
        }
        if (!z || valueOf == null || A002 == 0) {
            return null;
        }
        return valueOf.toString();
    }

    public C199159zX(C18030ve r3) {
        this.A01 = r3;
        if (C18020vd.A05(C18040vf.A02, r3, 1955)) {
            String A0I = r3.A0I(2659);
            if (!TextUtils.isEmpty(A0I)) {
                try {
                    this.A00 = C17880vN.A16(A0I);
                } catch (JSONException e) {
                    Log.e("Fail to fetch merchantCodePurposeCodeMaxAmountMap ", e);
                }
            }
        }
    }
}
