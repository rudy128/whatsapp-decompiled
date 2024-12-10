package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.76e  reason: invalid class name and case insensitive filesystem */
public final class C1415876e implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer valueOf;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        boolean A1R = C72473Md.A1R(parcel);
        boolean A1R2 = C72473Md.A1R(parcel);
        boolean A1R3 = C72473Md.A1R(parcel);
        boolean A1R4 = C72473Md.A1R(parcel);
        boolean A1R5 = C72473Md.A1R(parcel);
        String[] createStringArray = parcel.createStringArray();
        boolean A1R6 = C72473Md.A1R(parcel);
        boolean A1R7 = C72473Md.A1R(parcel);
        String readString7 = parcel.readString();
        int readInt3 = parcel.readInt();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        boolean A1R8 = C72473Md.A1R(parcel);
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new C1418377d(valueOf, A0y, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, createStringArray, readInt, readInt2, readInt3, A1R, A1R2, A1R3, A1R4, A1R5, A1R6, A1R7, A1R8);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1418377d[i];
    }
}
