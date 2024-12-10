package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class ABL implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        C20284AEs aEs = new C20284AEs();
        aEs.A09(parcel);
        return aEs;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass8pN[i];
    }
}
