package X;

import android.os.Parcel;
import android.os.Parcelable;

public class D3R implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public boolean A00;
    public final C26558D3y A01;
    public final D4C A02;
    public final String A03;
    public final float[] A04;
    public final float[] A05;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeFloatArray(this.A05);
        parcel.writeFloatArray(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        this.A01.writeToParcel(parcel, i);
    }

    public D3R(C26558D3y d3y, D4C d4c, String str, float[] fArr, float[] fArr2, boolean z) {
        C18070vi.A0o(str, fArr, fArr2);
        C72473Md.A1J(d4c, d3y);
        this.A03 = str;
        this.A05 = fArr;
        this.A04 = fArr2;
        this.A00 = z;
        this.A02 = d4c;
        this.A01 = d3y;
    }
}
