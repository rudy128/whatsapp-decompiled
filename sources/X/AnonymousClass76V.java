package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76V  reason: invalid class name */
public final class AnonymousClass76V implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        boolean A1R = C72473Md.A1R(parcel);
        boolean A1R2 = C72473Md.A1R(parcel);
        boolean A1R3 = C72473Md.A1R(parcel);
        boolean A1R4 = C72473Md.A1R(parcel);
        return new AnonymousClass77Q(A0y, readString, readString2, readString3, readString4, readString5, parcel.readString(), parcel.readString(), parcel.createStringArray(), readInt, readInt2, readInt3, A1R, A1R2, A1R3, A1R4);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77Q[i];
    }
}
