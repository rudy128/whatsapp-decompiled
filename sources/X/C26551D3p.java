package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D3p  reason: case insensitive filesystem */
public final class C26551D3p implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(45);
    public int A00;
    public final boolean A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public C26551D3p(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = C17890vO.A1R(parcel.readInt());
    }

    public C26551D3p() {
        this.A01 = false;
    }
}
