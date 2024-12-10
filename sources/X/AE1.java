package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AE1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final long A01;
    public final String A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE1) {
                AE1 ae1 = (AE1) obj;
                if (!(this.A01 == ae1.A01 && this.A00 == ae1.A00 && C18070vi.A18(this.A02, ae1.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public int hashCode() {
        return ((AnonymousClass8BV.A00(this.A01) + this.A00) * 31) + C17900vP.A00(this.A02);
    }

    public AE1(long j, int i, String str) {
        this.A01 = j;
        this.A00 = i;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OrderPaymentAmount(value=");
        A10.append(this.A01);
        A10.append(", offset=");
        A10.append(this.A00);
        A10.append(", description=");
        return C17900vP.A0B(this.A02, A10);
    }
}
