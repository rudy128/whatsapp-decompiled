package X;

import android.os.Parcel;
import android.os.Parcelable;

public class D3Q implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(30);
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A04);
    }

    public D3Q(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readDouble();
        this.A03 = parcel.readDouble();
        this.A04 = parcel.readDouble();
    }
}
