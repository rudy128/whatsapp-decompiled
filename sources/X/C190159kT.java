package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9kT  reason: invalid class name and case insensitive filesystem */
public class C190159kT {
    public AnonymousClass9NQ A00;
    public String A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.9NQ] */
    public C190159kT(String str) {
        Object obj;
        BigDecimal bigDecimal;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                this.A01 = A16.optString("invoice-number");
                if (A16.has("fx-detail")) {
                    String optString = A16.optString("fx-detail");
                    ? obj2 = new Object();
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            JSONObject A162 = C17880vN.A16(optString);
                            C144717Ik A0Z = AnonymousClass8BR.A0Z();
                            Class<String> cls = String.class;
                            C1418477e r0 = obj2.A00;
                            if (r0 != null) {
                                obj = r0.A00;
                            } else {
                                obj = null;
                            }
                            obj2.A00 = AnonymousClass8BR.A0Y(A0Z, cls, A162.optString("base-amount", (String) obj), "moneyStringValue");
                            obj2.A01 = A162.optString("base-currency");
                            BigDecimal bigDecimal2 = null;
                            if (A162.has("currency-fx")) {
                                bigDecimal = new BigDecimal(A162.optString("currency-fx"));
                            } else {
                                bigDecimal = null;
                            }
                            obj2.A02 = bigDecimal;
                            obj2.A03 = A162.has("currency-markup") ? new BigDecimal(A162.optString("currency-markup")) : bigDecimal2;
                        } catch (JSONException e) {
                            Log.w("PAY: IndiaUpiInternationalTransactionDetailData:FxDetail threw: ", e);
                        }
                    }
                    this.A00 = obj2;
                }
            } catch (JSONException e2) {
                Log.w("PAY: IndiaUpiTransactionComplaintData threw: ", e2);
            }
        }
    }

    public String A00() {
        String str;
        try {
            JSONObject A15 = C17880vN.A15();
            String str2 = this.A01;
            if (str2 != null) {
                A15.put("invoice-number", str2);
            }
            AnonymousClass9NQ r5 = this.A00;
            if (r5 != null) {
                try {
                    JSONObject A152 = C17880vN.A15();
                    C1418477e r0 = r5.A00;
                    if (r0 != null) {
                        A152.put("base-amount", r0.A00);
                    }
                    String str3 = r5.A01;
                    if (!TextUtils.isEmpty(str3)) {
                        A152.put("base-currency", str3);
                    }
                    BigDecimal bigDecimal = r5.A02;
                    if (bigDecimal != null) {
                        AnonymousClass8BS.A1C(bigDecimal, "currency-fx", A152);
                    }
                    BigDecimal bigDecimal2 = r5.A03;
                    if (bigDecimal2 != null) {
                        AnonymousClass8BS.A1C(bigDecimal2, "currency-markup", A152);
                    }
                    str = A152.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
                    str = null;
                }
                A15.put("fx-detail", str);
            }
            return A15.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiInternationalTransactionDetailData toDBString threw: ", e2);
            return null;
        }
    }
}
