package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.Czo  reason: case insensitive filesystem */
public final class C26449Czo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C26300CxD.A03(parcel, readInt);
            } else if (c != 2) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                arrayList = C26300CxD.A0G(parcel, C23098BbD.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23039BaG(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23039BaG[i];
    }
}
