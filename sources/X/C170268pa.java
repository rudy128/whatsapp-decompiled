package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pa  reason: invalid class name and case insensitive filesystem */
public final class C170268pa extends AnonymousClass8pX {
    public static final Parcelable.Creator CREATOR = new Object();
    public C1418477e A00;
    public AnonymousClass8pS A01;
    public String A02;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public void A06(String str) {
        if (str != null) {
            try {
                A0C(C17880vN.A16(str));
            } catch (JSONException unused) {
                Log.e("PAY: IndiaUpiMerchantMethodData fromDBString threw JSONException");
            }
        }
    }

    public String A04() {
        return C18070vi.A0H(A0B());
    }

    public void A05(AnonymousClass1KI r4, C29621ca r5, int i) {
        C18070vi.A0i(r4, r5);
        String A0Q = r5.A0Q("display-state", (String) null);
        if (A0Q == null || A0Q.length() == 0) {
            A0Q = "ACTIVE";
        }
        this.A07 = A0Q;
        this.A09 = r5.A0Q("merchant-id", (String) null);
        this.A03 = r5.A0Q("business-name", (String) null);
        this.A04 = r5.A0Q("country", (String) null);
        this.A05 = r5.A0Q("credential-id", (String) null);
        this.A00 = AnonymousClass8BW.A0K(r5.A0Q("vpa", (String) null), "upiHandle");
        this.A02 = r5.A0Q("vpa-id", (String) null);
        C29621ca A0K = r5.A0K("bank");
        if (A0K != null) {
            AnonymousClass8pS r0 = new AnonymousClass8pS();
            r0.A05(r4, A0K, i);
            this.A01 = r0;
        }
    }

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public JSONObject A0B() {
        JSONObject A0B = super.A0B();
        try {
            C1418477e r2 = this.A00;
            Object obj = null;
            if (!C20061A5k.A03(r2)) {
                if (r2 != null) {
                    obj = r2.A00;
                }
                A0B.put("vpaHandle", obj);
            }
            String str = this.A02;
            if (str != null) {
                A0B.put("vpaId", str);
            }
            AnonymousClass8pS r3 = this.A01;
            if (r3 != null) {
                JSONObject A15 = C17880vN.A15();
                C1418477e r0 = r3.A02;
                if (r0 != null) {
                    A15.put("accountNumber", r0.A00);
                }
                C1418477e r02 = r3.A01;
                if (r02 != null) {
                    A15.put("bankName", r02.A00);
                }
                A0B.put("bank", A15);
                return A0B;
            }
        } catch (JSONException unused) {
            Log.e("PAY: IndiaUpiMerchantMethodData toJSONObject threw JSONException");
        }
        return A0B;
    }

    public void A0C(JSONObject jSONObject) {
        super.A0C(jSONObject);
        this.A00 = AnonymousClass8BW.A0K(jSONObject.optString("vpaHandle"), "upiHandle");
        this.A02 = jSONObject.optString("vpaId");
        JSONObject optJSONObject = jSONObject.optJSONObject("bank");
        if (optJSONObject != null) {
            AnonymousClass8pS r2 = new AnonymousClass8pS();
            r2.A02 = AnonymousClass8BW.A0K(optJSONObject.optString("accountNumber", (String) null), "bankAccountNumber");
            r2.A01 = AnonymousClass8BW.A0K(optJSONObject.optString("bankName"), "bankName");
            this.A01 = r2;
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiMerchantMethodData{version=");
        A10.append(1);
        A10.append(", vpaId='");
        A10.append(this.A02);
        A10.append("', vpaHandle=");
        A10.append(this.A00);
        A10.append("} ");
        return AnonymousClass000.A0y(super.toString(), A10);
    }
}
