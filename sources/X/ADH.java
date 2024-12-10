package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ADH implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A00);
    }

    public ADH(String str) {
        this.A00 = str;
    }
}
