package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.76W  reason: invalid class name */
public final class AnonymousClass76W implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AnonymousClass77Q.CREATOR.createFromParcel(parcel);
        }
        AnonymousClass77Q r3 = (AnonymousClass77Q) createFromParcel;
        int readInt = parcel.readInt();
        ArrayList A0z = C17880vN.A0z(readInt);
        for (int i = 0; i != readInt; i++) {
            A0z.add(AnonymousClass77Q.CREATOR.createFromParcel(parcel));
        }
        return new AnonymousClass77O(r3, A0y, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, A0z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77O[i];
    }
}
