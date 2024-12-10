package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.75t  reason: invalid class name and case insensitive filesystem */
public final class C1414775t implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        boolean A1O = AnonymousClass000.A1O(parcel.readInt());
        int readInt = parcel.readInt();
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            arrayList = C17880vN.A0z(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(AnonymousClass774.CREATOR.createFromParcel(parcel));
            }
        }
        return new AnonymousClass77N(valueOf, valueOf2, valueOf3, A0y, readString, parcel.readString(), arrayList, readInt, A1O);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77N[i];
    }
}
