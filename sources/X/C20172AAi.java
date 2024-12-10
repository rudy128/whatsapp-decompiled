package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAi  reason: case insensitive filesystem */
public final class C20172AAi implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Object obj = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt()));
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20258ADq.CREATOR.createFromParcel(parcel);
        }
        C20258ADq aDq = (C20258ADq) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = AE7.CREATOR.createFromParcel(parcel);
        }
        return new AEN(aDq, (AE7) obj, valueOf, A0y, readString, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEN[i];
    }
}
