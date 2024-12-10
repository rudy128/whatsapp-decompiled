package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0P implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C24366C0b.A00(parcel.readString());
        } catch (C1X e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C24366C0b[i];
    }
}
