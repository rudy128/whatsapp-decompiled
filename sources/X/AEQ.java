package X;

import android.os.Parcel;
import android.os.Parcelable;

public class AEQ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;
    public final String A01;

    public int describeContents() {
        return 0;
    }

    public void A01(Parcel parcel) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AEQ)) {
            return false;
        }
        AEQ aeq = (AEQ) obj;
        if (!C18070vi.A18(this.A00, aeq.A00) || !C18070vi.A18(this.A01, aeq.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17880vN.A03(this.A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this instanceof AnonymousClass8nD) {
            AnonymousClass8nD r1 = (AnonymousClass8nD) this;
            C18070vi.A0d(parcel, 0);
            r1.A01(parcel);
            parcel.writeString(r1.A03);
            parcel.writeString(r1.A02);
            return;
        }
        C18070vi.A0d(parcel, 0);
        A01(parcel);
    }

    public AEQ(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BizCategory:{'id'='");
        A10.append(this.A00);
        A10.append("', 'name'='");
        A10.append(this.A01);
        return AnonymousClass000.A0y("'}", A10);
    }
}
