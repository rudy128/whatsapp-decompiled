package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.2ub  reason: invalid class name and case insensitive filesystem */
public final class C64332ub implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        boolean z = false;
        for (int i = 0; i != readInt; i++) {
            A0z.add(C64552ux.CREATOR.createFromParcel(parcel));
        }
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new C64572uz(readString, readString2, A0z, z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C64572uz[i];
    }
}
