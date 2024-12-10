package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public ADM(String str, String str2, String str3, String str4, int i, boolean z) {
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = i;
        this.A05 = z;
        this.A01 = str4;
    }
}
