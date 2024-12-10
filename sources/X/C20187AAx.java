package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAx  reason: case insensitive filesystem */
public final class C20187AAx implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "pincode";
        }
        return new C20259ADr(A0y, readString, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20259ADr[i];
    }
}
