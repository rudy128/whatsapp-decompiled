package X;

import android.os.Parcel;
import android.os.Parcelable;

public class ADL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(20);
    public long A00;
    public long A01 = 0;
    public String A02;
    public boolean A03;

    public int describeContents() {
        return 0;
    }

    public ADL(long j, String str, boolean z) {
        this.A02 = str;
        this.A00 = j;
        this.A03 = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeLong(this.A01);
    }
}
