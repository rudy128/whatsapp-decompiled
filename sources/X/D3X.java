package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class D3X implements Parcelable {
    public static final E0X CREATOR = new C26654D8d(1);
    public int A00;
    public final int A01;
    public final D48[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && Arrays.equals(this.A02, ((D3X) obj).A02);
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeParcelable(this.A02[0], 0);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 16337 + Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public D3X(D48... d48Arr) {
        this.A02 = d48Arr;
        int A012 = C26233CvQ.A01(d48Arr[0].A0S);
        this.A01 = A012 == -1 ? C26233CvQ.A01(d48Arr[0].A0P) : A012;
    }
}
