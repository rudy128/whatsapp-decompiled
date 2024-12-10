package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class D3S implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(3);
    public int A00;
    public String A01 = null;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A04 = AnonymousClass000.A13();
    public ArrayList A05 = AnonymousClass000.A13();
    public ArrayList A06;
    public C64602v2[] A07;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A04);
        parcel.writeTypedList(this.A05);
        parcel.writeTypedList(this.A06);
    }
}
