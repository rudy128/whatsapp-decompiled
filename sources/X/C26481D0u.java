package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.D0u  reason: case insensitive filesystem */
public final class C26481D0u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        String str = null;
        C23171BcR bcR = null;
        C23166BcM bcM = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C26300CxD.A0D(parcel, readInt);
                    break;
                case 2:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 3:
                    i2 = C26300CxD.A03(parcel, readInt);
                    break;
                case 4:
                    i3 = C26300CxD.A03(parcel, readInt);
                    break;
                case 5:
                    bcR = DJ0.A0A(parcel, readInt);
                    break;
                case 6:
                    bcM = (C23166BcM) C26300CxD.A0A(parcel, C23166BcM.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23186Bcg(bcR, bcM, str, i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23186Bcg[i];
    }
}
