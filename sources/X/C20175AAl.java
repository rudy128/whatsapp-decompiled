package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.AAl  reason: case insensitive filesystem */
public final class C20175AAl implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        A6S a6s;
        Object createFromParcel;
        String A0y = C72453Mb.A0y(parcel);
        String readString = parcel.readString();
        BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
        String readString2 = parcel.readString();
        if (readString2 != null) {
            a6s = new A6S(readString2);
        } else {
            a6s = null;
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20246ADe.CREATOR.createFromParcel(parcel);
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        return new ADV((AE6) AnonymousClass3Ma.A08(parcel, ADV.class), (C20246ADe) createFromParcel, a6s, A0y, readString, bigDecimal, readInt, readInt2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADV[i];
    }
}
