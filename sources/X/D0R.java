package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0R implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        try {
            for (C0V c0v : C0V.values()) {
                if (readString.equals(c0v.zze)) {
                    return c0v;
                }
            }
            throw new C1d(readString);
        } catch (C1d e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0V[i];
    }
}
