package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;

/* renamed from: X.AAa  reason: case insensitive filesystem */
public final class C20164AAa implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C20257ADp(C72453Mb.A0y(parcel), (BigDecimal) parcel.readSerializable(), A3Y.A01(parcel));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C20257ADp[i];
    }
}
