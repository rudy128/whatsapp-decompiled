package X;

import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pE  reason: invalid class name */
public final class AnonymousClass8pE extends AnonymousClass8pI {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00 = 1;

    public String A04() {
        JSONObject A15;
        try {
            String A04 = super.A04();
            if (A04 != null) {
                A15 = C17880vN.A16(A04);
            } else {
                A15 = C17880vN.A15();
            }
            A15.put("v", this.A00);
            long j = this.A00;
            if (j != -1) {
                A15.put("nextSyncTimeMillis", j);
            }
            String str = this.A04;
            if (!(str == null || str.length() == 0)) {
                A15.put("dataHash", str);
            }
            return A15.toString();
        } catch (JSONException e) {
            Log.w("PAY: BrazilContactData toDBString threw: ", e);
            return null;
        }
    }

    public void A06(String str) {
        super.A06(str);
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                int optInt = A16.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A00 = A16.optLong("nextSyncTimeMillis", -1);
                }
                this.A04 = A16.optString("dataHash");
            } catch (JSONException e) {
                Log.w("PAY: BrazilContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ ver: ");
        A10.append(this.A00);
        A10.append(" jid: ");
        A10.append(this.A03);
        A10.append(" isMerchant: ");
        A10.append(A0F());
        A10.append(" defaultPaymentType: ");
        A10.append(A08());
        return AnonymousClass000.A0y(" ]", A10);
    }
}
