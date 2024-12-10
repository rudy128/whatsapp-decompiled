package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D06 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C0Z.A00(parcel.readString());
        } catch (C1W e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0Z[i];
    }
}
