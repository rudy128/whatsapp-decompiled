package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class AAZ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList A0z;
        ArrayList A0z2;
        Object createFromParcel;
        int i = 0;
        Object obj = null;
        if (C72453Mb.A0A(parcel) == 0) {
            A0z = null;
        } else {
            int readInt = parcel.readInt();
            A0z = C17880vN.A0z(readInt);
            for (int i2 = 0; i2 != readInt; i2++) {
                A0z.add(AnonymousClass3Ma.A08(parcel, AE6.class));
            }
        }
        if (parcel.readInt() == 0) {
            A0z2 = null;
        } else {
            int readInt2 = parcel.readInt();
            A0z2 = C17880vN.A0z(readInt2);
            while (i != readInt2) {
                i = AnonymousClass8BV.A01(parcel, C20245ADd.CREATOR, A0z2, i);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = C20257ADp.CREATOR.createFromParcel(parcel);
        }
        C20257ADp aDp = (C20257ADp) createFromParcel;
        if (parcel.readInt() != 0) {
            obj = ADW.CREATOR.createFromParcel(parcel);
        }
        return new AE6((ADW) obj, aDp, A0z, A0z2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AE6[i];
    }
}
