package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.AAz  reason: case insensitive filesystem */
public final class C20189AAz implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer A0i;
        int A0A = C72453Mb.A0A(parcel);
        int readInt = parcel.readInt();
        Integer num = null;
        if (parcel.readInt() == 0) {
            A0i = null;
        } else {
            A0i = AnonymousClass8BT.A0i(parcel);
        }
        if (parcel.readInt() != 0) {
            num = AnonymousClass8BT.A0i(parcel);
        }
        return new AE8(A0i, num, A0A, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE8[i];
    }
}
