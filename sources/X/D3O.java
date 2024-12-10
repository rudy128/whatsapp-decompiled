package X;

import android.os.Parcel;
import android.os.Parcelable;

public class D3O implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(42);
    public final long A00;
    public final long A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public D3O(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
