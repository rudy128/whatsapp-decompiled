package X;

import android.os.Parcel;
import android.os.Parcelable;

public final class D2F implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A02 = C26300CxD.A02(parcel2);
        C23086Bb1[] bb1Arr = null;
        C23050BaR[] baRArr = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = -1.0f;
        while (parcel2.dataPosition() < A02) {
            int readInt = parcel2.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C26300CxD.A03(parcel2, readInt);
                    break;
                case 2:
                    i2 = C26300CxD.A03(parcel2, readInt);
                    break;
                case 3:
                    f = C26300CxD.A01(parcel2, readInt);
                    break;
                case 4:
                    f2 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 5:
                    f3 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 6:
                    f4 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 7:
                    f5 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 8:
                    f6 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 9:
                    bb1Arr = (C23086Bb1[]) C26300CxD.A0R(parcel2, C23086Bb1.CREATOR, readInt);
                    break;
                case 10:
                    f8 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 11:
                    f9 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 12:
                    f10 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 13:
                    baRArr = (C23050BaR[]) C26300CxD.A0R(parcel2, C23050BaR.CREATOR, readInt);
                    break;
                case 14:
                    f7 = C26300CxD.A01(parcel2, readInt);
                    break;
                case 15:
                    f11 = C26300CxD.A01(parcel2, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel2, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel2, A02);
        return new C23103BbI(bb1Arr, baRArr, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23103BbI[i];
    }
}
