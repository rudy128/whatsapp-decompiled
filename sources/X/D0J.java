package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0J implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return C24365C0a.A00(parcel.readString());
        } catch (C24381C1a e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C24365C0a[i];
    }
}
