package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abg  reason: case insensitive filesystem */
public final class C20926Abg implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;
    public boolean A01;
    public boolean A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20926Abg) {
                C20926Abg abg = (C20926Abg) obj;
                if (!(this.A01 == abg.A01 && C18070vi.A18(this.A00, abg.A00) && this.A02 == abg.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B05(this));
    }

    public int hashCode() {
        return C17880vN.A01((AnonymousClass3MX.A03(this.A01) + C17900vP.A00(this.A00)) * 31, this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentCards(enabled=");
        A10.append(this.A01);
        A10.append(", paymentConfiguration=");
        A10.append(this.A00);
        A10.append(", paymentGatewayCheckoutEnabled=");
        return C17900vP.A0F(A10, this.A02);
    }
}
