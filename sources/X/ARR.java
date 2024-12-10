package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public final class ARR implements C22565BDa {
    public static final C196669vR A03 = new Object();
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final AnonymousClass1KJ A01;
    public final AnonymousClass1KN A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ARR) {
                ARR arr = (ARR) obj;
                if (!C18070vi.A18(this.A02, arr.A02) || this.A00 != arr.A00 || !C18070vi.A18(this.A01, arr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        AnonymousClass1KJ r1 = this.A01;
        AnonymousClass1KJ[] r0 = AnonymousClass1KI.A01;
        parcel.writeParcelable(r1, i);
    }

    public int getValue() {
        BigDecimal bigDecimal = this.A02.A00;
        BigDecimal valueOf = BigDecimal.valueOf((long) this.A00);
        C18070vi.A0X(valueOf);
        BigDecimal multiply = bigDecimal.multiply(valueOf);
        C18070vi.A0X(multiply);
        return multiply.intValue();
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (AnonymousClass000.A0L(this.A02) + this.A00) * 31);
    }

    public ARR(AnonymousClass1KJ r1, AnonymousClass1KN r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public JSONObject CPM() {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("value", getValue());
            A15.put("offset", this.A00);
            AnonymousClass1KJ r2 = this.A01;
            A15.put("currencyType", ((AnonymousClass1KK) r2).A00);
            A15.put("currency", r2.CPM());
            return A15;
        } catch (JSONException e) {
            Log.w("PAY: PaymentMoney toJson threw: ", e);
            return A15;
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentMoney(amountValue=");
        A10.append(this.A02);
        A10.append(", offset=");
        A10.append(this.A00);
        A10.append(", currency=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
