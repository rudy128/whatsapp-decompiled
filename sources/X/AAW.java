package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

public final class AAW implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
        String readString = parcel.readString();
        if (readString != null) {
            return new AE5(new A6S(readString), bigDecimal, (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }
        throw C17890vO.A0K();
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE5[i];
    }
}
