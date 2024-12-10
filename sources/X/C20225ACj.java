package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.ACj  reason: case insensitive filesystem */
public final class C20225ACj implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        AnonymousClass9Je r1;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = AE2.CREATOR.createFromParcel(parcel);
        }
        AE2 ae2 = (AE2) createFromParcel;
        int readInt2 = parcel.readInt();
        if (readInt2 == 0) {
            r1 = AnonymousClass9Je.DEFAULT;
        } else if (readInt2 != 1) {
            r1 = null;
        } else {
            r1 = AnonymousClass9Je.EXTENSIONS_1;
        }
        return new C20268AEb(r1, ae2, A0y, readString, readString2, readInt);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20268AEb[i];
    }
}
