package X;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

public final class D2E implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 2) {
                i = C26300CxD.A06(parcel, c, 3, readInt, i);
            } else {
                pointFArr = (PointF[]) C26300CxD.A0R(parcel, PointF.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23050BaR(pointFArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23050BaR[i];
    }
}
