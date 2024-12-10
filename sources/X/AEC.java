package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AEC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C1418477e A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AEC) {
                AEC aec = (AEC) obj;
                if (!C18070vi.A18(this.A00, aec.A00) || !C18070vi.A18(this.A03, aec.A03) || !C18070vi.A18(this.A01, aec.A01) || !C18070vi.A18(this.A02, aec.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, C17890vO.A02(this.A01, C17890vO.A02(this.A03, AnonymousClass000.A0L(this.A00))));
    }

    public AEC(C1418477e r1, String str, String str2, String str3) {
        C18070vi.A0s(r1, str, str2, str3);
        this.A00 = r1;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentAliasData(alias=");
        A10.append(this.A00);
        A10.append(", aliasType=");
        A10.append(this.A03);
        A10.append(", aliasId=");
        A10.append(this.A01);
        A10.append(", aliasStatus=");
        return C17900vP.A0B(this.A02, A10);
    }
}
