package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2ui  reason: invalid class name and case insensitive filesystem */
public final class C64402ui implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        Parcelable.Creator creator = C47702Jn.CREATOR;
        return new C47702Jn((C42711yc) C42711yc.CREATOR.createFromParcel(parcel), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C47702Jn[i];
    }
}
