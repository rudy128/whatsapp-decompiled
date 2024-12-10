package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class D3Y implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(22);
    public final int A00;
    public final int A01;
    public final int[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D3Y d3y = (D3Y) obj;
            if (this.A00 != d3y.A00 || !Arrays.equals(this.A02, d3y.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        int[] iArr = this.A02;
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(iArr);
    }

    public D3Y(Parcel parcel) {
        this.A00 = parcel.readInt();
        int readByte = parcel.readByte();
        this.A01 = readByte;
        int[] iArr = new int[readByte];
        this.A02 = iArr;
        parcel.readIntArray(iArr);
    }
}
