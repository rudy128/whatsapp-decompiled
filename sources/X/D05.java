package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;

public final class D05 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.A00(parcel.readString());
        } catch (C1V e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }
}
