package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class BHK extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = D3B.A00(9);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public boolean A06;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }
}
