package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABT implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        int readInt = parcel.readInt();
        return new ARR(AnonymousClass1KI.A00(parcel), (AnonymousClass1KN) AnonymousClass1KN.CREATOR.createFromParcel(parcel), readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ARR[i];
    }
}
