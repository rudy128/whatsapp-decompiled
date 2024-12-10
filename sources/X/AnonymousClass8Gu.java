package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Gu  reason: invalid class name */
public class AnonymousClass8Gu extends AnonymousClass8D1 {
    public static final Parcelable.Creator CREATOR = new AD6(4);
    public int A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }
}
