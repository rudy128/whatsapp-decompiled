package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AE9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final double A00;
    public final double A01;
    public final int A02;
    public final String A03;

    public AE9(String str, double d, double d2, int i) {
        C18070vi.A0d(str, 4);
        this.A02 = i;
        this.A00 = d;
        this.A01 = d2;
        this.A03 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AE9) {
                AE9 ae9 = (AE9) obj;
                if (!(this.A02 == ae9.A02 && Double.compare(this.A00, ae9.A00) == 0 && Double.compare(this.A01, ae9.A01) == 0 && C18070vi.A18(this.A03, ae9.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeString(this.A03);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, AnonymousClass8BT.A00(AnonymousClass8BT.A00(this.A02 * 31, this.A00), this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessServiceArea(radius=");
        A10.append(this.A02);
        A10.append(", latitude=");
        A10.append(this.A00);
        A10.append(", longitude=");
        A10.append(this.A01);
        A10.append(", areaDescription=");
        return C17900vP.A0B(this.A03, A10);
    }
}
