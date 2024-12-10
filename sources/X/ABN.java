package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABN implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass8pI r0 = new AnonymousClass8pI();
        r0.A0B(parcel);
        return r0;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pI[i];
    }
}
