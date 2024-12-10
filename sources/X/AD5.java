package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

public final class AD5 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new C1776399u((File) parcel.readSerializable(), parcel.readInt(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C1776399u[i];
    }
}
