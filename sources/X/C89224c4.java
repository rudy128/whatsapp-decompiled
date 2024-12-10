package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4c4  reason: invalid class name and case insensitive filesystem */
public final class C89224c4 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A0A = C72453Mb.A0A(parcel);
        return new C89484cX(parcel.readString(), A0A, parcel.readInt(), parcel.readInt(), parcel.readInt(), C72473Md.A1R(parcel), C72473Md.A1R(parcel), C72473Md.A1R(parcel), C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89484cX[i];
    }
}
