package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AAR implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C168138iN((C20287AEv) AnonymousClass3Ma.A08(parcel, C168138iN.class), AnonymousClass000.A1O(parcel.readInt()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C168138iN[i];
    }
}
