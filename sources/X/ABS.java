package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABS implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        if (A0y != null) {
            AnonymousClass8pM r0 = new AnonymousClass8pM(A0y);
            r0.A09(parcel);
            return r0;
        }
        throw C17880vN.A0g();
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pM[i];
    }
}
