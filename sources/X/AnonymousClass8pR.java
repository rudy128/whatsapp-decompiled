package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pR  reason: invalid class name */
public final class AnonymousClass8pR extends AnonymousClass8pW {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;
    public int A04 = 1;

    public String A04() {
        Object obj;
        try {
            JSONObject A0B = A0B();
            A0B.put("v", this.A04);
            if (!C20061A5k.A02(this.A01)) {
                C1418477e r0 = this.A01;
                if (r0 != null) {
                    obj = r0.A00;
                } else {
                    obj = null;
                }
            } else {
                obj = "";
            }
            A0B.put("bankName", obj);
            A0B.put("bankCode", this.A01);
            A0B.put("verificationStatus", this.A00);
            return A0B.toString();
        } catch (JSONException e) {
            C17900vP.A0Z(e, "PAY: BrazilBankAccountMethodData toDBString threw: ", AnonymousClass000.A10());
            return null;
        }
    }

    public void A05(AnonymousClass1KI r4, C29621ca r5, int i) {
        C18070vi.A0d(r5, 2);
        this.A05 = r5.A0Q("country", (String) null);
        this.A06 = r5.A0Q("credential-id", (String) null);
        this.A02 = AnonymousClass8BW.A0K(r5.A0Q("account-number", (String) null), "bankAccountNumber");
        this.A01 = AnonymousClass8BW.A0K(r5.A0Q("bank-name", (String) null), "bankName");
        String A0Q = r5.A0Q("code", (String) null);
        this.A01 = A0Q;
        if (A0Q == null) {
            this.A01 = r5.A0Q("bank-code", (String) null);
        }
        String A0Q2 = r5.A0Q("verification-status", (String) null);
        if (A0Q2 != null) {
            this.A00 = C20284AEs.A00(A0Q2);
        }
        this.A02 = r5.A0Q("short-name", (String) null);
        this.A03 = r5.A0Q("bank-image", (String) null);
        this.A03 = "1".equals(r5.A0Q("accept-savings", (String) null));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A00);
    }

    public void A06(String str) {
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                this.A03 = A16.optString("bankImageURL", (String) null);
                this.A04 = A16.optString("bankPhoneNumber", (String) null);
                this.A04 = A16.optInt("v", 1);
                this.A01 = C20061A5k.A00(A16.optString("bankName"), "bankName");
                this.A01 = A16.optString("bankCode");
                this.A00 = A16.optInt("verificationStatus");
            } catch (JSONException e) {
                C17900vP.A0Z(e, "PAY: BrazilBankAccountMethodData fromDBString threw: ", AnonymousClass000.A10());
            }
        }
    }

    public void A07(List list) {
        throw AnonymousClass04E.createAndThrow();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ credentialId: ");
        A10.append(this.A06);
        A10.append("maskedAccountNumber: ");
        A10.append(this.A02);
        A10.append(" bankName: ");
        A10.append(this.A01);
        A10.append(" bankCode: ");
        A10.append(this.A01);
        A10.append(" verificationStatus: ");
        A10.append(this.A00);
        A10.append(" bankShortName: ");
        A10.append(this.A02);
        A10.append(" acceptSavings: ");
        A10.append(this.A03);
        return C17890vO.A0c(A10, ']');
    }
}
