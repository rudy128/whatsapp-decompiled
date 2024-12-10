package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D32 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new BHO(AnonymousClass3Ma.A08(parcel, BHO.class), parcel.readFloat(), parcel.readFloat());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BHO[i];
    }
}
