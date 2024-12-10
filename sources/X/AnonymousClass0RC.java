package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0RC  reason: invalid class name */
public class AnonymousClass0RC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R8(13);
    public int A00;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
