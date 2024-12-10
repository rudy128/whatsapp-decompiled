package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Gs  reason: invalid class name */
public class AnonymousClass8Gs extends AnonymousClass8D1 {
    public static final Parcelable.Creator CREATOR = new AD6(1);
    public String A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
