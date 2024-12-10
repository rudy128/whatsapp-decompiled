package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76f  reason: invalid class name and case insensitive filesystem */
public final class C1415976f implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        String A0y = C72453Mb.A0y(parcel);
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt()));
        }
        return new AnonymousClass778(valueOf, A0y, parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass778[i];
    }
}
