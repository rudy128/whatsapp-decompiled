package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D0L implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        try {
            return C24367C0c.A00(readString);
        } catch (C24382C1b e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C24367C0c[i];
    }
}
