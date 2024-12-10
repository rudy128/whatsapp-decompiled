package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.75p  reason: invalid class name and case insensitive filesystem */
public final class C1414375p implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass6R7 valueOf;
        C18070vi.A0d(parcel, 0);
        boolean A1R = C72473Md.A1R(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = AnonymousClass6R7.valueOf(parcel.readString());
        }
        return new C115945w6(valueOf, readString, readString2, parcel.readInt(), A1R);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C115945w6[i];
    }
}
