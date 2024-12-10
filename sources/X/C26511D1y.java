package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.D1y  reason: case insensitive filesystem */
public final class C26511D1y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                str = C26300CxD.A0E(parcel, str, c, 2, readInt);
            } else {
                arrayList = C26300CxD.A0F(parcel, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23210Bd5(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23210Bd5[i];
    }
}
