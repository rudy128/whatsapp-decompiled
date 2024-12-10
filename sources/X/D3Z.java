package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class D3Z implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D36(6);
    public int A00;
    public final int A01;
    public final C26549D3l[] A02;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            D3Z d3z = (D3Z) obj;
            if (this.A01 != d3z.A01 || !Arrays.equals(this.A02, d3z.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 527 + Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }

    public D3Z(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C26549D3l[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = AnonymousClass3Ma.A08(parcel, C26549D3l.class);
        }
    }
}
