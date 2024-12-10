package X;

import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pe  reason: invalid class name and case insensitive filesystem */
public final class C170308pe extends AnonymousClass8pG {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00;
    public C20274AEh A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.2r3, java.lang.Object] */
    public static final ARR A00(AnonymousClass1KI r7, C29621ca r8) {
        if (r8 != null) {
            ? obj = new Object();
            obj.A02 = AnonymousClass1KL.A0C;
            ARR A002 = obj.A00();
            C29621ca A0K = r8.A0K("money");
            if (A0K == null) {
                C17890vO.A19(AnonymousClass000.A11("PAY: BrazilTransactionCountryData :: extractAmountFromNode"), " :: money node is null");
            } else {
                try {
                    String A0P = A0K.A0P("value");
                    String A0P2 = A0K.A0P("offset");
                    AnonymousClass1KJ A012 = r7.A01(A0K.A0P("currency"));
                    obj.A01 = Long.parseLong(A0P);
                    obj.A00 = Integer.parseInt(A0P2);
                    obj.A02 = A012;
                    return obj.A00();
                } catch (Exception e) {
                    C108995ce.A1M(" :: an error occurred while parsing the money node :: e = ", AnonymousClass000.A11("PAY: BrazilTransactionCountryData :: extractAmountFromNode"), e);
                    return A002;
                }
            }
        }
        return null;
    }

    public String A04() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void A07(List list) {
        C18070vi.A0d(list, 1);
        String str = this.A05;
        if (str != null && str.length() > 0) {
            AnonymousClass8BT.A1S("nonce", str, list);
        }
        String str2 = this.A04;
        if (str2 != null && str2.length() > 0) {
            AnonymousClass8BT.A1S("device-id", str2, list);
        }
        Boolean bool = this.A02;
        if (bool != null) {
            AnonymousClass8BT.A1S("is_first_send", AnonymousClass8BS.A0b(bool.booleanValue() ? 1 : 0), list);
        }
        String str3 = this.A06;
        if (str3 != null && str3.length() > 0) {
            AnonymousClass8BT.A1S("psp_transaction_id", str3, list);
        }
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.2r3, java.lang.Object] */
    public void A06(String str) {
        C20274AEh aEh;
        C18070vi.A0d(str, 0);
        try {
            super.A06(str);
            JSONObject A16 = C17880vN.A16(str);
            this.A00 = A16.optLong("expiryTs", this.A00);
            this.A05 = A16.optString("nonce", this.A05);
            this.A04 = A16.optString("deviceId", this.A04);
            this.A03 = A16.optString("amount", this.A03);
            this.A07 = A16.optString("sender-alias", this.A07);
            if (A16.has("isFirstSend")) {
                this.A02 = Boolean.valueOf(A16.optBoolean("isFirstSend", false));
            }
            if (A16.has("pspTransactionId")) {
                this.A06 = A16.optString("pspTransactionId", this.A06);
            }
            if (A16.has("installment")) {
                JSONObject jSONObject = A16.getJSONObject("installment");
                if (jSONObject == null) {
                    aEh = null;
                } else {
                    int i = jSONObject.getInt("max_count");
                    int i2 = jSONObject.getInt("selected_count");
                    JSONObject optJSONObject = jSONObject.optJSONObject("due_amount_obj");
                    ? obj = new Object();
                    AnonymousClass1KJ r4 = AnonymousClass1KL.A0C;
                    obj.A02 = r4;
                    obj.A00();
                    ARR A0I = AnonymousClass8BU.A0I(optJSONObject);
                    C18070vi.A0z(A0I, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMoney");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("interest_obj");
                    ? obj2 = new Object();
                    obj2.A02 = r4;
                    obj2.A00();
                    ARR A0I2 = AnonymousClass8BU.A0I(optJSONObject2);
                    C18070vi.A0z(A0I2, "null cannot be cast to non-null type com.whatsapp.data.payments.PaymentMoney");
                    aEh = new C20274AEh(A0I, A0I2, i, i2);
                }
                this.A01 = aEh;
            }
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData fromDBString threw: ", e);
        }
    }

    public void A05(AnonymousClass1KI r7, C29621ca r8, int i) {
        C20274AEh aEh;
        C18070vi.A0i(r7, r8);
        this.A06 = C29621ca.A02(r8, "psp_transaction_id");
        C29621ca A0K = r8.A0K("installment");
        if (A0K != null) {
            try {
                int A0A = A0K.A0A("max_count", 0);
                int A0A2 = A0K.A0A("selected_count", 0);
                ARR A002 = A00(r7, A0K.A0K("due_amount"));
                ARR A003 = A00(r7, A0K.A0K("interest"));
                if (!(A002 == null || A003 == null)) {
                    aEh = new C20274AEh(A002, A003, A0A, A0A2);
                    this.A01 = aEh;
                }
            } catch (AnonymousClass1UI e) {
                Log.e((Throwable) e);
            }
            aEh = null;
            this.A01 = aEh;
        }
    }

    public void A0R(AnonymousClass8pG r6) {
        super.A0R(r6);
        C170308pe r62 = (C170308pe) r6;
        long j = r62.A00;
        if (j > 0) {
            this.A00 = j;
        }
        this.A05 = r62.A05;
        this.A04 = r62.A04;
        this.A03 = r62.A03;
        this.A07 = r62.A07;
        this.A02 = r62.A02;
        this.A06 = r62.A06;
        this.A01 = r62.A01;
    }
}
