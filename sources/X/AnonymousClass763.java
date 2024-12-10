package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.763  reason: invalid class name */
public final class AnonymousClass763 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long valueOf;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        Long l = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() != 0) {
            l = Long.valueOf(parcel.readLong());
        }
        return new AnonymousClass77V(valueOf, l, A0y, readString, readString2, readString3, readString4, readString5, readString6);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77V[i];
    }
}
