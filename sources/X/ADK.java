package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00 = "";
    public boolean A01 = true;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }
}
