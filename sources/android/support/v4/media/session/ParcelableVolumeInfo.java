package android.support.v4.media.session;

import X.AnonymousClass0R8;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(7);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }
}
