package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class AAP implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer A0i;
        Integer A0i2;
        Object[] objArr;
        Integer A0i3;
        String A0y = C72453Mb.A0y(parcel);
        Integer num = null;
        if (parcel.readInt() == 0) {
            A0i = null;
        } else {
            A0i = AnonymousClass8BT.A0i(parcel);
        }
        if (parcel.readInt() == 0) {
            A0i2 = null;
        } else {
            A0i2 = AnonymousClass8BT.A0i(parcel);
        }
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            objArr = null;
        } else {
            int readInt = parcel.readInt();
            objArr = new Object[readInt];
            for (int i = 0; i != readInt; i++) {
                objArr[i] = parcel.readValue(C20273AEg.class.getClassLoader());
            }
        }
        int readInt2 = parcel.readInt();
        if (parcel.readInt() == 0) {
            A0i3 = null;
        } else {
            A0i3 = AnonymousClass8BT.A0i(parcel);
        }
        if (parcel.readInt() != 0) {
            num = AnonymousClass8BT.A0i(parcel);
        }
        return new C20273AEg(A0i, A0i2, A0i3, num, A0y, readString, objArr, readInt2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20273AEg[i];
    }
}
