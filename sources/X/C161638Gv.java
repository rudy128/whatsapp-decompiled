package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Gv  reason: invalid class name and case insensitive filesystem */
public class C161638Gv extends AnonymousClass8D1 {
    public static final Parcelable.Creator CREATOR = new AD6(6);
    public boolean A00;

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
