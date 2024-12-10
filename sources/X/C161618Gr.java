package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Gr  reason: invalid class name and case insensitive filesystem */
public class C161618Gr extends AnonymousClass8D1 {
    public static final Parcelable.Creator CREATOR = new AD6(0);
    public String A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
