package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1KK  reason: invalid class name */
public abstract class AnonymousClass1KK implements AnonymousClass1KJ {
    public final int A00;
    public final int A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final String A05;

    public /* synthetic */ String BLc(C18000vb r9, AnonymousClass1KN r10) {
        AnonymousClass1KL r1 = (AnonymousClass1KL) this;
        C18070vi.A0d(r9, 0);
        C18070vi.A0d(r10, 1);
        String str = r1.A06;
        BigDecimal bigDecimal = r10.A00;
        String A012 = C20067A5r.A01(r9, str, r1.A09, bigDecimal, bigDecimal.scale(), true);
        C18070vi.A0X(A012);
        return A012;
    }

    public /* synthetic */ String BLd(C18000vb r5, BigDecimal bigDecimal) {
        AnonymousClass1KL r3 = (AnonymousClass1KL) this;
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(bigDecimal, 1);
        String A022 = C20067A5r.A02(r5, r3.A06, r3.A09, bigDecimal, true);
        C18070vi.A0X(A022);
        return A022;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1KK)) {
            return false;
        }
        AnonymousClass1KK r4 = (AnonymousClass1KK) obj;
        return this.A05.equals(r4.A05) && this.A02.equals(r4.A02) && this.A00 == r4.A00 && this.A03 == r4.A03 && this.A01 == r4.A01 && this.A04 == r4.A04;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass1KL r1 = (AnonymousClass1KL) this;
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(r1.A01);
        parcel.writeString(r1.A06);
        parcel.writeString(r1.A09);
        parcel.writeInt(r1.A03);
        parcel.writeInt(r1.A02);
        parcel.writeInt(r1.A04);
        parcel.writeString(r1.A07);
        parcel.writeString(r1.A08);
        r1.A00.writeToParcel(parcel, i);
        r1.A05.writeToParcel(parcel, i);
    }

    public JSONObject CPM() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.A05);
            jSONObject.put("symbol", this.A02);
            jSONObject.put("offset", this.A03);
            jSONObject.put("displayExponent", this.A01);
            jSONObject.put("weight", this.A04);
            jSONObject.put("currencyType", this.A00);
            return jSONObject;
        } catch (JSONException e) {
            Log.e("PAY: BasePaymentCurrency toJsonObject threw: ", e);
            return jSONObject;
        }
    }

    public int hashCode() {
        return (this.A05.hashCode() * 31) + (this.A02.hashCode() * 31) + this.A00 + this.A03 + this.A01 + this.A04;
    }

    public AnonymousClass1KK(String str, String str2, int i, int i2, int i3, int i4) {
        boolean z = false;
        C17960vV.A0F(i2 >= 1, "BasePaymentCurrency offset should be >= 1");
        C17960vV.A0F(i3 >= 0 ? true : z, "BasePaymentCurrency display exponent should be >= 0");
        this.A05 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = i2;
        this.A04 = i4;
        this.A01 = i3;
    }
}
