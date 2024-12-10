package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2ug  reason: invalid class name and case insensitive filesystem */
public final class C64382ug implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        C18070vi.A0d(parcel, 0);
        String readString = parcel.readString();
        Object obj = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            obj = C64562uy.CREATOR.createFromParcel(parcel);
        }
        return new C64532uv((C64562uy) obj, valueOf, readString);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C64532uv[i];
    }
}
