package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public final class ADS implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public long A00 = 0;
    public long A01 = 0;
    public String A02 = null;
    public boolean A03 = false;

    public ADS(String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                this.A03 = A16.optBoolean("is-complaint-eligible", false);
                this.A00 = A16.optLong("created-ts");
                this.A01 = A16.optLong("updated-ts");
                this.A02 = A16.optString("complaint-status");
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionComplaintData threw: ", e);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
    }

    public String A00() {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("is-complaint-eligible", this.A03);
            long j = this.A00;
            if (j > 0) {
                A15.put("created-ts", j);
            }
            long j2 = this.A01;
            if (j2 > 0) {
                A15.put("updated-ts", j2);
            }
            String str = this.A02;
            if (str != null) {
                A15.put("complaint-status", str);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionComplaintData toJson threw: ", e);
        }
        return C18070vi.A0H(A15);
    }
}
