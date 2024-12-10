package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.1KM  reason: invalid class name */
public final class AnonymousClass1KM implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        BigDecimal bigDecimal = AnonymousClass1KL.A0D;
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        Parcelable.Creator creator = AnonymousClass1KN.CREATOR;
        return new AnonymousClass1KL((AnonymousClass1KN) creator.createFromParcel(parcel), (AnonymousClass1KN) creator.createFromParcel(parcel), readString, readString2, readString3, readString4, readInt, readInt2, readInt3, readInt4);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1KL[i];
    }
}
