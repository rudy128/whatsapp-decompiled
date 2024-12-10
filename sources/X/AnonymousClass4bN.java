package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4bN  reason: invalid class name */
public final class AnonymousClass4bN implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Float valueOf;
        AnonymousClass4DE valueOf2 = AnonymousClass4DE.valueOf(C72453Mb.A0y(parcel));
        C89304cF r3 = (C89304cF) AnonymousClass3Ma.A08(parcel, C89504cZ.class);
        boolean A1R = C72473Md.A1R(parcel);
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Float.valueOf(parcel.readFloat());
        }
        return new C89504cZ(valueOf2, r3, valueOf, A1R);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89504cZ[i];
    }
}
