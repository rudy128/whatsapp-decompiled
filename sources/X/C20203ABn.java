package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.location.PlaceInfo;
import java.util.ArrayList;

/* renamed from: X.ABn  reason: case insensitive filesystem */
public final class C20203ABn implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer A0i;
        Parcel parcel2 = parcel;
        int A0A = C72453Mb.A0A(parcel2);
        double readDouble = parcel2.readDouble();
        double readDouble2 = parcel2.readDouble();
        int readInt = parcel2.readInt();
        String readString = parcel2.readString();
        int readInt2 = parcel2.readInt();
        ArrayList A0z = C17880vN.A0z(readInt2);
        for (int i = 0; i != readInt2; i = AnonymousClass8BV.A01(parcel2, PlaceInfo.CREATOR, A0z, i)) {
        }
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        int readInt3 = parcel2.readInt();
        if (parcel2.readInt() == 0) {
            A0i = null;
        } else {
            A0i = AnonymousClass8BT.A0i(parcel2);
        }
        String readString5 = parcel2.readString();
        boolean A1R = C72473Md.A1R(parcel2);
        return new C20283AEr(A0i, readString, readString2, readString3, readString4, readString5, parcel2.readString(), A0z, readDouble, readDouble2, A0A, readInt, readInt3, parcel2.readLong(), A1R, C72473Md.A1R(parcel2));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20283AEr[i];
    }
}
