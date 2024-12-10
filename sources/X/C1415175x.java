package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75x  reason: invalid class name and case insensitive filesystem */
public final class C1415175x implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AnonymousClass775.CREATOR.createFromParcel(parcel);
        }
        return new AnonymousClass77E((AnonymousClass775) createFromParcel, A0y, readString, readString2, readString3);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77E[i];
    }
}
