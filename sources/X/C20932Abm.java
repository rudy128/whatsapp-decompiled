package X;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* renamed from: X.Abm  reason: case insensitive filesystem */
public final class C20932Abm implements BDZ {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public C20932Abm(String str, String str2, String str3) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20932Abm) {
                C20932Abm abm = (C20932Abm) obj;
                if (!C18070vi.A18(this.A02, abm.A02) || !C18070vi.A18(this.A00, abm.A00) || !C18070vi.A18(this.A01, abm.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public JSONObject CPM() {
        return AnonymousClass84U.A00(new B06(this));
    }

    public int hashCode() {
        return ((C17880vN.A03(this.A02) + C17900vP.A00(this.A00)) * 31) + C108955ca.A06(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentLink(uri=");
        A10.append(this.A02);
        A10.append(", cancelUrl=");
        A10.append(this.A00);
        A10.append(", successUrl=");
        return C17900vP.A0B(this.A01, A10);
    }
}
