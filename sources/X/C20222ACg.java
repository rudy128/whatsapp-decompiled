package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACg  reason: case insensitive filesystem */
public final class C20222ACg implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        C18070vi.A0d(parcel, 0);
        C20931Abl abl = (C20931Abl) C20931Abl.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20935Abp.CREATOR.createFromParcel(parcel);
        }
        return new C20930Abk((C20935Abp) createFromParcel, abl);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20930Abk[i];
    }
}
