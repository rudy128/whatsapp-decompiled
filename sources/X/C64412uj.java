package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2uj  reason: invalid class name and case insensitive filesystem */
public final class C64412uj implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C42711yc.CREATOR;
        return new C42711yc(parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C42711yc[i];
    }
}
