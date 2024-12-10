package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACc  reason: case insensitive filesystem */
public final class C20218ACc implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20937Abr.CREATOR.createFromParcel(parcel);
        }
        return new C20928Abi((C20937Abr) createFromParcel, A0y);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20928Abi[i];
    }
}
