package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABR implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        boolean z = true;
        boolean A1T = AnonymousClass000.A1T(parcel.readByte(), 1);
        if (parcel.readByte() != 1) {
            z = false;
        }
        AnonymousClass8pO r0 = new AnonymousClass8pO(A0y, parcel.readString(), parcel.readInt(), A1T, z);
        r0.A09(parcel);
        return r0;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pO[i];
    }
}
