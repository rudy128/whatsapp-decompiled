package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class D19 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        IBinder iBinder = null;
        String[] strArr = null;
        C23143Bbw bbw = null;
        C23171BcR bcR = null;
        C23166BcM bcM = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    iBinder = C26300CxD.A09(parcel, readInt);
                    break;
                case 2:
                    strArr = C26300CxD.A0S(parcel, readInt);
                    break;
                case 3:
                    bbw = (C23143Bbw) C26300CxD.A0A(parcel, C23143Bbw.CREATOR, readInt);
                    break;
                case 4:
                    z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
                    break;
                case 5:
                    i = C26300CxD.A03(parcel, readInt);
                    break;
                case 6:
                    bcR = DJ0.A0A(parcel, readInt);
                    break;
                case 7:
                    bcM = (C23166BcM) C26300CxD.A0A(parcel, C23166BcM.CREATOR, readInt);
                    break;
                default:
                    C26300CxD.A0I(parcel, readInt);
                    break;
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23199Bct(iBinder, bbw, bcR, bcM, strArr, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C23199Bct[i];
    }
}
