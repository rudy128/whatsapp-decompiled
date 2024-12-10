package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0N implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        try {
            for (C0Y c0y : C0Y.values()) {
                if (readString.equals(c0y.zzb)) {
                    return c0y;
                }
            }
            throw new C24383C1c(readString);
        } catch (C24383C1c e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0Y[i];
    }
}
