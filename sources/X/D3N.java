package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D3N implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public D3N(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
