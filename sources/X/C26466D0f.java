package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.D0f  reason: case insensitive filesystem */
public final class C26466D0f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                arrayList = C26300CxD.A0G(parcel, C23133Bbm.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23122Bbb(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23122Bbb[i];
    }
}
