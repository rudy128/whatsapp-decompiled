package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.76X  reason: invalid class name */
public final class AnonymousClass76X implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Long valueOf;
        Boolean valueOf2;
        Integer A00 = AnonymousClass6XI.A00(C72453Mb.A0y(parcel));
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(AnonymousClass000.A1O(parcel.readInt()));
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = C17880vN.A0z(readInt);
            for (int i = 0; i != readInt; i++) {
                C17890vO.A1D(arrayList, parcel.readInt());
            }
        }
        return new C1418277c(valueOf2, A00, valueOf, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, arrayList, C72473Md.A1R(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1418277c[i];
    }
}
